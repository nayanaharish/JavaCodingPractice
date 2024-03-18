package com.example.reportgeneration.rest;

import com.example.reportgeneration.model.MemberInfo;
import com.example.reportgeneration.model.Request;
import com.example.reportgeneration.service.MemberService;
import com.example.reportgeneration.service.MemberServiceImpl;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MemberRestController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/save")
    public String saveMember(MemberInfo memberInfo)
    {
        return memberService.saveMember(memberInfo);
    }


    @GetMapping("/getAll")
    public List<MemberInfo> getAll()
    {
        return memberService.getAllMembers();
    }


    @GetMapping("get/planName")
    public List<String> getPlanName()
    {
        return memberService.getPlanNames();
    }
    @GetMapping("get/planStatus")
    public List<String> getPlanStatus()
    {
        return memberService.getPlanStatus();
    }

    @PostMapping("/search")
    public List<MemberInfo> search(@RequestBody Request request)
    {
        System.out.println(request.getPlanName()+"got it");
        return memberService.getMembers(request);
    }

    @GetMapping("/excel")
    public void generateExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octect-stream");
        String headerKey = "Content-Disposition";
        String headerVal = "attachemnt;filename=course.xls";
        response.setHeader(headerKey,headerVal);
        memberService.exportExcel(response);
    }
}

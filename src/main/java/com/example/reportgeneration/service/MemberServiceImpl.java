package com.example.reportgeneration.service;


import com.example.reportgeneration.model.MemberInfo;
import com.example.reportgeneration.model.Request;
import com.example.reportgeneration.repo.MemberRepo;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepo memberRepo;


    @Override
    public List<String> getPlanNames() {
       return memberRepo.getPlanName();

    }

    @Override
    public List<String> getPlanStatus() {
        return memberRepo.getPlanStatus();
    }

    @Override
    public List<MemberInfo> getMembers(Request request) {
        System.out.println("Search");
        MemberInfo entity = new MemberInfo();
        if (request.getPlanName() != null && ! request.getPlanName().equals(""))
        {
            entity.setPlanName(request.getPlanName());
           // return memberRepo.findAllByPlanNameAndPlanStatus(request.getPlanName() , request.getPlanStatus());
        }
        if (request.getPlanStatus() != null && ! request.getPlanStatus().equals(""))
        {
            //return memberRepo.findAllByPlanStatus(request.getPlanStatus());
            entity.setPlanStatus(request.getPlanStatus());
        }

       // MemberInfo entity  = new MemberInfo();

        System.out.println(entity.getPlanName());
        System.out.println(entity.getPlanStatus());


        Example<MemberInfo> example = Example.of(entity);

        List<MemberInfo> users = memberRepo.findAll(example);

        System.out.println(users);





        return users;

    }

    @Override
    public void exportExcel(HttpServletResponse response) throws IOException {

        //get all members from the db
        List<MemberInfo> members = memberRepo.findAll();

        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet("Member Info");
        HSSFRow titleRow = sheet.createRow(0);
        titleRow.createCell(0).setCellValue("S. NO.");
        titleRow.createCell(1).setCellValue("Name");
        titleRow.createCell(2).setCellValue("Email");
        titleRow.createCell(3).setCellValue("Mobile Number");
        titleRow.createCell(4).setCellValue("SSN");
        titleRow.createCell(5).setCellValue("Gender");
        titleRow.createCell(6).setCellValue("Plan Name");
        titleRow.createCell(7).setCellValue("Plan Status");

        int rowIndex = 1;

        for (MemberInfo memberInfo : members)
        {
            HSSFRow row = sheet.createRow(rowIndex);

            row.createCell(0).setCellValue(memberInfo.getSNo());

            row.createCell(1).setCellValue(memberInfo.getName());
            row.createCell(2).setCellValue(memberInfo.getEmail());
            row.createCell(3).setCellValue(memberInfo.getMobNum());
            row.createCell(4).setCellValue(memberInfo.getSsn());
            row.createCell(5).setCellValue(memberInfo.getGender());
            row.createCell(6).setCellValue(memberInfo.getPlanName());
            row.createCell(7).setCellValue(memberInfo.getPlanStatus());
            rowIndex++;


        }
        //get output stream from the response
        ServletOutputStream out = response.getOutputStream();

        workBook.write(out);
        workBook.close();
        out.close();




    }

    @Override
    public void exportPdf(HttpServletResponse reponse) {

    }

    @Override
    public String saveMember(MemberInfo memberInfo) {
        memberRepo.save(memberInfo);
        return "saved successfully";
    }

    @Override
    public List<MemberInfo> getAllMembers() {
        return memberRepo.findAll();
    }


}

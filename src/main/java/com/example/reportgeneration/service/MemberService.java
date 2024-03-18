package com.example.reportgeneration.service;

import com.example.reportgeneration.model.MemberInfo;
import com.example.reportgeneration.model.PlanName;
import com.example.reportgeneration.model.PlanStatus;
import com.example.reportgeneration.model.Request;
import jakarta.servlet.http.HttpServletResponse;

import javax.sound.midi.MetaMessage;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

public interface MemberService {

   public List<String> getPlanNames();
   public List<String> getPlanStatus();

   public List<MemberInfo> getMembers(Request request);


   public void exportExcel(HttpServletResponse response) throws IOException;
   public void exportPdf(HttpServletResponse reponse);

   public String saveMember(MemberInfo memberInfo);

   public List<MemberInfo> getAllMembers();







}

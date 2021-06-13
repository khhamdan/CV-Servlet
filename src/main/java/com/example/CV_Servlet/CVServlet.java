package com.example.CV_Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/CV-Response")
public class CVServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        String name = request.getParameter("name");
        String work = request.getParameter("work");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String github = request.getParameter("github");


        request.setAttribute("name",name);
        request.setAttribute("work",work);
        request.setAttribute("address",address);
        request.setAttribute("phone",phone);
        request.setAttribute("email",email);
        request.setAttribute("github",github);

 //                    Social media Information
        String facebook = request.getParameter("facebook");
        String twitter = request.getParameter("twitter");
        String youtube = request.getParameter("youtube");
        String linkedin = request.getParameter("linkedin");

        request.setAttribute("facebook",facebook);
        request.setAttribute("twitter",twitter);
        request.setAttribute("youtube",youtube);
        request.setAttribute("linkedin",linkedin);


//                        Skills
        String lang1 = request.getParameter("lang1");
        String lang2 = request.getParameter("lang2");
        String lang3 = request.getParameter("lang3");
        String lang4 = request.getParameter("lang4");
        String lang5 = request.getParameter("lang5");

        request.setAttribute("lang1",lang1);
        request.setAttribute("lang2",lang2);
        request.setAttribute("lang3",lang3);
        request.setAttribute("lang4",lang4);
        request.setAttribute("lang5",lang5);

        String percentage1 = request.getParameter("percentage1");
        String percentage2 = request.getParameter("percentage2");
        String percentage3 = request.getParameter("percentage3");
        String percentage4 = request.getParameter("percentage4");
        String percentage5 = request.getParameter("percentage5");

        request.setAttribute("percentage1",percentage1);
        request.setAttribute("percentage2",percentage2);
        request.setAttribute("percentage3",percentage3);
        request.setAttribute("percentage4",percentage4);
        request.setAttribute("percentage5",percentage5);


        int per1 = Integer.parseInt(percentage1);
        int per2 = Integer.parseInt(percentage2);
        int per3 = Integer.parseInt(percentage3);
        int per4 = Integer.parseInt(percentage4);
        int per5 = Integer.parseInt(percentage5);

        request.setAttribute("per1",per1);
        request.setAttribute("per2",per2);
        request.setAttribute("per3",per3);
        request.setAttribute("per4",per4);
        request.setAttribute("per5",per5);

        String about = request.getParameter("about");
        String yearsOfWorkExp1 = request.getParameter("yearsOfWorkExp1");
        String workExpHead1 = request.getParameter("workExpHead1");
        String workExp1 = request.getParameter("workExp1");

        request.setAttribute("about",about);
        request.setAttribute("yearsOfWorkExp1",yearsOfWorkExp1);
        request.setAttribute("workExpHead1",workExpHead1);
        request.setAttribute("workExp1",workExp1);



 /*                       String yearsOfWorkExp2=request.getParameter("yearsOfWorkExp2");
                        String workExpHead2=request.getParameter("workExpHead2");
                        String workExp2=request.getParameter("workExp2");
*/


        String yearsOfWorkExp3 = request.getParameter("yearsOfWorkExp3");
        String workExpHead3 = request.getParameter("workExpHead3");
        String workExp3 = request.getParameter("workExp3");

        request.setAttribute("yearsOfWorkExp3",yearsOfWorkExp3);
        request.setAttribute("workExpHead3",workExpHead3);
        request.setAttribute("workExp3",workExp3);


        String educationYears = request.getParameter("educationYears");
        String uniName = request.getParameter("uniName");
        String EducationInfo = request.getParameter("EducationInfo");

        request.setAttribute("educationYears",educationYears);
        request.setAttribute("uniName",uniName);
        request.setAttribute("EducationInfo",EducationInfo);


        request.getRequestDispatcher("CV-Response.jsp").forward(request,response);

    }
}

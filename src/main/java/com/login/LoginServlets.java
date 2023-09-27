package com.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class LoginServlets extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String p=req.getParameter("username");
        String q=req.getParameter("password");

        if((p.equalsIgnoreCase("prerana")) && (q.equals("admin@123"))) {
            req.setAttribute("p",p);
            RequestDispatcher dsp = req.getRequestDispatcher("welcome"); //calling a servlet from servlet
            dsp.forward(req, res);
        } else {
            PrintWriter pw=res.getWriter();
            pw.println("You are not a authenticated user ");
        }
    }
}

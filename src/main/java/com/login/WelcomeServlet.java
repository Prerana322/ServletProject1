package com.login;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
      public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
          String p= (String) req.getAttribute("p");
          PrintWriter out = res.getWriter();
          out.println("Welcome "+p);
      }
}

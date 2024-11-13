package com.fintech.app.fintech.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.fintech.app.fintech.services.validations.Signin_Valid;

import java.io.IOException;

@WebServlet("/signin")
public class SiginEP extends HttpServlet {
    @Override
    public void init(){
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if(Signin_Valid.ValidateCredentials(req)){
            resp.sendRedirect("login.jsp");
        }
    }
}

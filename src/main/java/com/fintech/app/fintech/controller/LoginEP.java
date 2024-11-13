package com.fintech.app.fintech.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.fintech.app.fintech.services.validations.Login_Valid;

import java.io.IOException;

@WebServlet("/login")
public class LoginEP extends HttpServlet {
    public void init() {
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            if (Login_Valid.ValidateCredentials(req)){
                resp.sendRedirect("lobby.jsp");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

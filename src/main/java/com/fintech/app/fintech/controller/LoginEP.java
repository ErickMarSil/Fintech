package com.fintech.app.fintech.controller;

import com.fintech.app.fintech.connectionfactory.ConnectionOracle;
import com.fintech.app.fintech.model.Transactions;
import com.fintech.app.fintech.model.User;
import com.fintech.app.fintech.services.querycontroll.GetterQuery;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.fintech.app.fintech.services.validations.Login_Valid;
import org.json.JSONObject;

import java.io.IOException;

@WebServlet("/login")
public class LoginEP extends HttpServlet {
    public void init() {
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Login_Valid loginV = new Login_Valid();
        try {
            if (loginV.ValidateCredentials(req)){
                // Gets user content
                resp.setContentType("application/json");
                resp.setCharacterEncoding("UTF-8");
                resp.getWriter().write(loginV.getUserContent_JSON());

                resp.sendRedirect("lobby.jsp");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

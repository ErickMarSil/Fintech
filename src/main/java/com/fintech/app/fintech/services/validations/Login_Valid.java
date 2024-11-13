package com.fintech.app.fintech.services.validations;

import com.fintech.app.fintech.implement.OracleUserDAO;
import com.fintech.app.fintech.model.User;
import jakarta.servlet.http.HttpServletRequest;

public class Login_Valid {
    public static boolean ValidateCredentials(HttpServletRequest req) throws Exception {
        User user = new User();
        user.email = req.getParameter("email");
        user.password = req.getParameter("password");

        OracleUserDAO oracleUserDAO = new OracleUserDAO();
        try{
            return oracleUserDAO.check_user(user);
        }catch(Exception e){
            return false;
        }
    }
}

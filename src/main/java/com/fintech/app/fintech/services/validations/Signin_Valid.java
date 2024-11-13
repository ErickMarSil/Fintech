package com.fintech.app.fintech.services.validations;

import com.fintech.app.fintech.implement.OracleUserDAO;
import com.fintech.app.fintech.model.User;
import jakarta.servlet.http.HttpServletRequest;

import java.sql.Date;

public class Signin_Valid {
    public static boolean ValidateCredentials(HttpServletRequest req){
        User user = new User();

        user.cd_cpf = Long.getLong(req.getParameter("cpf"));
        user.first_name = req.getParameter("firstName");
        user.last_name = req.getParameter("lastName");
        user.email = req.getParameter("email");
        user.password = req.getParameter("firstName");
        user.birth_data = Date.valueOf(String.valueOf(req.getParameter("dob")));

        OracleUserDAO oracleUserDAO = new OracleUserDAO();
        try{
            oracleUserDAO.check_user(user);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

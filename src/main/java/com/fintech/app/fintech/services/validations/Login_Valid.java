package com.fintech.app.fintech.services.validations;

import com.fintech.app.fintech.connectionfactory.ConnectionOracle;
import com.fintech.app.fintech.implement.OracleUserDAO;
import com.fintech.app.fintech.model.Transactions;
import com.fintech.app.fintech.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.eclipse.tags.shaded.org.apache.xalan.trace.TraceManager;
import org.json.JSONObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Login_Valid {
    User userContent;
    List<Transactions> userTransactions;

    public boolean ValidateCredentials(HttpServletRequest req) throws Exception {
        User user = new User();
        user.email = req.getParameter("email");
        user.password = req.getParameter("password");

        OracleUserDAO oracleUserDAO = new OracleUserDAO();
        try{
            if (oracleUserDAO.check_user(user)){
                getAllTransactions(user);
                getUserContent(user);
            }
        }catch(Exception e){
            return false;
        }
    }
    private List<Transactions> getAllTransactions(User user) throws Exception {
        Connection conn = ConnectionOracle.CreateConn();
        PreparedStatement ps = null;

        ps = conn.prepareStatement("SELECT User.id from User WHERE User.email = ?;");
        ps.setString(1, user.email);
        String UserId = ps.executeQuery().toString();

        ps = conn.prepareStatement("SELECT * FROM transactions WHERE user_id = ?");
        ps.setString(1, UserId);
        ps.executeQuery();

        List<Transactions> transactions = new ArrayList<>();


        return transactions;
    }
    private JSONObject getUserContent(User user) throws SQLException {

        return null;
    }

    public JSONObject getUserContent_JSON(){
        return null;
    }
    public JSONObject getUserContent_JSON(){
        return null;
    }
}

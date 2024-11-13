package com.fintech.app.fintech.implement;

import com.fintech.app.fintech.dao.UserDAO;
import com.fintech.app.fintech.model.User;
import com.fintech.app.fintech.services.querycontroll.GetterQuery;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.fintech.app.fintech.connectionfactory.ConnectionOracle;

public class OracleUserDAO implements UserDAO {
    Connection conn;
    public void UserDAO() throws SQLException {
        this.conn = ConnectionOracle.CreateConn();
    }
    @Override
    public boolean check_user(User user) throws Exception {
        boolean result = false;
        try{
            String query = GetterQuery.get_query(
                    "UserQ/check_user_content.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);
            ResultSet resSet;

            prepState.setString(1, user.email);
            prepState.setString(1, user.password);

            resSet = prepState.executeQuery();

            return resSet.next();
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public void delete_user(User user) {
        try{
            String query = GetterQuery.get_query(
                    "UserQ/delete_user_content.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);
            ResultSet resSet;

            prepState.setString(1, user.email);

            resSet = prepState.executeQuery();

        }catch (Exception e){
            return;
        }
    }

    @Override
    public void insert_user(User user) {
        try{
            String query = GetterQuery.get_query(
                    "UserQ/insert_new_user.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);
            ResultSet resSet;

            prepState.setInt(1, (int) user.cd_cpf);
            prepState.setString(2, user.first_name);
            prepState.setString(3, user.last_name);
            prepState.setString(4, user.email);
            prepState.setString(5, user.password);
            prepState.setDate(6, Date.valueOf(String.valueOf(user.birth_data)));
            prepState.setInt(7, user.nm_phone);

            resSet = prepState.executeQuery();

        }catch (Exception e){
            return;
        }
    }

    @Override
    public void update_user(User user, String[] args) {
        try{
            String query = GetterQuery.get_query(
                    "UserQ/alter_user_data.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);
            ResultSet resSet;

            prepState.setString(1, args[0]);
            prepState.setString(2, args[1]);
            prepState.setString(3, args[2]);
            prepState.setInt(4, Integer.parseInt(args[3]));
            prepState.setString(5, user.email);

            resSet = prepState.executeQuery();

        }catch (Exception e){
            return;
        }
    }

    @Override
    public List<User> get_users() {
        List<User> users = new ArrayList<>();
        try{
            String query = GetterQuery.get_query(
                    "UserQ/get_all_users.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);
            ResultSet resSet;

            resSet = prepState.executeQuery();
            while (resSet.next()) {
                User user = new User();
                user.id = resSet.getLong("id");
                user.cd_cpf = resSet.getInt("cd_cpf");
                user.first_name = resSet.getString("first_name");
                user.last_name = resSet.getString("last_name");
                user.email = resSet.getString("email");
                user.password = resSet.getString("password");
                user.birth_data = resSet.getDate("birth_data");
                user.nm_phone = resSet.getInt("nm_phone");
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User search_user(User user) {
        try {
            String query = GetterQuery.get_query(
                    "UserQ/get_search_user.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);

            prepState.setString(1, "%" + user.first_name + "%");
            prepState.setString(2, "%" + user.last_name + "%");

            ResultSet resSet = prepState.executeQuery();
            if (resSet.next()) {
                User foundUser  = new User();
                foundUser .id = resSet.getLong("id");
                foundUser .cd_cpf = resSet.getInt("cd_cpf");
                foundUser .first_name = resSet.getString("first_name");
                foundUser .last_name = resSet.getString("last_name");
                foundUser .email = resSet.getString("email");
                foundUser .password = resSet.getString("password");
                foundUser .birth_data = resSet.getDate("birth_data");
                foundUser .nm_phone = resSet.getInt("nm_phone");
                return foundUser ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null; // Return null if no user is found
    }
}

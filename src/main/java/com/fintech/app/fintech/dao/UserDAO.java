package com.fintech.app.fintech.dao;

import com.fintech.app.fintech.model.User;

import java.util.Date;
import java.util.List;

public interface UserDAO {
    public boolean check_user(User user) throws Exception;
    public void delete_user(User user);
    public void insert_user(User user);
    public void update_user(User user, String[] args);
    public List<User> get_users();
    public User search_user(User user );
}

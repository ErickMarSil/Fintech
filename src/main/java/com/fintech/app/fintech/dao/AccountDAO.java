package com.fintech.app.fintech.dao;

import com.fintech.app.fintech.model.Account;
import com.fintech.app.fintech.model.User;

import java.util.List;

public interface AccountDAO {
    public Account getAccount(User user);
    public void deleteAccount(long userID, Account account);
    public void updateAccount(long userID, Account account);
    public void insertAccount(long userID, Account account);
    public List<Account> getAccounts();
}

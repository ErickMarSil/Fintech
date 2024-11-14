package com.fintech.app.fintech.dao;

import com.fintech.app.fintech.model.Transactions;

import java.util.List;

public interface TransactionsDAO {
    public List<Transactions> getUserTransactions();
    public boolean sendTransaction(Transactions transaction);
    public boolean deleteTransaction(Transactions transaction);
}

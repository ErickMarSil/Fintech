package com.fintech.app.fintech.implement;

import com.fintech.app.fintech.connectionfactory.ConnectionOracle;
import com.fintech.app.fintech.dao.TransactionsDAO;
import com.fintech.app.fintech.model.Transactions;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OracleTransactionDAO implements TransactionsDAO {
    Connection conn;

    public OracleTransactionDAO() throws SQLException {
        this.conn = ConnectionOracle.CreateConn();
    }

    @Override
    public List<Transactions> getUserTransactions() {
        List<Transactions> transactions = new ArrayList<>();
        try {
            String query = "SELECT * FROM Transactions"; // Adjust this query to filter by user if needed
            PreparedStatement prepState = conn.prepareStatement(query);
            ResultSet resSet = prepState.executeQuery();

            while (resSet.next()) {
                Transactions transaction = new Transactions();
                transaction.id = resSet.getLong("id");
                transaction.expense_date = resSet.getDate("expense_date");
                transaction.payment_type = resSet.getString("payment_type");
                transaction.amount = resSet.getDouble("amount");
                transaction.recipient_account_name = resSet.getString("recipient_account_name");
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return transactions;
    }

    @Override
    public boolean sendTransaction(Transactions transaction) {
        try {
            String query = "INSERT INTO Transactions (id, expense_date, payment_type, amount, recipient_account_name) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepState = conn.prepareStatement(query);

            prepState.setLong(1, transaction.id);
            prepState.setDate(2, Date.valueOf(transaction.expense_date.toLocalDate())); // Assuming expenseDate is a java.util.Date
            prepState.setString(3, transaction.payment_type);
            prepState.setDouble(4, transaction.amount);
            prepState.setString(5, transaction.recipient_account_name);

            int rowsAffected = prepState.executeUpdate();
            return rowsAffected > 0; // Return true if the insert was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if there was an error
        } catch (Exception e) {
            return false; // Return false if there was an error
        }
    }

    @Override
    public boolean deleteTransaction(Transactions transaction) {
        try {
            String query = "DELETE FROM Transactions WHERE id = ?";
            PreparedStatement prepState = conn.prepareStatement(query);
            prepState.setLong(1, transaction.id);

            int rowsAffected = prepState.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}

package com.fintech.app.fintech.implement;

import com.fintech.app.fintech.connectionfactory.ConnectionOracle;
import com.fintech.app.fintech.dao.AccountDAO;
import com.fintech.app.fintech.model.Account;
import com.fintech.app.fintech.model.User;
import com.fintech.app.fintech.services.querycontroll.GetterQuery;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

public class OracleAccountDAO implements AccountDAO {
    Connection conn;

    public OracleAccountDAO() throws SQLException, SQLException {
        this.conn = ConnectionOracle.CreateConn();
    }
    @Override
    public Account getAccount(User user) {
        try {
            String query = GetterQuery.get_query("" +
                    "AccountQ/get_account.sql"
            );
            PreparedStatement prepState = conn.prepareStatement(query);

            prepState.setLong(1, user.id);

            ResultSet resSet = prepState.executeQuery();
            if (resSet.next()) {
                return mapRowToAccount(resSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void deleteAccount(long userID, Account account) {
        try {
            String query = GetterQuery.get_query("AccountQ/delete_account.sql");
            PreparedStatement prepState = conn.prepareStatement(query);

            prepState.setLong(1, userID);
            prepState.setLong(2, account.id);

            prepState.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(long userID, Account account) {
        try {
            String query = GetterQuery.get_query("AccountQ/update_account.sql");
            PreparedStatement prepState = conn.prepareStatement(query);

            prepState.setBigDecimal(1, BigDecimal.valueOf(account.nm_account));
            prepState.setString(2, account.nam_account);
            prepState.setDate(3, Date.valueOf(account.dt_creation.toLocalDate()));
            prepState.setDouble(4, account.vl_money);
            prepState.setLong(5, userID);
            prepState.setLong(6, account.id);

            prepState.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertAccount(long userID, Account account) {
        try {
            String query = GetterQuery.get_query("AccountQ/insert_account.sql");
            PreparedStatement prepState = conn.prepareStatement(query);
            prepState.setBigDecimal(1, BigDecimal.valueOf(account.nm_account));
            prepState.setString(2, account.nam_account);
            prepState.setDate(3, Date.valueOf(account.dt_creation.toLocalDate()));
            prepState.setDouble(4, account.vl_money);
            prepState.setLong(5, userID);
            prepState.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Account> getAccounts() {
        return List.of();
    }
    private Account mapRowToAccount(ResultSet resSet) throws SQLException {
        Account account = new Account();
        account.id = (int) resSet.getLong("id");
        account.nm_account = resSet.getLong("nm_account");
        account.nam_account = resSet.getString("nam_account");
        account.dt_creation = Date.valueOf(resSet.getDate("dt_creation").toLocalDate());
        account.vl_money = resSet.getDouble("vl_money");
        account.user_id = resSet.getLong("user_id");
        return account;
    }
}

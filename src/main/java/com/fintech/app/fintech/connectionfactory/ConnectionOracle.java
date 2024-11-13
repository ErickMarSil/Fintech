package com.fintech.app.fintech.connectionfactory;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.fintech.app.fintech.services.enviroment.EnvController;

public class ConnectionOracle {
    static protected java.sql.Connection cn = null;

    public static java.sql.Connection CreateConn() throws SQLException {
        if (cn == null){
            cn = DriverManager.getConnection(
                    EnvController.getFromEnv("URL_ORACLE"),
                    EnvController.getFromEnv("PASSWORD"),
                    EnvController.getFromEnv("USER")
            );
        }
        return cn;
    }
}

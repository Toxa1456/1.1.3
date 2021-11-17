package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String login = "root";
    private static final String password = "1234";
    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    public static Connection connection;

    public static Connection getConnection () {
        try {
            connection = DriverManager.getConnection(URL, login, password);
            connection.setAutoCommit(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

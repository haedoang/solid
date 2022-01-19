package ocp.exam03.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName : ocp.exam03.db
 * fileName : AConnectionMaker
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
public class AConnectionMaker implements ConnectionMaker {
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:13306/tobi?useSSL=false";
    private static final String DB_USER = "auser";
    private static final String DB_PASS = "apass";

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName(MYSQL_DRIVER);
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}

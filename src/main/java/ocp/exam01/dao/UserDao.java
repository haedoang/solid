package ocp.exam01.dao;

import ocp.domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * packageName : ocp.dao
 * fileName : UserDao
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
public class UserDao {
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:13306/tobi?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "masterpw";

    public int add(User user) throws ClassNotFoundException, SQLException {
        Class.forName(MYSQL_DRIVER);
        String query = "insert into users(id, name, password) values (?,?,?)";
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        PreparedStatement ps = conn.prepareStatement(query);

        try (conn; ps) {
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            return ps.executeUpdate();
        }
    }
}

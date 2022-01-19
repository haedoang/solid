package ocp.exam03.dao;

import ocp.exam03.db.ConnectionMaker;
import ocp.domain.User;

import java.sql.Connection;
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
    private final ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public int add(User user) throws ClassNotFoundException, SQLException {
        Connection conn = connectionMaker.makeConnection();
        String query = "insert into users(id, name, password) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);

        try (conn; ps) {
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            return ps.executeUpdate();
        }
    }
}

package ocp.exam03.db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * packageName : ocp.exam03.db
 * fileName : ConnectionMaker
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}

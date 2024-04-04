import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Connection conn;
        try {
             conn =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_dt",
                     "postgres",
                     "password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

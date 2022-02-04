import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtils {
    private static final String URL = "jdbc:postgresql://localhost:5432/jprog?verifyServerCertificate=false&useSSL=false&requireSSL=false&useLegacyDatetimeCode=false&amp&serverTimezone=UTC";
    private static final String Username = "postgres";
    private static final String Password = "postgres";


    static Connection getConnection(){
        Connection connection = null;
           try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, Username, Password);
            System.out.println("We're connected!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }



}

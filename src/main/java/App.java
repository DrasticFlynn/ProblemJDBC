import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {

    List<Students> students = CRUDUtils.getStudentData("SELECT * FROM studyuser");
        System.out.println(students);

        }

    }


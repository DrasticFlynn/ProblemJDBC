import org.h2.command.ddl.CreateTable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {

    private static String INSERT_STUDENT = "INSERT INTO StudyUser(name1, lastName1, age1) VALUES(?,?,?);";
    private static String UPDATE_STUDENT = "UPDATE StudyUser SET course_name = ? WHERE id =? ";
    private static String DELETE_STUDENT = "DELETE FROM StudyUser WHERE id = ?";

    public static List<Students> getStudentData(String query) {
        List<Students> students = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id1");
                String name1 = rs.getString("name1");
                String lastName1 = rs.getString("lastName1");
                int age1 = Integer.parseInt(rs.getString("age1"));

                students.add(new Students(id, name1, lastName1, age1));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return students;
    }
//
//    public static List<Students> saveStudent(Students students) {
//        List<Students> students2 = new ArrayList<>();
//
//        try (Connection connection = DBUtils.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT)) {
//
//            preparedStatement.setString(1, students.getName());
//            preparedStatement.setString(2, students.getSurname());
//            preparedStatement.setString(3, students.getCurse_name());
//            preparedStatement.executeUpdate();
//            PreparedStatement allStudents = connection.prepareStatement("SELECT * FROM students");
//            ResultSet rs = allStudents.executeQuery();
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String surname = rs.getString("surname");
//                String curse_name = rs.getString("course_name");
//
//                students2.add(new Students(id, name, surname, curse_name));
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        return students2;
//
//    }
//
//    public static List<Students> updateStudent(int sudentId, String courseName) {
//        List<Students> update = new ArrayList<>();
//
//        try (Connection connection = DBUtils.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT)) {
//
//            preparedStatement.setString(1, courseName);
//            preparedStatement.setInt(2, sudentId);
//
//            preparedStatement.executeUpdate();
//            PreparedStatement allStudents = connection.prepareStatement("SELECT * FROM students");
//            ResultSet rs = allStudents.executeQuery();
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String surname = rs.getString("surname");
//                String curse_name = rs.getString("course_name");
//
//                update.add(new Students(id, name, surname, curse_name));
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }return update;
//    }
//
//    public static List<Students> deleteStudents (int studentId){
//        List<Students> delete = new ArrayList<>();
//
//
//        try (Connection connection = DBUtils.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT)) {
//
//            preparedStatement.setInt(1, studentId);
//
//            preparedStatement.executeUpdate();
//            PreparedStatement allStudents = connection.prepareStatement("SELECT * FROM students");
//            ResultSet rs = allStudents.executeQuery();
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String surname = rs.getString("surname");
//                String curse_name = rs.getString("course_name");
//
//                delete.add(new Students(id, name, surname, curse_name));
//            }
//
//
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return delete;
//    }
}

package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Vi arver fra Database-klassen for at låne forbindelsen
public class StudentRepository extends Database {

    public StudentRepository() {
        boolean success = openConnection("SkoleDB");

        if (!success) {
            System.err.println("Fejl: Kunne ikke åbne forbindelsen til databasen i StudentRepository.");
        }
    }

    /*
     * Read operationer
     */
    public ArrayList<Student> getAllStudents() {
        return getStudentsByWhereClause("0=0");
    }

    public ArrayList<Student> getStudentsByFirstName(String firstName) {
        return getStudentsByWhereClause("firstname='" + firstName + "'");
    }

    public ArrayList<Student> getStudentsByLastName(String lastName) {
        return getStudentsByWhereClause("lastname='" + lastName + "'");
    }

    public ArrayList<Student> getStudentsBySemesterNo(int semesterNo) {
        return getStudentsByWhereClause("semester_no='" + semesterNo + "'");
    }

    private ArrayList<Student> getStudentsByWhereClause(String whereClause) {
        ArrayList<Student> students = new ArrayList<Student>();

        try {
            String sql = "SELECT * FROM student WHERE " + whereClause;

            System.out.println(sql);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            // iteration starter 'before first'
            while (resultSet.next()) {
                // hent data fra denne række
                int id = resultSet.getInt("id");
                String lastname = resultSet.getString("lastname");
                String firstname = resultSet.getString("firstname");
                int semester_no = resultSet.getInt("semester_no");

                Student student = new Student(id, lastname, firstname, semester_no);

                students.add(student);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    /*
     * Create operationer
     */
    public boolean insertStudent(Student student) {
        try {
            String sql = "INSERT INTO student VALUES (?, ?, ?)";

            System.out.println(sql);

            // get statement object
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, student.getLastName());
            statement.setString(2, student.getFirstName());
            statement.setInt(3, student.getSemesterNo());

            // execute sql statement
            int affectedRows = statement.executeUpdate();

            if (affectedRows != 1)
                return false;

            /*
             * get (possible) auto-generated key if INSERT-statement
             */
            ResultSet resultSet = statement.getGeneratedKeys();

            if (resultSet.next())
                student.setId(resultSet.getInt(1));

            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }

    /*
     * Delete operationer
     */
    public void deleteStudent(Student student) {
        try {
            String sql = "DELETE FROM student WHERE id=" + student.getId();

            System.out.println(sql);

            // get statement object
            Statement statement = connection.createStatement();

            // execute sql statement
            int affectedRows = statement.executeUpdate(sql);

            // ToDo: check at affectedRows er 1
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Update operationer
     */
    public void updateStudent(Student student) {
        try {
            String sql = "UPDATE student SET lastname='" +
                    student.getLastName() + "', firstname='" +
                    student.getFirstName() + "', semester_no=" +
                    student.getSemesterNo() +
                    " WHERE id=" + student.getId();

            System.out.println(sql);

            // get statement object
            Statement statement = connection.createStatement();

            // execute sql statement
            int affectedRows = statement.executeUpdate(sql);

            // ToDo: check at affectedRows er 1
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

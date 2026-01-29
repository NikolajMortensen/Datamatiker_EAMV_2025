package skole.db.data;

import skole.db.entities.Student;

import java.sql.*;
import java.util.ArrayList;

public class DataLayer {
  private static Connection connection;
  private static final String USER = "sa";
  private static final String PASS = "SuperCode123!";

  public DataLayer() {
    openConnection("SkoleDB");
  }

    protected static boolean openConnection(String databaseName) {
        // Vi bygger din Docker-venlige URL her, men sætter databasenavnet ind dynamisk
        String connectionString =
                "jdbc:sqlserver://localhost:1433;" +
                        "databaseName=" + databaseName + ";" +
                        "encrypt=true;" +
                        "trustServerCertificate=true;";

        connection = null;

        try {
            System.out.println("Connecting to database...");

            // VIGTIGT: Her skal vi sende user og password med!
            // Du bruger 'sa'-login, så du skal bruge metoden med 3 parametre:
            connection = DriverManager.getConnection(connectionString, USER, PASS);

            System.out.println("Connected to database");

            return true;
        }
        catch (SQLException e) {
            System.out.println("Could not connect to database!");
            System.out.println(e.getMessage());

            return false;
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

  /*
   * eksempel på kald af stored procedure
   */
  public int getNStudentsByLN(String lastName) {
    try {
      String sql = "{call spGetNumberOfStudentsByLastName(?, ?)}";

      try (CallableStatement statement = connection.prepareCall(sql)) {
        statement.setString("lastName", lastName);
        statement.registerOutParameter("nStudents", Types.INTEGER);
        statement.execute();

        int nStudents = statement.getInt("nStudents");

        return nStudents;
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
      return -1;
    }
  }
}

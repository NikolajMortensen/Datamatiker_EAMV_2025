package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Vi arver fra Database-klassen for at låne forbindelsen
public class StudentRepository extends Database {

    public static void readAllStudents() {

        // 1. Åbn forbindelsen til den rigtige database
        if (openConnection("SkoleDB")) {

            // SQL Query
            String sql = "SELECT * FROM student";

            try {
                PreparedStatement stmt = connection.prepareStatement(sql);

                // Udfør query og få resultatet tilbage
                ResultSet rs = stmt.executeQuery();

                System.out.println("\n--- LISTE OVER STUDERENDE ---");

                // Kør igennem rækkerne så længe der er flere (rs.next())
                while (rs.next()) {

                    // Hent data baseret på kolonnenavne i databasen
                    int id = rs.getInt("id");
                    String lastName = rs.getString("lastname");
                    String firstName = rs.getString("firstname");
                    int semesterNo = rs.getInt("semester_no");

                    System.out.println("#" + id + ": " + firstName + " " + lastName + " " + semesterNo);
                }

                // Luk forbindelsen pænt igen
                rs.close();
                stmt.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
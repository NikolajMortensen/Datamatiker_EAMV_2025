package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // Docker-login oplysninger
    private static final String USER = "sa";
    private static final String PASS = "SuperCode123!";

    // Denne variabel er 'protected', så StudentRepository kan bruge den
    protected static Connection connection;

    // Metoden tager databasenavnet som parameter (så du kan skrive "SkoleDB")
    protected static boolean openConnection(String databaseName) {

        // Opsætning til Mac/Docker (vigtigt med trustServerCertificate)
        String connectionString =
                        "jdbc:sqlserver://localhost:1433;" +
                        "databaseName=" + databaseName + ";" +
                        "encrypt=true;" +
                        "trustServerCertificate=true;";

        try {
            connection = DriverManager.getConnection(connectionString, USER, PASS);
            System.out.println("Forbindelse oprettet til " + databaseName);
            return true;
        } catch (SQLException e) {
            System.out.println("Kunne ikke forbinde til databasen: " + e.getMessage());
            return false;
        }
    }
}
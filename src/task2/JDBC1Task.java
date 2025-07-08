package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC1Task {
    static final String DB_URL = "jdbc:mysql://localhost:3306/connectgen";
    static final String USER = "root"; // username
    static final String PASS = "admin"; // password
    static Connection connection = null;

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Initializing connection to database
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection to the database established successfully!");

            // Insert a student record
            // Example student record
            insertStudent("SRAVANI",23);

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console.");
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void insertStudent(String studentName, int age) {
        String insertSQL = "INSERT INTO studentmanagement (`Student Name`, `Age`) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, studentName);
            preparedStatement.setInt(2, age);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " record(s) into the studentmanagement table.");
        } catch (SQLException e) {
            System.out.println("Insertion failed! Check output console.");
            e.printStackTrace();
        }
    }
}

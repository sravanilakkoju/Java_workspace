package task2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Main class....
public class JDBC3Task {
	static final String DB_URL = "jdbc:mysql://localhost:3306/connectgen";
	static final String USER = "root";
	static final String PASS = "admin";
	static Connection connection = null;

	// Main method of the class...
	public static void main(String[] args) {
		// Initializing Database connection...
		try {
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection Succesfull...");

			// Check if the employees table exists, if not create it
			if (!isTableExists("employees")) {
				createEmployeesTable();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Writing main display functions....
		try {
			Scanner scanner = new Scanner(System.in);

			while (true) {
				System.out.println();

				System.out.println("----------Enter your choice------------ ");
				System.out.println("1. Enter a New Employee");
				System.out.println("2. List of All Employees");
				System.out.println("3. Update an Employee");
				System.out.println("4. Remove an Employee");
				System.out.println("5. Exit..");
				int choice = scanner.nextInt();

				// switch statement..
				switch (choice) {

				case 1:
					System.out.println("Enter the details: ");

					System.out.println("Employee Id: ");
					scanner.nextLine();
					int Id = scanner.nextInt();

					System.out.println("Employee Name: ");
					scanner.nextLine();
					String Name = scanner.nextLine();

					System.out.println("Employee Email: ");
					String Email = scanner.nextLine();

					System.out.println("Branch: ");
					String Branch = scanner.nextLine();

					AddEmployee(Id, Name, Email, Branch);
					break;

				case 2:
					ListofEmployees();
					break;
				case 3:
					System.out.println("enter the details for updating");
					System.out.println("Enter the ID:");
					scanner.nextLine();
					int updateid = scanner.nextInt();

					if (UpdateEmployee(updateid, scanner)) {
						System.out.println("Record updated successfully!");
					} else {
						System.out.println("No Such Record exists.");
					}
					break;
				case 4:
					System.out.print("Enter the Emoployee Id to be Remove: ");
					scanner.nextLine();
					int KeyToRemove = scanner.nextInt();
					RemoveEmployee(KeyToRemove);
					System.out.println("Record removed..!!");
					break;

				default:
					System.out.println("Exited..");
					scanner.close();
					System.exit(0);
					break;
				}
			}
		} catch (Exception e) {

			System.out.println(e.toString());
		}

	}// End of Main method...

	// Method to check if the table exists
	public static boolean isTableExists(String tableName) throws SQLException {
		DatabaseMetaData metaData = connection.getMetaData();
		ResultSet resultSet = metaData.getTables(null, null, tableName, null);
		return resultSet.next();
	}

	// Method to create the employees table
	public static void createEmployeesTable() throws SQLException {
		String createTableSQL = "CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100), branch VARCHAR(100))";
		Statement statement = connection.createStatement();
		statement.executeUpdate(createTableSQL);
		System.out.println("Employees table created successfully.");
	}

	// Method to Add Employee to the records
	public static void AddEmployee(int id, String name, String email, String branch) throws SQLException {
		String insertQuery = "INSERT INTO employees(id,name,email,branch) VALUES(?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setLong(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, branch);

		preparedStatement.executeUpdate();
		System.out.println(name + " has been added to the list sucessfully with id : " + id);

	}

	// Method to Display all the employee records
	public static void ListofEmployees() throws SQLException {
		String selectQuery = "SELECT * FROM employees";

		PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String branch = resultSet.getString("branch");
			System.out.println("_________________________________________");
			System.out.println("ID: " + id);
			System.out.println("Employee Name: " + name);
			System.out.println("Email: " + email);
			System.out.println("Branch: " + branch);

		}

	}

	// Method to Update the employee records...
	public static boolean UpdateEmployee(int updateid, Scanner scanner) throws SQLException {
		String selectQuery = "SELECT * FROM employees WHERE Id = ?";

		PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
		selectStatement.setLong(1, updateid);

		if (selectStatement.executeQuery().next()) {

			System.out.println("Updated Employee Name: ");
			scanner.nextLine();
			String name1 = scanner.nextLine();

			System.out.println("Updated Employee Email: ");
			String email = scanner.nextLine();

			System.out.println("Updated branch: ");
			String branch = scanner.nextLine();

			String updateQuery = "UPDATE employees SET name = ?, email = ?, branch = ? WHERE id = ?";
			PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
			updateStatement.setString(1, name1);
			updateStatement.setString(2, email);
			updateStatement.setString(3, branch);
			updateStatement.setLong(4, updateid);
			updateStatement.executeUpdate();
			return true;
		}
		return false;
	}

	// Method to Remove the recoids from the employee table
	public static void RemoveEmployee(int idtoremove) throws SQLException {
		String deleteQuery = "DELETE FROM employees WHERE Id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
		preparedStatement.setLong(1, idtoremove);
		preparedStatement.executeUpdate();
	}
}

//output:-
//Connection Succesfull...
//
//----------Enter your choice------------ 
//1. Enter a New Employee
//2. List of All Employees
//3. Update an Employee
//4. Remove an Employee
//5. Exit..
//2
//_________________________________________
//ID: 1001
//Employee Name: Sravani
//Email: lakkojusravani@gmail.com
//Branch: IT
//_________________________________________
//ID: 1002
//Employee Name: Pinky
//Email: pinkygmail.com
//Branch: Finance
//_________________________________________
//ID: 1003
//Employee Name: Navya
//Email: navya@gmail.com
//Branch: Hr
//
//----------Enter your choice------------ 
//1. Enter a New Employee
//2. List of All Employees
//3. Update an Employee
//4. Remove an Employee
//5. Exit..
//3
//enter the details for updating
//Enter the ID:
//1002
//Updated Employee Name: 
//Chinku
//Updated Employee Email: 
//chinku@gmail.com
//Updated branch: 
//IT
//Record updated successfully!
//
//----------Enter your choice------------ 
//1. Enter a New Employee
//2. List of All Employees
//3. Update an Employee
//4. Remove an Employee
//5. Exit..
//2
//_________________________________________
//ID: 1001
//Employee Name: Sravani
//Email: lakkojusravani@gmail.com
//Branch: IT
//_________________________________________
//ID: 1002
//Employee Name: Chinku
//Email: chinku@gmail.com
//Branch: IT
//_________________________________________
//ID: 1003
//Employee Name: Navya
//Email: navya@gmail.com
//Branch: Hr
//
//----------Enter your choice------------ 
//1. Enter a New Employee
//2. List of All Employees
//3. Update an Employee
//4. Remove an Employee
//5. Exit..
//4
//Enter the Emoployee Id to be Remove: 1002
//Record removed..!!
//
//----------Enter your choice------------ 
//1. Enter a New Employee
//2. List of All Employees
//3. Update an Employee
//4. Remove an Employee
//5. Exit..
//2
//_________________________________________
//ID: 1001
//Employee Name: Sravani
//Email: lakkojusravani@gmail.com
//Branch: IT
//_________________________________________
//ID: 1003
//Employee Name: Navya
//Email: navya@gmail.com
//Branch: Hr
//
//----------Enter your choice------------ 
//1. Enter a New Employee
//2. List of All Employees
//3. Update an Employee
//4. Remove an Employee
//5. Exit..
//5
//Exited..
//

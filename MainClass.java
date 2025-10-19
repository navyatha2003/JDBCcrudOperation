package jdbcCrudOp;

import java.sql.*;

public class MainClass {
	
	static String insertQuery = "insert into employees(name,role, sal) values ('xyz','hr',50000);";
	static String retriveQuery = "select * from employees";
	static String updateQuery = "update emplyees set sal = 35000 where role = developer";
	static String deleteQuery = "delete from employees where id = 8"; 
	static Connection connection;
	
public static void main(String[] args) {
		
		try {
			
			//step 1 Load Driver class
			Class.forName("com.mysql.cj.jdbc.Driver"); //throws ClassNotFoundException
			String url = "jdbc:mysql://localhost:3306/crudOpdb";
			String userName = "root";
			String PassWord = "root";
			
			//step 2 get Connection
			connection = DriverManager.getConnection(url, userName, PassWord); //throws SQLException
			
			//step 3 create Statement to insert into table
			Statement statement = connection.createStatement();
			
			//step 4 Exececute Query	
			display(statement);
			
			//insertOperation(statement);
			//updateOp(statement);
			DeletOp(statement);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//step 5 Close Connection
				connection.close();
			} catch(SQLException e) {
				e.toString();
			}
		}
	}
	
	//Inserting values to db
	public static void insertOperation(Statement statement)throws SQLException {
		statement.executeUpdate(insertQuery);
		System.out.println("inserted Successfully");
		display(statement);
	}
	
	//Retriving tables from db
	public static void display(Statement statement) throws SQLException {
		ResultSet result = statement.executeQuery(retriveQuery); 
		System.out.println("--------------------------");
		while(result.next()){
			int id = result.getInt("id");
			String name = result.getString(2);
			String role = result.getString(3);
			int salary = result.getInt(4);
			System.out.printf("|%d |%s |%-9s |%d|\n", id,name,role,salary);
		}
		System.out.println("--------------------------");
	}
	
	//updating values to db
	public static void updateOp(Statement statement) throws SQLException {
		System.out.println("Updated Successfully");
		statement.executeUpdate(updateQuery);
		display(statement);
	}
	
	//deleting row from db
	public static void DeletOp(Statement statement) throws SQLException {
		System.out.println("Deleted Successfully");
		statement.execute(deleteQuery);
		display(statement);
	}

}
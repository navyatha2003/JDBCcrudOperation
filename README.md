# JDBC CRUD Operations in Java

This is a simple Java application demonstrating how to perform **CRUD operations** (Create, Read, Update, Delete) using **JDBC (Java Database Connectivity)** with a **MySQL** database.

## 📌 Features

- ✅ Connect to a MySQL database using JDBC
- 📝 Perform basic SQL operations:
  - **Insert** employee data
  - **Retrieve** and display employee records
  - **Update** an employee's salary
  - **Delete** an employee record by ID
- 📦 Organized code for clarity and reusability

## 📁 Project Structure

```bash
jdbcCrudOp/
├── MainClass.java
└── README.md

🛠️ Requirements
Java JDK (8 or later)
MySQL database
MySQL JDBC Driver (mysql-connector-java)
IDE (e.g., IntelliJ, Eclipse) or any Java compiler

⚙️ Setup Instructions
1. Create the MySQL Database
Open your MySQL CLI or GUI (like phpMyAdmin, DBeaver, etc.) and run:

CREATE DATABASE crudOpdb;

USE crudOpdb;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    role VARCHAR(50),
    sal INT
);

2. Update Database Credentials in Code

In MainClass.java, ensure the following matches your local MySQL setup:

String url = "jdbc:mysql://localhost:3306/crudOpdb";
String userName = "root";      // replace with your username
String PassWord = "root";      // replace with your password

3. Add MySQL Connector to Your Project

If using an IDE like IntelliJ or Eclipse, add the MySQL JDBC driver to your project libraries.
You can also download it from:
https://dev.mysql.com/downloads/connector/j/

▶️ Running the Application

Compile and run the MainClass.java file.

The program will:
Display current records in the employees table

(Uncomment) Insert, update, or delete operations based on the method calls

🔧 Example Usage
Insert Example
insertOperation(statement);

Update Example
updateOp(statement);

Delete Example
deleteOp(statement);

🧠 Notes
Current queries are hardcoded for demo purposes.
Future improvements can include:
Using PreparedStatement for better security
Taking user input via command line or GUI
Implementing the DAO pattern

🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you'd like to change.

🙋‍♂️ Questions?
If you have any questions or need help setting this up, feel free to open an issue or contact the maintainer.

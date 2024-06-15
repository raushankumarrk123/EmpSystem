Project Name: Employee Management System
Overview:
I have created an Employee Management System, which is a Spring Boot project designed to manage employee records efficiently. The application features a navigation bar with sections for "Home" and "Add Employee".

Features:
Home Section: Displays a list of all employee records.
Add Employee Section: Allows users to enter employee details. On submitting the form, a POST API is triggered to save the data to the database.
Update and Delete:
Update: Allows users to update existing employee records.
Delete: Allows users to delete employee records from the database.

Technologies Used:
Spring Boot
HTML, CSS
Bootstrap
Thymeleaf
SQL (MySQL Workbench) 

Tools Used:
Postman: Used for manual testing of APIs.
Spring Tool Suite (STS): Used for development.
MySQL Workbench: Used for database management.

Usage:
1)Run the Application: Start the application and navigate to http://localhost:8081.
2)Home Page: View all employee records using the GET API to fetch data from the database.
3}Add Employee: Navigate to the "Add Employee" section, fill out the form, and submit to trigger the POST API.
4)Update/Delete Employee: Use the provided buttons to update or delete records, which will trigger the respective APIs.

Project Structure:
1)Controller Layer: Contains handler methods mapped to GET, POST, DELETE, and UPDATE endpoints.
2)Service Layer: Contains the business logic.
3)Model Class: Defines the entity classes.
4)Repository Layer: Manages database interactions using MySQL, connected through application properties.

Dependencies:
Generated using Spring Initializr with the following dependencies:

1)Spring Boot Starter Thymeleaf
2)Spring Boot Starter Web
3)Spring Boot Starter Data JPA
4)Spring Boot DevTools
5)Spring Boot Starter Data JDBC

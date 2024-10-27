package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
//@EnableJpaRepositories("org.example.repository")
public class SpringApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringApiApplication.class, args);
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "postgres";

		try {
			// Load the PostgreSQL JDBC driver
			Class.forName("org.postgresql.Driver");

			// Establish the connection
			Connection connection = DriverManager.getConnection(url, username, password);

			System.out.println("Connection established successfully!");

			connection.close();
		} catch (ClassNotFoundException e) {
			System.err.println("Driver class not found: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("SQL Exception: " + e.getMessage());
		}
	}
	}



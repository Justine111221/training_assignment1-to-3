package com.myapp.utility;

import java.sql.*;
import java.util.*;
import java.io.*;

public class DbConnect {
	// establish the database connection
	Connection con;

	public   Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "password");
            System.out.println("We are connected to the db");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
	// create a method to close the connection
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

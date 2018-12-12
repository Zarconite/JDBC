package jdbc;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		accessDB();
	}
	
	public static void accessDB() {
		  Connection conn = null;
		  Statement stmt = null;
		  
		  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		  final String DB_URL = "jdbc:mysql://127.0.0.1:3306/movielens";

		  final String USER = "root";
		  final String PASS = "stu564";
		  
		  try {
			    Class.forName(JDBC_DRIVER);
			} 
			catch (ClassNotFoundException e) {
		  		System.out.println("Nope");
			} 
		  
		  Read(DB_URL,USER,PASS,conn,stmt);
		  
		  Create(DB_URL,USER,PASS,conn,stmt);
		  Read(DB_URL,USER,PASS,conn,stmt);
		  
		  Update(DB_URL,USER,PASS,conn,stmt);
		  Read(DB_URL,USER,PASS,conn,stmt);
		  
		  Delete(DB_URL,USER,PASS,conn,stmt);
		  Read(DB_URL,USER,PASS,conn,stmt);
		  
		  /*	
		  try {
			    conn = DriverManager.getConnection(DB_URL, USER, PASS);
			    
			    //Create
			    System.out.println("Inserting records into the table...");
			    stmt = conn.createStatement();
			    String sql = "INSERT INTO genres " + "VALUES (19, 'Cyberpunk')";
			    stmt.executeUpdate(sql);
			    System.out.println("Inserted records into the table...");
			    
			    //Read
			    
			  	System.out.println("Genres list:");
			  	stmt = conn.createStatement();
			  	String sql2 = "SELECT id, name FROM genres";
			  	ResultSet rs = stmt.executeQuery(sql2);
			  	while (rs.next()) {
			  	  int id = rs.getInt("id");
			  	  String name = rs.getString("name");
			  	  System.out.println("ID: " + id + ", name: " + name);
			  	  }
			  	rs.close();
			  	
			  	//update
			  	
			  	System.out.println("Updating Cyberpunk to Cyber-Punk...");
			  	stmt = conn.createStatement();
			  	String sql3 = "UPDATE genres " + "SET name = 'Cyber-Punk' WHERE id = 19";
			  	stmt.executeUpdate(sql3);
			  	
			  	
			    //Read again
			    
			  	System.out.println("Genres list:");
			  	stmt = conn.createStatement();
			  	String sql5 = "SELECT id, name FROM genres";
			  	ResultSet rs2 = stmt.executeQuery(sql5);
			  	while (rs2.next()) {
			  	  int id = rs2.getInt("id");
			  	  String name = rs2.getString("name");
			  	  System.out.println("ID: " + id + ", name: " + name);
			  	  }
			  	rs2.close();
			  	
			  	//Delete
			  	
			  	System.out.println("Deleting Cyber-Punk...");
			  	stmt = conn.createStatement();
			  	String sql4 = "DELETE FROM genres " + "WHERE id = 19";
			  	stmt.executeUpdate(sql4);
			  	
			    //Final Read
			    
			  	System.out.println("Genres list:");
			  	stmt = conn.createStatement();
			  	String sql6 = "SELECT id, name FROM genres";
			  	ResultSet rs3 = stmt.executeQuery(sql6);
			  	while (rs3.next()) {
			  	  int id = rs3.getInt("id");
			  	  String name = rs3.getString("name");
			  	  System.out.println("ID: " + id + ", name: " + name);
			  	  }
			  	rs3.close();
			  	
		  	}
		  	catch(SQLException SQLException){
		  		System.out.println("Nope");
		  	    System.out.println("SQLException: " + SQLException.getMessage());
		  	    System.out.println("SQLState: " + SQLException.getSQLState());
		  	}
		  	*/

}
	
	public static void Create(String DB_URL,String USER,String PASS, Connection conn, Statement stmt) {
		try {
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    
		    //Create
		    System.out.println("Inserting Cyberpunk into the table...");
		    stmt = conn.createStatement();
		    String sql = "INSERT INTO genres " + "VALUES (19, 'Cyberpunk')";
		    stmt.executeUpdate(sql);
		    System.out.println("Insert complete!");
		}
		    
	  	catch(SQLException SQLException){
	  		System.out.println("Nope");
	  	    System.out.println("SQLException: " + SQLException.getMessage());
	  	    System.out.println("SQLState: " + SQLException.getSQLState());
	  	}
	}
	
	public static void Read(String DB_URL,String USER,String PASS, Connection conn, Statement stmt) {
		try {
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    
		    //Read
		  	System.out.println("Genres list:");
		  	stmt = conn.createStatement();
		  	String sql2 = "SELECT id, name FROM genres";
		  	ResultSet rs = stmt.executeQuery(sql2);
		  	while (rs.next()) {
		  	  int id = rs.getInt("id");
		  	  String name = rs.getString("name");
		  	  System.out.println("ID: " + id + ", name: " + name);
		  	  }
		  	rs.close();
		}
		    
	  	catch(SQLException SQLException){
	  		System.out.println("Nope");
	  	    System.out.println("SQLException: " + SQLException.getMessage());
	  	    System.out.println("SQLState: " + SQLException.getSQLState());
	  	}
	}
	
	public static void Update(String DB_URL,String USER,String PASS, Connection conn, Statement stmt) {
		try {
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    
		  	//update
		  	
		  	System.out.println("Updating Cyberpunk to Cyber-Punk...");
		  	stmt = conn.createStatement();
		  	String sql3 = "UPDATE genres " + "SET name = 'Cyber-Punk' WHERE id = 19";
		  	stmt.executeUpdate(sql3);
		}
		    
	  	catch(SQLException SQLException){
	  		System.out.println("Nope");
	  	    System.out.println("SQLException: " + SQLException.getMessage());
	  	    System.out.println("SQLState: " + SQLException.getSQLState());
	  	}
	}
	
	public static void Delete(String DB_URL,String USER,String PASS, Connection conn, Statement stmt) {
		try {
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    
		  	//Delete
		  	
		  	System.out.println("Deleting Cyber-Punk...");
		  	stmt = conn.createStatement();
		  	String sql4 = "DELETE FROM genres " + "WHERE id = 19";
		  	stmt.executeUpdate(sql4);
		}
		    
	  	catch(SQLException SQLException){
	  		System.out.println("Nope");
	  	    System.out.println("SQLException: " + SQLException.getMessage());
	  	    System.out.println("SQLState: " + SQLException.getSQLState());
	  	}
	}
	
}

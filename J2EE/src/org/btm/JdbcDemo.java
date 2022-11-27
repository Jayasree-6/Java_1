package org.btm;

public class JdbcDemo {

	public static void main(String[] args) {
          try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded and registered successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

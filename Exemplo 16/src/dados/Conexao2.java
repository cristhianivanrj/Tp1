package dados;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Conexao2 {
	 
	private static String JDBC_BD;
	private static String JDBC_HOST;
	private static String JDBC_DRIVER;
	private static String JDBC_URL;
	private static String JDBC_USER;
	private static String JDBC_PASSWORD;
	
    private java.sql.Connection conn = null; 
        
    
    public Conexao2(String JDBC_BD,String JDBC_USER,String JDBC_PASSWORD) {
    	this.JDBC_BD 		= JDBC_BD;
    	this.JDBC_HOST 		= "localhost";
        this.JDBC_DRIVER   	= "com.mysql.jdbc.Driver";
        this.JDBC_URL     	= "jdbc:mysql://localhost/"+JDBC_BD+"?";
        this.JDBC_USER     	= JDBC_USER;
        this.JDBC_PASSWORD 	= JDBC_PASSWORD;
	}

	public static String getJDBC_BD() {
		return JDBC_BD;
	}

	public static void setJDBC_BD(String jDBC_BD) {
		JDBC_BD = jDBC_BD;
	}

	public java.sql.Connection getConexao() throws SQLException {
    	
    	try{        	
        	 conn = DriverManager.getConnection("jdbc:mysql://"+ this.JDBC_HOST+"/"+ this.JDBC_BD +"?user="+ this.JDBC_USER +"&password="+ this.JDBC_PASSWORD); 
    	}
        catch (SQLException e) { 
        	e.printStackTrace();
        	conn = null; 
        } 
    	
		return conn;     	
    }
}

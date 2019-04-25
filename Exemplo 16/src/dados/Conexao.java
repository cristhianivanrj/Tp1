package dados;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Conexao {
	
	public static String JDBC_BD 		= "bdTest";
	public static String JDBC_HOST 		= "localhost";
	public static String JDBC_DRIVER   	= "com.mysql.jdbc.Driver";
	public static String JDBC_URL     	= "jdbc:mysql://localhost/bdTest?";
	public static String JDBC_USER     	= "camila";
	public static String JDBC_PASSWORD 	= "camila";
 

    private java.sql.Connection conn = null; 

    public static String getJDBC_BD() {
		return JDBC_BD;

	}

	public static void setJDBC_BD(String jDBC_BD) {
		JDBC_BD = jDBC_BD;
	}

	public java.sql.Connection getConexao() {
    	
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

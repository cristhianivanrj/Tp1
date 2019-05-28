package dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * A seção a seguir do código Java mostra como você pode registrar
 * o MySQL Connector / J a partir do método main () do seu aplicativo.
 * Primeiro lfazer Instalação do Connector / J, para certificar-se de ter
 * o conector instalado corretamente e o CLASSPATH configurado. 
 * Além disso, assegure-se de que o MySQL esteja configurado para aceitar 
 * conexões TCP / IP externas.
 */
public class Conexao {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //"com.mysql.cj.jdbc.Driver"; 
	private static String JDBC_URL = "jdbc:mysql://localhost/testConexion?useSSL=false";
	private static String JDBC_USER = "camila";
	private static String JDBC_PASS = "camila";
	private static Driver driver =null;
	
	public static synchronized Connection getConnection()
            throws SQLException {
        if (driver == null) {
            try {
                //Define o driver 
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.out.println("Falha ocorreu ao carregar o driver JDBC");
                e.printStackTrace();
            }
        }
        //Se não houver error, solicitar conexão.
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }	
	
	 //Terminar  resultSet
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }   
    
    //Terminar PrepareStatement
    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }  
    
    //Terminar conexão
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }       	
}

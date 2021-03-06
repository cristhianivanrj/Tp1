package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Rule;

//import junit.framework.Assert;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mysql.jdbc.Connection;
import dados.Conexao2;

public class Conexao2Test {
	
	private static final String bd= "bdTest";
	private static final String user= "camila";
	private static final String invalidUser = "Mafer";
	private static final String password= "camila";
	private static final String InvalidPassword= "cam";
	private Conexao2 conexao;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testConexaoOk() {		
		conexao =new Conexao2(bd,user,password);
		java.sql.Connection conn = null;
		try {
			conn =conexao.getConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			//Assert.fail("Conexao retorno erro ");
		}
		Assert.assertThat(conn, Matchers.notNullValue());		
	}
	
	@Test 
	public void testConexaoErr(){
		conexao = new Conexao2(bd,invalidUser,InvalidPassword);
		java.sql.Connection conn = null;		
		try {
			conn = conexao.getConexao();
			if(conn == null){
				//Assert.fail("La conexao tem falha");				
			}
		} catch (SQLException e) {
			Assert.assertThat(e, Matchers.isA(SQLException.class));
			Assert.assertThat(e.getMessage(), Matchers.startsWith("Access denied "));
			Assert.assertThat(e.getMessage(), Matchers.containsString("'@'localhost'"));												
		}
		Assert.assertThat(conn, Matchers.nullValue());
	}	
	@Test
	public void testGetJDBC_BD(){
		conexao =new Conexao2(bd,user,password);		
		String atual = conexao.getJDBC_BD();
		String esperado = bd;
		Assert.assertEquals("Comparar nome bd ", esperado, atual);		
	}
	
	@Test 
	public void testSetJDBC_BD(){			
		conexao =new Conexao2(bd,user,password);
		conexao.setJDBC_BD("camilaBD");	
		String atual = conexao.getJDBC_BD();
		String esperado = bd;
		Assert.assertNotEquals("abril", atual);		
	}
	
//	
	
//	@Test(expected = SQLException.class)
//	public void testConexaoErrAnotacoes() throws SQLException{
//		conexao = new Conexao2(bd,invalidUser,InvalidPassword);
//		conexao.getConexao();
//		}
	
	
//	@Test
//	public void testConexaoErrRegras() throws SQLException{
//		exception.expect(SQLException.class);
//		exception.expectMessage("Access denied for ");
//		
//		conexao = new Conexao2(bd,invalidUser,InvalidPassword);
//		conexao.getConexao();
//		}



}








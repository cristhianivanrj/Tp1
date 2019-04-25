package test;
import static org.junit.Assert.*;

import java.util.regex.Matcher;
//import junit.framework.Assert;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.mysql.jdbc.Connection;

import dados.Conexao;

public class ConexaoTest {
	private Conexao conexao;

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		//fail("Not yet implemented");
		//Assert.fail("Prueba de Falla");
	}
	
	@Test
	public void testFailConnectionBD(){
		conexao = new Conexao();
		java.sql.Connection con = conexao.getConexao(); 
		if(con != null){
			System.out.println("Conexao ok ");
		}
		Assert.assertThat(con, Matchers.notNullValue());
		Assert.assertThat(conexao.getJDBC_BD(), Matchers.equalTo("bdTest"));											
	}
	
	@Test
	public void testSetJDBC_BD(){
		conexao = new Conexao();
		conexao.setJDBC_BD("bdTest");
		java.sql.Connection con = conexao.getConexao(); 
		if(con != null){
			System.out.println("Conexao ok ");
		}
		Assert.assertThat(con, Matchers.notNullValue());		
	}
	
	@Test 
	public void testFalhaConnectBD(){
		conexao = new Conexao();
		conexao.setJDBC_BD("errada");
		java.sql.Connection con = conexao.getConexao();
		Assert.assertThat(con, Matchers.nullValue());
	}
	
	

}

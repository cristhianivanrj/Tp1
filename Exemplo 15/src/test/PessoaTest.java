//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;

package test;

import main.Pessoa;
import main.UtilPessoa;
import org.junit.runners.MethodSorters;
import org.junit.*;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PessoaTest {
		
	@Before
	public void setUpBeforeClass() throws Exception {	
		
		System.out.println("@Before: Execucao feita antes dos testes");
	}

	@After
	public void tearDownAfterClass() throws Exception {
		System.out.println("@After: Execucao feita depois de cada teste");
	}

	@Test
	public void testGetIdPessoa() {
		Pessoa pessoa =new Pessoa();
		pessoa.setIdPessoa(16);
		int atualIdPessoa =pessoa.getIdPessoa();
		Assert.assertEquals("IdPessoa  diferente",16, atualIdPessoa);
		System.out.println("@Test: GetIdPessoa");
		}
	
	@Test
	public void testGetNome () {				
		Pessoa pessoa =new Pessoa();
		pessoa.setNome("Camila"); 		
		String atualNome =pessoa.getNome();
		Assert.assertEquals("Nome � diferente", "Camila", atualNome);
		System.out.println("@Test: GetNome");						
		}

	@Test 
	public void testGetSobreNome() {
		Pessoa pessoa =new Pessoa();
		pessoa.setSobrenome("Ramirez");	
		String atualSobreNome =pessoa.getSobrenome();
		Assert.assertEquals("Sobrenome � diferente", "Ramirez", atualSobreNome);
		System.out.println("@Test: GetSobreNome");			
		}		
	
	@Test
	public void testGetCarlos() {
		UtilPessoa utils = new UtilPessoa();
		Pessoa carlos =utils.GetCarlos();
		System.out.println("p1"+carlos);
		Assert.assertEquals("Ids nao Iguais ",16, carlos.getIdPessoa());
		Assert.assertEquals("Nomes nao Iguais ","Carlos", carlos.getNome());
		Assert.assertEquals("SobreNomes nao Iguais ","Romero", carlos.getSobrenome());
		}
		
	@Test
	public void testGetJuan() {
		UtilPessoa utils =new UtilPessoa();
		Pessoa Juan = utils.GetJuan();
		Assert.assertEquals("Ids nao Iguais ",17, Juan.getIdPessoa());
		Assert.assertEquals("Nomes nao Iguais ","Juan", Juan.getNome());
		Assert.assertEquals("SobreNomes nao Iguais ","Lopez", Juan.getSobrenome());
		}
	
	@Test
	public void testGetCarlosJuan() {			
		UtilPessoa utils =new UtilPessoa();
		Pessoa Carlos = utils.GetCarlos();
		Pessoa Juan = utils.GetJuan();
		Assert.assertNotEquals(Carlos, Juan);		
		}
	
	@Test
	public void testGetCarlosCamila() {
		UtilPessoa utils =new UtilPessoa();
		Pessoa Carlos = utils.GetCarlos();
		Pessoa Carlos_ = utils.GetCarlos();			
		Assert.assertEquals(Carlos, Carlos_);
		}
	
	@Test 
	public void testEquals_1(){	
		UtilPessoa utils =new UtilPessoa();
		Pessoa Camila = utils.GetCamila();
		Pessoa Other = null; 				
		boolean ResultFalse_1 = Camila.equals(Other);
		Assert.assertFalse(ResultFalse_1);
		System.out.println(ResultFalse_1);
		}
	
	@Test 
	public void testEquals_2(){			
		UtilPessoa utils =new UtilPessoa();
		Pessoa Camila = utils.GetCamila();
		Pessoa Camila_ = utils.GetCamila();		
		boolean ResultTrue = Camila.equals(Camila_);
		Assert.assertTrue(ResultTrue);
		System.out.println(ResultTrue);
		}
	
	@Test 
	public void testEquals_3(){
		UtilPessoa utils =new UtilPessoa();	
		Pessoa Camila = utils.GetCamila();
		Pessoa Other_1 = new Pessoa(); 	
		boolean ResultFalse_2 = Camila.equals(Other_1);
		Assert.assertFalse(ResultFalse_2);
		System.out.println(ResultFalse_2);
		}	
		
	@Test 
	public void testEquals_4(){
		UtilPessoa utils =new UtilPessoa();
		Pessoa Camila = utils.GetCamila();
		Pessoa Carlos = utils.GetCarlos();
		boolean ResultFalse = Camila.equals(Carlos);
		Assert.assertFalse(ResultFalse);
		System.out.println(ResultFalse);				
	}
	
	@Test
	public void testGetArrayPessoa() {
		UtilPessoa utils =new UtilPessoa();
		Pessoa Carlos = utils.GetCarlos();
		Pessoa Juan = utils.GetJuan();	
		Pessoa[] Other_1 = utils.getArrayPessoa();
		Assert.assertArrayEquals(Other_1, new Pessoa[]{Carlos,Juan});			
	}
}




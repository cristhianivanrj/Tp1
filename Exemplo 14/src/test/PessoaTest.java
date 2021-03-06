package test;

//import static org.junit.jupiter.api.Assertions.*;

import main.Pessoa;
import main.UtilPessoa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class PessoaTest {
	private UtilPessoa utils;

	@Before
	static void setUpBeforeClass() throws Exception {	
		System.out.println("@Before: feita antes de todos os testes");
	}

	@After
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll: Execu��o feita depois de cada teste");
	}

	@Before
	void setUp() throws Exception {
		
		System.out.println("@BeforeEach: Execu��o feita antes de cada teste");
		utils =new UtilPessoa();
	}
	
	@After
	void tearDown() throws Exception {
		System.out.println("@AfterEach: Execu��o feita depois de todos os testes");
	}

	@Test
	public void testGetIdPessoa() {
		Pessoa pessoa =new Pessoa();
		pessoa.setIdPessoa(16);
		int atualIdPessoa =pessoa.getIdPessoa();
		Assert.assertEquals("IdPessoa � diferente",16, atualIdPessoa);
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
			Assert.assertEquals("Sobrenome diferente", "Ramirez", atualSobreNome);
			System.out.println("@Test: GetSobreNome");			
		}		
//	
//	@Test
//	void testGetCarlos() {
//		Pessoa Carlos = utils.GetCarlos();
//		Assert.assertEquals("Ids nao Iguais ",16, Carlos.getIdPessoa());
//		Assert.assertEquals("Nomes nao Iguais ","Carlos", Carlos.getNome());
//		Assert.assertEquals("SobreNomes nao Iguais ","Romero", Carlos.getSobrenome());
//	}
//	
//		
//	@Test
//	void testGetJuan() {
//		Pessoa Juan = utils.GetJuan();
//		Assert.assertEquals("Ids nao Iguais ",17, Juan.getIdPessoa());
//		Assert.assertEquals("Nomes nao Iguais ","Juan", Juan.getNome());
//		Assert.assertEquals("SobreNomes nao Iguais ","Lopez", Juan.getSobrenome());
//	}
//	
//	@Test
//	void testGetCarlosJuan() {
//		Pessoa Carlos = utils.GetCarlos();
//		Pessoa Juan = utils.GetJuan();
//		Assert.assertNotEquals(Carlos, Juan);		
//	}
//	
//	@Test
//	void testGetCarlosCamila() {
//		Pessoa Carlos = utils.GetCarlos();
//		Pessoa Carlos_ = utils.GetCarlos();			
//		Assert.assertEquals(Carlos, Carlos_);
//	}
//	
//	@Test 
//	void testEquals_1(){
//		//if (_other == null)
//		Pessoa Camila = utils.GetCamila();
//		Pessoa Other = null; 				
//		boolean ResultFalse_1 = Camila.equals(Other);
//		Assert.assertFalse(ResultFalse_1);
//		System.out.println(ResultFalse_1);
//	}
//	
//	@Test 
//	void testEquals_2(){
//		//if (_other == this)
//		Pessoa Camila = utils.GetCamila();
//		Pessoa Camila_ = utils.GetCamila();		
//		boolean ResultTrue = Camila.equals(Camila_);
//		Assert.assertTrue(ResultTrue);
//		System.out.println(ResultTrue);
//	}
//	
//	@Test 
//	void testEquals_3(){
//		//if (!(_other instanceof Pessoa))	
//		Pessoa Camila = utils.GetCamila();
//		Pessoa Other_1 = new Pessoa(); 	
//		boolean ResultFalse_2 = Camila.equals(Other_1);
//		Assert.assertFalse(ResultFalse_2);
//		System.out.println(ResultFalse_2);
//	}	
//		
//	@Test 
//	void testEquals_4(){
//		//final Pessoa _cast = (Pessoa) _other
//		Pessoa Camila = utils.GetCamila();
//		Pessoa Carlos = utils.GetCarlos();
//		boolean ResultFalse = Camila.equals(Carlos);
//		Assert.assertFalse(ResultFalse);
//		System.out.println(ResultFalse);				
//	}
	
//	@Test
//	void testGetArrayPessoa() {
//		Pessoa Carlos = utils.GetCarlos();
//		Pessoa Juan = utils.GetJuan();	
//		Pessoa[] Other_1 = utils.getArrayPessoa();
//		Assert.assertArrayEquals(Other_1, new Pessoa[]{Carlos,Juan});			
//	}


}

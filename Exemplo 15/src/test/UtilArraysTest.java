package test;

import main.UtilArrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UtilArraysTest {
	
	private UtilArrays utils; 
	

	@Before
	public void setUp() throws Exception {
		int a=10;
		int b=2;
		utils = new UtilArrays (a,b);
	}

	@Test
	public void testGetArrayString_1() throws Exception {		
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");		
		Assert.assertArrayEquals(esperado, resultado);
	}
	
	@Test
	public void testGetArrayString_2() throws Exception {
		String [] resultado = utils.getArrayString("uno","dos", "tres");	
		Assert.assertEquals("Logitud diferente",3, resultado.length);
	}
	
	@Test
	public void testGetArrayString_3() throws Exception {
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");
		Assert.assertEquals(esperado.length, resultado.length);}
		
		//igualdade nos elementos do Array

	@Test
	public void testGetArrayString_4() throws Exception {
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");	
		Assert.assertEquals(esperado[0], resultado[0]);
	}
	
	@Test
	public void testGetArrayString_5() throws Exception {
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");
		Assert.assertEquals(esperado[1], resultado[1]);
	}
	
	@Test
	public void testGetArrayString_6() throws Exception {
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");
		Assert.assertEquals(esperado[2], resultado[2]);
	}
		
	@Test
	public void testGetArrayString_7() throws Exception {
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");
		Assert.assertNotEquals(esperado [0], resultado[1]);
	}
	
	@Test
	public void testGetArrayString_8() throws Exception {
		String [] esperado = {"uno","dos", "tres"};
		String [] resultado = utils.getArrayString("uno","dos", "tres");
		Assert.assertNotEquals(esperado [0], resultado[2]);
	}
	
	
	@Test	
	public void testConditionBoolean_1 () {
		boolean resultadoTrue = utils.MaiorQue10(11);
		Assert.assertTrue(resultadoTrue);
	}
	
	@Test	
	public void testConditionBoolean_2 () {
		boolean resultadoFalse = utils.MaiorQue10(7);	
		Assert.assertFalse(resultadoFalse);
	}
	
	@Test 	
	public void testConcatenar() {			
		//Resultado Null
		String resultadoConNull_1 = utils.concatenar(null, null);
		Assert.assertNull(resultadoConNull_1);		
		System.out.println(resultadoConNull_1);
	}
	
	@Test 	
	public void testConcatenar_2() {		
		String resultadoConNull_2 = utils.concatenar("um", null);
		Assert.assertNull(resultadoConNull_2);
		System.out.println(resultadoConNull_2);
	}
	
	@Test 	
	public void testConcatenar_3() {	
		String resultadoConNull_3 = utils.concatenar(null, "dois");
		Assert.assertNull(resultadoConNull_3);
		System.out.println(resultadoConNull_3);
	}
		//Resultado Cocatenacao
	
	@Test 	
	public void testConcatenar_4() {	
		String resultadoConcatenar = utils.concatenar("um", "dois");
		Assert.assertEquals("Resultado concatenacao", "um dois", resultadoConcatenar); 
		System.out.println(resultadoConcatenar);					
	}
	
	@Test
	
	public void testSuma(){
		int a=10;
		int b=15;
		int retornado =utils.suma(a, b);
		Assert.assertEquals("Resultado ok", a+b ,retornado );
		
		
	}
	

}

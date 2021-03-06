package test;
import java.util.Arrays;
import java.util.Collection;



import main.Utilidades;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class parametrizadoTest {
	@Parameters
	public static Collection <Object[]> datos(){
		return Arrays.asList(new Object [] []{
				{"a","b","1"},{"c","d","2"},{"e","f","3"},{"g","h","4"},{"i","j","5"}
		});
	}
	@Parameter(0)
	public String valor1;

	@Parameter(1)
	public String valor2;
	
	@Parameter(2)
	public String valor3;
	
	private Utilidades utils = new Utilidades();
	
	@Test	
	public void TestConcatenar(){
		System.out.println("V1 =  "+ valor1+ " V2 = "+valor2+ " V3= "+ valor3);
		String expected=valor1+" "+ valor2+" "+valor3;
		System.out.println(" esperado: "+ expected);
		String actual = utils.concatenar(valor1, valor2, valor3);
		System.out.println(" atual: "+ actual);
		Assert.assertEquals(expected, actual);		
	}
}

package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import main.Pessoa;
import main.Utilidades;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;//
@RunWith(JUnitParamsRunner.class)
public class UtilidadesLibreriaTest {
	
	private Utilidades utilidades;

	@Test
	@Parameters({"001,Carlos,Ramirez","002,Maria,Gomez","003, Fernanda, Jaimes"})
	public void testParametros(int Id, String nome, String Sobrenome) {
		System.out.println(" id: "+ Id+ " nome: "+nome+ " sobrenome: "+ Sobrenome);
		utilidades =new Utilidades();						
		utilidades.listar(Id, nome, Sobrenome);
		
		List expected = new ArrayList <Pessoa>();
		Pessoa p1 = new Pessoa(Id, nome, Sobrenome);
		expected.add(p1);
		System.out.println("expected"+expected);
		List actual = utilidades.getLista();		 
		Assert.assertEquals(expected, actual);				
	}
}

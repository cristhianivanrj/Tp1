package test;
import java.lang.*;
import java.util.*;

import main.UtilArrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.*;

@RunWith(Parameterized.class)
public class UtilArraysP1Test {
	
	@Parameters
	public static Collection <Object[]> datos(){
		return Arrays.asList(new Object [] []{
				{1,2},{3,5},{0,4},{8,4},{1,3}
		});
	}
	private int v1;
	private int v2;
	//private UtilArrays utils;
	
	public UtilArraysP1Test(int Valor1, int Valor2){
		v1=Valor1;
		v2=Valor2;
	}
	
	@Test
	public void testSuma(){
		System.out.println("Los parametros son a: "+v1+ " b: "+v2);
		UtilArrays utils = new UtilArrays(v1, v2);
		utils.suma(v1, v2);
		int sum = v1 + v2;
		int actual=utils.suma(v1, v2);
		Assert.assertEquals(sum, actual);		
	}
}

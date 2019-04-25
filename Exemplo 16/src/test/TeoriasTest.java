package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.*;

@RunWith(Theories.class)
public class TeoriasTest {
	
	@DataPoints
	public static String [] letras={"a","b","c"};
	
	@DataPoint
	public static int num1=1;
	
	@DataPoint
	public static int num2=2;
	
	@Theory
	public void testTeorias(String a, String b, String c,int num1, int num2){
		System.out.println(" Posiveis Combinacoes: "+a+b+c+num1+num2);		
	}
}

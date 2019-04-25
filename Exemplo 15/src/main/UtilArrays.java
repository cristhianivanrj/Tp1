package main;
import java.lang.*;

public class UtilArrays {
	private int a;
	private int b;

	public UtilArrays(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public String concatenar (String uno, String dos) {
		if(uno != null && dos != null ){
		return uno.concat(" ").concat(dos);
	}
	return null;
	}
	 	
	
	public String[] getArrayString(String ... strings ) {
			String[] array = new String[strings.length];
			for (int i=0; i < strings.length; i++){
				array[i]= strings[i];	
			}
			return array;
}
	
	public boolean MaiorQue10 (int num) {
		return num>10;
	}
	
	public int suma(int a, int b) {	
		System.out.println("Valor a :" +a +" Valor b "+b );
		return a+b;
	}
		
}

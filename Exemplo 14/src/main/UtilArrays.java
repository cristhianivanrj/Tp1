package main;

public class UtilArrays {

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
	
	
}

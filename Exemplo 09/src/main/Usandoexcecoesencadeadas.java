package main;

public class Usandoexcecoesencadeadas {

	public static void main(String[] args) {
		try 
		{
			metodo1(); //chama metodo 1		
		}// fin do try
		catch (Exception excecao)//excecao lancada do metodo1
		{
			excecao.printStackTrace();			
		} // fim do catch		
	} // fim do main

	
	//	chama metodo2 : lanca excecoes para main
	
	public static void metodo1() throws Exception
	{
		try {
			metodo2(); //chama metodo 2						
		} //fim do try
		
		catch (Exception excecao){ //Excecao lancada do metodo 2
			throw new Exception ("Excecao lanzada em metodo 1", excecao);		
		} // fim do catch		
	} // fim do metodo 1
	
	public static void metodo2() throws Exception
	{
		try{
			metodo3();
		}
		catch (Exception excecao){
			throw new Exception ("Excecao throw em metodo 2 ", excecao);
		}
	}
	public static void metodo3() throws Exception{
		throw new Exception ("Excecao lanzada em metodo 3");
		
	}

}

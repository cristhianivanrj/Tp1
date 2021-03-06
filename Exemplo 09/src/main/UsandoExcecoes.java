package main;

public class UsandoExcecoes {

	public static void main(String[] args) {
		try
		{
			System.out.println("Bloco try main");
			lancarExcecoes();		
		}
		catch  (Exception excecao ){
			System.err.println ("Excecoes em main ");
		}
		finally{
			System.out.println("Finally main");
			NaoLancaExcecoes();
		}
	}	
	public static void lancarExcecoes () throws Exception{
		 try {
			 System.out.println("Método lança exceções");
			 throw new Exception();
		 	}
		 catch (Exception excecao){
			 System.err.println("Exceções tratadas no método lancarExcecoes" );
			 throw excecao; // Relançando exceções  
		 }
		 finally {
			 System.out.println ("Finally executado en lancarExcecoes");
		 }		 		
	}
	
public static void NaoLancaExcecoes(){
	try{
		System.out.println ("Método não lança exceções");	
	}
	catch (Exception excecao){
		System.out.println (excecao);
	}
	
	finally {
		System.err.println ("Finally executado em NaoLancaExcecoes ");
	}
	//System.out.println("fin de método NaoLancaExcecoes  ");
}
	
}

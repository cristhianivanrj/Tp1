package main;
//11.8 Desempilamento de pilha

public class UsandoExcecoes2 {

	public static void main(String[] args) {
		try{			// chama lancarExcecoes para mostrar o desempilamento
			lancarExcecoes();			
		} //fim do try
		
		catch (Exception excecao){// exececao lancada em lancarExcecoes
			System.err.println("Excecao manipulada em main");
		} //fim do catch
		} //fim do main
	
	public static void lancarExcecoes() throws Exception{
		try{ //lanca uma excecao e a captura em main
			System.out.println("Metodo lanca excecoes");
			throw new Exception(); //gera a excecao
		} // fim do Try
		
		catch (RuntimeException tempoexcecucao){//captura o tipo correto
			System.err.println("Excecao manipulada em metodo de lancarExcecoes ");			
		} //fim do catch
		finally //o bloco finally sempre executa
		{
			System.err.println("finally é sempre executada");
		}//fim de fianlly
	}// fim do método lanca excecoes
} //fim da classe usandoExcecoes 

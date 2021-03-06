package main;
public class UsandoExcecoes3 {

	public static void main(String[] args) {
		try {
			metodo1();
		}// fim do try
		catch (Exception excecao) { //captura a excecao lancada no metodo
			System.err.printf("%s\n\n", excecao.getMessage());
			excecao.printStackTrace(); //Imprime rastreamento de pila de excecoes
			
			//Obter informacoes de restreamento da pilha
			StackTraceElement [] elementosTrace = excecao.getStackTrace();
			System.out.println("\n Rastreamento de pilha para getStackTrece: ");
			System.out.println("Classe  \t\t Arquivo  \t\t \tline \tMetodo ");
			
			//faz um loop por traceelements para obter a descricao da excecao
			
			for (StackTraceElement elemento: elementosTrace)
			{
				System.out.printf("%s\t", elemento.getClassName());
				System.out.printf("%s\t", elemento.getFileName());
				System.out.printf("%s\t", elemento.getLineNumber());
				System.out.printf("%s\n", elemento.getMethodName());
			}//for final			
		} // fim do catch
	}//fim do main
	
	// chama metodo2: lanca excecoes de volta para main
	
	public static void metodo1() throws Exception{
		metodo2();		
	} //fim do metodo 1
	
	
	//chama metodo 3			
	public static void metodo2() throws Exception{
		metodo3();		
	} //fim do metodo 2
		

	public static void metodo3() throws Exception{
		throw new Exception ("Excecao lancada em metodo 3");
	} //fim do metodo 3

}

package calcular;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculadoraTest {
	public static void main(String[] args) throws Exception {        
        
        double operandoA;  // Variáveis locais
        double operandoB;
        
        
		//Ler os valores operandoA, op4erandoB
		
		System.out.println("Digitar o Valor de [A]:  ");		
		BufferedReader Ain =new BufferedReader(new InputStreamReader(System.in));		
		String SA= Ain.readLine();
		//operandoA= Integer.parseInt(SA);
		operandoA = Double.parseDouble(SA);
		
		System.out.println("Digitar o Valor de  [B]:  ");		
		BufferedReader Bin =new BufferedReader(new InputStreamReader(System.in));		
		String SB= Bin.readLine();
		//operandoB= Integer.parseInt(SB);
		operandoB = Double.parseDouble(SB);
        
        Calculadora obj1 = new Calculadora(operandoA,operandoB); // Criamos um objeto da classe Calculadora
        //Mostrar operandos
        System.out.println("Operando A:" + operandoA + " y operadoB:" + operandoB); 
                
        //Mostrar resultado da soma
        System.out.println("\nResultado suma:" + obj1.somar());
        
        //Mostrar o resultado da subtração
        System.out.println("\nResultado resta:" + obj1.subtrair());
         
        //Mostrar resultado da multiplicação
        System.out.println("\nResultado multiplicacion:" + obj1.multiplicar());
        
        //Mostrar resultado da divisão
        System.out.println("\nResultado division:" + obj1.dividir());   
    }
       
}
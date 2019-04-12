package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZeroConExcecoes {
	
	//Arrojar uma exceção quando ocorre uma divisão por zero	
	public static int divisao (int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador; 		
			}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);//Para entrada de valores
		boolean continuar = true;
		
		do
		{
			try{
				System.out.println("Digite um numerador de tipo entero:  ");
				int numerador = scan.nextInt();
				
				System.out.println("Digite um denominador do tipo entero: ");
				int denominador =scan.nextInt();
				
				int resultado = divisao(numerador,denominador);
				System.out.printf("\nResulado: %d / %d = %d\n", numerador, denominador, resultado);
				continuar = false;
			}
			catch (InputMismatchException excecaodeincompatibilidade ){
				System.err.printf("\n Exceção %s\n", excecaodeincompatibilidade);
				scan.nextLine();
				System.out.println("Valor invalido par numerador, ingresar um numero enteiro: ");
			}
			catch (ArithmeticException excecoaritmetica){
				System.err.printf("\n Exceção %s\n ", excecoaritmetica);
				System.out.println("zero é um valor invalido para denominador ");				
			}
			}
		while (continuar == true);
		scan.close();
}
}
package main;
import java.util.Scanner;

public class DivisaoPorZero {
	//Arrojar uma exceção quando ocorre uma divisão por zero 
	
	public static int divisao (int numerador, int denominador){
		return numerador / denominador; 		
	}
	
	public static void main(String[] args) {
		// sem tratamento de exceções
		Scanner scan = new Scanner (System.in);//Para entrada de valores
		
		System.out.println("Digite um numerador de tipo entero:  ");
		int numerador = scan.nextInt();
		
		System.out.println("Digite um denominador do tipo entero: ");
		int denominador =scan.nextInt();
		
		int resultado = divisao(numerador,denominador);
		
		System.out.printf("\nResulado: %d / %d = %d\n", numerador, denominador, resultado);
		
		scan.close();
	}	
}

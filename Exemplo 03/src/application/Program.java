package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Calculator;

public class Program {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a operacao (+ - * /): ");
		char r = sc.next().charAt(0);
		
		System.out.print("Digite o primeiro valor: ");
		int x = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int y = sc.nextInt();
		
		Calculator cal = new Calculator(x, y);
		
		if(r == '+'){
			System.out.println(cal.adicao());
		}
		
		else if(r == '-'){
			System.out.println(cal.sub());
		}
		
		else if(r == '*'){
			System.out.println(cal.mult());
		}
		
		if(r == '/'){
			System.out.println(cal.div());
		}		
		sc.close();
	}

}

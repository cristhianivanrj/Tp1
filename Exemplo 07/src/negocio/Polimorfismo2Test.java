package negocio;

import entidades.EmpregadoComissao;
import entidades.EmpregadoHora;
import entidades.EmpregadoSalario;
import entidades.EmpregadoSalarioComissao;
import entidades.Funcionario;

public class Polimorfismo2Test {
	public static void main(String[] args) {

			EmpregadoSalario empSal =
			new EmpregadoSalario ("Maria", "Ramirez","111-222-333",800.00);
			EmpregadoHora empHora = new EmpregadoHora( "Karen", "Martinez", "222-22-2222", 16.75, 40 );
			
			EmpregadoComissao empCom = new EmpregadoComissao ("Yesid", "Jaimes", "333-33-3333", 10000, .06 );
			
			EmpregadoSalarioComissao empComSal = new EmpregadoSalarioComissao ("Sofia", "Lourdes", "444-44- 4444", 5000, .04, 300 );
			
			System.out.println( "Empregados processados individualmente:\n" );
			System.out.printf( "%s\n%s: $%,.2f\n\n", empSal, "ganhou ", empSal.salario());
			System.out.printf( "%s\n%s: $%,.2f\n\n", empHora, "ganhou ", empHora.salario());
			System.out.printf( "%s\n%s: $%,.2f\n\n", empCom, "ganhou ", empCom.salario());
			System.out.printf( "%s\n%s: $%,.2f\n\n", empComSal, "ganhou", empComSal.salario());
						
			//Criar matriz de empregados de quatro elementos
			Funcionario empregados[] = new Funcionario[ 4 ];
			
			// inicializar array com tipos de empregados
			empregados[ 0 ] = empSal;
			empregados[ 1 ] = empHora;
			empregados[ 2 ] = empCom;
			empregados[ 3 ] = empComSal;
			System.out.println( "Processados polimorficamente :\n" );
			// Empregados processados polimorficamente:
			for ( Funcionario atualEmpregado : empregados )	{
				System.out.println( atualEmpregado ); // invoca toString
				// Determinar se o elemento é EmpregadoSalarioComissao
			if ( atualEmpregado instanceof EmpregadoSalarioComissao) {
					
					EmpregadoSalarioComissao funcionario = ( EmpregadoSalarioComissao ) atualEmpregado;				
					double salarioBaseAnterior = funcionario.getSalarioSemana();
					funcionario.setSalarioSemana(1.10 * salarioBaseAnterior);
					System.out.printf("novo salário base com 10%% adicional é: $%,.2f\n", funcionario.getSalarioSemana());
				} 
			
					System.out.printf( "ganhou $%,.2f\n\n", atualEmpregado.salario());
			} 
	}

}

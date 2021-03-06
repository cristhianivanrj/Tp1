package negocio;
import entidades.*;

public class InteracoesTest {
	public static void main(String[] args) {
			Pagavel [] objetosPagavel = new Pagavel[4];
			objetosPagavel [0] = new Fatura ("01234", "UPS", 2, 375.00 );
			objetosPagavel [1] = new Fatura ("56789", "impressora", 4, 79.95);
		
			objetosPagavel [2] = new EmpregadoSalario ( "yesid", "jaimes","01234",375.00);
			objetosPagavel [3] = new EmpregadoSalario ( "John", "andrade","01234", 75.00);
			System.out.println( "Faturas e Empregados processados polimorficamente:\n" );
			for ( Pagavel atualPagavel : objetosPagavel ) {
				System.out.printf( "%s\n%s: $%,.2f\n\n", atualPagavel.toString(),"pagamento devido", atualPagavel.getValorPagamento());
			}
		}
	}

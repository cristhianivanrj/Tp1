package negocio;

import entidades.EmpregadoComComissao;

public class EmpregadoComComissaoTest {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			EmpregadoComComissao empregado = new
			EmpregadoComComissao ("Luiz", "Oliveira", "111-11-333",10000,0.06);
			System.out.println("Informações do funcionário obtidas pelos métodos get: \\ n");
			System.out.println("Nome : "+ empregado.getNome());
			System.out.println("Sobrenome : "+ empregado.getSobrenome());			
			System.out.println("Número de segurança social: " +	empregado.getNumeroSeguridadeSocial());
			System.out.printf("Vendas brutas: " + empregado.getVendasSemanaisBrutas());
			System.out.printf("A taxa de comissão: "+ empregado.getTaxadeComissao());
			empregado.setVendasSemanaisBrutas(500);
			empregado.setTaxadecomissao(.1);
			System.out.printf("\n%s: \n\n%s\n", "Atualização",
			empregado);
			}
	}


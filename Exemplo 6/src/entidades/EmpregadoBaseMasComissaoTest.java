package entidades;

public class EmpregadoBaseMasComissaoTest {

	public static void main(String[] args) {
			EmpregadoBaseMasComissao empregado = new EmpregadoBaseMasComissao("Maria", "Ramirez","17-2235", 2500,0.04, 300);
			System.out.println("Informacao obtida usando Metodos gets:");
			System.out.println("Nome: " + empregado.getNome());
			System.out.println("Sobrenome: " + empregado.getSobrenome());
			System.out.println("Número de segurança	social: "+ empregado.getNumeroSeguridadeSocial());
			System.out.println("Vendas brutas: " + empregado.getVendasSemanaisBrutas());
			System.out.println("A taxa de comissão: "+ empregado.getTaxadeComissao());
			System.out.println("O salario base: "+ empregado.getSalarioBase());	

			empregado.setSalarioBase(1000);
			System.out.println("\nAtualizar \n" + empregado.toString());
			}
		
}

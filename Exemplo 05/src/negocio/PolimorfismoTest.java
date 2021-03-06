package negocio;
import entidades.EmpregadoBaseMasComissao;
import entidades.EmpregadoComComissao;


public class PolimorfismoTest {
	public static void main(String[] args) {

		//Criam um objeto EmpregadoComComissao e atribuem sua referencia a uma variável
		
		EmpregadoComComissao EmpComissao =new EmpregadoComComissao("Camila","Gomez", "11-111-222", 10000,0.06);
		
		//Criam um objeto EmpregadoBaseMasComissao e atribuem sua referencia a uma variável
		EmpregadoBaseMasComissao EmpBase = new EmpregadoBaseMasComissao("Fernanda", "Ramirez", "33-444-555", 15000,0.04,300);
		
		//Os métodos da superclasse y e subclasse são invocados explicitamente.
		System.out.println("Chamada toString de EmpregadoComComissao (Superclasse) "+ EmpComissao.toString());
		System.out.println("Chamada toString de	EmpregadoBaseMaisComissao (Subclasse)"+ EmpBase.toString());
		
		//Invoca toString no objeto de subclasse utilizando a variável de superclasse
		EmpregadoComComissao EmpComissao2 = EmpBase;
		
		//Chama o método toString da Classe	EmpregadoBaseMasComissao
		System.out.println("Chamada toString de EmpBase (subclasse) usando variavel de superclasse "+ EmpComissao2.toString());
		}
}

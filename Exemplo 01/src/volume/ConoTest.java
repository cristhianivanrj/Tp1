package volume;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class ConoTest {


	public static void main(String[] args) {
		
		double Vc;
		//Criar objetoS
		ConoTroncado C1;
		C1=new ConoTroncado();
		ConoTroncado C2= new ConoTroncado(); //Método simplificado
		
		//Modificar valores 
		C1.Rb=125;
		C1.Rm=10;
		C1.G=230;
		
		//Chamar um método do objeto
		System.out.println("Mostrar Valores C1");
		C1.mostrarDados();
		System.out.println("Mostrar Valores C2");
		C2.mostrarDados();
		
		//Chamar um método do objeto		
		Vc = C1.CalcularVolume();
		System.out.println("Mostrar Valor Volume 1: " + Vc);
		
		
		System.out.println("Mostrar Valor Volume 2: " + C2.CalcularVolume(125, 10, 230));
		//3540763.0839057225

	}

}

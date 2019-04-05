package volume;
public class ConoTroncado {
	//Definimos os atributos e variáveis de nossa classe.
	int Rb;
	int Rm; 
	int G;
	
	//Construtor vazio 
	ConoTroncado(){
	}	
	
	ConoTroncado(int Rb, int Rm, int G){
		this.Rb = Rb;
		this.Rm = Rm;
		this.G = G;
	}
	
public void mostrarDados() {
	System.out.println("Valor Raio Base: "+Rb);
	System.out.println("Valor Raio Menor: "+Rm);
	System.out.println("Valor Generatrix: "+G);	
}

double CalcularVolume( ){
	return  ((Math.PI)*(Math.sqrt(Math.pow(G, 2)- Math.pow((Rb-Rm), 2)))*(Math.pow(Rb,2)+Math.pow(Rm, 2) + (Rb*Rm)))/3;
}

double CalcularVolume(int Rb, int Rm, int G ){
	double part0 =(Math.PI);
	double part1 = (Math.sqrt(Math.pow(G, 2)- Math.pow((Rb-Rm), 2)));
	double part2 = (Math.pow(Rb,2)+Math.pow(Rm, 2) + (Rb*Rm));
	double Vc=(part0*part1*part2)/3;
	return Vc;
}

}


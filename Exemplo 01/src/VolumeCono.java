import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VolumeCono {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int Rb,Rm,G;	
		double Vc;
		
		//Ler os valores Rb, Rm e G
		
		System.out.println("Digitar o Valor de [Rb]:  ");		
		BufferedReader Rbin =new BufferedReader(new InputStreamReader(System.in));		
		String S1= Rbin.readLine();
		Rb= Integer.parseInt(S1);
		
		System.out.println("Digitar o Valor de  [Rm]:  ");		
		BufferedReader Rmin =new BufferedReader(new InputStreamReader(System.in));		
		String S2= Rmin.readLine();
		Rm= Integer.parseInt(S2);
		
		System.out.println("Digitar o Valor de [G]:  ");		
		BufferedReader Gin =new BufferedReader(new InputStreamReader(System.in));		
		String S3= Gin.readLine();
		G= Integer.parseInt(S3);
		
						
		System.out.println("Valor Rb,Rm e G : "+ Rb + " " + Rm + " "+ " "+ G);
		
			
		Vc= ((Math.PI)*(Math.sqrt(Math.pow(G, 2)- Math.pow((Rb-Rm), 2)))*(Math.pow(Rb,2)+Math.pow(Rm, 2) + (Rb*Rm)))/3;	
		
		System.out.println("Volume Vc:   :" + Vc);
		
	}

}

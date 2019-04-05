package calcular;
public class Calculadora {
    double a;    //Atributos da classe Calculadora
    double b;
    
    Calculadora(){} 	//Construtor vazio    
    Calculadora( double a , double b){ //Construtor com 2 argumentos
        
        this.a = a; 	//Uso do operador this para diferenciar entre variáveis e atributos. 
        this.b = b;
    }
    
    double somar(){ 
        return a + b;	//método Somar usa os atributos da classe. 
    }
    
    double subtrair(){
        return a - b;   //Método  restar
    }
    
    double multiplicar(){  //Método multiplicar
        return a * b;
    }
    

    double dividir(){ 		//Método dividir
        return a / b;
    }
    
}
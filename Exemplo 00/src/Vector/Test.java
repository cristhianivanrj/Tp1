package Vector;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Vector ListaEmpregados = new Vector();
	    ListaEmpregados.addElement(new EntidadeVector("Jose Luis","42435445",2222));
	    ListaEmpregados.addElement(new EntidadeVector("Bianca ","45454322",1111));
	    ListaEmpregados.addElement(new EntidadeVector("Vitor v","9861234",3333));
	    for(int i = 0; i < ListaEmpregados.size(); i++) {
	    	EntidadeVector atual =(EntidadeVector) ListaEmpregados.elementAt(i);
		      System.out.println("Empregado " + i + ":");
		      System.out.println(atual);
		    }
	}
}


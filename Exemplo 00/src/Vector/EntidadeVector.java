package Vector;
import java.util.*;

public class EntidadeVector {
		/**
	 * @param args
	 */	
	  String nome;
	  String fone;
	  int idCadastro;
	  
	  EntidadeVector(String nome, String fone, int idCadastro) {
		    this.nome = new String(nome);
		    this.fone = new String(fone);
		    this.idCadastro = idCadastro;
		  }
	  
	  public String toString() {
		    return("Nome: " + nome + "\nfone: " + fone + "\nidCadastro: " + idCadastro);
		  }
		}
	  










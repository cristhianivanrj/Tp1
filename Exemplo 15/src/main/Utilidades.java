package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Utilidades {
	private List lista;

	public List getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	public String concatenar (String uno, String dos, String tres) {
		if(uno != null && dos != null ){
		return uno.concat(" ").concat(dos+" ").concat(tres);
	}
	return null;
	}	
	
	 public List <Pessoa> listar(int idPessoa, String nome, String Sobrenome){
		 List lista = new ArrayList <Pessoa>();
		 Pessoa p1 = new Pessoa(idPessoa, nome, Sobrenome);
		 lista.add(p1);
		 setLista(lista);
		 return lista;
	 }
	

	
      
      
}

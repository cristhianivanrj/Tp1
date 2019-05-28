package control;

import dados.PessoaJDBC;
import domain.Pessoa;
import java.util.List;


public class GestaoPessoas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PessoaJDBC pessoasJDBC = new PessoaJDBC();
		//Testear método insert
		//pessoasJDBC.insert("Camila", "Ramirez");
		
        //Testear método update
       //pessoasJDBC.update(2, "Nome2", "sobrenome2");
		
      //Testear método delete
       
		
		//bpessoasJDBC.delete(2);
        
        //Testear método select
        //Uso do objeto Pessoa para encapsular a informação
        //de um registro do banco de dados

		
		List<Pessoa> pessoas = pessoasJDBC.select();
        for (Pessoa pessoa : pessoas) {
        	System.out.print(pessoa);
            System.out.println("");
	}

}
}
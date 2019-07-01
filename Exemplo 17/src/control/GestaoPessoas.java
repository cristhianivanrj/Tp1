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
		//pessoasJDBC.insert("Carlos", "Tarantino");
		
        //Testear método update
      	//pessoasJDBC.update(3, "Nome3", "sobrenome3");
		
		//Testear método delete
       
		
		//pessoasJDBC.delete(3);
        
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
package test;

//import static org.junit.Assert.*;
//import junit.framework.Assert;

import main.Pessoa;
import main.UtilPessoa;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest2 {

	private UtilPessoa utils;
	@Test
	public void testGetIdPessoa() {
		//fail("Not yet implemented");
		Pessoa person = new Pessoa();
		person.setIdPessoa(16);
		int actualId = person.getIdPessoa();
		Assert.assertEquals("IdPessoa  diferente",16, actualId);		
	}

	@Test
	public void testGetNome() {		
		Pessoa person = new Pessoa();
		String nome = "Carlos";
		person.setNome(nome);
		String nomeAtual= person.getNome();
		Assert.assertEquals("Nome igual",nome,nomeAtual);
	}

}

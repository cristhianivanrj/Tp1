package main;
public class UtilPessoa {
	private Pessoa Carlos;
	private Pessoa  Juan;
	private Pessoa  Camila;
	
	
	public UtilPessoa() {
		Carlos = new Pessoa();
		Carlos.setIdPessoa(16);
		Carlos.setNome("Carlos");
		Carlos.setSobrenome("Romero");
		
		Juan = new Pessoa();
		Juan.setIdPessoa(17);
		Juan.setNome("Juan");
		Juan.setSobrenome("Lopez");
		
		Camila = new Pessoa();
		Camila.setIdPessoa(16);
		Camila.setNome("Camila");
		Camila.setSobrenome("Ramirez");
	}	
	
	public Pessoa GetCarlos() {
		return Carlos;		
	}
	
	public Pessoa GetJuan() {
		return Juan;		
	}
	public Pessoa GetCamila() {
		 return Camila;
	}
		

	/*** AssertArrayEquals */
	
	public Pessoa[] getArrayPessoa() {
		Pessoa[] pessoas = {Carlos, Juan};
		return pessoas;
		
	}
	
}

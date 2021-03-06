package entidades;
public class Autor extends Artista{
	
	private int anoCriacao;

	public Autor(){
		
	}
	public Autor(String nome, int anoCriacao){
		super(nome);
		this.anoCriacao =anoCriacao;		
	}
	
	public Autor(String nome, String nacionalidade, int anoCriacao) {
		super(nome, nacionalidade);
		this.anoCriacao =anoCriacao;
	}	
	
	public void setAnoCriacao(int anoCriacao){
		this.anoCriacao = anoCriacao;		
	}

	public int getAnoCriacao(){
		return anoCriacao;
	}
	

	public String toString() {
		
		return super.toString() +" Autor [anoCriacao ="+ anoCriacao + "]";
	}		
}

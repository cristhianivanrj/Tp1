package entidades;

public class Interprete extends Artista{
	private  boolean adaptacao;
	
	public Interprete(){	
	}
	
	public Interprete (String nome, String nacionalidade, boolean adaptacao){
		super(nome,nacionalidade);
		this.adaptacao = adaptacao;
	}
	
	public Interprete (String nome, boolean adaptacao){
		super(nome);
		this.adaptacao = adaptacao;
	}
	
	public void setAdaptacao(boolean adaptacao){
		this.adaptacao = adaptacao;		
	}
	public boolean isAdaptacao(){
		return adaptacao;
	}
		
	public String toString (){
		return super.toString() + "Interprete [ adaptacao = "+ adaptacao+"]"; 
	}

}

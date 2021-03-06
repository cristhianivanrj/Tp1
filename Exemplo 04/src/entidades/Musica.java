package entidades;
import java.util.ArrayList;
import java.util.List;

public class Musica {
	
	private String nome;
	private String duracao;
	private List<Autor> autor = new ArrayList<Autor>();
	private List<Interprete> interprete = new ArrayList<Interprete>();
	
	public Musica(){
		
	}
	
	public Musica(String nome){
		this.nome =nome;
	}
	
	public Musica(String nome, String duracao){
		this.nome = nome;
		this.duracao = duracao;
	}	
	
	public Musica(String nome, String duracao, Autor autor, Interprete interprete){
		this.nome=nome;
		this.duracao=duracao;
		this.autor.add(autor);
		this.interprete.add(interprete);
	}
	
	public void setNome(String nome){
		this.nome=nome;		
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDuracao(String duracao){
		this.duracao = duracao;
	}
	
	public String getDruracao(){
		return duracao;
	}
			
	public List<Autor> getAutor() {
		return autor;
	}
	public void inserirInterprete(Interprete interprete){
		this.interprete.add(interprete);
	}
	
	public void inserirAutor(Autor autor){
		this.autor.add(autor);
	}

	public String toString (){
		return "Musica [ nome=" +nome + ", duracao" + duracao +", Autor: "+ autor + ", Interprete:"+ interprete+ "]"; 
	}

}

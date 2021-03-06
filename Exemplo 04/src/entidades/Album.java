package entidades;

import java.util.ArrayList;
import java.util.List;

public class Album {
	private String  nome;
	private String duracao;
	private int ano;	
    private List<Musicas> musicas = new ArrayList<Musicas>();
    public List<Autores>  autores= new ArrayList<Autores>();
    public List<Interpretes> interpretes = new ArrayList<Interpretes>();        

	public Album(){		
	}
	
	public Album(String nome){
		this.nome = nome;
	}
	
	public Album(String nome, String duracao){
		this.nome= nome;
		this.duracao =duracao;
	}
	
	public Album(String nome, String duracao, int ano){
		this.nome =nome;
		this.duracao= duracao;
		this.ano = ano;
	}
	
	public Album(String nome, String duracao, int ano, Musicas musicas, Autores autores, Interpretes interpretes){
		this.nome = nome;
		this.duracao = duracao;
		this.ano = ano;
		this.musicas.add(musicas);
		this.autores.add(autores);
		this.interpretes.add(interpretes);
	}
		
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDuracao(String duracao){
		this.duracao = duracao;
	}
	public String getDuracao(){
		return duracao;		
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getAno(){
		return ano;
	}
		
	public List<Musicas> getMusicas() {
		return musicas;
	}

	
	public List<Autores> getAutores() {
		return autores;
	}
	
	public void inserirMusicas(Musicas musicas) {
		this.musicas.add(musicas);
	}
	
	public void inserirAutores(Autores autores) {
		this.autores.add(autores);
	}
	
	public void inserirInterpretes(Interpretes interpretes){
		this.interpretes.add(interpretes);
	}
			
	public String toString (){
		return "Album [nome = "+nome+ ", duracao = "+ duracao + ", ano"+ ano +", Musicas: "+musicas+ ", Interpretes " + interpretes + ", Autores :"+autores+ "]";
	}
}

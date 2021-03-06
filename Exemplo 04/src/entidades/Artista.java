package entidades;
import java.util.ArrayList;
import java.util.List;


public abstract class Artista {
	
	private String nome;
	private String nacionalidade;
	private List<Album> albums = new ArrayList<>();
	private List<Musica> musicas = new ArrayList<>();
	
	public Artista(){		
	}
	
	public Artista(String nome){
		super();
		this.nome =nome;
	}
		
	public Artista(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade(){
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade =nacionalidade;		
	}
	
	public List<Album> getAlbum() {
		return albums;
	}

	public void setAlbum(List<Album> album) {
		this.albums = album;
	}
	
	
	public void inserirAlbum(Album album) {
		this.albums.add(album);		
	}
	
	public void inserirMusica(Musica musica){
		this.musicas.add(musica);
	}
	
	public List<Artista> buscaPorNome(String nome){
		List<Artista> artistasBusca = new ArrayList<Artista>();		
		return artistasBusca;
	}
	
	public List<Artista> buscaPorNacionalidade(String nacionalidade){
		List<Artista> artistaBusca = new ArrayList <Artista>();		
		return artistaBusca;		
	}
		

	public String toString() {
		return "\nArtista [ nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
	}
	
	
	

}

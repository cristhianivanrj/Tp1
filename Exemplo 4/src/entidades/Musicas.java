package entidades;
import java.util.List;
import java.util.ArrayList;

public class Musicas {
	
	private List<Musica> musicas = new ArrayList<Musica>();
	
	public void inserirMusicas(Musica musica){
		this.musicas.add(musica);
	}
	
	public void inserirListaMusica(List<Musica> musicas){
		this.musicas.addAll(musicas);
	}
	
	public List<Musica> getMusicais(){
		return musicas;
	}

	@Override
	public String toString() {
		return "Musicas [ musicas=" + musicas + "]";
	}
	
	

}

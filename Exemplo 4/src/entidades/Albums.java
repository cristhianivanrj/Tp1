package entidades;
import java.util.List;
import java.util.ArrayList;

public class Albums {
	
	private List<Album> albums =new ArrayList<Album>();
	
	public void inserirAlbum(Album album){
		this.albums.add(album);		
	}
	
	public void InserirListaAlbum(List<Album> albums){
		this.albums.addAll(albums);
	}
	
	public List<Album> getAlbums(){
		return albums;
	}

	@Override
	public String toString() {
		return "Albums [albums=" + albums + "]";
	}
	

}

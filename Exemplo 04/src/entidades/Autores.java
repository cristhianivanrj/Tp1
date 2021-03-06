package entidades;

import java.util.ArrayList;
import java.util.List;


public class Autores extends Autor{
	
	protected List<Autor> autores = new ArrayList<>();
	
	public void inserirAutor(Autor autor){
		this.autores.add(autor);
	}
	
	
	public void inserirListaAutor(List<Autor> autores){
		this.autores.addAll(autores);
	}

	public List<Autor> getAutores() {
		return autores;
	}
			
	
	public List<Artista> buscaPorNome(String nome){
		List<Artista> artistasBusca = new ArrayList<Artista>();

		for(Autor autor: this.autores) {
			if(autor.getNome() == nome) {
				artistasBusca.add(autor);
			}
		}		
		return artistasBusca;
	}
		
    public List<Autor> getAutoresList() {
        List<Autor> Oautor = this.autores;
           return Oautor;
    }
	
	
	public List<Artista> buscaPorNacionalidade(String nacionalidade){
		List<Artista> artistaBusca = new ArrayList <Artista>();
		
		for(Autor autor: this.autores){
			if(autor.getNacionalidade() == nacionalidade){
				artistaBusca.add(autor);
			}
		}
		return artistaBusca;		
	}	

	@Override
	public String toString() {
		return  autores + "]";
	}



}

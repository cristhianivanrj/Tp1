package entidades;
import java.util.ArrayList;
import java.util.List;
public class Interpretes extends Interprete {

private List<Interprete> interpretes = new ArrayList<Interprete>();

public void inserirInterprete(Interprete interprete){
	this.interpretes.add(interprete);
}

public void inserirListaInterprete(List<Interprete> interpretes){
	this.interpretes.addAll(interpretes);
}

public List<Interprete> getInterpretes(){
	return interpretes;
}

@Override
public List<Artista> buscaPorNome(String nome) {
	
	List<Artista> artistasBusca = new ArrayList<Artista>();

	for(Interprete interpretes: this.interpretes) {
		if(interpretes.getNome() == nome) {
			artistasBusca.add(interpretes);
		}
	}		
	return artistasBusca;
}


@Override
public List<Artista> buscaPorNacionalidade(String nacionalidade) {
	List<Artista> artistasBusca =new ArrayList<Artista>();
	for(Interprete interpretes : this.interpretes){
		if(interpretes.getNacionalidade() == nacionalidade){
			artistasBusca.add(interpretes);
		}
	}		
	return artistasBusca;
}

@Override
public String toString() {
	return "Interpretes [ interpretes=" + interpretes + "]";
}



}

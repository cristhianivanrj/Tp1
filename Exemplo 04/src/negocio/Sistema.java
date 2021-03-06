package negocio;

import entidades.Albums;
import entidades.Autor;
import entidades.Album;
import entidades.Autores;
import entidades.Interprete;
import entidades.Interpretes;
import entidades.Musica;
import entidades.Musicas;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
	/**
	 * @param args
	 * Exemplo Cadastro de Artistas, musicas e albumes
	 * @author cristhian
	 * @
	 */
	public static void main(String[] args) {	
        	
		//Inserir Autores		
		Autores autores = new Autores();               
        Autor dadoVilla = new Autor("xado Villa-Lobos", "Belgica",1965);
        Autor macercelo = new Autor("Marcelo Bonfa", "Brasil",1979); 
        Autor renatoRuso = new Autor("Renato Russo", "Brasil", 1960);
		autores.inserirAutor(dadoVilla);		
		autores.inserirAutor(macercelo);
		autores.inserirAutor(renatoRuso);
		System.out.println("\nListas Autor: ");
		System.out.println("Autores : " + autores);
	
		//Inserir Interpretes		
		Interpretes interpretes = new Interpretes();
		Interprete Cassia = new Interprete("Cassia Eller", "Brasil",true);
		Interprete sabina = new Interprete("Joaquin Sabina","España",true);
		Interprete ruso = new Interprete("Renato Russo", "Brasil",true);
		interpretes.inserirInterprete(Cassia);
		interpretes.inserirInterprete(ruso);
		interpretes.inserirInterprete(sabina);	
		System.out.println("\nListas Interprete: ");
		System.out.println("Interprete :  "+ interpretes);				
		
//		// Inserir Musicas	
			
		Musicas musicas = new Musicas();
		Musica m1 = new Musica("Geração Coca-Cola","2:22 min", dadoVilla, ruso);
		Musica m2 = new Musica("Teorema","3:06min", macercelo, Cassia);		
		musicas.inserirMusicas(m1);
		musicas.inserirMusicas(m2);
		System.out.println("\nListas Musica: ");
		System.out.println("Musicas : "+ musicas);
//		
//		
//		//Inserir Albun
		
		Albums albums = new Albums();		
		Album a1 = new Album(" Legião Urbana 30 Anos", "37:09min", 1985, musicas, autores,  interpretes);
		albums.inserirAlbum(a1);	
		System.out.println("\nListas Album: ");
		System.out.println("Album: "+ a1);
//		
//		//Busca en Autores	
		
		System.out.println("\nBusca en Autores: ");		
		System.out.println("-> Autor nome: "+ autores.buscaPorNome("Marcelo Bonfa"));				
		System.out.println("-> Autor nacionalidade: "+ autores.buscaPorNacionalidade("Belgica"));
//		
//		//Busca en Interpretes
		System.out.println("\nBusca en Interpretes");		
		System.out.println("-> Autor nome: "+interpretes.buscaPorNome("Cassia Eller"));
		System.out.println("-> Autor nacionalidade: "+ interpretes.buscaPorNacionalidade("Brasil"));
		
//		//Ordenar lista	
		
		System.out.println("\nOrdenar Lista ");
		System.out.println("Sin Ordenar : "+autores);
		
        java.util.List<Autor> Oautores = autores.getAutoresList();
        Collections.sort(Oautores, new Comparator<Autor>(){
            
            public int compare(Autor a1, Autor a2) {
            	return a1.getNome().compareToIgnoreCase(a2.getNome());                
            }
        });
        
        System.out.println("Lista en Orden: "+autores);
		
	}

}

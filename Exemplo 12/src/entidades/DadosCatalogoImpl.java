package entidades;
import integracao.DadosFilme;
import integracao.DadosCatalogo;

import java.util.List;

import util.AcessoDadosEx;
import util.LeituraDadosEx;
public class DadosCatalogoImpl implements DadosCatalogo {
	/**
	 * @author cristhian
	 * Clase usada para realcionar los metodos  
	 */
    private final DadosFilme dados;    
    
    public DadosCatalogoImpl() {
        this.dados = new DadosFilmeImpl();
    }     
    public void inserirFilme(String nomeFilme, String nomeArquivo) {
        Filme filme = new Filme(nomeFilme);
        boolean inserir = false;
        try {
            inserir = dados.existe(nomeArquivo);
            dados.escrever(filme, nomeArquivo, inserir);
        } catch (AcessoDadosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    public void listarFilmes(String nomeArquivo) {
        try {
            List <Filme> filmes = dados.listar(nomeArquivo);
            for (Filme filme : filmes) {
                System.out.println("Filme:" + filme);
            }
        } catch (AcessoDadosEx ex) {
            System.out.println("Erro de acesso a dados");
            ex.printStackTrace();
        }
    }

    public void buscaFilme(String nomeArquivo, String busca) {
        String resultado = null;
        try {
            resultado = dados.busca(busca, nomeArquivo);
        } catch (LeituraDadosEx ex) {
            System.out.println("Erro ao procurar o filme");
            ex.printStackTrace();
        }
        System.out.println("Resultado da pesquisa:" + resultado);
    }

    public void iniciarArquivo(String nomeArquivo) {
        try {
            if (dados.existe(nomeArquivo)) {
                dados.apagar(nomeArquivo);
                dados.criar(nomeArquivo);
            } else {                
                dados.criar(nomeArquivo);
            }
        } catch (AcessoDadosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

}

  
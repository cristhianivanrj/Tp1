package integracao;
import java.util.List;

import util.AcessoDadosEx;
import util.EscrituraDadosEx;
import util.LeituraDadosEx;

import entidades.Filme;

public interface  DadosFilme {
    boolean existe(String nomeArquivo) throws AcessoDadosEx;
    public List <Filme> listar(String nomeArquivo) throws LeituraDadosEx;
    void escrever(Filme filme, String nombeArquivo, boolean inserir) throws EscrituraDadosEx;
    public String busca(String nomeeArquivo, String buca) throws LeituraDadosEx;
    public void criar(String nomeArquivo) throws AcessoDadosEx;
    public void apagar(String nomeArquivo) throws AcessoDadosEx;
}


      
            
   
            
   
    
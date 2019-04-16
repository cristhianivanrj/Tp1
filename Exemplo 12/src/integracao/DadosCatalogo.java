package integracao;

public interface DadosCatalogo {

    public void inserirFilme(String nomeFilme, String nomeArquivo);

    public void listarFilmes(String nomeArquivo);

    public void buscaFilme(String nomeArquivo, String busca);

    public void iniciarArquivo(String nomeArquivo);

}
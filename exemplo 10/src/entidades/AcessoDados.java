package entidades;

public interface AcessoDados  {
	
    public abstract void inserir() throws AcessoDadosException;
    
    public abstract void listar() throws AcessoDadosException;
    
    public abstract void simularErro(boolean simularErro);

}

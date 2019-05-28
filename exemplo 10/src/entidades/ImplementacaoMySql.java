package entidades;

public class ImplementacaoMySql implements AcessoDados {
	
	private boolean simularErro;
		
    public ImplementacaoMySql(boolean simularErro) {
		//super();
		this.simularErro = simularErro;
	}     
    
	public void setSimularErro(boolean simularErro) {
		this.simularErro = simularErro;
	}
	
    public boolean isSimularErro() {
        return simularErro;
    }
   

	@Override
    public void inserir() throws AcessoDadosException {

         if (isSimularErro()) {
        	 System.out.println("Simular erro  em método inserir() tipo: EscreverDadosException ");
            throw new EscreverDadosException("Lancada excecao em INSERIR");
        } else {
             System.out.println("Inserir ok");
        }
    }

    @Override
    public void listar() throws AcessoDadosException {
        if (isSimularErro()) {
        	System.out.println("Simular erro em método listar()  tipo: LerDadosException");
            throw new LerDadosException("Lancada a excecao: LISTAR");
        } else {
            System.out.println("Listar ok");
        }
    }
  
    @Override
    public void simularErro(boolean simularErro) {
    	setSimularErro(simularErro);
    	
    }
}

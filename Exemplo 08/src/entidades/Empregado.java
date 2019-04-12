package entidades;

public  abstract  class  Empregado implements Pagavel  {
	private String nome;
	private String sobrenome;
	private String nss;

	public Empregado( String nome, String sobrenome, String nss) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nss =nss;
		}
	
	public String getNome() {
		return nome;}
	
	public void setNome(String nome) {
		this.nome = nome;}
	
	public String getSobrenome() {
		return sobrenome;}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;}
	
	public String getNss() {
		return nss;}
	
	public void setNss(String nss) {
		this.nss = nss;}

@Override
	public String toString()
	{
	return String.format( "%s\n%s numero de seguridade social: %s", 	getNome() , getSobrenome() , getNss() );
	
	}


}

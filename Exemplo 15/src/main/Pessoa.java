package main;

public class Pessoa 
{
	/**
	 * @author cristhian
	 * Clase usada para testear creación de objetos
	 */
	private int idPessoa;
	private String nome;
	private String sobrenome;

	public Pessoa(){
	}
	
	
	public Pessoa(int idPessoa, String nome, String sobrenome) {
		/**
		 * @author cristhian
		 * Clase usada para testear creación de objetos
		 */
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}


	public int getIdPessoa(){
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa){
		/**
		 * @author cristhian
		 * Clase usada para testear creación de objetos
		 */
		this.idPessoa = idPessoa;
	}

	public String getNome()	{
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSobrenome()	{
		return sobrenome;
	}

	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Pessoa)) {
			return false;
		}
		
		final Pessoa _cast = (Pessoa) _other;
		if (idPessoa != _cast.idPessoa) {
			return false;
		}
		
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
			return false;
		}
		
		if (sobrenome == null ? _cast.sobrenome != sobrenome : !sobrenome.equals( _cast.sobrenome )) {
			return false;
		}
		
		return true;
	}


//	public int hashCode()
//	{
//		int _hashCode = 0;
//		_hashCode = 29 * _hashCode + idPessoa;
//		if (nome != null) {
//			_hashCode = 29 * _hashCode + nome.hashCode();
//		}
//		
//		if (sobrenome != null) {
//			_hashCode = 29 * _hashCode + sobrenome.hashCode();
//		}
//		
//		return _hashCode;
//	}

//	public PessoaPk createPk()
//	{
//		return new PessoaPk(idPessoa);
//	}


	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mycompany.myapp.dto.Pessoa: " );
		ret.append( "idPessoa=" + idPessoa );
		ret.append( ", nome=" + nome );
		ret.append( ", sobrenome=" + sobrenome );
		return ret.toString();
	}

}






package entidades;


public abstract class Funcionario {
	private String nome;
	private String sobrenome;
	private String nss;
	//Construtor com três argumentos
	public Funcionario(String nome, String sobrenome, String nss) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nss = nss;
		}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNss() {
		return nss;
	}
	
	public void setNss(String nss) {
		this.nss = nss;
	}

	//retorna Representação de string do objeto Empregado
	public String toString()
	{
	return String.format( "%s %s\nNúmero da Segurança Social: %s",
	getNome(), getSobrenome(), getNss() );
	}
	//Método abstrato sobrescrito por subclasses
	public abstract double salario(); // não implementado nesta classe
	}



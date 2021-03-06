package entidades;

public class EmpregadoComComissao extends Object {
	private String nome;
	private String sobrenome;
	private String numeroSeguridadeSocial;
	private double vendasSemanaisBrutas;
	private double taxadeComissao;
	
	// constructor
	public EmpregadoComComissao(String nome, 
								String sobrenome, 
								String numeroSeguridadeSocial, 
								double vendasSemanaisBrutas, 
								double taxadeComissao) {
			this.nome = nome;
			this.sobrenome =sobrenome;
			this.numeroSeguridadeSocial=numeroSeguridadeSocial;
			this.vendasSemanaisBrutas =vendasSemanaisBrutas;
			this.taxadeComissao =taxadeComissao;
	}
	
	// Métodos Set/Get para encapsulamento
	public void setNome(String nome) {
				this.nome = nome;
		}
	public String getNome() {
		return nome;
		}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getNumeroSeguridadeSocial() {
		return numeroSeguridadeSocial;
	}
	public void setNumeroSeguridadeSocial(String numeroSeguridadeSocial) {
		this.numeroSeguridadeSocial = numeroSeguridadeSocial;
	}


	public double getVendasSemanaisBrutas() {
		return vendasSemanaisBrutas;
		}
	public void setVendasSemanaisBrutas(double
		vendasSemanaisBrutas) {
		this.vendasSemanaisBrutas = (vendasSemanaisBrutas <0.0 )? 0.0 :vendasSemanaisBrutas;
		}
	public double getTaxadeComissao() {
		return taxadeComissao;
		}
	public void setTaxadecomissao(double taxadeComissao) {
		this.taxadeComissao = taxadeComissao;
		this.taxadeComissao = (taxadeComissao > 0.0 &&
		taxadeComissao < 1)? taxadeComissao: 0.0;
		}
	public double salario() {
		return this.taxadeComissao* this.vendasSemanaisBrutas;
		}
	@Override
	public String toString() {
		return String.format("Empregado Com Comissão: \nNome: "+ this.nome + "\n Sobrenome: " + this.sobrenome + "\n Número da Segurança Social: " +this.numeroSeguridadeSocial + "\n Vendas brutas: " + this.vendasSemanaisBrutas + "\n Taxa de comissão:" + this.taxadeComissao);
		}
}


	
	
	



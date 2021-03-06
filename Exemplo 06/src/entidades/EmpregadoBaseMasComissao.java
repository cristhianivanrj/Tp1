package entidades;
public class EmpregadoBaseMasComissao extends EmpregadoComComissao {
	
	private double salarioBase;
	//constructor de seis argumentos
	public EmpregadoBaseMasComissao(String nome,
			String sobrenome,
			String numeroSeguridadeSocial,
			double vendasSemanaisBrutas,
			double taxadeComissao,
			double salarioBase) {
			super(nome, sobrenome, numeroSeguridadeSocial, vendasSemanaisBrutas, taxadeComissao);
			setSalarioBase(salarioBase);
	}
	public double getSalarioBase() {
	return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
	}
	@Override
	public double salario()
	{
	return this.salarioBase +
	(super.getTaxadeComissao()* super.getVendasSemanaisBrutas());
	}
	@Override
	public String toString() {
	return super.toString() + "\nSalario Base: " +
	this.salarioBase;
	}

	
	
	

}

package entidades;


public class EmpregadoSalario extends Funcionario{
	
	private double salarioSemanal;
			public EmpregadoSalario( String nome, String sobrenome,	String nss,	double salarioSemanal)
	{
	super(nome, sobrenome, nss );
		setSalarioSemanal( salarioSemanal );
	}

	public void setSalarioSemanal( double salarioSemanal){
		this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 :salarioSemanal;
			}
	public double getSalarioSemanal(){
		return salarioSemanal;
		}
@Override
	public double salario() {
			return getSalarioSemanal();
		}
@Override
	public String toString(){
		return String.format( "Salario Empleado: %s\n%s: $%,.2f", super.toString(), "Salario Semanal",
				getSalarioSemanal() );
}

}

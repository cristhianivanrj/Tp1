package entidades;


public class EmpregadoHora extends Funcionario {
	private double salarioHora;
	private double horas;
	public EmpregadoHora( String nome, String sobrenome, String	nss, double salarioHora, double horas ){
		super( nome, sobrenome, nss );
		setSalarioHora( salarioHora );
		setHoras( horas );
		}
	
	public void setSalarioHora( double salarioHora ){
		this.salarioHora = ( salarioHora < 0.0 ) ? 0.0 : salarioHora;
	}
	
	public double getSalarioHora() {
		return this.salarioHora;
	}
	
	public void setHoras( double horas ) {
		this.horas = ( ( horas >= 0.0 ) && ( horas <= 168.0 ) )? horas : 0.0;
	}
	
	public double getHoras() {
		return this.horas;
	}
	
@Override
	public double salario()	{
		if ( getHoras() <= 40 )
			return getSalarioHora() * getHoras();
		else
			return 40 * getSalarioHora() + ( getHoras() - 40 ) * getSalarioHora() * 1.5;
	}
	
@Override
	public String toString(){
		return String.format( "Empregado por hora: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "Salario Hora:", getSalarioHora(), "houras trabhaladas", getHoras());
	}



}

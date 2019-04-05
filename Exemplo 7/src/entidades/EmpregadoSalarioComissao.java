package entidades;


public class EmpregadoSalarioComissao extends EmpregadoComissao {
	
	private double salarioSemana;
	public EmpregadoSalarioComissao( String nome, String sobrenome,	String nss, double vendasSemanais, double taxaComissao,	double salarioSemana) {
		super( nome, sobrenome, nss, vendasSemanais, taxaComissao);
		setSalarioSemana( salarioSemana );
		}
	
	public void setSalarioSemana( double salarioSemana ) {
		this.salarioSemana = ( salarioSemana < 0.0 ) ? 0.0 : salarioSemana;
	}
	
	public double getSalarioSemana() {
		return this.salarioSemana;
	}
	
@Override
	public double salario() {
		return getSalarioSemana() + super.salario();
	}

@Override
	public String toString() {
	return String.format( "%s %s; %s: $%,.2f",	"Salario ", super.toString(), "Salario Semana", getSalarioSemana() );
	}
}



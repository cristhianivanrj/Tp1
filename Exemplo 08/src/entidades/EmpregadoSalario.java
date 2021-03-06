package entidades;

public class EmpregadoSalario extends Empregado  {
	private double salarioSemanal;
	
	public EmpregadoSalario(String nome, 
							String sobrenome,
							String nss, 
							double salarioSemanal){
			super(nome,sobrenome, nss);
			setSalarioSemanal(salarioSemanal);
			}
			
	public double getSalarioSemanal() {
			return salarioSemanal ;
			}

	public void setSalarioSemanal(double salarioSemanal) {
			this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal ;
			}
	
	@Override
	public double getValorPagamento() {
			return getSalarioSemanal();
	}
	
	@Override
	public String toString() {
			return String.format("Salario Empregado: %s\n%s: $%,.2f", super.toString(), "salário semanal",
			getSalarioSemanal());
			}
}

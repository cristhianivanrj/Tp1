package entidades;

public class EmpregadoComissao extends Funcionario {
	private double vendasSemanais ;
	private double taxaComissao; //

	public EmpregadoComissao( String nome, String sobrenome, String nss, double vendasSemanais, double taxaComissao)
			{
			super(nome, sobrenome, nss );
			setVendasSemanais( vendasSemanais );
			setTaxaComissao( taxaComissao );
			}
	
	public void setTaxaComissao( double taxaComissao ){	
		this.taxaComissao = ( taxaComissao > 0.0 && taxaComissao < 1.0 ) ? taxaComissao : 0.0;
		}
	
	public double getTaxaComissao()	{
		return this.taxaComissao;
	}
	
	public void setVendasSemanais( double vendasSemanais) {
		this.vendasSemanais = ( vendasSemanais < 0.0 ) ? 0.0 : vendasSemanais;
	}
	
	public double getVendasSemanais()	{
		return this.vendasSemanais;
	}

@Override
	public double salario () {
		return getTaxaComissao() * getVendasSemanais();
	}

@Override
public String toString()
{
return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", "Comissão Empregado", super.toString(), "Vendas Semanais ", getVendasSemanais(), "Taxa de comissão ", getTaxaComissao() );
}
}






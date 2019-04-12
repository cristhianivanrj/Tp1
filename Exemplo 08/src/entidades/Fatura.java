package entidades;

public class Fatura implements Pagavel{
	
	private String numeroPeca;
	private String descricaoPeca;
	private int quantidade ;
	private double precoItem;
	public Fatura(String numeroPeca, String descricaoPeca, int quantidade, double precoItem) {
			this.numeroPeca = numeroPeca;
			this.descricaoPeca =descricaoPeca;
			this.quantidade = quantidade;
			this.precoItem = precoItem;
	}
	
	public String getNumeroPeca() {
			return numeroPeca;
			}
	
	public void setNumeroPeca(String numeroPeca) {
			this.numeroPeca = numeroPeca;
			}
	
	public String getDescricaoPeca() {
			return descricaoPeca;
			}
	
	public void setDescricaoPeca(String descricaoPeca) {
			this.descricaoPeca = descricaoPeca;
	 	}
	public int getQuantidade() {
			return quantidade; 
			}
	
	public void setQuantidade(int quantidade) {
			this.quantidade = ( quantidade < 0 ) ? 0 :	quantidade;
			}
	
	public double getPrecoItem() {
			return precoItem;
	 }
	
	public void setPrecoItem(double precoItem) {
			this.precoItem = ( precoItem < 0.0 ) ? 0.0 : precoItem;
	 }
	
	@Override
	public String toString() {
		return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s:	$%,.2f", "fatura", " numero de peça ", getNumeroPeca(), getDescricaoPeca(), "quantity", getQuantidade(), "preço por item", getPrecoItem());
	}
	
	@Override
	public double getValorPagamento() {
		return getQuantidade() * getPrecoItem();
	}


}

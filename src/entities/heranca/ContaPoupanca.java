package entities.heranca;

public class ContaPoupanca extends Conta{
		private Double taxaDeJuros;
		
	public ContaPoupanca() {
		super(); /** 
				*super() É usado para sobrecarregar o construtor Padrão da classe atual com os 
				*parametros do construtor da Classe Pai.
		 		*
		 		**/
	}

	public ContaPoupanca(Integer numeroConta, String titularConta, Double saldoConta, Double taxaDeJuros) {
		super(numeroConta, titularConta, saldoConta);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	/**
	 * Método atualizar saldo da conta com base na taxa de Juros.
	 * */
	public void atualizarSaldo() {
		saldoConta = saldoConta * taxaDeJuros;
	}
}

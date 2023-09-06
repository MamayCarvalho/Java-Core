package entities.heranca;

/**
 * Representa uma conta bancária de uma empresa
 * 
 * @author Mayara Brandão de Carvalho
 * @since 04-09-2023
 * @version 1.0
 */
public class ContaEmpresa extends Conta {
	/**
	 * Limite para realização de empréstimo
	 */
	private Double limiteEmprestimo;

	/**
	 * Construtor padrão da classe ContaEmpresa
	 */
	public ContaEmpresa() {
		super();
	}

	/**
	 * Construtor personalizado.
	 * 
	 * @param numeroConta      Representa o número da conta, herdado do pai.
	 * @param titularConta     Representa o nome do titular da conta, herdado do
	 *                         pai.
	 * @param saldoConta       Representa o atual saldo da conta, herdado do pai.
	 * @param limiteEmprestimo Representa o limite para empréstimo.
	 */
	public ContaEmpresa(Integer numeroConta, String titularConta, Double saldoConta, Double limiteEmprestimo) {
		super(numeroConta, titularConta, saldoConta);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	/**
	 * Obtém o limite de empréstimo da conta
	 * @return O limite de empréstimo da conta.
	 */
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	
	/**
	 * Define o limite de empréstimo da conta.
	 * @param limiteSaque representa o novo limite para empréstimo da conta.
	 * */
	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	/**
	 * Realizar um empréstimo na conta empresa.
	 * @param quantidade representa o valor do empréstimo.
	 * */
	public void emprestimo(double quantidade) {
		if(quantidade <= limiteEmprestimo) {
			deposito(quantidade);
		}
		
	}
}
//05/09

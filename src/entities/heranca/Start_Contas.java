package entities.heranca;

public class Start_Contas {

	public static void main(String[] args) {
		Conta contaPF1 = new Conta(5848, "Ricardão do Pão", 0.0);
		ContaEmpresa contaPJ1 = new ContaEmpresa(6577, "Senai", 0.0, 1000.0);
		ContaPoupanca contaPP1 = new ContaPoupanca(1996, "Mamay", 20.0, 2.2);
	/**
	 * UPCASTING -> Serve para converter um Objeto da subclasse para superclasse (Classe Pai). 
	 * O motivo do método é feito para criar um vinculo
	 * */	
		Conta contaPF3 = new ContaEmpresa(2626, "Fernando", 0.0, 200.0);
		Conta contaPF4 = new ContaPoupanca(1234, "Beatriz", 0.0, 0.10);
		
		/**
		 * DOWNCASTING
		 * */
		
		ContaEmpresa contaPF5 = (ContaEmpresa) contaPF3;
		ContaEmpresa contaPF6 = (ContaEmpresa) contaPF3; // Aqui ela permite o recebimento, pois rebaixamos contaPF3 da Classe Conta para a Classe ContaEmpresa.
		contaPF6.emprestimo(100.0);
	}

}

package entities;

import java.util.Scanner;

// Classe em Java para Programa de registro e monitoramento de gastos.

public class ControleFinanceiro {
	
	private double salario;
	private double valorDespesa;
	private double saldo;
	private String despesa;
	
	// Construtores
	public ControleFinanceiro() {
		
	}
	
	public ControleFinanceiro(double salario, double valorDespesa, String despesa, double saldo) {
		this.salario = salario;
		this.valorDespesa = valorDespesa;
		this.despesa = despesa;
		this.saldo = saldo;
	}
	
	// Gets e Sets

	public double getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getDespesa() {
		return despesa;
	}

	public void setDespesa(String despesa) {
		this.despesa = despesa;
	}
	
	// Métodos
	public void addSaldo(double saldo) {
		this.saldo += saldo;
		
	}
	public void addDespesa(double valorDespesa) {
		this.valorDespesa -= (valorDespesa + getSaldo());
	}
	
	public void selecaoMenu (Scanner sc){
		System.out.println("Selecione a opção desejada: \n1 - Cadastro de Saldo \n2 - Cadastro de Despesa \n3 - Visualizar Saldo");
		int selecao = sc.nextInt();
		switch (selecao) {
		case 1:
			System.out.println("Você escolheu Cadastro de Saldo!!");
			System.out.println("Informe o valor de saldo que deseja cadastrar: ");
			double saldo = sc.nextDouble();
			addSaldo(saldo);
			dadosConta();
			break;
		case 2: 
			System.out.println("Você escolheu Cadastro de Despesa ");
			System.out.println("Informe o nome do Produto que você deseja gastar o dinheiro: ");
			String despesa = sc.next();
			setDespesa(despesa);
			System.out.println("Informe o valor do Produto: ");
			double valorDespesa = sc.nextDouble();
			addDespesa(valorDespesa);
			dadosConta();
			
			break;
		case 3: 
			System.out.println("Você escolheu Visualização de Saldo");
			dadosConta();
			
			break;
		default: 
			System.out.println("Opção inválida! Selecione uma opção válida.");
			break;
			}
		}
		
	public void dadosConta() {
		System.out.println("Segue os dados atualizados do Saldo abaixo: ");
		System.out.println(toString());
	}
	public String toString() {
		return "O valor do seu saldo é: R$" + String.format("%.2f", getSaldo());
	}
}


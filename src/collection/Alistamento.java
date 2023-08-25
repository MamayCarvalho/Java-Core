package collection;

import java.util.Scanner;

/*
 * Desenvolvedora: 
 * 
 * Mayara Brandão de Carvalho
 * 
 * */
public class Alistamento {
	
	private String nome;
	private String nomeMae;
	private String nomePai;
	private String email;
	private int dataNasc;
	private double altura;
	private double peso;
	private int telefone;
	
	
	
	public Alistamento(String nome, String nomeMae, String nomePai, String email, 
			int dataNasc, double altura, double peso, int telefone) {
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.email = email;
		this.dataNasc = dataNasc;
		this.altura = altura;
		this.peso = peso;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public String getEmail() {
		return email;
	}
	public int getDataNasc() {
		return dataNasc;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	//Métodos
	public int calculoNasc(int dataNasc) {
		int idade = dataNasc - 2023;
		if (idade > 45) {
			System.out.println("Devido a idade ser maior que 45 anos, não será possível realizar o Alistamento");
		}
		return idade;
	}
	public void multa(int idade) {
		if (calculoNasc(dataNasc) >= 20) {
			double precoMulta = (calculoNasc(dataNasc) - 19) * 5.0;
			System.out.println("O valor da multa é de R$" + precoMulta);
		}
	}
	public void iniciarCadastro(Scanner sc) {
		System.out.println("Programa para Alistamento Militar\n");
		System.out.println("Informe o seu ano de Nascimento: ");
		int dataNasc = sc.nextInt();
		calculoNasc(dataNasc);
		
		System.out.println("Informe o nome completo: ");
		String nome = sc.next();
		
	}

	

}

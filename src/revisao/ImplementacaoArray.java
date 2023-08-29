package revisao;

import java.util.Scanner;

public class ImplementacaoArray {
	
	// Parâmetro ou variável da classe
	public double notasAluno[] = new double[4];
	
	// Método para inserir elementos ao Array.
	
	public void addElementosArray(Scanner sc) {
		System.out.println("Insira a 1º nota do Aluno: ");
		notasAluno[0] = sc.nextDouble();
		System.out.println("Insira a 2º nota do Aluno: ");
		notasAluno[1] = sc.nextDouble();
		System.out.println("Insira a 3º nota do Aluno: ");
		notasAluno[2] = sc.nextDouble();
		System.out.println("Insira a 4º nota do Aluno: ");
		notasAluno[3] = sc.nextDouble();
	}
	
	// Listar os elementos do Array.
	public void listarElementos() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + ": " + notasAluno[i]);
		}
		System.out.println("---------------------------------------------");
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println(i + ": " + notasAluno[i]);
		}
	}
	
}

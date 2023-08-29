package revisao;

import java.util.Locale;
import java.util.Scanner;

public class ArrayNotasAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criar objetos Notas de alunos
		ImplementacaoArray notasAlunoA = new ImplementacaoArray();
		System.out.println("Informe as notas do Aluno A\n");
		notasAlunoA.addElementosArray(sc);
		
		ImplementacaoArray notasAlunoB = new ImplementacaoArray();
		System.out.println("Informe o nome do Aluno B\n");
		notasAlunoB.addElementosArray(sc);
		System.out.println("As notas foram: ");
		notasAlunoB.listarElementos();
		
		
		sc.close();

	}

}

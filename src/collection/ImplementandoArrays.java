package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exemplo 01 - Array notas de um aluno.
		double notasAlunoA[] = new double[3];
		
		//Atribuição.
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		//Exibição.
		System.out.println(notasAlunoA); //Array é um objeto, ele retorna um endereço de memória (alocação)RAM.
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);
		
		//Exibição por meio de método de classe Arrays.
		System.out.println(Arrays.toString(notasAlunoA)); // Este método retorna os DADOS que CONSTAM no Array e  o Array, conforme visto no Sysout do outro comentário.
		double notas = 0;
		// Formas de percorrer um array. 
		for (int i = 0; i < 3; i++) {
			 notas = notasAlunoA[i];
			System.out.println("\n" + i + ":" + notas);
			System.out.println("\n");
			// Calcular a média das notas.
			 notas += notasAlunoA[i]  ;
		}
		System.out.printf("Média das notas é: %.2f\n", notas/3);
		
		sc.close();		

	}

}
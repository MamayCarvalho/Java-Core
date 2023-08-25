package Exercicios;

public class ExercicioQuestao03 {

	public static void main(String[] args) {
		int valor01 = 5;
		int valor02 = 6;
		int valor03 = 7;
		int valor04 = 8;
		double resultado;
		
		resultado = valor01*valor02 - valor03*valor04;
		
		System.out.printf("Qual a diferença de %d e %d pelo Produto de %d e %d segundo a fórmula: DIFERENCA = (A*B-C*D)? %n A diferença é de: %.0f",valor01, valor02, valor03, valor04, resultado);

	}

}

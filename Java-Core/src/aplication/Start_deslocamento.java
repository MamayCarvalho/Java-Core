package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Deslocamento;

public class Start_deslocamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Deslocamento deslocamento = new Deslocamento(0, 0, 0, 0, 0);
		
		System.out.println("Insira o valor de X1: ");
		double x1 = sc.nextDouble();
		deslocamento.setX1(x1);
		System.out.println("Insira o valor de Y1: ");
		double y1 = sc.nextDouble();
		deslocamento.setY1(y1);
		System.out.println("Insira o valor de X2: ");
		double x2 = sc.nextDouble();
		deslocamento.setX2(x2);
		System.out.println("Insira o valor de Y2: ");
		double y2 = sc.nextDouble();
		deslocamento.setY2(y2);
		System.out.println("Insira a velocidade média: ");
		double velocidade = sc.nextDouble();
		deslocamento.setVelocidade(velocidade);
		
		System.out.printf("A distância total é: %.2f" , deslocamento.calcularDistancia());
		
		System.out.printf("%nO tempo de deslocamento entre os dois pontos é: %.2f" , deslocamento.calcularTempo());
		
		sc.close();

	}

}

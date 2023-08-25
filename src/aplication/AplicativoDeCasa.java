package aplication;

import java.util.Scanner;

import entities.Triangle;

public class AplicativoDeCasa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle X = new Triangle("X");
		Triangle Y = new Triangle("Y");
		
		System.out.println("Informe os lados do triângulo X:");
		X.ladoA = sc.nextDouble();
		X.ladoB = sc.nextDouble();
		X.ladoC = sc.nextDouble();

		double areadeX = X.area();
		System.out.printf("Área de X é: %.2f%n", areadeX);
		X.typeofTriangle();
		
		System.out.println("Informe os lados do triângulo Y: ");
		Y.ladoA = sc.nextDouble();
		Y.ladoB = sc.nextDouble();
		Y.ladoC = sc.nextDouble();
		
		double areadeY = Y.area();
		System.out.printf("Área de Y é: %.2f", areadeY);

		Y.typeofTriangle();
		
		sc.close();

	}
}
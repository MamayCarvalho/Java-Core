package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Aplicativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangle X,Y;
		X = new Triangle("X");
		Y = new Triangle("Y");
		
		// Interação do triângulo X
		System.out.println("Informe os lados do triangulo X: ");
		X.ladoA = sc.nextDouble();
		X.ladoB = sc.nextDouble();
		X.ladoC = sc.nextDouble();
		
		
		// Interação do triângulo Y
		System.out.println("Informe os lados do triangulo Y: ");
		Y.ladoA = sc.nextDouble();
		X.ladoB = sc.nextDouble();
		X.ladoC = sc.nextDouble();
		
		double areaDeX = X.area();
		double areaDeY = Y.area();
		
		System.out.printf("Área de X é: %.2f\n", areaDeX);
		X.typeofTriangle();
		System.out.printf("Área de Y é: %.2f\n", areaDeY);
		Y.typeofTriangle();
		
		sc.close();

	}

}

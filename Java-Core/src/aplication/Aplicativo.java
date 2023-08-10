package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Aplicativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangle X = new Triangle("X");
		Triangle Y = new Triangle("Y");
		
		// Interação do triângulo X
		System.out.println("Informe o lado A do triangulo X: ");
		X.ladoA = sc.nextDouble();
		System.out.println("Informe o lado B do triangulo X: ");
		X.ladoB = sc.nextDouble();
		System.out.println("Informe o lado C do triangulo X: ");
		X.ladoC = sc.nextDouble();
		double areaDeX = X.area();
		
		// Interação do triângulo Y
		System.out.println("Informe o lado A do triangulo Y: ");
		Y.ladoA = sc.nextDouble();
		System.out.println("Informe o lado B do triangulo Y: ");
		X.ladoB = sc.nextDouble();
		System.out.println("Informe o lado C do triangulo Y: ");
		X.ladoC = sc.nextDouble();
		double areaDeY = Y.area();
		
		System.out.printf("Área de X é: %.2f%n", areaDeX);
		System.out.printf("Área de Y é: %.2f%n", areaDeY);
		
		X.typeofTriangle();
		Y.typeofTriangle();
		
		sc.close();

	}

}

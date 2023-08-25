package oop;

import java.util.Scanner;

public class Triangulo {
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo X = new Triangulo();
		X.ladoA = 3.0;
		X.ladoB = 4.0;
		X.ladoC = 2.0;
		System.out.println(X.ladoA);
		
		Triangulo Y = new Triangulo();
		
		System.out.println("Informe o valor para o lado A do triângulo Y: ");
		Y.ladoA = sc.nextDouble();
		System.out.println("Informe o valor para o lado B do triângulo Y: ");
		Y.ladoB = sc.nextDouble();
		System.out.println("Informe o valor para o lado C do triângulo Y: ");
		Y.ladoC = sc.nextDouble();
		
		System.out.println("O valor do lado A é: "+ Y.ladoA);
		System.out.println("O valor do lado B é: "+ Y.ladoB);
		
		sc.close();
	}

}

package Variaveis;

import java.util.Scanner;

public class TesteTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Calcular a Área de 2 triângulos.
		double areaDeX,areaDeY, pDeX, pDeY;
		double ladoAdeX = 0; 
		double ladoBdeX = 0;
		double ladoCdeX = 0;
		double ladoAdeY = 0; 
		double ladoBdeY = 0; 
		double ladoCdeY = 0; 
		
		System.out.println("Informe o valor para o lado A do triângulo X: ");
		ladoAdeX = sc.nextDouble();
		System.out.println("Informe o valor para o lado B do triângulo X: ");
		ladoBdeX = sc.nextDouble();
		System.out.println("Informe o valor para o lado C do triângulo X");
		ladoCdeX = sc.nextDouble();
		
		// Para saber se o programa está rodando correto, coloque: System.out.println(ladoAdeX + " " + ladoBdeX + " " + ladoCdeX); para mostrar os valores.
		
		pDeX = (ladoAdeX+ ladoBdeX + ladoCdeX) / 2;
		areaDeX = Math.sqrt( pDeX * (pDeX - ladoAdeX) * (pDeX - ladoBdeX) * (pDeX - ladoCdeX));
		
		System.out.println("Informe o valor para o lado A do triângulo Y: ");
		ladoAdeY = sc.nextDouble();
		System.out.println("Informe o valor para o lado B do triângulo Y: ");
		ladoBdeY = sc.nextDouble();
		System.out.println("Informe o valor para o lado C do triângulo Y: ");
		ladoCdeY = sc.nextDouble();
		
		pDeY = (ladoAdeY + ladoBdeY + ladoCdeY) / 2;
		areaDeY = Math.sqrt( pDeY * (pDeY - ladoAdeY) * (pDeY - ladoBdeY) * (pDeY - ladoCdeY));
		
		System.out.printf("A área do triangulo X é: %.2f %n" ,  areaDeX);
		System.out.printf("A área do triangulo Y é: %.2f %n" ,  areaDeY);
		
		if (areaDeX > areaDeY) {
			System.out.println("O triângulo com a maior Área é X");
		} else {
			System.out.println("O triângulo com a maior Área é Y");
		}
		
		sc.close();
	}

}

package aplication;


import java.util.Scanner;

import entities.ExploradorRobor;

public class StartRobot {

	public static void main(String[] args) {
		// Criando o robo Alfa.
		Scanner sc = new Scanner(System.in);
		ExploradorRobor alfa = new ExploradorRobor();
		String name = "Alfa";
		alfa.status = "Explorando";
		alfa.velocidade = 7;
		alfa.temperatura = 20;
		alfa.exibirAtributos();
		System.out.println("----------------------------------------"+ name + "-------------------------------------------------------------");
		
		//Modificando o status do robo Alfa
		System.out.println("Aumentando a velocidade para 8");
		alfa.velocidade = 8;
		alfa.exibirAtributos();
		System.out.println("Alterar a temperatura para 47");
		alfa.temperatura = 47;
		alfa.verificarTemperatura();
		alfa.exibirAtributos();
		
		sc.close();
	}

}

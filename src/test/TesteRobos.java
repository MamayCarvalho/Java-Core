package test;

import java.util.Scanner;

import entities.ExploradorRobor;

public class TesteRobos {

	public static void main(String[] args) {
		// Criando o robo Alfa.
		Scanner sc = new Scanner(System.in);
		ExploradorRobor alfa, beta;
		alfa = new ExploradorRobor();
		beta = new ExploradorRobor();
		
		alfa.status = "Explorando";
		alfa.velocidade = 7;
		alfa.temperatura = 20;
		alfa.exibirAtributos();
		
		//Modificando o status do robo Alfa
		System.out.println("Informe o nome do 1º robo: ");
		alfa.nome = sc.next();
		System.out.println("Informe o nome do 2º robo");
		beta.nome = sc.next();
		System.out.println("Alterar a temperatura para 47");
		alfa.temperatura = 47;
		alfa.verificarTemperatura();
		alfa.exibirAtributos();
		beta.exibirAtributos();
		alfa.exibirAtributos();
		
		sc.close();
	}

}
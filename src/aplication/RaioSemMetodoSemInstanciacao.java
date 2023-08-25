package aplication;

import java.util.Locale;
import java.util.Scanner;
import util.CalculadoraComMetodosEstaticos;

public class RaioSemMetodoSemInstanciacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter com o valor do raio: ");
		double raio = sc.nextDouble();
		double c = CalculadoraComMetodosEstaticos.circunferencia(raio); // Nome da Classe e o metodo.
		double v = CalculadoraComMetodosEstaticos.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n" ,c);
		System.out.printf("Volume: %.2f%n" ,v);
		System.out.printf("Valor do PI é: %.2f%n" ,CalculadoraComMetodosEstaticos.PI);
		sc.close();

	}

}

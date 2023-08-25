package Exercicios;

import java.util.Locale;


public class ExcercioQuestao04 {

	public static void main(String[] args) {
		Locale locale=new Locale("en","US");
		Locale.setDefault(locale);
		int func1 = 25;
		int func2 = 1;
		double hrTrab1 = 100;
		double hrTrab2 = 200;
		double hr01 = 5.50;
		double hr02 = 20.50; 
		double resultado;
		
		resultado = hrTrab1 * hr01;
		System.out.printf("Number = %d%n Salary = %.2f", func1, resultado);
		resultado = hrTrab2 * hr02;
		System.out.printf("%nNumber = %d%n Salary = %.2f", func2, resultado);
		

	}

}

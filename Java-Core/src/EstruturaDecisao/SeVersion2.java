package EstruturaDecisao;

import java.util.Scanner;

public class SeVersion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		double number4 = 0;
		double number5 = 0;
		double resultado;
		
		//pedir para o usuário digitar 5 números, se o sistema identificar se o número 0 for colocado ele não dá continuidade no programa.
		//1º - fazer a primeira parte, executar e olhar a saída. E assim por diante.
				
		System.out.println("Informe o 1º número: ");
		number1 = sc.nextDouble();
		if (number1 == 0) {
			System.out.println("Infelizmente o número '0' não é válido, o programa foi encerrado.");
		} else {
			System.out.println("Informe o 2º número: ");
			number2 = sc.nextDouble();
			
			if (number2 == 0) {
				System.out.println("Infelizmente o número '0' não é válido, o programa foi encerrado.");
			}else {
				System.out.println("Informe o 3º número: ");
				number3 = sc.nextDouble();
				
				if (number3 == 0) {
					System.out.println("Infelizmente o número '0' não é válido, o programa foi encerrado.");
				} else {
					System.out.println("Informe o 4º número: ");
					number4 = sc.nextDouble();
					
					if (number4 == 0) {
						System.out.println("Infelizmente o número '0' não é válido, o programa foi encerrado.");
					} else {
						System.out.println("Informe o 5º número: ");
						number5 = sc.nextDouble();
						
						if (number5 == 0) {
							System.out.println("Infelizmente o número '0' não é válido, o programa foi encerrado.");
						} else {
							resultado = number1 + number2 + number3 + number4 + number5;
							System.out.printf("A soma dos números informados dão o valor total de: %.2f " , resultado);
						}
					}
				}
			}
		}
		
		sc.close();
	}

}

package EstruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade = 0;
		double valorInformado;
		
		System.out.println("Informe um valor: ");
		valorInformado = sc.nextDouble();
		
		if (quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			
			System.out.println("Quantidade de números digitados: " + quantidade);
		}
		
		System.out.println("Informe um novo valor: ");
		valorInformado = sc.nextDouble();
		
		if(quantidade == 5 || valorInformado != 0.00) {
			quantidade++;
			System.out.println("Quantidade de números digitados: " + quantidade);
		} else {
			System.out.println("Você informou o valor " + valorInformado + "Programa foi encerrado.");
		}
		sc.close();
	}
	
}

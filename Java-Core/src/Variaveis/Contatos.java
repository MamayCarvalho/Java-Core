package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		long telefone; //Em casos de número de telefone, é necessário informar long no lugar de int, devido a quantidade de bits que cada caractere possui.
		
		System.out.println("Insira o seu nome:" );
		name = sc.next();
		System.out.println("Insira o seu e-mail:" );
		email = sc.next();
		System.out.println("Insira o seu número de telefone:" );
		telefone = sc.nextLong();
		sc.close();
		
		System.out.printf("Dados:%nNome: %s%nEmail: %s %nTelefone: %d", name, email, telefone);
	}

}

package Variaveis;

public class Logicas {

	public static void main(String[] args) {
		
		double x = 5;
		
		System.out.println(x <= 20 && x == 10);
		
		System.out.println(x > 0 && x != 3); //(para transformar essa logica em False, é só tornar uma das alternativas faltas. Ex: (x > 0 && x == 3)
		
		System.out.println((x <= 20 && x == 10 && x !=3) + "\n");
		
		
		System.out.println(x == 10 || x <= 20);
		
		System.out.println(x > 0 && x != 5);
		
		System.out.println(x <= 0 || x != 3 && x !=5); // para transformar essa lógica em True, é só adicionar uma condição a mais. Ex: || (x <= 0 || x != 3 && x !=5 || x == 5)
	}

}
-
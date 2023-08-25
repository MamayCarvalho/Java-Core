package Variaveis;

public class Operadores {

	public static void main(String[] args) {
		// Operador Unário:
		
		//int preco = 10;
		//System.out.println(preco); //10
		//System.out.println(preco++); // 10+1 = 11
		//System.out.println(++preco); // 11+1=12
		//System.out.println(--preco); // 12-1=11
		//System.out.println(--preco); // 11-1=10
//-----------------------------------------------------------------------------------------------------//
		
		// Operador Uniário 02 - Operações
		
		int valor01 = 10;
		int valor02 = 10;
		//int valor03 = 2;
		
		//valor03 = ++valor01;
		//System.out.println(valor03);
		System.out.println(valor01++ + ++valor01);
		System.out.println(valor02++ + valor02++);
		System.out.println(valor02++ + ++valor01);
		
		//System.out.println(valor01++ + ++valor01);
		//System.out.println(valor02++ + ++valor01);
		//System.out.println(valor02++ + valor01++);
	}

}

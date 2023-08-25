package EstruturaDecisao;

public class Enquanto {

	public static void main(String[] args) {
		// Implementação da variável números.
		int numeros = 0;
		
		// Imprimir na tela TODOS os números de 0 a 10.
		while (numeros < 11) {
			System.out.println(numeros);
			numeros++;
			// se acrescentar mais um "numeros++" ele exibe os números pares.
		}
		// Exibir TODOS os números ímpares de 0 à 10.
		
		int nImpar = 1;
		while (nImpar < 10) {
			System.out.println(nImpar);
			nImpar+=2; // OU numeros++;
			           //     numeros++;
		}

	}

}

package collection;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		/**
		 * Sintaxe para implementar uma lista
		 * List<tipo da lista> nome = new ArrayList<>(); apertar em ctrl + shift + o para importar a List.
		 * 
		 * */
		// Implementar lista tipo String.
		List<String> lista = new ArrayList<>(); //List é um objeto de Array
		
		// Adicionar elementos a lista.
		lista.add("Matemática");
		lista.add("Física");
		lista.add("Biologia");
		lista.add("Português");
		lista.add("Geografia");
		lista.add("História");
		
		// Percorrer os elementos da lista. - Para percorrer, pode-se usar um for, porém é mais rapido utilizar um for each.
		for (String materias : lista) {
			System.out.println(materias);			
		}
		System.out.println("\n----------------------------\n");
		
		//Inserir elemento entre um nodo
		lista.add(3, "Química");
		lista.add("Inglês"); //- para adicionar a lista quando não se sabe a quantidade de Index.
		lista.add(5, "Programação");
		for (String materias : lista) {
			System.out.println(materias);			
		}
		
		// Verificar tamanho da lista
		System.out.println("----------------------------------------");
		System.out.println("A lista possui um tamanho de " + lista.size() + " posições.");
		
		// Para mostrar a posição de um elemento na lista
		System.out.println("A posição 3 é: " + lista.get(3));
		
		System.out.println("--------------------------------------");
		
		// Remover elemento da Lista
		lista.remove(2);
		lista.remove("Física");
		for (String materias : lista) {
			System.out.println(materias);			
		}
		
		// Listar a posição de um elemento.
		System.out.println("Index de Inglês: " + lista.indexOf("Inglês"));
	}

}

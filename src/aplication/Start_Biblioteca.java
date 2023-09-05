package aplication;
/**
 * @author Mayara Brandão de Carvalho
 * {@link} https://github.com/MamayCarvalho/Biblioteca
 * 
 * */
import java.util.Scanner;

import entities.Biblioteca;

public class Start_Biblioteca {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Biblioteca biblioteca = new Biblioteca(null, null, null, null, null, null, null);
			int escolha;
			
			do {
				System.out.println("Bem-vindo a sua Biblioteca Pessoal! \nPara prosseguir com o programa, informe a opção desejada: ");
				System.out.println("1 - Adicionar livro");
				System.out.println("2 - Exibir livros cadastrados");
				System.out.println("3 - Remover Livro");
				System.out.println("4 - Sair do Programa");
				escolha = sc.nextInt();
				sc.nextLine();
				
				switch(escolha) {
				case 1:
					System.out.println("Informe o ID do Livro: ");
					String idLivro = sc.nextLine();
					System.out.println("Informe o Título do Livro: ");
					String titulo = sc.nextLine();
					System.out.println("Informe o Autor do Livro: ");
					String autor = sc.nextLine();
					System.out.println("Informe o Ano de lançamento do Livro: ");
					String ano = sc.nextLine();
					System.out.println("Informe o Gênero do Livro: ");
					String genero = sc.nextLine();
					System.out.println("Informe a Editora do Livro: ");
					String editora = sc.nextLine();
					System.out.println("Informe a quantidade de páginas do Livro: ");
					String qntPaginas = sc.nextLine();
					
					Biblioteca novoLivro = new Biblioteca(idLivro, titulo, autor, ano, genero, editora, qntPaginas);
					biblioteca.adicionarLivro(novoLivro);
					break;
					
				case 2: 
					biblioteca.listaLivros();

					break;
					
				case 3:
					System.out.println("Informe o título do livro que deseja remover: ");
					String tituloRemovido = sc.nextLine();
					biblioteca.removerLivro(tituloRemovido);
					
					break;
				
				case 4: 
					System.out.println("Obrigada por utilizar os nossos serviços. Até breve! ");
					break;
					
				default: 
					System.out.println("Opção inválida, tente novamente!");
				}
				
			} while (escolha !=4);
			
			sc.close();
			

		}

	}
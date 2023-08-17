package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto2;



public class Start_Produto3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto2 produto = new Produto2(null, 0, 0);
		//Produto2 produto2 = new Produto2(null, 0);
		
		System.out.println("Informe as informações do Produto! ");
		System.out.println("Nome: ");
		String nome = sc.next();
		produto.setNome(nome);
		
		System.out.println("Preço: ");
		Double preco = sc.nextDouble();
		produto.setPreco(preco);
			
		System.out.println("Informações do Produto: " + "\nNome: "+ produto.getNome() + " - Preço R$" + produto.getPreco() + " - Quantidade " + produto.getQuantidade());
		
		System.out.println("Informe a quantidade: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade); // Para garantir a segurança da Classe, utilizamos addProduto no lugar de setQuantidade(). Deixando o setQuantidade é deixado um espaço para quebra de segurança do sistema.
		
		System.out.println("Valor total em Estoque: R$" + produto.valorTotalEmEstoque());
		sc.close();

	}

}

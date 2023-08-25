package entities;

public class Caminhao {
	
	String marca;
	int eixos;
	int toneladas;
	int quantidade;
	
	/*
	 * Construtor pesonalizado para 3 parâmetros. Quem instanciar a classe, obrigatóriamente terá que informar os parametros. 
	 * Nesse caso, como o construtor possui "public" na frente, não é necessário colocar no inicio dos parametros. 
	 * */
	
	public Caminhao(String marca, int eixos, int toneladas) {
		this.marca = marca;
		this.eixos = eixos;
		this.toneladas = toneladas;
	}
	
	public void addCaminhao() {
		this.quantidade += quantidade;
	}

}

package entities;

public class ExploradorRobor {
	//vai querer saber o status, a temperatura e velocidade.Todas as vezes que for detectado que a temperatura é maior a 45º o robo deve voltar a base.
	
	public String status;
	public int velocidade;
	public double temperatura;
	public String nome;
	
	public void verificarTemperatura() {
		if(temperatura > 45 ) {
			status = "Retorne imediatamente para a base!";
			velocidade = 5;
		
	// Mostrar esse retorno em um display.
		}
	}
	
	public void exibirAtributos() {
		System.out.println("Nome do Robo: " + nome);
		System.out.println("Status: " + status);
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Temperatura: " + temperatura);
	}
}

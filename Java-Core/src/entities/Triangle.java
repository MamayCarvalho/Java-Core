package entities;

public class Triangle {
	
	// Atributos da classe
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	public String nome;
	
	public Triangle(String nome) {
		this.nome = nome;
	}
	
	// Método Área
	
	public double area() {
		double pDex = (ladoA + ladoB + ladoC) / 2.0;
		//Calculo
		return Math.sqrt( pDex * (pDex - ladoA) * (pDex - ladoB) * (pDex - ladoC)); 
	}
	public void typeofTriangle() {
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("O triangulo" + nome + "é Equilatero");
		} else if (ladoA != ladoB || ladoA != ladoC || ladoB != ladoC) {
			System.out.println("O triangulo" + nome + "é Isósceles");
			
		} else {
			System.out.println("O triangulo" + nome +"é Escaleno");
		}
	}
}

// UML é uma linguagem de representação gráfica, usada para Arquitetura e Projetos. 
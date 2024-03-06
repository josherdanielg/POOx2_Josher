package edu.udelp.POO.models;
import lombok.Data;

@Data
public abstract class LadosFigura implements Figura {
	
	Double lado;
	
	public LadosFigura (Double lado) {
		this.lado=lado;
	}

	public abstract Integer numLados();
	public abstract String nombreFigura();

	public void getResultado() {
		System.out.println("La figura " + nombreFigura());
		System.out.println("Lados: " + numLados());
		System.out.println("Perimetro:" + perimetro());
		System.out.println("Area:" + area());
	}
}

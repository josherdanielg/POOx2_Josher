package edu.udelp.POO.models;

public class Rectangulo extends LadosFigura{
	
	private Double altura;
	
	public Rectangulo(Double base, Double altura) {
		super(base);
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		return (altura * 2) + (lado * 2);
	}

	@Override
	public double area() {
		return lado * altura;
	}

	@Override
	public Integer numLados() {
		return 4;
	}

	@Override
	public String nombreFigura() {
		return "Rectangulo" ;
	}
}
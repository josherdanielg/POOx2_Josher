package edu.udelp.POO.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Cuadrado extends LadosFigura {
	
	public Cuadrado(Double lado) {
		super(lado);
	}
	
	@Override
	public double perimetro() {
		return lado * numLados();
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public Integer numLados() {
		return 4;
	}

	@Override
	public String nombreFigura(){
		return "Cuadrado";
	}
}

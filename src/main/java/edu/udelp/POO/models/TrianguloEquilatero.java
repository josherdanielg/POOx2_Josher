package edu.udelp.POO.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrianguloEquilatero  implements Figura {

	private Double base;
	private Double altura;
	
	@Override
	public double perimetro() {
		return base * 3;
	}

	@Override
	public double area() {
		return (base * altura)/2;
	}	
}

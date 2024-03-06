package edu.udelp.POO.Procesos;
import edu.udelp.POO.models.Cuadrado;
import edu.udelp.POO.models.Figura;
import edu.udelp.POO.models.LadosFigura;
import edu.udelp.POO.models.Rectangulo;
import edu.udelp.POO.models.TrianguloEquilatero;


public class PruebaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LadosFigura fL = new Cuadrado(3D);
		fL.getResultado();
		
		fL = new Rectangulo(10D, 2D);
		fL.getResultado();
		
		fL = new TrianguloEqui(3D, 2D);
		fL.getResultado();
		
		fL = new TrianguloEsc(2D, 3D);
		fL.getResultado();
		
		fL = new TrianguloIso(3D, 2D);
		fL.getResultado();

		Figura f = new TrianguloEquilatero(2D, 3D);
		Double res = f.perimetro();
		System.out.println(res);
		
	}
}
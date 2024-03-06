package edu.udelp.POO.models;

public class TrianguloEqui extends AbstractTriangulo {
	
	private Double base;
	private Double altura;
    
    public TrianguloEqui(Double lado) {
        super(lado, lado, lado);
        
    }
    
    @Override
    public double perimetro() {
        return lado * 2;
    }
    
    @Override
    public double area() {
        return (base * altura)/2;
    }
    
    @Override
    public String nombreFigura() {
        return "Triángulo Equilátero";
    }
}

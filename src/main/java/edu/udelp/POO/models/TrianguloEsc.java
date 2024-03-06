package edu.udelp.POO.models;

public class TrianguloEsc extends AbstractTriangulo {
    
    public TrianguloEsc(Double lado1, Double lado2, Double lado3) {
        super(lado1, lado2, lado3);
    }
    
    @Override
    public double perimetro() {
        return getLado() + getLado() + getLado();
    }
    
    @Override
    public double area() {
        double s = (getLado() + getLado() + getLado()) / 2;
        return Math.sqrt(s * (s - getLado()) * (s - getLado()) * (s - getLado()));
    }
    
    @Override
    public String nombreFigura() {
        return "Triángulo Escaleno";
    }
}

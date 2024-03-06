package edu.udelp.POO.models;

public class TrianguloIso extends AbstractTriangulo {
    
    public TrianguloIso(Double base, Double lado) {
        super(base, lado, lado);
    }
    
    @Override
    public double perimetro() {
        return 2 * getLado() + getLado();
    }
    
    @Override
    public double area() {
        double altura = Math.sqrt(getLado() * getLado() - (getLado() / 2) * (getLado() / 2));
        return (getLado() * altura) / 2;
    }
    
    @Override
    public String nombreFigura() {
        return "Triángulo Isósceles";
    }
}

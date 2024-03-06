package edu.udelp.POO.models;


public abstract class AbstractTriangulo extends LadosFigura {
    
    public AbstractTriangulo(Double lado1, Double lado2, Double lado3) {
        super(lado1, lado2, lado3);
    }
    
    @Override
    public Integer numLados() {
        return 3;
    }
    
    @Override
    public abstract double perimetro();
    
    @Override
    public abstract double area();
}

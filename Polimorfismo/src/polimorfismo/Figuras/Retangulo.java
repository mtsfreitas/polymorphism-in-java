/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.Figuras;

/**
 *
 * @author Martins
 */
public class Retangulo extends Forma{

    private float lado;
    private float altura;
    
    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        return (lado*altura);
    }

    @Override
    public float calcularPerimetro() {
        return (lado+altura);
    }

    @Override
    public String getTipo() {
        return "Retângulo";
    }
    
}

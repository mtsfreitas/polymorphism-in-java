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
public class Circulo extends Forma{

    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }
    
    @Override
    public float calcularArea() {
        return ((float) Math.PI * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return ((float) Math.PI * 2 * raio);
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
    
}

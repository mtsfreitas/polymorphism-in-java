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
public class Quadrado extends Retangulo{    
    
    public Quadrado(float lado) {
        super(lado, lado);
    }
    
    @Override
    public String getTipo(){
        return "Quadrado";
    }
}

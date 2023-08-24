/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.Transporte;

/**
 *
 * @author Martins
 */

public abstract class Veiculo {
    float velocidade = 0;
    
    
    abstract public int getNumeroRodas();

    abstract public void acelerar(float velocidade);

    abstract public void parar();
    
}

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
public class Polimorfismo {
    
    
    
    public static void main(String[] args) {
        
        
        teste1();

    }
    
    public static void teste1(){
        Veiculo bike = new Bicicleta();
        Veiculo automovel = new Automovel();
        
        chamaVeiculo(bike);
        chamaVeiculo(automovel);
    }
    
    public static void chamaVeiculo(Veiculo veiculo){
        veiculo.acelerar(20);
        veiculo.getNumeroRodas();
        veiculo.parar();
        if(veiculo instanceof Automovel){
            ((Automovel) veiculo).trocarOleo();
        }
    }
}

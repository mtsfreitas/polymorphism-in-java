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
public class Bicicleta extends Veiculo {

    @Override
    public int getNumeroRodas() {
        System.out.println("2 rodas");
        return 2;
    }

    @Override
    public void acelerar(float velocidade) {
        if(this.velocidade+velocidade<200){ //Se velocidade for menor do que 200km/h então incremente.
            this.velocidade += velocidade;
            System.out.println("Acelerando...");
        }
        else
            System.out.println("Velocidade Maxima alcancada");
    }

    @Override
    public void parar() {
        velocidade = 0;
        System.out.println("Parando...");
    }
    
}

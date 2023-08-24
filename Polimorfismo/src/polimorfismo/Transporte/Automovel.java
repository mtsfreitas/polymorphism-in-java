/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.Transporte;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Martins
 */
public class Automovel extends Veiculo{
    
    Calendar dataOleoTrocado = Calendar.getInstance();
    Date dataOleo;
    
     public void trocarOleo(){
         dataOleo = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
         System.out.println(sdf.format(dataOleo));
     }

    @Override
    public int getNumeroRodas() {
        System.out.println("4 rodas");
        return 4;
    }

    @Override
    public void acelerar(float velocidade) {
         if(this.velocidade+velocidade<300){ //Se velocidade for menor do que 300km/h então incremente.
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

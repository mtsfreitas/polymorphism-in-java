/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.Jokenpo;

/**
 *
 * @author Martins
 */
public class Papel implements Objeto {

    @Override
    public void fazerAcao(Objeto o2) {
        if(!o2.receberAcao(this)){
            o2.fazerAcao(this);
        }
    }

    @Override
    public boolean receberAcao(Objeto o2) {
        if(o2 instanceof Papel){
            System.out.println("Empate!");            
            return true;
        } else{
            if(o2 instanceof Pedra){
                System.out.println("O Papel ganhou: envolveu a Pedra!");
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String getDescricao(){
        return "Papel";
    }
}

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
public interface Objeto {
    public void fazerAcao(Objeto o2);
    public boolean receberAcao(Objeto o2);
    public String getDescricao();
}

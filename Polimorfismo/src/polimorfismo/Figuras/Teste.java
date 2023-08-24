/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.Figuras;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Martins
 */
public class Teste {
    
    public static final String QUEBRA_DE_LINHA = System.lineSeparator();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Forma> forma = new ArrayList<>();
        
        forma.add(new Retangulo(5, 3));
        forma.add(new Circulo(8));
        forma.add(new Quadrado(5));
        
        StringBuilder saida = new StringBuilder();
        Iterator<Forma> it = forma.iterator();
        while(it.hasNext()){
            Forma f = it.next();
            saida.append(f.getTipo()).append(QUEBRA_DE_LINHA);
            saida.append("Área: ").append(f.calcularArea()).append(QUEBRA_DE_LINHA);
            saida.append("Perímetro: ").append(f.calcularPerimetro()).append(QUEBRA_DE_LINHA).append(QUEBRA_DE_LINHA);
        }
        
        System.out.println(saida.toString());
    }
    
}

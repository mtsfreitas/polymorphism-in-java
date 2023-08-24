package polimorfismo.Jokenpo;


import java.util.Random;


public class Jogo {
     
    public static final int PAPEL = 0;
    public static final int PEDRA = 1;
    public static final int TESOURA = 2;
    public static final String QUEBRA_DE_LINHA = System.lineSeparator();
    
    public static int QTD_MAX_JOGADAS = 3;    
    
    public static void main(String[] args) {
        int i;
        
        Objeto o1, o2;
        for(i = 1; i <= QTD_MAX_JOGADAS; i++){
            System.out.println("--- Jogada " + i + " ---");
            
            o1 = selecionaObjeto();
            o2 = selecionaObjeto();
            
            if(o1 == null || o2 == null) { System.out.println("Algum dos objetos é nulo. Erro grave! Terminando execução..."); return; }
            
            System.out.println(o1.getDescricao() + " X " + o2.getDescricao());
            o1.fazerAcao(o2);
            System.out.println();
        }
    }
    
    private static Objeto selecionaObjeto(){
        Objeto o = null;
        Random rn = new Random();
        switch(rn.nextInt(3)){
                case PEDRA: o = new Pedra();
                    break;
                case PAPEL: o = new Papel();
                    break;
                case TESOURA: o = new Tesoura();
                    break;
        }
        return o;
    }
    
}

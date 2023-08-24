package polimorfismo.Calculadora;




/**
 *
 * @author Martins
 */
public class Teste1 {
    
    public void testar(){
        double x = 5, y = 7;
        
        Calculadora calculadora_normal = new Calculadora(); // tipo estático = tipo dinâmico = Calculadora
        Calculadora calculadora_cientifica = new CalculadoraCientifica(); // tipo estático: Calculadora ; tipo dinâmico: CalculadoraCientifica
        CalculadoraCientifica calculadora_cientifica_2 = new CalculadoraCientifica(); // tipo estático = tipo dinâmico = CalculadoraCientifica
        
        System.out.println("---- Calculadora Normal ----");
        chamaCalc(calculadora_normal, x, y);
        System.out.println("\n\n");
        System.out.println("---- Calculadora Cientifica com tipo estático Calculadora ----");
        chamaCalc(calculadora_cientifica, x, y);
        System.out.println("\n\n");
        System.out.println("---- Calculadora Cientifica com tipo estático CalculadoraCientifica ----");
        chamaCalc(calculadora_cientifica_2, x, y);
    }
    
    public void chamaCalc(Calculadora calculadora, double x, double y){
        // posso fazer tudo que uma calculadora pode fazer...
        System.out.println("Soma: " + calculadora.soma(x, y));
        System.out.println("Subtração: " + calculadora.subtrai(x, y));
        System.out.println("Multiplicação: " + calculadora.multiplica(x, y));
        System.out.println("Divisão: " + calculadora.divide(x, y));
        
        if(calculadora instanceof CalculadoraCientifica){
            // posso fazer raiz e potencia
            System.out.println("Raiz: " + ((CalculadoraCientifica) calculadora).raiz(x));
            System.out.println("Potencia: " + ((CalculadoraCientifica) calculadora).potencia(x, y));
        }        
    }
    
}

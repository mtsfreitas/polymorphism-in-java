package polimorfismo.Calculadora;


/**
 *
 * @author Martins
 */
public class CalculadoraCientifica extends Calculadora{
    
    double raiz(double x){
        return Math.sqrt(x);
    }
    
    double potencia(double x, double y){
        return Math.pow(x, y);
    }
    
}

package polimorfismo.Calculadora;


/**
 *
 * @author Martins
 */
public class Calculadora {
    
    public double soma(double x, double y){
        return x + y;
    }
    
    public double subtrai(double x, double y){
        return x - y;
    }
    
    public double multiplica(double x, double y){
        return x * y;
    }
    
    public double divide(double x, double y) throws ArithmeticException{
        if(y == 0)
            throw new ArithmeticException("Não é possível dividir por 0.");
        
        return x / y;
    }
    
}

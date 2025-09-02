import Calculadora.Calculadora;

public class ExecutaCalculadora{
    public static void main(String[] args){
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();

        calc1.NumeroA = 3.0;
        calc1.NumeroB = 5.0;

        calc2.NumeroA = 6.0;
        calc2.NumeroB = 2.0;

        calc1.Soma();
        calc1.Subtracao();
        calc1.Produto();
        calc1.Quociente();

        calc2.Soma();
        calc2.Subtracao();
        calc2.Produto();
        calc2.Quociente();
    }
}
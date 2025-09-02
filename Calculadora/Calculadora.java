package Calculadora;

public class Calculadora {
    public Double NumeroA;
    public Double NumeroB;

    public void Soma(){
        Double resultadoSoma = this.NumeroA + this.NumeroB;
        System.out.println(this.NumeroA + " + " + this.NumeroB + " = " + resultadoSoma);
    }

    public void Subtracao(){
        Double resultadoSubtracao = this.NumeroA - this.NumeroB;
        System.out.println(this.NumeroA + " - " + this.NumeroB + " = " + resultadoSubtracao);
    }

    public void Produto(){
        Double resultadoProduto = this.NumeroA * this.NumeroB;
        System.out.println(this.NumeroA + " * " + this.NumeroB + " = " + resultadoProduto);
    }

    public void Quociente(){
        Double resultadoQuociente = this.NumeroA / this.NumeroB;
        System.out.println(this.NumeroA + " / " + this.NumeroB + " = " + resultadoQuociente);
    }
}

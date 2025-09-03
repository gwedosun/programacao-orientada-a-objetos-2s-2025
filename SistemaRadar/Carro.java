package SistemaRadar;

public class Carro {
    public Integer Ano;
    public String Modelo;
    public String Placa; // Alterado de Integer para String
    public Integer Velocidade;

    public Carro(String Placa, Integer Velocidade, Integer Ano, String Modelo){
        this.Placa = Placa;
        this.Velocidade = Velocidade;
        this.Ano = Ano;
        this.Modelo = Modelo;
    }

    public void Acelerar(){
        this.Velocidade += 5;
    }

    public void Frear(){
        if(this.Velocidade > 0){
            this.Velocidade -= 5;
        }
    }
}
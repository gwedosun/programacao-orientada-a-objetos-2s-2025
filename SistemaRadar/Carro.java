package SistemaRadar;

public class Carro {
    public Integer Ano;
    public String Modelo;
    public String Placa; // Alterado de Integer para String
    public Integer Velocidade;

    public void Acelerar(){
        this.Velocidade += 5;
    }

    public void Frear(){
        if(this.Velocidade > 0){
            this.Velocidade -= 5;
        }
    }
}
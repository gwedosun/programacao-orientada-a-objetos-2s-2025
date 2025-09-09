package SistemaRadar;

public class Carro {
    public Integer Ano;
    public String Modelo;
    public String Placa; 
    private Integer Velocidade;

    public Carro(String Placa, Integer Velocidade, Integer Ano, String Modelo){
        this.Placa = Placa;
        this.Velocidade = Velocidade;
        this.Ano = Ano;
        this.Modelo = Modelo;
    }

    public Integer getVelocidade(){
        return this.Velocidade;
    }

    public void setVelocidade(Integer Velocidade){
        if(Velocidade != null && Velocidade > 0){
            this.Velocidade = Velocidade;
        }
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
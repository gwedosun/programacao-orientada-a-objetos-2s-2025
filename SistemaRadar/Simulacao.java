package SistemaRadar;

// import SistemaRadar.Carro;
// import SistemaRadar.Radar;

public class Simulacao {

    public static void main(String[] args){
        Carro Opala = new Carro("ACLR300", 0, 1976, "Comodoro");
        Opala.Velocidade = 0;
        Opala.Placa = "ACLR300"; 
        Opala.Modelo = "Comodoro";
        Opala.Ano = 1976;


        Radar Radar = new Radar();
        Radar.ModeloRadar = "pardal";
        Radar.LimiteVelocidade = 60;
        Radar.Localizacao = "Pistao Sul";

        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();
        Opala.Acelerar();

        Radar.avaliarVelocidade(Opala);
        Opala.Acelerar();
        Radar.avaliarVelocidade(Opala);
        Opala.Acelerar();
        Radar.avaliarVelocidade(Opala);
    }
}
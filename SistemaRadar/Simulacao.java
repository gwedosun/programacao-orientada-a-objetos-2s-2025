import SistemaRadar.Carro;
import SistemaRadar.Radar;

public class Simulacao {

    public static void main(String[] args){
        // Criando os objetos corretamente
        Carro Opala = new Carro();
        Opala.Velocidade = 0;
        Opala.Placa = "ACLR300"; // Atribuindo uma String à Placa
        Opala.Modelo = "Comodoro";
        Opala.Ano = 1976;

        Radar Radar = new Radar();
        Radar.ModeloRadar = "pardal";
        Radar.LimiteVelocidade = 60;
        Radar.Localizacao = "Pistao Sul";

        // Acelerando o carro (chamando os métodos com parênteses)
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

        // Avaliando a velocidade
        Radar.avaliarVelocidade(Opala);
        Opala.Acelerar();
        Radar.avaliarVelocidade(Opala);
        Opala.Acelerar();
        Radar.avaliarVelocidade(Opala);
    }
}
package SistemaRadar;

public class Radar {
    public Integer LimiteVelocidade;
    public Integer ModeloRadar;
    public String Localizacao;

    public void emitirNotificacao(String Placa, Integer VelocidadeAvaliada){
        System.out.println("Limite de velocidade: " + this.LimiteVelocidade);
        System.out.println("VelocidadeAvaliada" + VelocidadeAvaliada);;
        System.out.println("Placa" + Placa);
    }

    public void avaliarVelocidade(Carro c){
        if(c.Velocidade > this.LimiteVelocidade){
            emitirNotificacao(c.Placa, c.Velocidade);
        }
    }
}

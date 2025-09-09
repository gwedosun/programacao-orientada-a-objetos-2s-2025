package SistemaRadar;

public class Radar {
    public Integer LimiteVelocidade;
    public String ModeloRadar;
    public String Localizacao;

    public void emitirNotificacao(String Placa, Integer VelocidadeAvaliada){
        System.out.println("Limite de velocidade: " + this.LimiteVelocidade);
        System.out.println("VelocidadeAvaliada" + VelocidadeAvaliada);;
        System.out.println("Placa" + Placa);
    }

    public Radar(String ModeloRadar, Integer LimiteVelocidade, String Localizacao){
        this.ModeloRadar = ModeloRadar;
        this.LimiteVelocidade = LimiteVelocidade;
        this.Localizacao = Localizacao;
    }

    public void avaliarVelocidade(Carro c){
        if(c.getVelocidade() > this.LimiteVelocidade){
            emitirNotificacao(c.Placa, c.getVelocidade());
        }
    }
}

// trocar todos os atributos de public para private;
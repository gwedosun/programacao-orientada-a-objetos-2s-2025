package Atividade1;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa programa) {
        System.out.println("Analisando requisitos do programa...");

        if (programa.getSSDOcupado() > this.computador.getSSD()) {
            System.out.println("ERRO NA INSTALAÇÃO: Espaço em SSD insuficiente!");
            return false;
        }

        if (programa.getMemoriaRAMAlocada() > this.computador.getMemoriaRAM()) {
            System.out.println("ERRO NA EXECUÇÃO: Memória RAM insuficiente!");
            return false;
        }

        System.out.println("Programa executado com sucesso!");
        
        float tempoDeExecucao = (float) programa.getQuantidadeOperacoes() / 
                                (this.computador.getOperacoesPorSegundo() * this.computador.getNucleos());

        System.out.printf("Tempo de execução: %.2f segundos.\n", tempoDeExecucao);
        
        return true;
    }
}
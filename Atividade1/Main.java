package Atividade1;

public class Main {
    public static void main(String[] args) {
        Computador meuPC = new Computador(16, 512, 8, 3.5f);
        System.out.println("Computador criado com " + meuPC.getMemoriaRAM() + "GB RAM, " + meuPC.getSSD() + "GB SSD.");

        SistemaOperacional so = new SistemaOperacional(meuPC);

        Programa editorDeVideo = new Programa(8, 100, 6, 150000);
        Programa jogoModerno = new Programa(12, 600, 8, 500000);
        Programa maquinaVirtual = new Programa(20, 200, 4, 80000);

        System.out.println("\n--- TENTATIVA 1: Editor de Vídeo ---");
        so.executarPrograma(editorDeVideo);

        System.out.println("\n--- TENTATIVA 2: Jogo Moderno ---");
        so.executarPrograma(jogoModerno);

        System.out.println("\n--- TENTATIVA 3: Máquina Virtual ---");
        so.executarPrograma(maquinaVirtual);
    }
}
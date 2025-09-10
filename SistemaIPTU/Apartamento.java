package SistemaIPTU;

public class Apartamento {
    private Boolean possuiElevador;

    public Boolean isPossuiElevador() {
        return this.possuiElevador;
    }

    public Boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

    public Apartamento(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }
}

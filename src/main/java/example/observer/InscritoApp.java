package example.observer;

public class InscritoApp implements IObservador {

    private String ultimaNotificacao;

    @Override
    public void atualizar(String tituloVideo) {
        this.ultimaNotificacao = "Push: novo video publicado - " + tituloVideo;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}

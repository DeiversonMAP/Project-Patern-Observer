package example.observer;

public class InscritoSMS implements IObservador {

    private String ultimaNotificacao;

    @Override
    public void atualizar(String tituloVideo) {
        this.ultimaNotificacao = "SMS: novo video publicado - " + tituloVideo;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}

package example.observer;

public class InscritoEmail implements IObservador {

    private String ultimaNotificacao;

    @Override
    public void atualizar(String tituloVideo) {
        this.ultimaNotificacao = "E-mail: novo video publicado - " + tituloVideo;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}

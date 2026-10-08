package example.observer;

import java.util.ArrayList;
import java.util.List;

public class Canal implements ISujeito {

    private final String nome;
    private final List<IObservador> inscritos = new ArrayList<>();

    public Canal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void inscrever(IObservador observador) {
        inscritos.add(observador);
    }

    @Override
    public void desinscrever(IObservador observador) {
        inscritos.remove(observador);
    }

    @Override
    public void notificarTodos(String tituloVideo) {
        for (IObservador observador : inscritos) {
            observador.atualizar(tituloVideo);
        }
    }

    public void publicarVideo(String tituloVideo) {
        notificarTodos(tituloVideo);
    }

    public int getQuantidadeInscritos() {
        return inscritos.size();
    }
}

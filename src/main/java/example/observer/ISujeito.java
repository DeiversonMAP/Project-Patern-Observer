package example.observer;

public interface ISujeito {
    void inscrever(IObservador observador);
    void desinscrever(IObservador observador);
    void notificarTodos(String tituloVideo);
}

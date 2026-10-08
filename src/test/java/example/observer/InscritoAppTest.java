package example.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscritoAppTest {

    @Test
    void deveReceberNotificacaoDeNovoVideo() {
        InscritoApp inscrito = new InscritoApp();
        inscrito.atualizar("Introducao ao padrao Observer");

        assertEquals("Push: novo video publicado - Introducao ao padrao Observer", inscrito.getUltimaNotificacao());
    }
}

package example.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscritoEmailTest {

    @Test
    void deveReceberNotificacaoDeNovoVideo() {
        InscritoEmail inscrito = new InscritoEmail();
        inscrito.atualizar("Introducao ao padrao Observer");

        assertEquals("E-mail: novo video publicado - Introducao ao padrao Observer", inscrito.getUltimaNotificacao());
    }
}

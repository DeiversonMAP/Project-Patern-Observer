package example.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscritoSMSTest {

    @Test
    void deveReceberNotificacaoDeNovoVideo() {
        InscritoSMS inscrito = new InscritoSMS();
        inscrito.atualizar("Introducao ao padrao Observer");

        assertEquals("SMS: novo video publicado - Introducao ao padrao Observer", inscrito.getUltimaNotificacao());
    }
}

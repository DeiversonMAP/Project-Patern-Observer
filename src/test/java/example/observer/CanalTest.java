package example.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalTest {

    @Test
    void deveNotificarTodosOsInscritosAoPublicarVideo() {
        Canal canal = new Canal("Oficina de Padroes");
        InscritoEmail porEmail = new InscritoEmail();
        InscritoApp porApp = new InscritoApp();

        canal.inscrever(porEmail);
        canal.inscrever(porApp);
        canal.publicarVideo("Observer na pratica");

        assertEquals("E-mail: novo video publicado - Observer na pratica", porEmail.getUltimaNotificacao());
        assertEquals("Push: novo video publicado - Observer na pratica", porApp.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarInscritoAposDesinscricao() {
        Canal canal = new Canal("Oficina de Padroes");
        InscritoSMS porSMS = new InscritoSMS();

        canal.inscrever(porSMS);
        canal.desinscrever(porSMS);
        canal.publicarVideo("Observer na pratica");

        assertNull(porSMS.getUltimaNotificacao());
    }

    @Test
    void deveContarInscritosCorretamente() {
        Canal canal = new Canal("Oficina de Padroes");
        canal.inscrever(new InscritoEmail());
        canal.inscrever(new InscritoApp());
        canal.inscrever(new InscritoSMS());

        assertEquals(3, canal.getQuantidadeInscritos());
    }
}

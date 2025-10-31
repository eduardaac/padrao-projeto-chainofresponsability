package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {

    AgenteEngenheiroSoftware engenheiro;
    AgenteNivel3 agenteN3;
    AgenteNivel2 agenteN2;
    AgenteNivel1 agenteN1;

    @BeforeEach
    void setUp() {
        engenheiro = new AgenteEngenheiroSoftware(null);
        agenteN3 = new AgenteNivel3(engenheiro);
        agenteN2 = new AgenteNivel2(agenteN3);
        agenteN1 = new AgenteNivel1(agenteN2);
    }

    @Test
    void deveRetornarSuporteNivel1ParaResetSenha() {
        assertEquals("Suporte Nivel 1", agenteN1.resolverTicket(new Ticket(TipoProblemaResetSenha.getTipoProblemaResetSenha())));
    }

    @Test
    void deveRetornarSuporteNivel2ParaCobranca() {
        assertEquals("Suporte Nivel 2", agenteN1.resolverTicket(new Ticket(TipoProblemaCobranca.getTipoProblemaCobranca())));
    }

    @Test
    void deveRetornarSuporteNivel3ParaConectividade() {
        assertEquals("Suporte Nivel 3", agenteN1.resolverTicket(new Ticket(TipoProblemaConectividade.getTipoProblemaConectividade())));
    }

    @Test
    void deveRetornarEngenhariaParaBugSoftware() {
        assertEquals("Engenharia de Software", agenteN1.resolverTicket(new Ticket(TipoProblemaBugSoftware.getTipoProblemaBugSoftware())));
    }

    @Test
    void deveRetornarTicketNaoResolvidoParaHardware() {
        assertEquals("Ticket nao resolvido", agenteN1.resolverTicket(new Ticket(TipoProblemaHardware.getTipoProblemaHardware())));
    }
}
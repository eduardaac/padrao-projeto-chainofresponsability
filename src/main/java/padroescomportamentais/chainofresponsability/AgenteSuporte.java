package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class AgenteSuporte {

    protected ArrayList listaProblemas = new ArrayList();
    private AgenteSuporte proximoAgente;

    public AgenteSuporte getProximoAgente() {
        return proximoAgente;
    }

    public void setProximoAgente(AgenteSuporte proximoAgente) {
        this.proximoAgente = proximoAgente;
    }

    public abstract String getDescricaoNivel();

    public String resolverTicket(Ticket ticket) {
        if (listaProblemas.contains(ticket.getTipoProblema())) {
            return getDescricaoNivel();
        }
        else {
            if (proximoAgente != null) {
                return proximoAgente.resolverTicket(ticket);
            }
            else
            {
                return "Ticket nao resolvido"; //
            }
        }
    }
}
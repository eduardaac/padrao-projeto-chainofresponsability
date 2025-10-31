package padroescomportamentais.chainofresponsability;

public class AgenteEngenheiroSoftware extends AgenteSuporte {

    public AgenteEngenheiroSoftware(AgenteSuporte superior) {
        listaProblemas.add(TipoProblemaBugSoftware.getTipoProblemaBugSoftware());
        setProximoAgente(superior);
    }

    public String getDescricaoNivel() {
        return "Engenharia de Software";
    }
}
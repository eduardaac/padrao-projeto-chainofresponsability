package padroescomportamentais.chainofresponsability;

public class AgenteNivel2 extends AgenteSuporte {

    public AgenteNivel2(AgenteSuporte superior) {
        listaProblemas.add(TipoProblemaCobranca.getTipoProblemaCobranca());
        setProximoAgente(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Nivel 2";
    }
}
package padroescomportamentais.chainofresponsability;

public class AgenteNivel3 extends AgenteSuporte {

    public AgenteNivel3(AgenteSuporte superior) {
        listaProblemas.add(TipoProblemaConectividade.getTipoProblemaConectividade());
        setProximoAgente(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Nivel 3";
    }
}
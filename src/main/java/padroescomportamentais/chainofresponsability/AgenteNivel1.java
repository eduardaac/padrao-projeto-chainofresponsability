package padroescomportamentais.chainofresponsability;

public class AgenteNivel1 extends AgenteSuporte {

    public AgenteNivel1(AgenteSuporte superior) {
        listaProblemas.add(TipoProblemaResetSenha.getTipoProblemaResetSenha());
        setProximoAgente(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Nivel 1";
    }
}
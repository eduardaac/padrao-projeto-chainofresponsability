package padroescomportamentais.chainofresponsability;

public class TipoProblemaConectividade implements TipoProblema {
    private static TipoProblemaConectividade tipo = new TipoProblemaConectividade();
    private TipoProblemaConectividade() {};
    public static TipoProblemaConectividade getTipoProblemaConectividade() { return tipo; }
}

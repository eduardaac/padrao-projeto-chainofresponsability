package padroescomportamentais.chainofresponsability;

public class TipoProblemaCobranca implements TipoProblema {
    private static TipoProblemaCobranca tipo = new TipoProblemaCobranca();
    private TipoProblemaCobranca() {};
    public static TipoProblemaCobranca getTipoProblemaCobranca() { return tipo; }
}

package padroescomportamentais.chainofresponsability;

public class TipoProblemaBugSoftware implements TipoProblema {
    private static TipoProblemaBugSoftware tipo = new TipoProblemaBugSoftware();
    private TipoProblemaBugSoftware() {};
    public static TipoProblemaBugSoftware getTipoProblemaBugSoftware() { return tipo; }
}

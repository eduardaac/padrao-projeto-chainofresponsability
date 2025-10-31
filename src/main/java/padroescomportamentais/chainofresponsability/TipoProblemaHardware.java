package padroescomportamentais.chainofresponsability;

public class TipoProblemaHardware implements TipoProblema {
    private static TipoProblemaHardware tipo = new TipoProblemaHardware();
    private TipoProblemaHardware() {};
    public static TipoProblemaHardware getTipoProblemaHardware() { return tipo; }
}
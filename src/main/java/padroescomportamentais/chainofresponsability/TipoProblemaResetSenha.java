package padroescomportamentais.chainofresponsability;

public class TipoProblemaResetSenha implements TipoProblema {
    private static TipoProblemaResetSenha tipo = new TipoProblemaResetSenha();
    private TipoProblemaResetSenha() {};
    public static TipoProblemaResetSenha getTipoProblemaResetSenha() { return tipo; }
}

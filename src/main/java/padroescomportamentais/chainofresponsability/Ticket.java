package padroescomportamentais.chainofresponsability;

public class Ticket {

    private TipoProblema tipoProblema;

    public Ticket(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

}
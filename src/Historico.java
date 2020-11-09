
import java.util.Date;


public class Historico extends Coleta {

    public Historico(String tipoHist, Date dataHist, int numColeta, String tipoColeta, Empresa empresaResponsavel) {
        super(numColeta, tipoColeta, empresaResponsavel);
        this.tipoHist = tipoHist;
        this.dataHist = dataHist;
    }

    public String getTipoHist() {
        return tipoHist;
    }

    public void setTipoHist(String tipoHist) {
        this.tipoHist = tipoHist;
    }

    public Date getDataHist() {
        return dataHist;
    }

    public void setDataHist(Date dataHist) {
        this.dataHist = dataHist;
    }
    private String tipoHist;
    private Date dataHist;

    
}


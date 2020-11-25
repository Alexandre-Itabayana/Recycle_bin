
import java.util.Date;

/**
 *
 * @author Reinaldo Reis
 */
public class Historico extends Coleta {

    /**
     *
     * @param tipoHist
     * @param dataHist
     * @param numColeta
     * @param tipoColeta
     * @param empresaResponsavel
     */
    public Historico(String tipoHist, Date dataHist, int numColeta, String tipoColeta, Empresa empresaResponsavel) {
        super(numColeta, tipoColeta, empresaResponsavel);
        this.tipoHist = tipoHist;
        this.dataHist = dataHist;
    }

    /**
     *
     * @return
     */
    public String getTipoHist() {
        return tipoHist;
    }

    /**
     *
     * @param tipoHist
     */
    public void setTipoHist(String tipoHist) {
        this.tipoHist = tipoHist;
    }

    /**
     *
     * @return
     */
    public Date getDataHist() {
        return dataHist;
    }

    /**
     *
     * @param dataHist
     */
    public void setDataHist(Date dataHist) {
        this.dataHist = dataHist;
    }
    private String tipoHist;
    private Date dataHist;

    
}




/**
 *
 * @author Reinaldo Reis
 */
public class Coleta {
    private int numColeta;
    private String tipoColeta;
    private String empresaResponsavel;
    
    /**
     *
     * @param numColeta
     * @param tipoColeta
     * @param empresaResponsavel
     */
    public Coleta(int numColeta, String tipoColeta, String empresaResponsavel) {
        this.numColeta = numColeta;
        this.tipoColeta = tipoColeta;
        this.empresaResponsavel = empresaResponsavel;
    }

    /**
     *
     * @return
     */
    public int getNumColeta() {
        return numColeta;
    }

    /**
     *
     * @param numColeta
     */
    public void setNumColeta(int numColeta) {
        this.numColeta = numColeta;
    }

    /**
     *
     * @return
     */
    public String getTipoColeta() {
        return tipoColeta;
    }

    /**
     *
     * @param tipoColeta
     */
    public void setTipoColeta(String tipoColeta) {
        this.tipoColeta = tipoColeta;
    }

    /**
     *
     * @return
     */
    public Empresa getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    /**
     *
     * @param empresaResponsavel
     */
    public void setEmpresaResponsavel(Empresa empresaResponsavel) {
        this.empresaResponsavel = empresaResponsavel;
    }

    
}

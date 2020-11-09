
public class Coleta {
       private int numColeta;
    private String tipoColeta;
    private Empresa empresaResponsavel;
    
    public Coleta(int numColeta, String tipoColeta, Empresa empresaResponsavel) {
        this.numColeta = numColeta;
        this.tipoColeta = tipoColeta;
        this.empresaResponsavel = empresaResponsavel;
    }

    public int getNumColeta() {
        return numColeta;
    }

    public void setNumColeta(int numColeta) {
        this.numColeta = numColeta;
    }

    public String getTipoColeta() {
        return tipoColeta;
    }

    public void setTipoColeta(String tipoColeta) {
        this.tipoColeta = tipoColeta;
    }

    public Empresa getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    public void setEmpresaResponsavel(Empresa empresaResponsavel) {
        this.empresaResponsavel = empresaResponsavel;
    }

    
}

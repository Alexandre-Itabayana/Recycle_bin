

/**
 *
 * @author Reinaldo Reis
 */
public class Servico {
    private String produto;
    private char preco;
    private char tempoRetirada;
    private String coletorResponsavel;
    private String statusId;

    /**
     *
     * @return
     */
    public String getProduto() {
        return produto;
    }

    /**
     *
     * @param produto
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     *
     * @return
     */
    public char getPreco() {
        return preco;
    }

    /**
     *
     * @param preco
     */
    public void setPreco(char preco) {
        this.preco = preco;
    }

    /**
     *
     * @return
     */
    public char getTempoRetirada() {
        return tempoRetirada;
    }

    /**
     *
     * @param tempoRetirada
     */
    public void setTempoRetirada(char tempoRetirada) {
        this.tempoRetirada = tempoRetirada;
    }

    /**
     *
     * @return
     */
    public String getColetorResponsavel() {
        return coletorResponsavel;
    }

    /**
     *
     * @param coletorResponsavel
     */
    public void setColetorResponsavel(String coletorResponsavel) {
        this.coletorResponsavel = coletorResponsavel;
    }

    /**
     *
     * @return
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     *
     * @param statusId
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    /**
     *
     * @param produto
     * @param preco
     * @param tempoRetirada
     * @param coletorResponsavel
     * @param statusId
     */
    public Servico(String produto, char preco, char tempoRetirada, String coletorResponsavel, String statusId) {
        this.produto = produto;
        this.preco = preco;
        this.tempoRetirada = tempoRetirada;
        this.coletorResponsavel = coletorResponsavel;
        this.statusId = statusId;
    }
    

}

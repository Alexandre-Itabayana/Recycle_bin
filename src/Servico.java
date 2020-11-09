
public class Servico {
    private String produto;
    private char preco;
    private char tempoRetirada;
    private String coletorResponsavel;
    private String statusId;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public char getPreco() {
        return preco;
    }

    public void setPreco(char preco) {
        this.preco = preco;
    }

    public char getTempoRetirada() {
        return tempoRetirada;
    }

    public void setTempoRetirada(char tempoRetirada) {
        this.tempoRetirada = tempoRetirada;
    }

    public String getColetorResponsavel() {
        return coletorResponsavel;
    }

    public void setColetorResponsavel(String coletorResponsavel) {
        this.coletorResponsavel = coletorResponsavel;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public Servico(String produto, char preco, char tempoRetirada, String coletorResponsavel, String statusId) {
        this.produto = produto;
        this.preco = preco;
        this.tempoRetirada = tempoRetirada;
        this.coletorResponsavel = coletorResponsavel;
        this.statusId = statusId;
    }
    

}

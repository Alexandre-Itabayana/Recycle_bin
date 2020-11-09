
import java.util.Date;


public class Pedido {

    private int numPedido;
    private String status;
    private Date date;
    private boolean aceite;

    public Pedido(int numPedido, String status, Date date, boolean aceite) {
        this.numPedido = numPedido;
        this.status = status;
        this.date = date;
        this.aceite = aceite;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAceite() {
        return aceite;
    }

    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

}

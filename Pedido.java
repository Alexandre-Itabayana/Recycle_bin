
import java.util.Date;

/**
 *
 * @author Reinaldo Reis
 */
public class Pedido {

    private int numPedido;
    private String status;
    private Date date;
    private boolean aceite;

    /**
     *
     * @param numPedido
     * @param status
     * @param date
     * @param aceite
     */
    public Pedido(int numPedido, String status, Date date, boolean aceite) {
        this.numPedido = numPedido;
        this.status = status;
        this.date = date;
        this.aceite = aceite;
    }

    /**
     *
     * @return
     */
    public int getNumPedido() {
        return numPedido;
    }

    /**
     *
     * @param numPedido
     */
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public boolean isAceite() {
        return aceite;
    }

    /**
     *
     * @param aceite
     */
    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

}

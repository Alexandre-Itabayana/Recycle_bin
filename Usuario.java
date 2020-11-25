
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picanha-PC
 */
public class Usuario {

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public Date getData_inicio() {
        return data_inicio;
    }

    /**
     *
     * @param data_inicio
     */
    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     *
     * @return
     */
    public Date getData_final() {
        return data_final;
    }

    /**
     *
     * @param data_final
     */
    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

    /**
     *
     * @return
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    private String login;
    private Date data_inicio;
    private Date data_final;
    private String senha;
    private String email;
     
}

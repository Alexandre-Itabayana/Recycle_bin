/* Essa classe faz login com Empresa e chama m�todo Servi�o*/

/**
 *
 * @author Reinaldo Reis
 */


public class Empresa {
   private long cnpj;
   private float usuariosenha;
   private Usuario usuario;
   private String endereco;
   private int complemento;
   private String bairro;
   private String uf;
   private String cidade;
   private int cep;
   private String pais;

    /**
     *
     * @return
     */
    public long getCnpj() {
        return cnpj;
    }

    /**
     *
     * @param cnpj
     */
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    /**
     *
     * @return
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
   private int telefone;

    /**
     *
     * @return
     */
    public Usuario getUsuario() {
     return usuario;
  }

    /**
     *
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
  }

    /**
     *
     * @return
     */
    public String getEndereco() {
    return endereco;
}

    /**
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
      this.endereco = endereco;
  }

    /**
     *
     * @return
     */
    public int getComplemento() {
      return complemento;
    }

    /**
     *
     * @param complemento
     */
    public void setComplemento(int complemento) {
      this.complemento = complemento;
  }

    /**
     *
     * @return
     */
    public String getBairro() {
      return bairro;
  }

    /**
     *
     * @param bairro
     */
    public void setBairro(String bairro) {
      this.bairro = bairro;
  }

    /**
     *
     * @return
     */
    public String getUf() {
      return uf;
  }

    /**
     *
     * @param uf
     */
    public void setUf(String uf) {
      this.uf = uf;
  }

    /**
     *
     * @return
     */
    public String getCidade() {
      return cidade;
  }

    /**
     *
     * @param cidade
     */
    public void setCidade(String cidade) {
      this.cidade = cidade;
  }

    /**
     *
     * @return
     */
    public int getCep() {
      return cep;
  }

    /**
     *
     * @param cep
     */
    public void setCep(int cep) {
      this.cep = cep;
  }

    /**
     *
     * @return
     */
    public String getPais() {
      return pais;
  }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
      this.pais = pais;
  }

    /**
     *
     * @param num
     * @param user
     */
    public Empresa (long num, float user) {
        cnpj = num;
	usuariosenha = user;
    }

    /**
     *
     * @param num
     */
    public void RegistraColeta (long num){
		if (usuariosenha == 0)
			cnpj = cnpj + 1;
		/* cnpf Registra Coleta no banco de dados*/
    }

}

/* Essa classe faz login com Empresa e chama m�todo Servi�o*/

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
   private int telefone;

   public Usuario getUsuario() {
     return usuario;
  }

  public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
  }

  public String getEndereco() {
    return endereco;
}

  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }

  public int getComplemento() {
      return complemento;
    }

  public void setComplemento(int complemento) {
      this.complemento = complemento;
  }

  public String getBairro() {
      return bairro;
  }

  public void setBairro(String bairro) {
      this.bairro = bairro;
  }

  public String getUf() {
      return uf;
  }

  public void setUf(String uf) {
      this.uf = uf;
  }

  public String getCidade() {
      return cidade;
  }

  public void setCidade(String cidade) {
      this.cidade = cidade;
  }

  public int getCep() {
      return cep;
  }

  public void setCep(int cep) {
      this.cep = cep;
  }

  public String getPais() {
      return pais;
  }

  public void setPais(String pais) {
      this.pais = pais;
  }


   public Empresa (long num, float user) {
        cnpj = num;
	usuariosenha = user;
    }

    public void RegistraColeta (long num){
		if (usuariosenha == 0)
			cnpj = cnpj + 1;
		/* cnpf Registra Coleta no banco de dados*/
    }

}

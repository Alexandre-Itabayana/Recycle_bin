/* Essa classe tem por objetivo incluir, excluir, validar
 *  e gerar usuario para entrada no sistema*/

/**
 *
 * @author Reinaldo Reis
 */


public class Cadastro {

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
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
     * @return
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @return
     */
    public long getCpf() {
        return cpf;
    }

	private String nome;
	private String endereco;
	private String telefone;
	private long cpf;
	private float usuariosenha;
        
    /**
     *
     * @param n
     * @param end
     * @param tel
     * @param num
     */
    public Cadastro (String n, String end, String tel, long num) {
		this.nome = n;
		this.endereco = end;
		this.telefone = tel;
		this.cpf = num;
	}

    /**
     *
     * @param num
     */
    public 	void validarCadastro (long num){
		if (this.cpf < 0) //verificar banco de dados se existe*/
		System.out.println("J� existe esse cadastro"); 

	}
	
    /**
     *
     * @param n
     * @param end
     * @param tel
     * @param num
     */
    public 	void incluir (String n, String end, String tel, long num){
		this.nome = n;
		this.endereco = end;
		this.telefone = tel;
		this.cpf = num;
	}
	
    /**
     *
     * @param num
     */
    public	void excluir (long num){
		nome = null;
		endereco = null;
		telefone = null;
		cpf = 0;
	}

    /**
     *
     * @param n
     * @param end
     * @param tel
     * @param num
     */
    public	void alterar (String n, String end,String tel, long num){
		nome = null;
		endereco = null;
		telefone = null;
	}

    /**
     *
     * @return
     */
    public float gerarSenha () {
	return (usuariosenha); /*retorna usuario e senha */
	}
}	

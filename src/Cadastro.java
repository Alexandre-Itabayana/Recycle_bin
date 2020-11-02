/* Essa classe tem por objetivo incluir, excluir, validar
 *  e gerar usuario para entrada no sistema*/

public class Cadastro {
	private String nome;
	private String endereco;
	private String telefone;
	private long cpf;
	private float usuariosenha;
	
	public Cadastro (String n, String end, String tel, long num) {
		nome = n;
		endereco = end;
		telefone = tel;
		cpf = num;
	}
	public 	void validarCadastro (long num){
		if (cpf < 0) //verificar banco de dados se existe*/
		System.out.println("Já existe esse cadastro"); 

	}
	
	public 	void incluir (String n, String end, String tel, long num){
		nome = n;
		endereco = end;
		telefone = tel;
		cpf = num;
	}
	
	public	void excluir (long num){
		nome = null;
		endereco = null;
		telefone = null;
		cpf = 0;
	}
	public	void alterar (String n, String end,String tel, long num){
		nome = null;
		endereco = null;
		telefone = null;
	}

	public float gerarSenha () {
	return (usuariosenha); /*retorna usuario e senha */
	}
}	

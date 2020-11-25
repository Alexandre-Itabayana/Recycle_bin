/* Essa claase faz login com usu�rio e chama m�todo coleta*/ 

/**
 *
 * @author Reinaldo Reis
 */
 

public class Morador {
	private long cpf;
	private float usuariosenha; 

    /**
     *
     * @param num
     * @param user
     */
    public Morador (long num, float user) {
	this.cpf = num;
	this.usuariosenha = user;
	}
	
    /**
     *
     * @param num
     */
    public void solicitaColeta (long num){
		/* cpf grava solicitacao desejada no banco de dados*/
		
	}

}
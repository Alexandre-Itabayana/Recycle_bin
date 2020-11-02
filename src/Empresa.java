/* Essa classe faz login com Empresa e chama método Serviço*/ 

public class Empresa {
   private long cnpj;
   private float usuariosenha; 

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
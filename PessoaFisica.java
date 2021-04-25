public class PessoaFisica extends Cliente {
    private String cpf;
    
public PessoaFisica(String nome, String cpf){
    super(nome);    
    this.cpf = cpf;

}
public String getCpf(){
    return cpf;
   }
@Override
	public String toString() {
		return "Nome: "+getNome()+" CPF: "+cpf+" Tipo do Cliente: "+getClass();
	}
}
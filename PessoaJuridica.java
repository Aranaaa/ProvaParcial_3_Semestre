public class PessoaJuridica extends Cliente {
    private String cnpj;

public PessoaJuridica(String nome, String cnpj){
    super(nome);
    this.cnpj = cnpj;
    
    
}
public String getCnpj(){
    return cnpj;
   }
@Override
	public String toString() {
        return "Nome: "+getNome()+" Tipo do Cliente: "+getClass();
	}
}
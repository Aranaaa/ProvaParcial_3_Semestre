public class PessoaJuridica extends Cliente {
    private String cnpj;

public void setPessoaJuridica(String nome, String cnpj){
    super(nome);
    this.cnpj = cnpj;
    
}
@Override
	public String toString() {
		return "CNPJ: "+this.cnpj;
	}
}
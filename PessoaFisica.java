public class PessoaFisica extends Cliente {
    private String cpf;

public void setPessoaFisica(String cpf){
    this.cpf = cpf;
}
@Override
	public String toString() {
		return "CPF: "+this.cpf;
	}
}
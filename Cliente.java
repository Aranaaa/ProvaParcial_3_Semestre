public abstract class Cliente {
    private String nome;

public void setCliente(String nome){
    this.nome = nome;
}

    @Override
	public String toString() {
		return "Nome: "+this.nome;
	}

}

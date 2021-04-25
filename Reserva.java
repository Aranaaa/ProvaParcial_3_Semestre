public class Reserva {
    private Cliente cliente;
    private boolean pagamentoAvista;


    public Reserva(Cliente cliente, boolean pagamentoAvista){
       this.cliente = cliente;
       this.pagamentoAvista = pagamentoAvista;
    }
   public Cliente getCliente(){
        return cliente;
   }

    @Override
	public String toString() {
		return "Nome: "+this.cliente.getNome()+"Tipo de cliente: "+cliente+"Forma de pagamento: "+this.pagamentoAvista;
    }
    public void setNome(Cliente novo) {
    }
    public void setpagamentoAvista(boolean pagamento) {
    }

}


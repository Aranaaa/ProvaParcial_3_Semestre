public class Reserva {
    private Cliente cliente;
    private boolean pagamentoAvista;


    public Reserva(Cliente cliente, boolean pagamentoAvista){
       
    }
   
    @Override
	public String toString() {
		return "Nome: "+this.cliente.getNome()+"Tipo de cliente: "+this.cliente+"Forma de pagamento: "+this.pagamentoAvista;
    }

    //public boolean setpagamentoAvista(boolean b) {
       // return b;
    //}

    public void setpagamentoAvista(boolean b) {
    }
}


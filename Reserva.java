public class Reserva implements Pagamento {
    private Cliente cliente;
    private boolean pagamentoAvista;


    public Reserva(Cliente cliente, boolean pagamentoAvista){
       this.cliente = cliente;
       this.pagamentoAvista = pagamentoAvista;
    }
    public Cliente getCliente(){
        return cliente;
   }
    public void setNome(Cliente novo) {
    }
    public void setpagamentoAvista(boolean pagamento) {
    }
    
    @Override
	public String toString() {
        if (!pagamentoAvista) {
            return cliente+" Forma de pagamento: Parcelado";
        }else{
        return cliente+" Forma de pagamento: A vista";
    }
}
    

}


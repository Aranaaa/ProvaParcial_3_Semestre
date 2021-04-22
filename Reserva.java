public class Reserva {
    private Cliente cliente;
    private boolean pagamentoAvista;


    public Reserva(Cliente cliente, boolean pagamentoAvista){
        this.cliente = cliente;
        this.pagamentoAvista = pagamentoAvista;

    }
   
    @Override
	public String toString() {
		return "Nome: "+this.cliente.getNome()+"Tipo de cliente: "+this.cliente+"Forma de pagamento: "+this.pagamentoAvista;
    }
    public double calcularPagamento(){
        double auxpagamento = 0;
        if (pagamentoAvista = true){
            auxpagamento = 3200 * 0.9;
        }else{
            auxpagamento = 3200;
    }
    return auxpagamento;
}


public interface Pagamento {
    public static double calcularPagamento(boolean pagamentoAvista){
        double auxpagamento = 0;
        if (pagamentoAvista = true){
            auxpagamento = 3200 * 0.9;
        }else{
            auxpagamento = 3200;
    }
    return auxpagamento;
}
}


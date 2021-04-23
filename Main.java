import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
        Reserva[] reservas = new Reserva [30];
		int indice = 0;
		String nome;
		String resp;
		do {
			resp = JOptionPane.showInputDialog(
					"Restaurante SABOR SOFISTICADO\n1. Reservar Mesa\n2. Pesquisar reserva\n3. Imprimir reservas\n4. Imprimir lista de espera\n5. Cancelar reserva\n6.Finalizar");
			switch (resp) {
			//Reservar Mesa
            case "1":
            Reservar(reservas, indice);
				break;
			//Pesquisar Reserva
			case "2":
			Pesquisar(reservas);
                break;
			default:
			JOptionPane.showMessageDialog(null, "Escolha uma opção válida!", "Erro!",JOptionPane.WARNING_MESSAGE);
				resp = "1";
			}
		} while (resp.equals("1") || resp.contentEquals(null));

    }
    public static void Reservar(Reserva reservas[], int indice) {
		Cliente novo;
		//nome
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		//pessoafisicajuridica
		Object[] itens = { "Física", "Jurídica" };
		Object tipo = JOptionPane.showInputDialog(null, "Pessoa física ou jurídica", null,
			JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
			if (tipo == "Física") {
				String cpf = JOptionPane.showInputDialog("Informe o CPF");
				 novo = new PessoaFisica(nome, cpf);	
				novo.setNome(nome);
			}else if (tipo == "Jurídica") {
				String cnpj = JOptionPane.showInputDialog("Informe o CNPJ");
				 novo = new PessoaJuridica(nome, cnpj);
				novo.setNome(nome);
			} else {
				JOptionPane.showMessageDialog(null, "Escolha uma ação", "!",
							JOptionPane.WARNING_MESSAGE);
				return;
			}
		//formadepagamento
		boolean pagamento = false;
			Object[] items = { "A vista", "Parcelado" };
			Object type = JOptionPane.showInputDialog(null, "Qual sua forma de pagamento?", null,
				JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
			if(type == "A vista"){
			pagamento = true;
			}else if (type == "Parcelado") {
			pagamento = false;

			} else {
				JOptionPane.showMessageDialog(null, "Escolha uma ação", "!",
							JOptionPane.WARNING_MESSAGE);
				return;
			}
		//reserva
		Reserva R = new Reserva(novo, pagamento);
		reservas[indice] = R;
		indice++;
			if(indice > 5){
				JOptionPane.showMessageDialog(null, "Passando para a lista de espera, devido ao número de mesas cheias.", "Lista de espera",
							JOptionPane.WARNING_MESSAGE);
							
			}else{
		JOptionPane.showMessageDialog(null, "Reservado!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
	}
	}
	
	public static void Pesquisar(Reserva reservas[]) {
		Object[] itens = { "Física", "Jurídica" };
		Object tipo = JOptionPane.showInputDialog(null, "Pessoa física ou jurídica", null,
			JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		//PessoaFísica
			if (tipo == "Física"){
		String aux = JOptionPane.showInputDialog("Informe seu CPF");
				for (int i = 0; i < 6; i++) {
					PessoaFisica pf = (PessoaFisica)reservas[i].getCliente();
					if(pf.getCpf().equals(aux) ){
						JOptionPane.showMessageDialog(null, "Você possui uma mesa reservada!", "Maravilha!", JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null, "Não tem reserva com tais informações... ", "Oh não...",
							JOptionPane.WARNING_MESSAGE);
					}
				}
		//PessoaJurídica
			}else if(tipo == "Jurídica"){
				String aux = JOptionPane.showInputDialog("Informe seu CNPJ");
				for (int i = 0; i < 6; i++) {
					PessoaJuridica pj = (PessoaJuridica)reservas[i].getCliente();
					if(pj.getCnpj().equals(aux) ){
						JOptionPane.showMessageDialog(null, "Você possui uma mesa reservada!", "Maravilha!", JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null, "Não tem reserva com tais informações... ", "Oh não...",
							JOptionPane.WARNING_MESSAGE);
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "Escolha uma ação", "!",
							JOptionPane.WARNING_MESSAGE);
				return;

       
    }
 }
}	
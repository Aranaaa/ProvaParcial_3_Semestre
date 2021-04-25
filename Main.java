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
		   reservas [indice] = Reservar(reservas, indice);
		   if (reservas[indice] == null) {
			   
		   }else{
			indice ++;
		   }
				break;
			//Pesquisar Reserva
			case "2":
			Pesquisar(reservas);
				break;
			case "3":
			JOptionPane.showMessageDialog(null,ImprimirReservas(reservas));
				break;
			case "4":
			JOptionPane.showMessageDialog(null,ImprimirExtras(reservas));
					break;
			case "5":
			return;
			case "6":
			return;
			default:
			JOptionPane.showMessageDialog(null, "Escolha uma opção válida!", "Erro!",JOptionPane.WARNING_MESSAGE);
				resp = "1";
			}
		} while (resp.equals("1") || resp.equals("2") ||resp.equals("3") || resp.equals("4")|| resp.equals("5") || 
		resp.equals("6") || resp.contentEquals(null));
 
    }
    public static Reserva Reservar(Reserva reservas[], int indice) {
		Cliente novo = null;
		Reserva R = null;
		//nome
		String nome = JOptionPane.showInputDialog(null,"Informe seu nome");
		if(nome == null ){
			return R;
		}
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
				return R;
			}
		//formadepagamento, cancelar n está funcionando
		boolean pagamento = false;
			Object[] items = { "A vista", "Parcelado" };
			Object type = JOptionPane.showInputDialog(null, "Qual sua forma de pagamento?", null,
				JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
			if(type == "A vista"){
			pagamento = true;
			}else if  (type == "Pagamento") {
			pagamento = false;
			} else if (type == null) {
				return R;
			}
		//reserva
		R = new Reserva(novo, pagamento);
		R.setNome(novo);
		R.setpagamentoAvista(pagamento);
		
			if(indice > 5){
				JOptionPane.showMessageDialog(null, "Passando para a lista de espera, devido ao número de mesas cheias.", "Lista de espera",
							JOptionPane.WARNING_MESSAGE);
							
			}else{
		JOptionPane.showMessageDialog(null, "Reservado!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		return R;
	}
	return R;
	}
	
	public static void Pesquisar(Reserva reservas[]) { //show
		Object[] itens = { "Física", "Jurídica" };
		Object tipo = JOptionPane.showInputDialog(null, "Pessoa física ou jurídica", null,
			JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		//PessoaFísica
			if (tipo == "Física"){
		String aux = JOptionPane.showInputDialog("Informe seu CPF");
				for (int i = 0; i < 6; i++) {
					if(reservas[i] != null){
					if (reservas[i].getCliente() instanceof PessoaFisica) {
					PessoaFisica pf = (PessoaFisica)reservas[i].getCliente();
					if(pf.getCpf().equals(aux) ){
						JOptionPane.showMessageDialog(null, "Você possui uma mesa reservada!", "Maravilha!", JOptionPane.INFORMATION_MESSAGE);
						return;
				}	
			}
		 }	
		}
		//PessoaJurídica
			}else if(tipo == "Jurídica"){
				String aux = JOptionPane.showInputDialog("Informe seu CNPJ");
				for (int i = 0; i < 6; i++) {
					if(reservas[i] != null){
					if (reservas[i].getCliente() instanceof PessoaJuridica) {
					PessoaJuridica pj = (PessoaJuridica)reservas[i].getCliente();
					if(pj.getCnpj().equals(aux) ){
						JOptionPane.showMessageDialog(null, "Você possui uma mesa reservada!", "Maravilha!", JOptionPane.INFORMATION_MESSAGE);
						return;
					}	
					}
				}
			}
    	}
		JOptionPane.showMessageDialog(null, "Não tem reserva com tais informações... ", "Oh não...", JOptionPane.WARNING_MESSAGE);
 }

	public static String ImprimirReservas(Reserva reservas[]){ //pedir ajuda com conteudo dentro do array
		String imprimir = "";
		for (int i = 0; i < 6; i++) {
			if (reservas[i] == null) {
				break;
			}
			imprimir +=" \n" + reservas[i]; 
		}
		return imprimir;
	 }

	public static String ImprimirExtras(Reserva reservas[]){ //pedir ajuda com conteudo dentro do array
		String imprimir = "";
		for (int i = 6; i < reservas.length; i++) {
			if (reservas[i] == null) {
				break;
			}
			imprimir +=" \n" + reservas[i]; 
		}
		return imprimir;
	 }

	}

	
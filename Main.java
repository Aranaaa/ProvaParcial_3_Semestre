import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
        Reserva[] reservas = new Reserva [5];
        Reserva[] extra = new Reserva [10];
        int indice = 0;
        String resp;
		do {
			resp = JOptionPane.showInputDialog(
					"Restaurante SABOR SOFISTICADO\n1. Reservar Mesa\n2. Pesquisar reserva\n3. Imprimir reservas\n4. Imprimir lista de espera\n5. Cancelar reserva\n6.Finalizar");
			switch (resp) {
            case "1":
            indice += Reservar(reservas, indice);
				if (indice < 5) {
					
				} else if (indice > 4 && indice < 15 ){
					JOptionPane.showMessageDialog(null, "Passando para a lista de espera, devido ao número de mesas cheias.", "Lista de espera",
							JOptionPane.WARNING_MESSAGE);
					indice += Reservar(extra, indice);
					
				}else {
					JOptionPane.showMessageDialog(null, "Ta tudo lotado", "Eita!",
							JOptionPane.WARNING_MESSAGE);
				}
				break;
			case "2":
				cpf = JOptionPane.showInputDialog("Digite o CPF que quer buscar");
				Pesquisar(bro, extra, cpf);
				break;
			case "3":
				Listar(bro);
				Listar(bro, "27/12/2020");
				break;
			case "4":
				cpf= JOptionPane.showInputDialog("Poe o cpf de quem vc quer cancelar");
				Cancelar(bro,cpf);
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "Já vai tarde!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida.");
				resp = "1";
			}
		} while (resp.equals("1") || resp.equals("2") || resp.equals("3") || resp.equals("4")
				|| resp.contentEquals(null));

    }
    public static int Reservar(Reserva reservas[], int indice) {
		String auxpaga = "";
		reservas[indice] = new Reserva();
		reservas[indice].nome = JOptionPane.showInputDialog("Diga seu nome!");
		reservas[indice].CPF = JOptionPane.showInputDialog("Diga seu CPF!");
		reservas[indice].telefone = JOptionPane.showInputDialog("Diga seu telefone!");
		auxpaga = JOptionPane.showInputDialog("\nDigite 1 para pagamento à vista\nDigite dois para pagemento parcelado");
		reservas[indice].pagamento = Integer.parseInt(auxpaga);
		JOptionPane.showMessageDialog(null, "Reservado!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
	}
    }

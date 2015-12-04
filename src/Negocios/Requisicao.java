package Negocios;

import Redes.Cliente_SD;
import Ui.ControlCliente;

public class Requisicao implements ControlCliente {

	private Cliente_SD cliente;
	
	public Requisicao(Cliente_SD clienteParametro){
		cliente = clienteParametro;
	}
	
	@Override
	public void enviarMsg(String menssagem) {
		cliente.send(menssagem);
		}

}

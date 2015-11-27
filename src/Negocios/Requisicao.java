package Negocios;

import Redes.Cliente;
import Ui.ControlCliente;

public class Requisicao implements ControlCliente {

	private Cliente cliente;
	
	public Requisicao(Cliente clienteParametro){
		cliente = clienteParametro;
	}
	
	@Override
	public void enviarMsg(String menssagem) {
		cliente.send(menssagem);
	}

}

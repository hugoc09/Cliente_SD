package Negocios;

import Entidades.IP;
import Redes.Cliente_SD;
import Redes.PacketUDP;
import Ui.ControlCliente;

public class Controlador implements ControlCliente {

	private Cliente_SD cliente;
	private PacketUDP packetUDP;
	
	public Controlador(){
	}
	
	
	@Override
	public void enviarMsg(String menssagem) {
		cliente.send(menssagem);
		}

	@Override
	public void parar() {
		
		try {
			System.out.println("Encerrado conexão...");
			cliente.stop();
			System.out.println("Conexão encerrada com sucesso!");
			
			} catch (Exception e) {
				e.printStackTrace();
			}	
		
	}


	@Override
	public void buscarIp() {
		
		try {
			
			do{
				
			System.out.println("Buscando IP...");
			packetUDP = new PacketUDP();
			packetUDP.start();
			packetUDP.stop();
			
			}while(PacketUDP.ip==null);
			
			inicializar(PacketUDP.ip);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}
	

	@Override
	public boolean statusConexao() {
		boolean boo = false;
		
		if(cliente!=null){
		boo = cliente.isExecutando();
		}
		
		return boo;
	}
	

	public void pararBusca() {
		try {
			
			packetUDP.stop();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}


	public void inicializar(IP ipParametro) {
		
		try {
			System.out.println("Inicializando Conexão com o servidor...");
			cliente = new Cliente_SD(ipParametro);
			cliente.start();
			System.out.println("Coneção realizada com sucesso!");
			
			} catch (Exception e) {
				e.printStackTrace();
			}		
		
	}

	

}

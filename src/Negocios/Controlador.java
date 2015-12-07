package Negocios;

import Entidades.IP;
import Exceptions.ServidoresOfflineExceptions;
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
		if(statusConexao()){
		cliente.send(menssagem);
		}
		}

	@Override
	public void parar() {
		
		try {
			System.out.println("Encerrado conex�o...");
			cliente.stop();
			System.out.println("Conex�o encerrada com sucesso!");
			
			} catch (Exception e) {
				e.printStackTrace();
			}	
		
	}


	@Override
	public void buscarIp() {
		
		try {
			
			//do{
			for(int i=0;i <3; i++){
			
			System.out.println("Buscando IP..." + "tentativa: " + i++);
			packetUDP = new PacketUDP();
			packetUDP.start();
			packetUDP.stop();
			
			if(packetUDP.getIp() != null){
				break;
			}else if(i==2){
				return;
			}
			
			}
			//}while(packetUDP.getIp() == null);
			
			inicializar(packetUDP.getIp());
			
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


	public void inicializar(IP ipParametro) throws Exception {
		
		try {
			System.out.println("Inicializando Conex�o com o servidor...");
			cliente = new Cliente_SD(ipParametro);
			cliente.start();
			System.out.println("Conex�o realizada com sucesso!");
			
			} catch (ServidoresOfflineExceptions e) {
				System.out.println("Servidores n�o encontrados em rede.");
			}		
		
	}

	

}

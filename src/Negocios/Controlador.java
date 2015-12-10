package Negocios;

import Entidades.IP;
import Exceptions.ServidoresOfflineExceptions;
import Redes.Cliente_SD;
import Redes.PacketUDP;
import Ui.ControlCliente;
import Ui.TelaPrincipal;

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
			if(cliente!=null){
			enviarMsg("FIM");
			cliente.stop();
			}
			System.out.println("Conex�o encerrada com sucesso!");
			
			} catch (Exception e) {
				e.printStackTrace();
			}	
		
	}


	@Override
	public void buscarIp() {
		
		try {
			
			for(int i=1; i<4; i++){
			
			System.out.println("Buscando IP...");
			System.out.print("Tentativa: " + i);
			packetUDP = new PacketUDP();
			packetUDP.start();
			packetUDP.stop();
			
			if(packetUDP.getIp() != null){
				break;
			}
			
			if(i==3){
				TelaPrincipal.Logs.append("Servidores Offline"+"\n");
				return;
			}
			
			}
			
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

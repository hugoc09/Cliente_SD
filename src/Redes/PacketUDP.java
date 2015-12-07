package Redes;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

import Entidades.IP;
import Negocios.Pesquisa;
import Ui.TelaPrincipal;

public class PacketUDP implements Runnable{
	
	private DatagramSocket clientSocket;
	 
	private DatagramPacket pkgEnviado;
	private DatagramPacket pkgRecebido;

	public static IP ip;
	private Control control;
	
	private boolean inicializado;
	private boolean executando;

	private Thread  thread;
	
	public PacketUDP() throws Exception{
		control = new Pesquisa();
		inicializado = false;
		executando   = false;

		open();
	}
	
	private void open() {
		try {
			clientSocket = new DatagramSocket(); 
		
			enviarMsg();
			
			inicializado = true;
		}
		catch (Exception e) {
			close();
		}
	}
	
	private void close(){

		if (clientSocket != null) {
			try {
				clientSocket.close();
			}
			catch (Exception e){
				System.out.println(e);
			}
		}

		pkgEnviado   = null;
		pkgRecebido  = null;
		clientSocket = null;
		
		control = null;
		
		inicializado = false;
		executando   = false;

		thread = null;

	}
	
	public void start() {
		if (!inicializado || executando) {
			return;
		}

		executando = true;
		thread = new Thread(this);
		thread.start();
	}

	public void stop() throws Exception{
		executando = false;
		
		if (thread != null) {
			thread.join();
		}
	}
	
	private void enviarMsg(){
		
		try {
			InetAddress addr = InetAddress.getByName("192.168.50.26"); // CONFIGURAR IP DNS
			
			byte[] msgEnviada = new byte[1024];
			pkgEnviado = new DatagramPacket(msgEnviada, msgEnviada.length, addr, 2526);
			this.clientSocket.send(pkgEnviado);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {

		byte[] recebeDados = new byte[1024];
		pkgRecebido = new DatagramPacket(recebeDados, recebeDados.length);
	 	
		try {
			
			clientSocket.setSoTimeout(6000);
		 	
		 	clientSocket.receive(pkgRecebido); 
		 	
		 	
		 	
		 	String s = new String(pkgRecebido.getData());
			
			ip = control.pegarIP(s);
			 
		 	
		} catch (SocketTimeoutException g) {
			System.out.println("Servidores Offline");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		close();	
	}
		
	
	}



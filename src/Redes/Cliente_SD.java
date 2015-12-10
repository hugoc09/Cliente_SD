package Redes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

import Ui.TelaPrincipal;
import Entidades.IP;
import Exceptions.ServidoresOfflineExceptions;

public class Cliente_SD implements Runnable{
 
		private Socket socket;
 
		private BufferedReader in;
		private PrintStream out;
 
		private IP ip;
		
		private boolean inicializado;
		private boolean executando;
 
		private Thread  thread;
 
		public Cliente_SD(IP ipParametro) throws Exception, ServidoresOfflineExceptions{
			ip = ipParametro;
			inicializado = false;
			executando   = false;
		
			open();
		}
 
		private void open() throws Exception{
			try {
				socket = new Socket(ip.getIp(), ip.getPorta()); 
				
				in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintStream(socket.getOutputStream());
   
				inicializado = true;
			}
			catch (Exception e) {
				  close();
				  throw new ServidoresOfflineExceptions(e);
			}
		}
 
		private void close(){
			if (in != null) {
				try {
					in.close();
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}

			if (out != null) {
				try {
					out.close();
				}
				catch (Exception e){
					e.printStackTrace();				}
			}

			if (socket != null) {
				try {
					socket.close();
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
  
			in     = null;
			out    = null;
			socket = null;
			
			ip = null;
  
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
		
		public boolean isInicializado() {
			  return inicializado;
			 }
 
		public boolean isExecutando() {
			return executando;
		}
 
		public void send(String mensagem) {
			try {
				out.println(mensagem);
			} catch (Exception e) {
				System.out.println("Você não possui conexão");
			}
			
		}
 
 
		@Override
		public void run() {
  
			while (executando) {
				try {
					socket.setSoTimeout(3000);
					
					String mensagem = in.readLine();
    
					if (mensagem == null) {
						break;
					}

					System.out.println(
							"Tradução recebida do servidor: " +
									mensagem);
					TelaPrincipal.Logs.append(mensagem+"\n");
						
				}
				catch (SocketTimeoutException e) {
					// Ignorar
				}
				catch (Exception e) {
					break;
				}
			}
			
			TelaPrincipal.Logs.append(" < Conexao Encerrada > " + "\n");
			
			close();				
		}
	}
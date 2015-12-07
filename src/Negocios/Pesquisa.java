package Negocios;


import java.net.InetAddress;
import java.util.regex.Pattern;

import Entidades.IP;
import Redes.Control;

public class Pesquisa implements Control{

	@Override
	public IP pegarIP(String s) {
		IP r = new IP();
		try {
		String argumentos[] = s.split(Pattern.quote(";"));
		String enderecoIp[] = argumentos[0].split(Pattern.quote("/"));
		//Mostra no video
		System.out.println("Datagrama UDP recebido: " + argumentos[0] + ":" + argumentos[1]);
		
		String c = enderecoIp[1];
		InetAddress a = InetAddress.getByName(c);
			
		
		
	 	int b = Integer.parseInt(argumentos[1]);
	 	
	 	r.setIp(a);
	 	r.setPorta(b);
		} catch (Exception e) {
		e.printStackTrace();	
		}
		
		return r;
	}

}

package Negocios;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

import Entidades.IP;
import Redes.Control;

public class Pesquisa implements Control{

	@Override
	public IP pegarIP(String s) {
		IP r = new IP();
		
		try {
		String argumentos[] = s.split(Pattern.quote(";"));
		//Mostra no video
		System.out.println("Datagrama UDP recebido: " + argumentos[0] + argumentos[1]);
		
		String a = argumentos[0];
	 	String b = argumentos[1];
	
	 	r.setIp(InetAddress.getByName(a));
	 	r.setPorta(Integer.parseInt(b));
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		return r;
	}

}

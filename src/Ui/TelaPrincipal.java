/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import Entidades.IP;
import Negocios.Requisicao;
import Redes.Cliente_SD;

import javax.swing.JTextPane;

/**
 *
 * @author Hugo Calado
 */
public class TelaPrincipal extends javax.swing.JFrame {

	
	private ControlCliente  control;
	
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(Cliente_SD clienteParametro) {
        initComponents();
        control = new Requisicao(clienteParametro);
    }

    public void Traduzir() throws UnknownHostException, IOException{
    	
	
    	String traduzir = PalavraParaTraduzir.getText();
    	String l1 = Linguagem1.getSelectedItem();
    	String l2 = Linguagem2.getSelectedItem();
    	String menssagem = traduzir+";"+l1+";"+l2+";";
    	
    	control.enviarMsg(menssagem);
    	
    	//Socket socket = null;
		
		//socket = new Socket("192.168.1.102", 2525);
		
		//InputStream input = socket.getInputStream();
		//OutputStream output = socket.getOutputStream();
	
		//BufferedReader in = new BufferedReader(new InputStreamReader(input));
		//PrintStream out = new PrintStream(output);

		//out.println(mensagem);
		//mensagem = in.readLine();
		//System.out.println(mensagem);
		
		//JLabel label = new JLabel("");
		//getContentPane().add(label);
		//label.setText(menssagem);
		//JTextArea Logs = new JTextArea(menssagem);
		
    	
	}
		
        
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        PalavraParaTraduzir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Linguagem1 = new java.awt.Choice();
        Linguagem2 = new java.awt.Choice();
        Traduzir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PalavraParaTraduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalavraParaTraduzirActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite a palavra a ser traduzida");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Tradutor");

        jLabel3.setText("Linguagens");

        jLabel4.setText("De:");

        jLabel5.setText("Para:");

        Linguagem1.add("pt");
        Linguagem1.add("en");
        Linguagem1.add("fr");
        Linguagem1.add("it");
        Linguagem1.add("es");

        Linguagem2.add("pt");
        Linguagem2.add("en");
        Linguagem2.add("fr");
        Linguagem2.add("it");
        Linguagem2.add("es");

        Traduzir.setText("Traduzir");
        Traduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					TraduzirActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(4)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(PalavraParaTraduzir, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(69)
        							.addComponent(jLabel3))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(Linguagem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(Linguagem2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel4)
        									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jLabel5)))
        							.addGap(22))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(232)
        					.addComponent(jLabel2)))
        			.addContainerGap(87, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(369, Short.MAX_VALUE)
        			.addComponent(Traduzir)
        			.addGap(95))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jLabel2)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        					.addGroup(layout.createSequentialGroup()
        						.addGap(18)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        							.addComponent(PalavraParaTraduzir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(28)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel4)
        							.addComponent(jLabel5))
        						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(Linguagem1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(Linguagem2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(7)
        					.addComponent(jLabel3)))
        			.addGap(18, 18, Short.MAX_VALUE)
        			.addComponent(Traduzir)
        			.addGap(34))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void TraduzirActionPerformed(java.awt.event.ActionEvent evt) throws UnknownHostException, IOException {                                         
       Traduzir();
    }                                        

    private void PalavraParaTraduzirActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    /**
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	InetAddress enderecoIP = InetAddress.getByName("192.168.43.126");
    	IP ip = new IP(enderecoIP, 2525);
    	final Cliente_SD cliente = new Cliente_SD(ip);
    	cliente.start();
    	
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(cliente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Choice Linguagem1;
    private java.awt.Choice Linguagem2;
    private javax.swing.JTextField PalavraParaTraduzir;
    private javax.swing.JButton Traduzir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
}

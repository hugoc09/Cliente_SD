/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import Entidades.IP;
import Negocios.Controlador;
import Redes.Cliente_SD;

/**
 *
 * @author Hugo Calado
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
	
	ControlCliente  control;
	
    public TelaPrincipal() {
        initComponents();
        
        control = new Controlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Logs = new javax.swing.JTextArea();
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

        Logs.setColumns(20);
        Logs.setRows(5);
        jScrollPane2.setViewportView(Logs);

        PalavraParaTraduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalavraParaTraduzirActionPerformed(evt);
            }
        });

        jLabel1.setText("Palavra a ser Traduzida:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Tradutor");

        jLabel3.setText("Linguagens");

        jLabel4.setText("De:");

        jLabel5.setText("Para:");

        Linguagem1.add("Portugu�s");
        Linguagem1.add("Ingl�s");
        Linguagem1.add("Franc�s");
        Linguagem1.add("Italiano");
        Linguagem1.add("Espanhol");

        Linguagem2.add("Portugu�s");
        Linguagem2.add("Ingl�s");
        Linguagem2.add("Franc�s");
        Linguagem2.add("Italiano");
        Linguagem2.add("Espanhol");

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
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PalavraParaTraduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Linguagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Linguagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)))
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Traduzir)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PalavraParaTraduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Linguagem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Linguagem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Traduzir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void TraduzirActionPerformed(java.awt.event.ActionEvent evt) throws UnknownHostException, IOException{                                         
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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Choice Linguagem1;
    private java.awt.Choice Linguagem2;
    public static javax.swing.JTextArea Logs;
    private javax.swing.JTextField PalavraParaTraduzir;
    private javax.swing.JButton Traduzir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration                   
    
    public void Traduzir()throws UnknownHostException, IOException{
    	
    	String traduzir = PalavraParaTraduzir.getText();
    	String l1="";
    	String l2="";
    	if(Linguagem1.getSelectedItem().equals("Portugu�s")){
    		l1="pt";
    	}
    	if(Linguagem1.getSelectedItem().equals("Ingl�s")){
    		l1="en";
    	}
    	if(Linguagem1.getSelectedItem().equals("Franc�s")){
    		l1="fr";
    	}
    	if(Linguagem1.getSelectedItem().equals("Italiano")){
    		l1="it";
    	}
    	if(Linguagem1.getSelectedItem().equals("Espanhol")){
    		l1="es";
    	}
    	if(Linguagem2.getSelectedItem().equals("Portugu�s")){
    		l2="pt";
    	}
    	if(Linguagem2.getSelectedItem().equals("Ingl�s")){
    		l2="en";
    	}
    	if(Linguagem2.getSelectedItem().equals("Franc�s")){
    		l2="fr";
    	}
    	if(Linguagem2.getSelectedItem().equals("Italiano")){
    		l2="it";
    	}
    	if(Linguagem2.getSelectedItem().equals("Espanhol")){
    		l2="es";
    	}
    	 
    	String menssagem = traduzir+";"+l1+";"+l2+";";
    	
    	if(control.statusConexao()){
    		control.enviarMsg(menssagem);
    		control.buscarIp();
    	}else{
    		control.buscarIp();
    		control.enviarMsg(menssagem);
    	}
    	
    	
    	
    	
    }
    
}

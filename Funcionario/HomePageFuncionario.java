/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto.Funcionario;

import Projeto.CardapioPage;
import Projeto.Login;
import Projeto.MesasPage;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Vinicius Marques
 */
public class HomePageFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form HomePageFuncionario
     */
    public HomePageFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btLogoff = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btCardapioFuncionario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btMesasFuncionario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btHomePageFuncionario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btVerificarMesas = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 780, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btLogoff.setBackground(new java.awt.Color(50, 27, 9));
        btLogoff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLogoff.setForeground(new java.awt.Color(255, 255, 255));
        btLogoff.setText("Logoff");
        btLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoffActionPerformed(evt);
            }
        });
        jPanel3.add(btLogoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 80, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/alface.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 130, 100));

        btCardapioFuncionario.setBackground(new java.awt.Color(68, 35, 4));
        btCardapioFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCardapioFuncionarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btCardapioFuncionarioMousePressed(evt);
            }
        });
        btCardapioFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cardapio");
        btCardapioFuncionario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone cardapio.png"))); // NOI18N
        btCardapioFuncionario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btCardapioFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 260, 50));

        btMesasFuncionario.setBackground(new java.awt.Color(68, 35, 4));
        btMesasFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMesasFuncionarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btMesasFuncionarioMousePressed(evt);
            }
        });
        btMesasFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Mesas");
        btMesasFuncionario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone mesa 50x50.png"))); // NOI18N
        btMesasFuncionario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btMesasFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 50));

        btHomePageFuncionario.setBackground(new java.awt.Color(68, 35, 4));
        btHomePageFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btHomePageFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHomePageFuncionarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btHomePageFuncionarioMousePressed(evt);
            }
        });
        btHomePageFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 212, 212));
        jLabel4.setText("Home");
        btHomePageFuncionario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone home.png"))); // NOI18N
        btHomePageFuncionario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btHomePageFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, 50));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 10));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Restaurante");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/SideTab imagem.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 680));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Restaurante");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/alface.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 130, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 673));

        btVerificarMesas.setBackground(new java.awt.Color(50, 27, 9));
        btVerificarMesas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVerificarMesas.setForeground(new java.awt.Color(255, 255, 255));
        btVerificarMesas.setText("Verificar");
        btVerificarMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarMesasActionPerformed(evt);
            }
        });
        getContentPane().add(btVerificarMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 100, 50));

        jLabel17.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Verifique as");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 140, 40));

        jLabel18.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("op????es das mesas");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 200, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Churrasco imagem.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 290, 170));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 30)); // NOI18N
        jLabel1.setText("Este ?? um app de gerenciamento de restaurantes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 860, 90));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel11.setText("Bem vindo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 190, 90));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/alface.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 130, 100));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 780, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 780, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/SideTab imagem.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 850, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoffActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_btLogoffActionPerformed

    private void btCardapioFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCardapioFuncionarioMouseClicked
        // TODO add your handling code here:
        CardapioPageFuncionario cardapio = new CardapioPageFuncionario();
        cardapio.show();
        dispose();
    }//GEN-LAST:event_btCardapioFuncionarioMouseClicked

    private void btCardapioFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCardapioFuncionarioMousePressed
        // TODO add your handling code hbtCardapioFuncionario   setColor(btCardapio);
        setColor(btCardapioFuncionario);
        resetColor(btHomePageFuncionario);
        resetColor(btMesasFuncionario);    
    }//GEN-LAST:event_btCardapioFuncionarioMousePressed

    private void btMesasFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMesasFuncionarioMouseClicked
        // TODO add your handling code here:
        MesasPageFuncionario mesa = new MesasPageFuncionario();
        mesa.show();
        dispose();
    }//GEN-LAST:event_btMesasFuncionarioMouseClicked

    private void btMesasFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMesasFuncionarioMousePressed
        // TODO add your handling code here:
        setColor(btMesasFuncionario);
        resetColor(btHomePageFuncionario);
        resetColor(btCardapioFuncionario);
    }//GEN-LAST:event_btMesasFuncionarioMousePressed

    private void btHomePageFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomePageFuncionarioMouseClicked
        // TODO add your handling code here:
        HomePageFuncionario homeFuncionario = new HomePageFuncionario();
        homeFuncionario.show();
        dispose();
    }//GEN-LAST:event_btHomePageFuncionarioMouseClicked

    private void btHomePageFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomePageFuncionarioMousePressed
        // TODO add your handling code here:
        setColor(btHomePageFuncionario);
        resetColor(btMesasFuncionario);
        resetColor(btCardapioFuncionario);      
    }//GEN-LAST:event_btHomePageFuncionarioMousePressed

    private void btVerificarMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarMesasActionPerformed
        // TODO add your handling code here:
        MesasPageFuncionario mesa = new MesasPageFuncionario();
        mesa.show();
        dispose();
    }//GEN-LAST:event_btVerificarMesasActionPerformed

    void setColor(JPanel panel){
        panel.setBackground(new Color(90,46,9));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(68,35,4));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HomePageFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btCardapioFuncionario;
    private javax.swing.JPanel btHomePageFuncionario;
    private javax.swing.JButton btLogoff;
    private javax.swing.JPanel btMesasFuncionario;
    private javax.swing.JButton btVerificarMesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}

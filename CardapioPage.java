/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicius Marques
 */
public class CardapioPage extends javax.swing.JFrame {

    /**
     * Creates new form CardapioPage
     */
    public CardapioPage() {
        initComponents();
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante_login","root","12345678vini@");
            java.sql.Statement st = con.createStatement();
            String query="select * from menu";
            ResultSet rs=st.executeQuery(query);
            java.sql.ResultSetMetaData rsmd=rs.getMetaData();

            DefaultTableModel model= (DefaultTableModel) TableCardapio.getModel();

            int cols = 3;
            String[] colName=new String[cols];
            for(int i=0;i<cols;i++)
                colName[i]=rsmd.getColumnName(i+1);
            model.setColumnIdentifiers(colName);

            String item;
            String preco;
            String id;
            while(rs.next()) {
                item=rs.getString(1);
                preco=rs.getString(2);
                id=rs.getString(3);
            
                String[] row= {item,preco,id};
                
                
                model.addRow(row);
               

            }
            con.close();}
        catch(Exception e){
            System.out.println(e.getMessage());
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        btLogoff = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btRegistrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btCardapio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btMesas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btHomePage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        caixaTxtIdItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        caixaTxtNomeItem = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btAddCardapio = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        caixaTxtNomeItem2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btDeletarCardapio = new javax.swing.JButton();
        caixaTxtValorItem2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCardapio = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        btUpdateCardapio = new javax.swing.JButton();
        caixaTxtValorItem1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Restaurante");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 40));

        btLogoff.setBackground(new java.awt.Color(50, 27, 9));
        btLogoff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLogoff.setForeground(new java.awt.Color(255, 255, 255));
        btLogoff.setText("Logoff");
        btLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoffActionPerformed(evt);
            }
        });
        getContentPane().add(btLogoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 80, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btRegistrar.setBackground(new java.awt.Color(68, 35, 4));
        btRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRegistrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btRegistrarMousePressed(evt);
            }
        });
        btRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Registrar/Relatorio");
        btRegistrar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone usuario.png"))); // NOI18N
        btRegistrar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 50));

        btCardapio.setBackground(new java.awt.Color(68, 35, 4));
        btCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCardapioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btCardapioMousePressed(evt);
            }
        });
        btCardapio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cardapio");
        btCardapio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone cardapio.png"))); // NOI18N
        btCardapio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 260, 50));

        btMesas.setBackground(new java.awt.Color(68, 35, 4));
        btMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMesasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btMesasMousePressed(evt);
            }
        });
        btMesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Mesas");
        btMesas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone mesa 50x50.png"))); // NOI18N
        btMesas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 50));

        btHomePage.setBackground(new java.awt.Color(68, 35, 4));
        btHomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHomePageMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btHomePageMousePressed(evt);
            }
        });
        btHomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 212, 212));
        jLabel4.setText("Home");
        btHomePage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/Icone home.png"))); // NOI18N
        btHomePage.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        jPanel3.add(btHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, 50));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/alface.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 130, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/SideTab imagem.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 680));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Restaurante");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 673));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 400, 10));

        caixaTxtIdItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixaTxtIdItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTxtIdItemActionPerformed(evt);
            }
        });
        jPanel2.add(caixaTxtIdItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 80, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/linha reta divisao.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, -20, 10, 760));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Preço");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, 50));

        jLabel12.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel12.setText("Adicionar item ao cardápio");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 310, 60));

        caixaTxtNomeItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixaTxtNomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTxtNomeItemActionPerformed(evt);
            }
        });
        jPanel2.add(caixaTxtNomeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 230, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nome");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, 50));

        btAddCardapio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAddCardapio.setText("ADICIONAR");
        btAddCardapio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCardapioActionPerformed(evt);
            }
        });
        jPanel2.add(btAddCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 120, 50));

        jLabel17.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel17.setText("Atualizar item do cardápio");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 310, 60));

        caixaTxtNomeItem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixaTxtNomeItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTxtNomeItem2ActionPerformed(evt);
            }
        });
        jPanel2.add(caixaTxtNomeItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 230, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nome");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 60, 50));

        btDeletarCardapio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDeletarCardapio.setForeground(new java.awt.Color(204, 51, 0));
        btDeletarCardapio.setText("DELETAR");
        btDeletarCardapio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDeletarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarCardapioActionPerformed(evt);
            }
        });
        jPanel2.add(btDeletarCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 120, 50));

        caixaTxtValorItem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixaTxtValorItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTxtValorItem2ActionPerformed(evt);
            }
        });
        jPanel2.add(caixaTxtValorItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 230, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Preço");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 60, 50));

        TableCardapio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TableCardapio.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        TableCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableCardapio.setRowHeight(40);
        TableCardapio.setRowMargin(10);
        jScrollPane2.setViewportView(TableCardapio);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 410, 450));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/imagens/samabaia.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 370, 920));

        btUpdateCardapio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btUpdateCardapio.setText("ATUALIZAR");
        btUpdateCardapio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btUpdateCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateCardapioActionPerformed(evt);
            }
        });
        jPanel2.add(btUpdateCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 120, 50));

        caixaTxtValorItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixaTxtValorItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTxtValorItem1ActionPerformed(evt);
            }
        });
        jPanel2.add(caixaTxtValorItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 230, 50));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("ID");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 920, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoffActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_btLogoffActionPerformed

    private void caixaTxtIdItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTxtIdItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTxtIdItemActionPerformed

    private void caixaTxtNomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTxtNomeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTxtNomeItemActionPerformed
   
     private void caixaTxtValorItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                
    private void btAddCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCardapioActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante_login","root","12345678vini@");
            
            String item = caixaTxtNomeItem.getText();
            String preco = caixaTxtValorItem1.getText();
            Float precoFt = Float.parseFloat(preco);
            
            Statement stm = con.createStatement();
            
            stm.executeUpdate("insert into menu (item, preco) values ('"+item+"', '"+precoFt+"');");                      
                              
            JOptionPane.showMessageDialog(this, "Item adicionado no cardapio com sucesso!");
            caixaTxtNomeItem.setText("");
            caixaTxtIdItem.setText("");            
           
            con.close();                          
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        CardapioPage cardapio = new CardapioPage();
        cardapio.show();
        dispose();
    }//GEN-LAST:event_btAddCardapioActionPerformed

    private void caixaTxtNomeItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTxtNomeItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTxtNomeItem2ActionPerformed

    private void btDeletarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarCardapioActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante_login","root","12345678vini@");
            int index = TableCardapio.getSelectedRow();
            String cardapioDlt = (String) TableCardapio.getValueAt(index, 0);
            
            Statement stm = con.createStatement();
            
            stm.executeUpdate("delete from menu where item = '"+cardapioDlt+"';");                      
                              
            JOptionPane.showMessageDialog(this, "Item removido do cardapio com sucesso!");
            caixaTxtNomeItem.setText("");
            caixaTxtIdItem.setText("");            
           
            con.close();                          
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        CardapioPage cardapio = new CardapioPage();
        cardapio.show();
        dispose();
    }//GEN-LAST:event_btDeletarCardapioActionPerformed

    private void caixaTxtValorItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTxtValorItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTxtValorItem2ActionPerformed

    private void btUpdateCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateCardapioActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante_login","root","12345678vini@");
            
            String item = caixaTxtNomeItem2.getText();
            String preco = caixaTxtValorItem2.getText();
            String id = caixaTxtIdItem.getText();
            int idInt = Integer.parseInt(id);
            double precoDouble = Double.parseDouble(preco);
            
            Statement stm = con.createStatement();
            
            stm.executeUpdate("update menu set item = '"+item+"', preco = "+precoDouble+" where id = '"+idInt+"';");                      
                              
            JOptionPane.showMessageDialog(this, "Item do cardapio atualizado com sucesso!");
            caixaTxtNomeItem.setText("");
            caixaTxtIdItem.setText("");            
            caixaTxtValorItem2.setText("");   

            con.close();                 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        CardapioPage cardapio = new CardapioPage();
        cardapio.show();
        dispose();
    }//GEN-LAST:event_btUpdateCardapioActionPerformed

    private void btHomePageMousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        setColor(btHomePage);
        resetColor(btMesas);
        resetColor(btCardapio);
        resetColor(btRegistrar);   
    }                                       

    private void btMesasMousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        setColor(btMesas);
        resetColor(btHomePage);
        resetColor(btCardapio);
        resetColor(btRegistrar);
    }                                    

    private void btCardapioMousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        setColor(btCardapio);
        resetColor(btHomePage);
        resetColor(btMesas);
        resetColor(btRegistrar);
    }                                       

    private void btRegistrarMousePressed(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        setColor(btRegistrar);
        resetColor(btHomePage);
        resetColor(btMesas);
        resetColor(btCardapio);
    }                                        

    private void btHomePageMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.show();
        dispose();
    }                                       

    private void btMesasMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        MesasPage mesa = new MesasPage();
        mesa.show();
        dispose();
    }                                    

    private void btCardapioMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        CardapioPage cardapio = new CardapioPage();
        cardapio.show();
        dispose();
    }                                       

    private void btRegistrarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        RegistrarPage registro = new RegistrarPage();
        registro.show();
        dispose();
    }                                        
                                
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
            java.util.logging.Logger.getLogger(CardapioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCardapio;
    private javax.swing.JButton btAddCardapio;
    private javax.swing.JPanel btCardapio;
    private javax.swing.JButton btDeletarCardapio;
    private javax.swing.JPanel btHomePage;
    private javax.swing.JButton btLogoff;
    private javax.swing.JPanel btMesas;
    private javax.swing.JPanel btRegistrar;
    private javax.swing.JButton btUpdateCardapio;
    private javax.swing.JTextField caixaTxtIdItem;
    private javax.swing.JTextField caixaTxtNomeItem;
    private javax.swing.JTextField caixaTxtNomeItem2;
    private javax.swing.JTextField caixaTxtValorItem1;
    private javax.swing.JTextField caixaTxtValorItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
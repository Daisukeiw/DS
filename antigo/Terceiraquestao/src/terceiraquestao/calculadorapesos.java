/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package terceiraquestao;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author pedro
 */
public class calculadorapesos extends javax.swing.JFrame {

    /**
     * Creates new form calculadorapesos
     */
    public calculadorapesos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        planeta.setVisible(false);
        jLabel3.setVisible(false);
    }
    double p;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rotulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        lista = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        planeta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Planeta:");

        rotulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotulo.setText("Pesos em diferentes planetas");

        jLabel1.setText("Escreva o peso em kg:");

        jLabel3.setText("O peso é de xxxx em y ");

        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem seleção", "Mercúrio", "Vênus", "Marte", "Júpiter", "Saturno", "Urano" }));
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/terceiraquestao/Starsinthesky.jpg"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/terceiraquestao/clear.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        planeta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotulo)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jLabel3)
                            .addComponent(planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotulo)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        if(texto1.getText().equals("")) {
            jLabel3.setVisible(true);
            jLabel3.setText("O campo está vazio");
        }else {
        p = Double.parseDouble(texto1.getText());
        String txt;
        double peso;
        ImageIcon img;
        if(lista.getSelectedItem() == "Sem seleção"){
            planeta.setVisible(false);
            jLabel3.setVisible(true);
            jLabel3.setText("Não foi selecionado o planeta");
        }
        if(lista.getSelectedItem().toString() == "Mercúrio"){
            peso = p * 0.37;
            txt = String.format("%.3f",(double)peso);
            img = new ImageIcon("mercurio.jpg");
            planeta.setIcon(img);
            planeta.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Equivalente a " +txt +"kg em mércurio");
        }
        if(lista.getSelectedItem().toString() == "Vênus"){
            peso = p * 0.88;
            txt = String.format("%.3f",(double)peso);
            img = new ImageIcon("venus.jpg");
            planeta.setIcon(img);
            planeta.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Equivalente a " +txt +"kg em vênus");
        }
        if(lista.getSelectedItem().toString() == "Marte"){
            peso = p * 0.38;
            txt = String.format("%.3f",(double)peso);
            img = new ImageIcon("marte.jpg");
            planeta.setIcon(img);
            planeta.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Equivalente a " +txt +"kg em marte");
        }
        if(lista.getSelectedItem().toString() == "Júpiter"){
            peso = p * 2.64;
            txt = String.format("%.3f",(double)peso);
            img = new ImageIcon("jupiter.jpg");
            planeta.setIcon(img);
            planeta.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Equivalente a " +txt +"kg em júpiter");
        }
        if(lista.getSelectedItem().toString() == "Saturno"){
            peso = p * 1.15;
            txt = String.format("%.3f",(double)peso);
            img = new ImageIcon("saturno.jpg");
            planeta.setIcon(img);
            planeta.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Equivalente a " +txt +"kg em saturno");
        }
        if(lista.getSelectedItem().toString() == "Urano"){
            peso = p * 1.17;
            txt = String.format("%.3f",(double)peso);
            img = new ImageIcon("Urano.png");
            planeta.setIcon(img);
            planeta.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Equivalente a " +txt +"kg em urano");
        }
        }
    }//GEN-LAST:event_listaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        texto1.setText(null);
        texto1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(calculadorapesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadorapesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadorapesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadorapesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadorapesos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JLabel planeta;
    private javax.swing.JLabel rotulo;
    private javax.swing.JTextField texto1;
    // End of variables declaration//GEN-END:variables
}
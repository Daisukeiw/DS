/**
 * Exercício 2
 * Criar  um  aplicativo  utilizando  interface  gráfica  para  calcular  a 
 * fórmula de Bhaskara.
 * 
 * @author ferreiraluizga
 */
package bhaskara;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Bhaskara extends javax.swing.JFrame {

    /**
     * Creates new form Bhaskara
     */
    public Bhaskara() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/bhaskara/img/appIcon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblNumA = new javax.swing.JLabel();
        lblNumB = new javax.swing.JLabel();
        lblNumC = new javax.swing.JLabel();
        txtNumA = new javax.swing.JTextField();
        txtNumB = new javax.swing.JTextField();
        txtNumC = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtX1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        lblX1 = new javax.swing.JLabel();
        lblX2 = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fórmula de Bhaskara");
        setIconImages(null);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Fórmula de Bhaskara");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bhaskara/img/bhaskara.png"))); // NOI18N

        lblSubtitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("ax² + bx + c = 0");

        lblNumA.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumA.setText("Digite o valor de A");

        lblNumB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumB.setText("Digite o valor de B");

        lblNumC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumC.setText("Digite o valor de C");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtX1.setEnabled(false);

        txtX2.setEnabled(false);

        lblX1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblX1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblX1.setText("x'");

        lblX2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblX2.setText("x\"");

        lblErro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bhaskara/img/close.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bhaskara/img/limpar.gif"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(separator)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblX1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblX2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblNumA)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtNumA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNumB)
                        .addComponent(lblNumC))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblSubtitulo, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumA)
                    .addComponent(txtNumA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumB)
                    .addComponent(txtNumB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumC)
                    .addComponent(txtNumC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX2)
                    .addComponent(lblX1)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblErro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //confirmação para sair do programa
        int status = JOptionPane.showConfirmDialog(rootPane, "Deseja sair do sistema?", "Sair", JOptionPane.YES_NO_OPTION);
        if(status == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //esse botão limpa os campos e define a equação padrão e a primeira caixa de texto como foco
        lblSubtitulo.setText("ax² + bx + c = 0");
        txtNumA.setText(null);
        txtNumB.setText(null);
        txtNumC.setText(null);
        txtX1.setText(null);
        txtX2.setText(null);
        lblErro.setText(null);
        txtNumA.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //armazenando valores inseridos pelo usuário em variáveis e criando variaveis para calculo
        int a, b, c;
        double delta, x1, x2;
        
        DecimalFormat mascara = new DecimalFormat("#.##"); //mascara para formatar resultado final em até duas casas decimais

        if (txtNumA.getText().equals("") && txtNumB.getText().equals("") && txtNumC.getText().equals("")) {
            lblErro.setText("Preencha todos os campos para calcular a equação");
        } else {
            a = Integer.parseInt(txtNumA.getText());
            b = Integer.parseInt(txtNumB.getText());
            c = Integer.parseInt(txtNumC.getText());
            //atualização no subtitulo para mostrar equação inserida pelo usuário
            lblSubtitulo.setText(String.valueOf(a) + "x² + " + String.valueOf(b) + "x + " + String.valueOf(c) + " =  0");
            //descobrimento do delta e aplicação da fórmula de Bhaskara
            if (a < 0) {
                lblErro.setText("A equação não possui raízes reais");
            } else {
                delta = b * b - (4 * a * c);
                if (delta < 0) {
                    lblErro.setText("A equação não possui raízes reais");
                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    
                    //formatação e apresentação dos resultados
                    String X1 = mascara.format(x1);
                    String X2 = mascara.format(x2);
                    txtX1.setText(X1);
                    txtX2.setText(X2);
                }
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Bhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bhaskara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bhaskara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblNumA;
    private javax.swing.JLabel lblNumB;
    private javax.swing.JLabel lblNumC;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblX1;
    private javax.swing.JLabel lblX2;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField txtNumA;
    private javax.swing.JTextField txtNumB;
    private javax.swing.JTextField txtNumC;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultado_txt = new javax.swing.JTextField();
        valor1_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valor2_txt = new javax.swing.JTextField();
        dividir_btn = new javax.swing.JButton();
        subtrair_btn = new javax.swing.JButton();
        multiplicar_btn = new javax.swing.JButton();
        somar_btn = new javax.swing.JButton();
        fechar_btn = new javax.swing.JButton();
        limpar_btn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CALCULADORA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 10, 220, 26);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("VALOR 1:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 50, 90, 30);

        resultado_txt.setBackground(new java.awt.Color(204, 204, 204));
        resultado_txt.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        resultado_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado_txtActionPerformed(evt);
            }
        });
        jPanel1.add(resultado_txt);
        resultado_txt.setBounds(20, 190, 340, 30);

        valor1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1_txtActionPerformed(evt);
            }
        });
        jPanel1.add(valor1_txt);
        valor1_txt.setBounds(170, 50, 150, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("VALOR 2:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 100, 90, 30);

        valor2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2_txtActionPerformed(evt);
            }
        });
        jPanel1.add(valor2_txt);
        valor2_txt.setBounds(170, 100, 150, 30);

        dividir_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        dividir_btn.setText("/");
        dividir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividir_btnActionPerformed(evt);
            }
        });
        jPanel1.add(dividir_btn);
        dividir_btn.setBounds(270, 150, 80, 23);

        subtrair_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        subtrair_btn.setText("-");
        subtrair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(subtrair_btn);
        subtrair_btn.setBounds(110, 150, 80, 23);

        multiplicar_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        multiplicar_btn.setText("X");
        multiplicar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(multiplicar_btn);
        multiplicar_btn.setBounds(190, 150, 80, 23);

        somar_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        somar_btn.setText("+");
        somar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(somar_btn);
        somar_btn.setBounds(30, 150, 80, 23);

        fechar_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        fechar_btn.setText("FECHAR");
        fechar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(fechar_btn);
        fechar_btn.setBounds(190, 240, 120, 29);

        limpar_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        limpar_btn.setText("LIMPAR");
        limpar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(limpar_btn);
        limpar_btn.setBounds(60, 240, 120, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 280);

        setSize(new java.awt.Dimension(380, 280));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void somar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar_btnActionPerformed
        Model.Operacoes_DAO.somar();
    }//GEN-LAST:event_somar_btnActionPerformed

    private void fechar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fechar_btnActionPerformed

    private void valor1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1_txtActionPerformed

    private void valor2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor2_txtActionPerformed

    private void resultado_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultado_txtActionPerformed

    private void subtrair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrair_btnActionPerformed
        Model.Operacoes_DAO.subtrair();
    }//GEN-LAST:event_subtrair_btnActionPerformed

    private void multiplicar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicar_btnActionPerformed
        Model.Operacoes_DAO.multiplicar();
    }//GEN-LAST:event_multiplicar_btnActionPerformed

    private void dividir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividir_btnActionPerformed
        Model.Operacoes_DAO.dividir();
    }//GEN-LAST:event_dividir_btnActionPerformed

    private void limpar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_btnActionPerformed
        Model.Operacoes_DAO.limpar();
    }//GEN-LAST:event_limpar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir_btn;
    private javax.swing.JButton fechar_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar_btn;
    private javax.swing.JButton multiplicar_btn;
    public static javax.swing.JTextField resultado_txt;
    private javax.swing.JButton somar_btn;
    private javax.swing.JButton subtrair_btn;
    public static javax.swing.JTextField valor1_txt;
    public static javax.swing.JTextField valor2_txt;
    // End of variables declaration//GEN-END:variables
}

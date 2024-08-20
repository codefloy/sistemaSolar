/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolar;

import java.awt.Color;

/**
 *
 * @author Giancarlos
 */
public class Urano extends javax.swing.JFrame {

    /**
     * Creates new form Urano
     */
    public Urano() {
        initComponents();
        txturano.setBackground(new Color(0,0,0,1));
        txttierra1.setBackground(new Color(0,0,0,1));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttierra1 = new javax.swing.JTextArea();
        btnSalir1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txturano = new javax.swing.JTextArea();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttierra1.setEditable(false);
        txttierra1.setColumns(20);
        txttierra1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txttierra1.setForeground(new java.awt.Color(255, 255, 255));
        txttierra1.setRows(5);
        txttierra1.setText("Es el séptimo planeta del sistema solar, \nel tercero de mayor tamaño, y el cuarto más masivo. \nSe llama así en honor de la divinidad griega \ndel cielo Urano (del griego antiguo Οὐρανός),\nel padre de Crono (Saturno) y el abuelo de Zeus \n(Júpiter).\n");
        txttierra1.setBorder(null);
        txttierra1.setOpaque(false);
        getContentPane().add(txttierra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 590, 200));

        btnSalir1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/boton.png"))); // NOI18N
        btnSalir1.setBorder(null);
        btnSalir1.setBorderPainted(false);
        btnSalir1.setContentAreaFilled(false);
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 40, 100, 100));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/atras.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, 100));

        txturano.setEditable(false);
        txturano.setColumns(20);
        txturano.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txturano.setForeground(new java.awt.Color(255, 255, 255));
        txturano.setRows(5);
        txturano.setText("Características generales de Urano\n\nMasa\t\t\t: 8.6810 x 1025 kg.\nVolumen\t\t\t: 6.83344 x 1013 km3.\nDensidad\t\t: 1.270 g/cm3.\nDiámetro\t\t: 51118 km.\nTemperatura efectiva\t: -216° centígrados.\n");
        txturano.setBorder(null);
        txturano.setOpaque(false);
        getContentPane().add(txturano, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 560, 190));

        Titulo.setFont(new java.awt.Font("Dylan Gothic", 1, 70)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Urano");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1370, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/Urano.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 520, 550));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/silueta 520 x 520.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 520, 550));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espacio.jpg"))); // NOI18N
        fondo.setAlignmentY(0.0F);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        SistemaSolar ss = new SistemaSolar();
        ss.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Urano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea txttierra1;
    private javax.swing.JTextArea txturano;
    // End of variables declaration//GEN-END:variables
}

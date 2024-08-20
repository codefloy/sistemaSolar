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
public class Saturno extends javax.swing.JFrame {

    /**
     * Creates new form Saturno
     */
    public Saturno() {
        initComponents();
        txtSaturno.setBackground(new Color(0,0,0,1));
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

        btnSalir1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txttierra1 = new javax.swing.JTextArea();
        txtSaturno = new javax.swing.JTextArea();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txttierra1.setEditable(false);
        txttierra1.setColumns(20);
        txttierra1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txttierra1.setForeground(new java.awt.Color(255, 255, 255));
        txttierra1.setRows(5);
        txttierra1.setText("Saturno es el sexto planeta del sistema solar \ncontando desde el Sol, el segundo en tamaño \ny masa después de Júpiter y el único con un \nsistema de anillos visible desde la Tierra. \nSu nombre proviene del dios romano Saturno.");
        txttierra1.setBorder(null);
        txttierra1.setOpaque(false);
        getContentPane().add(txttierra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 590, 200));

        txtSaturno.setEditable(false);
        txtSaturno.setColumns(20);
        txtSaturno.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtSaturno.setForeground(new java.awt.Color(255, 255, 255));
        txtSaturno.setRows(5);
        txtSaturno.setText("Características generales de Saturno\nMasa\t\t\t: 5.6832 x 1026 kg.\nVolumen\t\t\t: 8.2713 x 1014 km3.\nDensidad\t\t: 0.687 g/cm3.\nDiámetro\t\t: 120, 660 km.\nTemperatura efectiva\t: -178° Celsius.");
        txtSaturno.setBorder(null);
        txtSaturno.setOpaque(false);
        getContentPane().add(txtSaturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 520, 180));

        Titulo.setFont(new java.awt.Font("Dylan Gothic", 1, 70)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Saturno");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1370, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/Saturno.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 520, 550));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/Silueta2.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 520, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espacio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(Saturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saturno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea txtSaturno;
    private javax.swing.JTextArea txttierra1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app_201314655;
import Logica.Datos;
import Logica.ListaDatos;
import Logica.Matriz;
import Logica.NodeListaDatos;
import Logica.NodoMatriz;
import javax.swing.JOptionPane;
/**
 *
 * @author Kristhal
 */
public class Gmail extends javax.swing.JFrame {

    /**
     * Creates new form Gmail
     */
    public Gmail() {
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

        btnRegistrar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        dominio = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        icono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(110, 410, 110, 40);

        correo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(correo);
        correo.setBounds(80, 230, 175, 30);

        dominio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(dominio);
        dominio.setBounds(80, 290, 175, 30);

        contra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(contra);
        contra.setBounds(80, 360, 175, 30);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(icono);
        icono.setBounds(30, 0, 250, 190);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 200, 80, 20);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Dominio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 270, 80, 19);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 330, 100, 19);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 500);

        txtConsola.setColumns(20);
        txtConsola.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        txtConsola.setForeground(new java.awt.Color(255, 0, 0));
        txtConsola.setRows(5);
        jScrollPane1.setViewportView(txtConsola);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 20, 210, 460);

        setSize(new java.awt.Dimension(564, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Datos nDatos = new Datos();
        nDatos.setFila(correo.getText().substring(0,1).toUpperCase());
        nDatos.setColumna(dominio.getText());
        nDatos.setEmail(correo.getText());
        if(contra.getText().length()>=6){
            nDatos.setContraseña(contra.getText());
            Matriz nMatriz = new Matriz();
            nMatriz.insertarMatriz(nDatos);
            nMatriz.dPrint();
            String salida="";
            salida+=nMatriz.dPrint();
            txtConsola.setText(salida);
        }
        else{
            JOptionPane.showMessageDialog(null, "La contraseña debe tener almenos 6 caracteres");
        }
        correo.setText("");
        dominio.setText("");
        contra.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Gmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField contra;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dominio;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
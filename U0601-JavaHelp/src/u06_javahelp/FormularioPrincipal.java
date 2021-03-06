/*
 * class FormularioPrincipal           version 1.0
 * Fecha de creaci?n: 14/03/2021       Fecha de ?ltima modificaci?n: 18/03/2021
 *
 * Copyright (c) Desarrollo de Aplicaciones Multiplataforma, 2021
 * M?dulo: DISE?O DE INTERFACES        Unidad de Trabajo VI
 */
package u06_javahelp;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;




/**
 * Interfaz gr?fica de la aplicaci?n
 * @author Flor Moncada
 * @author David Jim?nez Riscardo
 */
public class FormularioPrincipal extends JFrame {
    

   Ventana ventana01=new Ventana(this, "Nueva Ventana", true);
   
            
           
    public FormularioPrincipal(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        btnNueva.setBackground(java.awt.Color.yellow);
        
        //Importante: NO NECESITAMOS PROGRAMAR NINGUN EVENTO, SOLO CARGAR LA AYUDA
        obtenerAyuda();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNueva = new javax.swing.JButton();
        lblpulsaF1 = new javax.swing.JLabel();
        txtCuadro = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        cbMostrarAyudaMenu = new javax.swing.JCheckBoxMenuItem();
        menuSalir = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnNueva.setBackground(new java.awt.Color(255, 255, 255));
        btnNueva.setText("Nueva ventana");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        lblpulsaF1.setForeground(new java.awt.Color(0, 51, 255));
        lblpulsaF1.setText("Pulsa F1 dentro del campo:");

        menuArchivo.setText("Archivo");

        cbMostrarAyudaMenu.setSelected(true);
        cbMostrarAyudaMenu.setText("Qui?nes somos");
        cbMostrarAyudaMenu.setActionCommand("");
        cbMostrarAyudaMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMostrarAyudaMenuItemStateChanged(evt);
            }
        });
        menuArchivo.add(cbMostrarAyudaMenu);

        jMenuBar1.add(menuArchivo);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpulsaF1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCuadro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblpulsaF1)
                .addGap(18, 18, 18)
                .addComponent(txtCuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
       int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "?Desea salir?",
                    "Salir",
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.NO_OPTION) {
                // Pues nada
            } else {
                dispose();
    }                        
    }//GEN-LAST:event_menuSalirMouseClicked

    private void cbMostrarAyudaMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMostrarAyudaMenuItemStateChanged
        //No necesitamos programar eventos para el uso de JavaHelper
    }//GEN-LAST:event_cbMostrarAyudaMenuItemStateChanged

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        //Centramos la ventana
        Toolkit mipantalla = Toolkit.getDefaultToolkit();    
        Dimension tamanoPantalla = mipantalla.getScreenSize();        
        int altoPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        int anchoVentana = ventana01.getWidth();
        int altoVentana = ventana01.getHeight();
        ventana01.setLocation(anchoPantalla/2 - anchoVentana/2, altoPantalla/2 - altoVentana/2);
        
        ventana01.txtAyuda.setFocusable(true);
        ventana01.setVisible(true);
    }//GEN-LAST:event_btnNuevaActionPerformed
                               
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
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioPrincipal dialog = new FormularioPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNueva;
    private javax.swing.JCheckBoxMenuItem cbMostrarAyudaMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblpulsaF1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JTextField txtCuadro;
    // End of variables declaration//GEN-END:variables
    
    /**
     * M?todo mediante el cual cargamos la ayuda en la aplicaci?n
     */
    private void obtenerAyuda() {
        try{
            
            // Carga el fichero de ayuda
            File fichero = new File("./helpDJR/help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Muestra la ayuda sobre el bot?n del menuItem y en los textfield al presionar la tecla F1
            hb.enableHelpOnButton(this.cbMostrarAyudaMenu, "aplicacion", helpset);
            hb.enableHelpKey(txtCuadro, "calendario",helpset);
            hb.enableHelpKey(ventana01.txtAyuda, "estructura",helpset);
            
            //Centramos la pantalla de ayuda
            Toolkit mipantalla = Toolkit.getDefaultToolkit();    
            Dimension tamanoPantalla = mipantalla.getScreenSize();        
            int altoPantalla = tamanoPantalla.height;
            int anchoPantalla = tamanoPantalla.width;
            Dimension tamanoVentana = hb.getSize();
            int altoVentana = tamanoVentana.height;
            int anchoVentana = tamanoVentana.width;
            Point p = new Point(anchoPantalla/2 - anchoVentana/2, altoPantalla/2 - altoVentana/2);
            hb.setLocation(p);
              
        } catch (Exception e) {
                e.printStackTrace();
        }    
   
        
    }
    
}

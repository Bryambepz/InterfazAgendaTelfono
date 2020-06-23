/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author braya
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //ventanas
    private VentanaIniciarSesion ventanaIniciar;
    private VentanaRegistrarUsuario ventanaRegistrar;
    private AgregarTelefono agregarTelefono;
    private EditarUsuario editarUsuario;
    private TelefonosporUsuario telefonoPorUsuario;
    //mvc
    private UsuarioDAO usuarioDAO;
    private TelefonoDAO telefonoDAO;
    private ControladorUsuario ctrlUsuario;
    private ControladorTelefono ctrlTelefono;
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        menuItemCerrar.setVisible(false);
        menuGestionar.setVisible(false);
        //instanciar DAO's
        usuarioDAO = new UsuarioDAO();
        telefonoDAO = new TelefonoDAO();
        //instanciar Controladore
        ctrlUsuario = new ControladorUsuario(usuarioDAO, telefonoDAO);
        ctrlTelefono = new ControladorTelefono(telefonoDAO);
        //instanciar vistas
        ventanaIniciar = new VentanaIniciarSesion(ctrlUsuario,this);
        ventanaRegistrar = new VentanaRegistrarUsuario(ctrlUsuario, this);
        agregarTelefono = new AgregarTelefono(ctrlUsuario,this);
        editarUsuario = new EditarUsuario(ctrlUsuario);
        telefonoPorUsuario = new TelefonosporUsuario(ctrlUsuario);
        //localizacion
        localizacion = Locale.getDefault();
//        localizacion = new Locale("en", "UK");
//        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
//        cambiarIdioma();
    }
    
    public void cambiarIdioma(){
        menuMenu.setText(mensajes.getString("menuMenu"));
            menuItemIniciarSesion.setText(mensajes.getString("menuItemIniciarSesion"));
                ventanaIniciar.getIngreseCorreoL().setText(mensajes.getString("ingreseCorreoL"));
                ventanaIniciar.getIngreseContraseñaL().setText(mensajes.getString("ingreseContraseñaL"));
                ventanaIniciar.getBtnInicarSesion().setText(mensajes.getString("btnIniciarSesion"));
            menuItemRegistar.setText(mensajes.getString("menuItemRegistrar"));
                ventanaRegistrar.getCedulaL().setText(mensajes.getString("cedulaL"));
                ventanaRegistrar.getNombreL().setText(mensajes.getString("nombreL"));
                ventanaRegistrar.getApellidoL().setText(mensajes.getString("apellidoL"));
                ventanaRegistrar.getCorreoL().setText(mensajes.getString("correoL"));
                ventanaRegistrar.getContraseñaL().setText(mensajes.getString("contraseñaL"));
                ventanaRegistrar.getBtnRegistrar().setText(mensajes.getString("btnRegistrar"));
            menuItemListarUs.setText(mensajes.getString("menuItemListarUs"));
                
            menuItemCerrar.setText(mensajes.getString("menuItemCerrar"));
            menuItemSalir.setText(mensajes.getString("menuItemSalir"));
        menuGestionar.setText(mensajes.getString("menuGestionar"));
            menuItemtTelefono.setText(mensajes.getString("menuItemTelefono"));
                agregarTelefono.getCodigoLabel().setText(mensajes.getString("codigo"));
                agregarTelefono.getNumerojLabel2().setText(mensajes.getString("numero"));
                agregarTelefono.getTipojLabel3().setText(mensajes.getString("tipo"));
                agregarTelefono.getOperadorajLabel4().setText(mensajes.getString("operadora"));
                agregarTelefono.getBtnAgregar().setText(mensajes.getString("btnAgregar"));
                agregarTelefono.getBtnEliminar().setText(mensajes.getString("btnEliminar"));
                agregarTelefono.getBtnCancelar().setText(mensajes.getString("btnCancelar"));
                agregarTelefono.getBtnEditar().setText(mensajes.getString("btnEditar"));
            menuItemUsuario.setText(mensajes.getString("menuItemUsuario"));
                
        menuIdioma.setText(mensajes.getString("menuIdioma"));
            menuItemEspañol.setText(mensajes.getString("menuItemEspañol"));
            menuItemIngles.setText(mensajes.getString("menuItemIngles"));
            
    }
    
    public JMenu getMenuAgenda() {
        return menuGestionar;
    }

    public JMenuItem getMenuItemCerrar() {
        return menuItemCerrar;
    }

    public JMenuItem getMenuItemIniciarSesion() {
        return menuItemIniciarSesion;
    }

    public JMenuItem getMenuItemListarUs() {
        return menuItemListarUs;
    }

    public JMenuItem getMenuItemRegistar() {
        return menuItemRegistar;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuMenu = new javax.swing.JMenu();
        menuItemIniciarSesion = new javax.swing.JMenuItem();
        menuItemRegistar = new javax.swing.JMenuItem();
        menuItemListarUs = new javax.swing.JMenuItem();
        menuItemCerrar = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuGestionar = new javax.swing.JMenu();
        menuItemtTelefono = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuIdioma = new javax.swing.JMenu();
        menuItemEspañol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        menuMenu.setMnemonic('f');
        menuMenu.setText("Menu");

        menuItemIniciarSesion.setMnemonic('o');
        menuItemIniciarSesion.setText("Iniciar Sesion");
        menuItemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIniciarSesionActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemIniciarSesion);

        menuItemRegistar.setMnemonic('s');
        menuItemRegistar.setText("Registrar");
        menuItemRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistarActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemRegistar);

        menuItemListarUs.setMnemonic('a');
        menuItemListarUs.setText("Listar telefonos del usuario");
        menuItemListarUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarUsActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemListarUs);

        menuItemCerrar.setText("Cerrar Sesion");
        menuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemCerrar);

        menuItemSalir.setMnemonic('x');
        menuItemSalir.setText("Exit");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemSalir);

        menuBar.add(menuMenu);

        menuGestionar.setMnemonic('e');
        menuGestionar.setText("Gestionar Agenda");

        menuItemtTelefono.setMnemonic('t');
        menuItemtTelefono.setText("Tefonos");
        menuItemtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemtTelefonoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemtTelefono);

        menuItemUsuario.setText("Usuario");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemUsuario);

        menuBar.add(menuGestionar);

        menuIdioma.setText("Idioma");

        menuItemEspañol.setText("Español");
        menuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspañolActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemEspañol);

        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemIngles);

        menuBar.add(menuIdioma);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIniciarSesionActionPerformed
        desktopPane.add(ventanaIniciar);
        ventanaIniciar.setVisible(true);
    }//GEN-LAST:event_menuItemIniciarSesionActionPerformed

    private void menuItemRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistarActionPerformed
        desktopPane.add(ventanaRegistrar);
        ventanaRegistrar.setVisible(true);
    }//GEN-LAST:event_menuItemRegistarActionPerformed

    private void menuItemtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemtTelefonoActionPerformed
        desktopPane.add(agregarTelefono);
        agregarTelefono.setVisible(true);
    }//GEN-LAST:event_menuItemtTelefonoActionPerformed

    private void menuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspañolActionPerformed
        localizacion = new Locale("es", "EC");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_menuItemEspañolActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        localizacion = new Locale("en", "UK");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void menuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarActionPerformed
        // TODO add your handling code here:
        menuItemIniciarSesion.setVisible(true);
        menuItemRegistar.setVisible(true);
        
    }//GEN-LAST:event_menuItemCerrarActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        desktopPane.add(editarUsuario);
        editarUsuario.setVisible(true);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemListarUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarUsActionPerformed
        // TODO add your handling code here:
        desktopPane.add(telefonoPorUsuario);
        telefonoPorUsuario.setVisible(true);
    }//GEN-LAST:event_menuItemListarUsActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGestionar;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenuItem menuItemCerrar;
    private javax.swing.JMenuItem menuItemEspañol;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuItemIniciarSesion;
    private javax.swing.JMenuItem menuItemListarUs;
    private javax.swing.JMenuItem menuItemRegistar;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuItem menuItemtTelefono;
    private javax.swing.JMenu menuMenu;
    // End of variables declaration//GEN-END:variables

}

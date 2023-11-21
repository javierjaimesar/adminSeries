package vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.ConexionDB;
import model.UrlDB;

/**
 *
 * @author javie
 */
public class VistaConexionDB extends javax.swing.JFrame {

    ConexionDB conexionDB = ConexionDB.getInstancia();
    VistaSeries vistaSeries = new VistaSeries();
    
    public VistaConexionDB() {
        initComponents();
        setIcon();
        this.setTitle("Conexion a la Base de Datos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextServidor = new javax.swing.JTextField();
        jTextPuerto = new javax.swing.JTextField();
        jTextContraseña = new javax.swing.JPasswordField();
        jTextDB = new javax.swing.JTextField();
        jTextUsuario = new javax.swing.JTextField();
        btnConexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        jLabel2.setText("Puerto:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Contraseña:");

        jLabel3.setText("Base de Datos:");

        jTextServidor.setText("localhost");

        jTextPuerto.setText("3306");

        jTextContraseña.setText("3816963548");

        jTextDB.setText("adminSerie");

        jTextUsuario.setText("root");

        btnConexion.setText("Conectar");
        btnConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConexionMouseClicked(evt);
            }
        });
        btnConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConexionActionPerformed(evt);
            }
        });

        jLabel1.setText("Servidor/Host:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextServidor)
                                .addComponent(jTextPuerto)
                                .addComponent(jTextDB, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(jTextUsuario)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(btnConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConexion)
                    .addComponent(btnSalir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConexionMouseClicked
        String servidor = jTextServidor.getText();
        String puerto = jTextPuerto.getText();
        String DB = jTextDB.getText();
        String usuario = jTextUsuario.getText();
        String contraseña = new String(jTextContraseña.getPassword());
        
        if(servidor.isEmpty()){
            JOptionPane.showMessageDialog(null, "El Servidor/Host es requerido.");
        }else if(puerto.isEmpty()){
            JOptionPane.showMessageDialog(null, "El Puerto es requerido.");
        }else if(DB.isEmpty()){
            JOptionPane.showMessageDialog(null, "La Base de Datos es requerida.");
        }else if(usuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "El Usuario es requerido.");
        }else if(contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "La Contraseña es requerida.");
        }else{
            UrlDB db = new UrlDB(servidor,puerto,DB,usuario,contraseña);
        
            try{
                conexionDB.conectarDB(db);
                vistaSeries.setVisible(true);
                this.dispose();
            }catch(Exception e){
                System.out.println("Error conectar" + e);
            }
        }
    }//GEN-LAST:event_btnConexionMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConexionActionPerformed

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
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConexionDB().setVisible(true);
            }
        });
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pragmasoftPng.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConexion;
    public javax.swing.JButton btnSalir;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPasswordField jTextContraseña;
    public javax.swing.JTextField jTextDB;
    public javax.swing.JTextField jTextPuerto;
    public javax.swing.JTextField jTextServidor;
    public javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}

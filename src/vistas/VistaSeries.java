package vistas;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ConexionDB;
import model.Serie;

/**
 *
 * @author javie
 */
public class VistaSeries extends javax.swing.JFrame {

    ConexionDB conexionDB = ConexionDB.getInstancia();
    
    public VistaSeries() {
        initComponents();
        model.TextPrompt placeHolder = new model.TextPrompt("Buscar por titulo...", jTextBuscar);
        setIcon();
        this.setTitle("Administrador de Series");
        jTableSeries.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSeries = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        jTableSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Titulo", "Descripcion", "Fecha Estreno", "Estrellas", "Genero", "Precio Alquiler", "ATP", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSeries.getTableHeader().setReorderingAllowed(false);
        jTableSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableSeriesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSeries);
        if (jTableSeries.getColumnModel().getColumnCount() > 0) {
            jTableSeries.getColumnModel().getColumn(0).setMinWidth(1);
            jTableSeries.getColumnModel().getColumn(0).setMaxWidth(1);
            jTableSeries.getColumnModel().getColumn(1).setResizable(false);
            jTableSeries.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTableSeries.getColumnModel().getColumn(2).setResizable(false);
            jTableSeries.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTableSeries.getColumnModel().getColumn(3).setResizable(false);
            jTableSeries.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableSeries.getColumnModel().getColumn(4).setResizable(false);
            jTableSeries.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTableSeries.getColumnModel().getColumn(5).setResizable(false);
            jTableSeries.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableSeries.getColumnModel().getColumn(6).setResizable(false);
            jTableSeries.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableSeries.getColumnModel().getColumn(7).setResizable(false);
            jTableSeries.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTableSeries.getColumnModel().getColumn(8).setResizable(false);
            jTableSeries.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnAnular.setText("Anular");
        btnAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnularMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jTextBuscar.setForeground(new java.awt.Color(150, 150, 150));
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyReleased(evt);
            }
        });

        jLabel1.setText("🔍");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnAnular)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        new VistaNuevo(-1).setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            conexionDB.mostrar(this.jTableSeries.getModel(),jTextBuscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if(this.jTableSeries.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay series para modificar");
        }else if(this.jTableSeries.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione una Serie.");
        }else{
            if("AC".equals("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 8)))){
                int id = Integer.parseInt("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 0)));
                String titulo = String.valueOf("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 1)));
                String descripcion = String.valueOf("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 2)));
                String fechaEstreno = String.valueOf("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 3)));
                int estrellas = Integer.parseInt("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 4)));
                String genero = String.valueOf("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 5)));
                String price = (String) this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 6);
                String[] parts  = price.split(" ");
                System.out.println();
                double precioAlquiler = Double.parseDouble(parts[1]);
                boolean atp = Boolean.parseBoolean("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 7)));
                String estado = String.valueOf("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 8)));
                System.out.println(estrellas);
                if(estrellas > 5 || estrellas < 0){
                    JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 5");
                }else{
                    Serie serie = new Serie(titulo,descripcion,fechaEstreno,estrellas,genero,precioAlquiler,atp,estado);
                    try {
                        new VistaNuevo(id,serie).setVisible(true);
                        conexionDB.setId(id);
                    } catch (SQLException ex) {
                        Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "No se puede modificar una serie anulada.");
            }
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnularMouseClicked
        if(this.jTableSeries.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay series para anular");
        }else if(this.jTableSeries.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione una Serie.");
        }else{
            String estado = String.valueOf("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 8)));
            if("AC".equals(estado)){
                int valor = JOptionPane.showConfirmDialog(null, "Estas seguro que desea anular la serie?");
                if(valor == 0){
                    int id = Integer.parseInt("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 0)));
                    
                    try {
                        conexionDB.anularActivar(id, "AN");
                        conexionDB.mostrar(this.jTableSeries.getModel(),jTextBuscar.getText());
                        JOptionPane.showMessageDialog(null, "La serie fue anulada.");
                    } catch (SQLException ex) {
                        Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                int id = Integer.parseInt("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 0)));
                try {
                    conexionDB.anularActivar(id, "AC");
                    conexionDB.mostrar(this.jTableSeries.getModel(),jTextBuscar.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.btnAnular.setText("Anular");
    }//GEN-LAST:event_btnAnularMouseClicked

    private void jTableSeriesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSeriesMousePressed
        if("AN".equals("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 8)))){
            this.btnAnular.setText("Activar");
        }else{
            this.btnAnular.setText("Anular");
        }
        
    }//GEN-LAST:event_jTableSeriesMousePressed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(this.jTableSeries.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay series para eliminar");
        }else if(this.jTableSeries.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Seleccione una Serie.");
        }else{
            int valor = JOptionPane.showConfirmDialog(null, "Estas seguro que desea eliminar un serie?");
            if(valor == 0){
                int id = Integer.parseInt("" + (this.jTableSeries.getValueAt(this.jTableSeries.getSelectedRow(), 0)));
                System.out.println(id);
                try {
                    conexionDB.eliminar(id);
                    conexionDB.mostrar(this.jTableSeries.getModel(),jTextBuscar.getText());
                    JOptionPane.showMessageDialog(null, "La serie fue eliminada.");
                } catch (SQLException ex) {
                    Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void jTextBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyReleased
        System.out.println(jTextBuscar.getText());
        try {
            conexionDB.mostrar(this.jTableSeries.getModel(),jTextBuscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(VistaSeries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextBuscarKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSeries().setVisible(true);
            }
        });
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pragmasoftPng.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAnular;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableSeries;
    public javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables

}

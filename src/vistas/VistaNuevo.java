package vistas;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ConexionDB;
import model.Serie;

public class VistaNuevo extends javax.swing.JFrame {
    
    ConexionDB conexionDB = ConexionDB.getInstancia();
    private int id;
    
    public VistaNuevo(int id,Serie serie) throws SQLException, ParseException {
        initComponents();
        if(id < 0){
            this.setTitle("Nueva Serie");    
        }else{
            this.setTitle("Modificar Serie");
            this.jTextTitulo.setText(serie.getTitulo());
            this.jTextDescripcion.setText(serie.getDescripcion());
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date dataFormateada = formato.parse(serie.getFechaEstreno()); 
            this.jDate.setDate(dataFormateada);
            this.jTextEstrellas.setText(String.valueOf(serie.getEstrellas()));
            this.jGenero.setSelectedItem(serie.getGenero());
            this.jTextPrecio.setText(String.valueOf(serie.getPrecioAlquiler()));
            this.jAtp.setSelected(serie.getAtp());
        }
        setIcon();
    }
    
    public VistaNuevo(int id) {
        initComponents();
        setIcon();
        this.setTitle("Nueva Serie");    
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    private VistaNuevo() {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescripcion = new javax.swing.JTextArea();
        jGenero = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        jAtp = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextEstrellas = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Fecha de Estreno:");

        jLabel4.setText("Genero:");

        jTextDescripcion.setColumns(20);
        jTextDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextDescripcion);

        jGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Animada", "Comedia", "Drama", "Suspenso", "Terror" }));
        jGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGeneroActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jAtp.setText("Apta para todo público (ATP)");
        jAtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtpActionPerformed(evt);
            }
        });

        jLabel5.setText("Estrellas:");

        jLabel6.setText("Precio Alquiler:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAtp))
                            .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jAtp)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGeneroActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void jAtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtpActionPerformed
        
    }//GEN-LAST:event_jAtpActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        if(this.jTextTitulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El titulo es requerido.");
        }else if(this.jTextDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La descripcion es requerida.");
        }else if(this.jDate.getDate() == null){
            JOptionPane.showMessageDialog(null, "La fecha de estreno es requerida.");
        }else if(this.jGenero.getActionCommand().isEmpty()){
            JOptionPane.showMessageDialog(null, "El genero es requerido.");
        }else if(!this.jTextEstrellas.getText().matches("[0-9]*")){
            JOptionPane.showMessageDialog(null, "El campo 'Estrellas' debe ser un valor numerico.");
        }else if(this.jTextEstrellas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Las estrellas son requeridas.");
        }else if(this.jTextPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El precio es requerido.");
        }else if(!this.jTextPrecio.getText().matches("[-+]?[0-9]*\\.?[0-9]+")){
            JOptionPane.showMessageDialog(null, "El campo 'Precio Alquiler' debe ser un valor numerico.");
        }else{
            String titulo = jTextTitulo.getText().trim();
            String descripcion = jTextDescripcion.getText().trim();
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String fechaEstreno = date.format(this.jDate.getCalendar().getTime());
            int estrellas = Integer.parseInt(jTextEstrellas.getText().trim());
            String genero = jGenero.getSelectedItem().toString().trim();
            double precioAlquiler = Double.parseDouble(jTextPrecio.getText().trim());
            boolean atp = jAtp.isSelected();

            if(estrellas > 5 || estrellas < 0){
                JOptionPane.showMessageDialog(null, "Ingrese un numerro entre 0 y 5");
                return;
            }
            if("Nueva Serie".equals(this.getTitle())){
                try{
                    conexionDB.nuevo(titulo,descripcion,fechaEstreno,estrellas,genero,precioAlquiler,atp,"AC");
                    JOptionPane.showMessageDialog(null, "Serie agregada correctamente.");
                    this.dispose();
                }catch(Exception e){
                    System.out.println("Error en boton nuevo: " + e);
                }
            }else{
                try{
                    System.out.println(conexionDB.getId());
                    conexionDB.modificar(conexionDB.getId(),titulo,descripcion,fechaEstreno,estrellas,genero,precioAlquiler,atp,"AC");
                    JOptionPane.showMessageDialog(null, "Serie modificada correctamente.");
                    this.dispose();
                }catch(Exception e){
                    System.out.println("Error en boton modificar: " + e);
                }
            }
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaNuevo().setVisible(true);
            }
        });
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pragmasoftPng.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox jAtp;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JComboBox<String> jGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextDescripcion;
    private javax.swing.JTextField jTextEstrellas;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables

    private boolean getId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


package ipc1.f._1s2026.views;

import Singleton.SingletonID;
import ipc1.f._1s2026.controllers.AgregarController;
import javax.swing.JOptionPane;

/**
 *
 * @author fofo_
 */
public class VistaAgregar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaAgregar.class.getName());
    
    AgregarController addControl = new AgregarController();
    VistaPrincipal vistaPrincipal;
    
    
    //VistaPrincipal viPrincipal = new VistaPrincipal();
    
    
    public VistaAgregar(VistaPrincipal vp) {
        initComponents();
        this.vistaPrincipal = vp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btmAgregar = new javax.swing.JButton();
        btmCerrar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Agregar Producto");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Nombre del producto");

        jLabel3.setText("Categoria");

        jLabel4.setText("Precio [Q]");

        jLabel5.setText("Cantidad en Stock");

        jLabel6.setText("El Codigo unico del producto se genera automaticamente.");

        btmAgregar.setText("AGREGAR");
        btmAgregar.addActionListener(this::btmAgregarActionPerformed);

        btmCerrar.setText("CERRAR");
        btmCerrar.addActionListener(this::btmCerrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreP)
                            .addComponent(txtCategoria)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadStock)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(btmAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCerrarActionPerformed
        //viPrincipal.setVisible(true);
        this.setVisible(false);
        vistaPrincipal.setVisible(true);
    }//GEN-LAST:event_btmCerrarActionPerformed

    private void btmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarActionPerformed
        

        //Obetenemos los datos de los textField
        String nombreNew = this.txtNombreP.getText();
        String categoriaNew = this.txtCategoria.getText();
        int precioNew; // = Integer.parseInt(txtPrecio.getText());
        
        int cantidad;
        
        try {
            nombreNew = txtNombreP.getText().trim();
            categoriaNew = txtCategoria.getText().trim();

            if (nombreNew.isEmpty() || categoriaNew.isEmpty()) {
                throw new IllegalArgumentException("Los campos Nombre y Categoría no pueden estar vacíos.");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
            null,
            e.getMessage(),
            "Error",
            JOptionPane.WARNING_MESSAGE
            );
            if (nombreNew.isEmpty()) {
            txtNombreP.requestFocus();
            } else {
                txtCategoria.requestFocus();
                }
            return; // Salimos del método para que no se continúe con la agregación
            }
        
        try{
            precioNew = Integer.parseInt(txtPrecio.getText());
            
            if (precioNew < 0){
                JOptionPane.showMessageDialog(
                null,
                "No se permiten precios negativos",
                "Error",
                JOptionPane.WARNING_MESSAGE);
                txtPrecio.setText("");
                txtPrecio.requestFocus();
                return;
                
            } 
        }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar un precio valido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
                    txtPrecio.setText("");
                    txtPrecio.requestFocus();
                    return;
                    }

        try{
            cantidad = Integer.parseInt(txtCantidadStock.getText());
            
            if (cantidad < 0){
                JOptionPane.showMessageDialog(
                null,
                "No se permiten valores negativos",
                "Error",
                JOptionPane.WARNING_MESSAGE);
                txtCantidadStock.setText("");
                txtCantidadStock.requestFocus();
                return;
                
            } 
        }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar un número válido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
                    txtCantidadStock.setText("");
                    txtCantidadStock.requestFocus();
                    return;
                    }
        
        int codigoNew = SingletonID.getInstancia().generarID();
        
        addControl.AgregarProducto(nombreNew, categoriaNew, precioNew, cantidad, codigoNew);
        
        vistaPrincipal.actualizarTabla(addControl.obtenerProductos());
        
        JOptionPane.showMessageDialog(null,"Producto agregado");
        txtNombreP.setText("");
        txtCategoria.setText("");
        txtPrecio.setText("");
        txtCantidadStock.setText("");
        txtNombreP.requestFocus();
    }//GEN-LAST:event_btmAgregarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaAgregar(null).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAgregar;
    private javax.swing.JButton btmCerrar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCantidadStock;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}



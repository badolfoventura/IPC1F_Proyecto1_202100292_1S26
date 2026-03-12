
package ipc1.f._1s2026.views;

import ipc1.f._1s2026.controllers.AgregarController;
import ipc1.f._1s2026.models.AgregarModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fofo_
 */


public class VistaBuscar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaBuscar.class.getName());

    
      
    
public void cargarTabla(){
    
    System.out.println(AgregarController.contador);

    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Categoria");
    modelo.addColumn("Precio");
    modelo.addColumn("Cantidad");

    for(int i = 0; i < AgregarController.contador; i++){

        AgregarModel p = AgregarController.datosAgregar[i];
        
        if(p != null){

        Object fila[] = {
            p.getCodigo(),
            p.getNombre(),
            p.getCategoria(),
            p.getPrecio(),
            p.getCantidad()
           
        };

        modelo.addRow(fila);
        }   
    }

    tablaProductos.setModel(modelo);
    

}

    
    public VistaBuscar() {
        initComponents();
       
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btmBusqueda = new javax.swing.JButton();
        btmCerrar = new javax.swing.JButton();
        cmbSelector = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Inventiario de Productos");

        jLabel2.setText("Escribe elemento a buscar, (codigo, nombre, categoria)");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btmBusqueda.setText("Buscar");
        btmBusqueda.addActionListener(this::btmBusquedaActionPerformed);

        btmCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btmCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btmCerrar.setText("Cerrar");
        btmCerrar.addActionListener(this::btmCerrarActionPerformed);

        cmbSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Categoria" }));
        cmbSelector.addItemListener(this::cmbSelectorItemStateChanged);
        cmbSelector.addActionListener(this::cmbSelectorActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btmCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmBusqueda))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmBusqueda)
                    .addComponent(cmbSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmCerrar)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btmCerrarActionPerformed

    private void btmBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBusquedaActionPerformed
        AgregarController controlador = new AgregarController();
    
        String criterio = cmbSelector.getSelectedItem().toString();
        String valor = txtBusqueda.getText().trim(); // eliminamos espacios
        
        controlador.buscarProducto(criterio, valor);
        
    }//GEN-LAST:event_btmBusquedaActionPerformed

    private void cmbSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSelectorItemStateChanged
        JComboBox<String> cmbSelector = new JComboBox<>();

        cmbSelector.addItem("Codigo");
        cmbSelector.addItem("Nombre");
        cmbSelector.addItem("Categoria");
    }//GEN-LAST:event_cmbSelectorItemStateChanged

    private void cmbSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectorActionPerformed


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
        java.awt.EventQueue.invokeLater(() -> new VistaBuscar().setVisible(true));
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmBusqueda;
    private javax.swing.JButton btmCerrar;
    private javax.swing.JComboBox<String> cmbSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}


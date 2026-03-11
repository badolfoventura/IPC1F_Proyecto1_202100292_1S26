
package ipc1.f._1s2026.views;

import ipc1.f._1s2026.controllers.AgregarController;
import ipc1.f._1s2026.models.AgregarModel;
import javax.swing.JOptionPane;
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
        cargarTabla();
        
        
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btmBusqueda))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btmBusqueda))
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
        int codigo = Integer.parseInt(txtBusqueda.getText());

        for(int i = 0; i < AgregarController.contador; i++){

            AgregarModel p = AgregarController.datosAgregar[i];
            

            if(p.getCodigo() == codigo){

               JOptionPane.showMessageDialog(null,
                "Nombre: " + p.getNombre() +
                "\nCategoria: " + p.getCategoria() +
                "\nPrecio: " + p.getPrecio() +
                "\nCantidad: " + p.getCantidad()
                );

             return;
            }

        }

        JOptionPane.showMessageDialog(null,"Producto no encontrado");
    }//GEN-LAST:event_btmBusquedaActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}



package Ventanas;

import Ejecuta.ListaProveedor;
import Ejecuta.Vendedor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class IngresoProveedor extends javax.swing.JFrame {
    
    DefaultTableModel modeloTablaV = new DefaultTableModel();
    private NuevoVendedor ventana3;
    private Principal principal;
    private ListaProveedor listaP;
    private Vendedor vendedor;
    public IngresoProveedor() {
        agregarTabla();
        initComponents();
        setLocationRelativeTo(null);        
    }
    private void  agregarTabla(){        
        modeloTablaV.addColumn("Cédula");
        modeloTablaV.addColumn("Nombres");
        modeloTablaV.addColumn("Apellidos");
        modeloTablaV.addColumn("Teléfono");
        modeloTablaV.addColumn("Genero");
    }
    
    public void limpiar(){
    textRuc.setText("");
    textRsocial.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboProducto = new javax.swing.JComboBox<>();
        textRuc = new javax.swing.JTextField();
        textRsocial = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonNVendedor = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaV = new javax.swing.JTable();
        botonImportarV = new javax.swing.JButton();
        textNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Comercial");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("Su Economía");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingreso Empresa");

        jLabel4.setText("Razón Social:");

        jLabel5.setText("RUC:");

        jLabel6.setText("Datos del Vendedor:");

        comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Productos de Limpieza", "Productos Lacteos", "Productos Cárnicos", "Aseo Personales", "Otros" }));
        comboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoActionPerformed(evt);
            }
        });

        textRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRucActionPerformed(evt);
            }
        });
        textRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRucKeyTyped(evt);
            }
        });

        textRsocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRsocialKeyTyped(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonNVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonNVendedor.setText("Nuevo Vendedor");
        botonNVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNVendedorActionPerformed(evt);
            }
        });

        botonAtras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Producto:");

        tablaV.setModel(modeloTablaV);
        /*ListSelectionListener oyenteSeleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    int filaSeleccionada = tablaV.getSelectedRow();

                    String cedula = (String)modeloTablaV.getValueAt(filaSeleccionada, 0);
                    String nombre = (String)modeloTablaV.getValueAt(filaSeleccionada, 1);
                    String apellido = (String)modeloTablaV.getValueAt(filaSeleccionada, 2);
                    String genero = (String)modeloTablaV.getValueAt(filaSeleccionada, 3);
                    String telefono = (String)modeloTablaV.getValueAt(filaSeleccionada, 4);

                    textNombre.setText(nombre);
                }
            }
        };

        tablaV.getSelectionModel().addListSelectionListener(oyenteSeleccion);*/
        tablaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaV);

        botonImportarV.setText("Importar Datos");
        botonImportarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImportarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonNVendedor)
                                .addGap(151, 151, 151)
                                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonImportarV)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textRsocial, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                .addComponent(textRuc, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textRsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(botonImportarV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonNVendedor)
                    .addComponent(botonAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoActionPerformed
        
    }//GEN-LAST:event_comboProductoActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        principal = new Principal();
        principal.show();
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonNVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNVendedorActionPerformed
        
        ventana3=new NuevoVendedor();
        this.dispose();
        ventana3.show();
    }//GEN-LAST:event_botonNVendedorActionPerformed

    private void textRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRucActionPerformed

    }//GEN-LAST:event_textRucActionPerformed

    private void textRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRucKeyTyped
        
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textRucKeyTyped

    private void textRsocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRsocialKeyTyped
        
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_textRsocialKeyTyped

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        listaP = ListaProveedor.obtenerInstancia();        
        listaP.guardarProveedor(textRuc.getText(), textRsocial.getText(),
                comboProducto.getSelectedItem().toString(),vendedor);
        JOptionPane.showMessageDialog(null, "Proveedor Ingresado Correctamente");
        limpiar();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonImportarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImportarVActionPerformed
        tablaV.setModel(NuevoVendedor.modeloTablaV);//copia tabla nuevo vendedro a proveedor
        
    }//GEN-LAST:event_botonImportarVActionPerformed

    private void tablaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVMouseClicked
        // TODO add your handling code here:
        int seleccion = tablaV.rowAtPoint(evt.getPoint());
        String cedula = String.valueOf(tablaV.getValueAt(seleccion, 0));
        String nombre = String.valueOf(tablaV.getValueAt(seleccion, 1));
        String apellido = String.valueOf(tablaV.getValueAt(seleccion, 2));
        String genero = String.valueOf(tablaV.getValueAt(seleccion, 3));
        String telefono = String.valueOf(tablaV.getValueAt(seleccion, 4));
        vendedor=new Vendedor(cedula, nombre, apellido, genero, telefono);
        textNombre.setText(cedula);
    }//GEN-LAST:event_tablaVMouseClicked

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
            java.util.logging.Logger.getLogger(IngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonImportarV;
    private javax.swing.JButton botonNVendedor;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaV;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textRsocial;
    private javax.swing.JTextField textRuc;
    // End of variables declaration//GEN-END:variables
}

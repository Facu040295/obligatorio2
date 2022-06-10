
package vista;

import Logica.Mesa;
import Logica.Mozo;
import controlador.ControladorMesas;
import controlador.IvistaMesas;
import java.awt.Color;
import java.util.ArrayList;
import Logica.Fachada;
import Logica.MesasException;
import Logica.Producto;
import Logica.Sesion;
import controlador.ControladorLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import jdk.jshell.spi.ExecutionControl;

public class VistaMozos extends javax.swing.JDialog implements IvistaMesas{

    private ControladorMesas controlador;
    private ArrayList<JButton> botones = new ArrayList<>();
    private Mesa mesaSeleccionada = null;
  
    //private ControladorLogin controladorLog;

    public VistaMozos(java.awt.Frame parent, boolean modal, Sesion sesion) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorMesas(sesion, this);
        Mozo m = sesion.getUsuarioMozo();
        cargarBotones();
        cargarGenerales(m);
        mostrarMesasAsignadas(controlador.getMesasAsignadas());
        listarProductos(controlador.getProductos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Mesas = new javax.swing.JPanel();
        btn_Mesa1 = new javax.swing.JButton();
        btn_Mesa2 = new javax.swing.JButton();
        btn_Mesa4 = new javax.swing.JButton();
        btn_Mesa5 = new javax.swing.JButton();
        btn_Mesa3 = new javax.swing.JButton();
        lb_nombreMozo = new javax.swing.JLabel();
        lbl_MesaSeleccionada = new javax.swing.JLabel();
        btn_AbrirMesa = new javax.swing.JButton();
        btn_CerrarMesa = new javax.swing.JButton();
        btn_TransferirMesa = new javax.swing.JButton();
        btn_NuevoPedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cmb_Productos = new javax.swing.JComboBox<>();
        txt_Descripcion = new javax.swing.JTextField();
        int_Cantidad = new javax.swing.JSpinner();
        btn_AgregarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btn_Mesa1.setText("Mesa");
        btn_Mesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa1ActionPerformed(evt);
            }
        });

        btn_Mesa2.setText("Mesa");
        btn_Mesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa2ActionPerformed(evt);
            }
        });

        btn_Mesa4.setText("Mesa");
        btn_Mesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa4ActionPerformed(evt);
            }
        });

        btn_Mesa5.setText("Mesa");
        btn_Mesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa5ActionPerformed(evt);
            }
        });

        btn_Mesa3.setText("Mesa");
        btn_Mesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_MesasLayout = new javax.swing.GroupLayout(Panel_Mesas);
        Panel_Mesas.setLayout(Panel_MesasLayout);
        Panel_MesasLayout.setHorizontalGroup(
            Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MesasLayout.createSequentialGroup()
                .addComponent(btn_Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_MesasLayout.createSequentialGroup()
                .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_MesasLayout.setVerticalGroup(
            Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lb_nombreMozo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_nombreMozo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombreMozo.setText("Mozo:");

        lbl_MesaSeleccionada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_MesaSeleccionada.setText("Se ha seleccionado la mesa");

        btn_AbrirMesa.setText("Abrir");
        btn_AbrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirMesaActionPerformed(evt);
            }
        });

        btn_CerrarMesa.setText("Cerrar");
        btn_CerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarMesaActionPerformed(evt);
            }
        });

        btn_TransferirMesa.setText("Transferir");

        btn_NuevoPedido.setText("Nuevo Pedido");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Producto", "Precio Unitario", "Subtotal", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btn_AgregarPedido.setText("Agregar");
        btn_AgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarPedidoActionPerformed(evt);
            }
        });

        jLabel1.setText("Productos");

        jLabel2.setText("Descripción");

        jLabel3.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmb_Productos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(int_Cantidad)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nombreMozo, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(lbl_MesaSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btn_AgregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_AbrirMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_TransferirMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(btn_CerrarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_NuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_AbrirMesa, btn_CerrarMesa, btn_TransferirMesa, lb_nombreMozo, lbl_MesaSeleccionada});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_nombreMozo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_MesaSeleccionada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AbrirMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CerrarMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_TransferirMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_NuevoPedido))
                    .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AgregarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmb_Productos, int_Cantidad, txt_Descripcion});

        setBounds(0, 0, 653, 434);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Mesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa1ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa1.getText());
        lbl_MesaSeleccionada.setVisible(true);
        mesaSeleccionada = controlador.getMesasAsignadas().get(0);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa1ActionPerformed

    private void btn_Mesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa2ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa2.getText());
        lbl_MesaSeleccionada.setVisible(true);
        mesaSeleccionada = controlador.getMesasAsignadas().get(1);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa2ActionPerformed

    private void btn_Mesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa5ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa5.getText());
        lbl_MesaSeleccionada.setVisible(true);
        mesaSeleccionada = controlador.getMesasAsignadas().get(4);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa5ActionPerformed

    private void btn_Mesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa3ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa3.getText());
        lbl_MesaSeleccionada.setVisible(true);
        mesaSeleccionada = controlador.getMesasAsignadas().get(2);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa3ActionPerformed

    private void btn_Mesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa4ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa4.getText());
        lbl_MesaSeleccionada.setVisible(true);
        mesaSeleccionada = controlador.getMesasAsignadas().get(3);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa4ActionPerformed

    private void btn_AbrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirMesaActionPerformed
        abrirMesa(mesaSeleccionada);   
    }//GEN-LAST:event_btn_AbrirMesaActionPerformed

    private void btn_CerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CerrarMesaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        logout();
    }//GEN-LAST:event_formWindowClosed

    private void btn_AgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarPedidoActionPerformed
        Mesa m = mesaSeleccionada;
        Producto p = controlador.getProductos().get(cmb_Productos.getSelectedIndex());
        String descripcion = txt_Descripcion.getText();
        int cantidad = (int) int_Cantidad.getValue();
        
        agregarPedido(m, p, descripcion, cantidad);
        
        JOptionPane.showMessageDialog(this, m.getServicio().getPedidos().get(0).getProducto().getNombre(), "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btn_AgregarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Mesas;
    private javax.swing.JButton btn_AbrirMesa;
    private javax.swing.JButton btn_AgregarPedido;
    private javax.swing.JButton btn_CerrarMesa;
    private javax.swing.JButton btn_Mesa1;
    private javax.swing.JButton btn_Mesa2;
    private javax.swing.JButton btn_Mesa3;
    private javax.swing.JButton btn_Mesa4;
    private javax.swing.JButton btn_Mesa5;
    private javax.swing.JButton btn_NuevoPedido;
    private javax.swing.JButton btn_TransferirMesa;
    private javax.swing.JComboBox<String> cmb_Productos;
    private javax.swing.JSpinner int_Cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lb_nombreMozo;
    private javax.swing.JLabel lbl_MesaSeleccionada;
    private javax.swing.JTextField txt_Descripcion;
    // End of variables declaration//GEN-END:variables

    private void cargarBotones(){
        botones.add(btn_Mesa1);
        botones.add(btn_Mesa2);
        botones.add(btn_Mesa3);
        botones.add(btn_Mesa4);
        botones.add(btn_Mesa5);
    }
    
    private void cargarGenerales(Mozo m) {
        
        for (JButton boton : botones) {
            boton.setVisible(false);
        }
        
        lbl_MesaSeleccionada.setVisible(false);
        btn_AbrirMesa.setVisible(false);
        lb_nombreMozo.setText("Mozo: " + m.getNombreCompleto());
        
    }
    
    public void logout() {
       controlador.logout();
    }

    @Override
    public void mostrarMesasAsignadas(ArrayList<Mesa> mesasAsignadas) {
        int contador = 0;
        for (Mesa mesa : mesasAsignadas) {
            JButton boton = botones.get(contador);
            
            boton.setVisible(true);
            boton.setText("Mesa " + mesa.getNumero());
            
            if (mesa.isOcupado()) {
                boton.setBackground(Color.red);
            }else{
                boton.setBackground(Color.green);
            }
            
            contador ++;
        }
    }

    @Override
    public void abrirMesa(Mesa m){
        try {
            controlador.abrirMesa(m);
        } catch (MesasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    @Override
    public void listarProductos(ArrayList<Producto> productos) {
        for(Producto producto : productos){
            cmb_Productos.addItem(producto.getNombre());
        }
    }

    @Override
    public void agregarPedido(Mesa m, Producto p, String descripcion, int cantidad) {
        try {
            controlador.AgregarPedido(m, p, descripcion, cantidad);
        } catch (Exception e) {
        }
    }

}

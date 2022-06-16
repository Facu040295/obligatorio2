package vista;

import Logica.Pedido;
import Logica.Sesion;
import Logica.UnidadProcesadora;
import controlador.ControladorMonitorPedidos;
import java.util.ArrayList;
import controlador.IvistaMonitorPedidos;

public class VistaMonitorPedidos extends javax.swing.JDialog implements IvistaMonitorPedidos{
    
    private ControladorMonitorPedidos controlador;

    public VistaMonitorPedidos(java.awt.Frame parent, boolean modal, Sesion sesion) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorMonitorPedidos(sesion, this);
        controlador.listarUnidades();
        controlador.getPedidosGestor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Unidades = new javax.swing.JPanel();
        cmb_Unidades = new javax.swing.JComboBox<>();
        btn_SeleccionarUnidad = new javax.swing.JButton();
        lbl_Unidades = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_PedidosUnidad = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_PedidosGestor = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        btn_Procesar = new javax.swing.JButton();
        btn_Finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btn_SeleccionarUnidad.setText("Seleccionar");
        btn_SeleccionarUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeleccionarUnidadActionPerformed(evt);
            }
        });

        lbl_Unidades.setText("Unidad Procesadora:");

        javax.swing.GroupLayout pnl_UnidadesLayout = new javax.swing.GroupLayout(pnl_Unidades);
        pnl_Unidades.setLayout(pnl_UnidadesLayout);
        pnl_UnidadesLayout.setHorizontalGroup(
            pnl_UnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UnidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Unidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_SeleccionarUnidad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_UnidadesLayout.setVerticalGroup(
            pnl_UnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UnidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_UnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Unidades)
                    .addComponent(cmb_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeleccionarUnidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Pedidos de la Unidad");

        jScrollPane1.setViewportView(lst_PedidosUnidad);

        jScrollPane2.setViewportView(lst_PedidosGestor);

        jLabel2.setText("Pedidos del Gestor");

        btn_Procesar.setText("Procesar");
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });

        btn_Finalizar.setText("Finalizar");
        btn_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Procesar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(btn_Finalizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Procesar)
                    .addComponent(btn_Finalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Unidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinalizarActionPerformed
        Pedido p = controlador.getPedidosGestor().get(lst_PedidosGestor.getSelectedIndex());
        controlador.finalizarPedido(p);
    }//GEN-LAST:event_btn_FinalizarActionPerformed

    private void btn_SeleccionarUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeleccionarUnidadActionPerformed
        UnidadProcesadora u = controlador.getUnidades().get(cmb_Unidades.getSelectedIndex());
        controlador.mostrarTitulo();
        controlador.seleccionarUnidad(u);
        this.ocultarUnidades();
    }//GEN-LAST:event_btn_SeleccionarUnidadActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       logout();
    }//GEN-LAST:event_formWindowClosing

    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed
        Pedido p = controlador.getPedidosUnidad().get(lst_PedidosUnidad.getSelectedIndex());
        controlador.agregarPedidoGestor(p);
    }//GEN-LAST:event_btn_ProcesarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Finalizar;
    private javax.swing.JButton btn_Procesar;
    private javax.swing.JButton btn_SeleccionarUnidad;
    private javax.swing.JComboBox<String> cmb_Unidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Unidades;
    private javax.swing.JList lst_PedidosGestor;
    private javax.swing.JList lst_PedidosUnidad;
    private javax.swing.JPanel pnl_Unidades;
    // End of variables declaration//GEN-END:variables

    public void ocultarUnidades(){
        this.lbl_Unidades.setVisible(false);
        this.cmb_Unidades.setVisible(false);
        this.btn_SeleccionarUnidad.setVisible(false);
        this.pnl_Unidades.setVisible(false);
    }
    
    @Override
    public void mostrarPedidosUnidad(ArrayList<Pedido> pedidos) {
        
        ArrayList<String> listado = new ArrayList();
        for (Pedido p : pedidos) {
            listado.add(p.getProducto().getNombre() + " - " + p.getCantidad()
                        + " - $" + p.getProducto().getPrecioUnitario() + " P/U - $" + 
                        (p.getProducto().getPrecioUnitario() * p.getCantidad()) + " - " + p.getEstado());
        }
        
        lst_PedidosUnidad.setListData(listado.toArray());
    }

    @Override
    public void mostrarPedidosGestor(ArrayList<Pedido> pedidos) {
        
        ArrayList<String> listado = new ArrayList();
        for (Pedido p : pedidos) {
            listado.add(p.getProducto().getNombre() + " - " + p.getCantidad()
                        + " - $" + p.getProducto().getPrecioUnitario() + " P/U - $" + 
                        (p.getProducto().getPrecioUnitario() * p.getCantidad()) + " - " + p.getEstado());
        }
        
        lst_PedidosGestor.setListData(listado.toArray());        
    }

    @Override
    public void mostrarTitulo(String titulo) {
        this.setTitle(titulo);
    }

    @Override
    public void listarUnidades(ArrayList<UnidadProcesadora> unidades) {
        for(UnidadProcesadora u : unidades){
            cmb_Unidades.addItem(u.getNombre());
        }
    }

    private void logout() {
        controlador.logout();
    }

}

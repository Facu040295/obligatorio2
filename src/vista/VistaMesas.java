
package vista;

import Logica.Mesa;
import Logica.Mozo;
import controlador.ControladorMesas;
import java.awt.Color;
import java.util.ArrayList;
import Logica.MesasException;
import Logica.Pedido;
import Logica.Producto;
import Logica.Servicio;
import Logica.Sesion;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import controlador.IVistaMesas;

public class VistaMesas extends javax.swing.JDialog implements IVistaMesas{

    private ControladorMesas controlador;
    private ArrayList<JButton> botones = new ArrayList<>();
    private Mesa mesaSeleccionada = null;
  
    //private ControladorLogin controladorLog;

    public VistaMesas(java.awt.Frame parent, boolean modal, Sesion sesion) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorMesas(sesion, this);
        Mozo m = sesion.getUsuarioMozo();
        cargarBotones();
        cargarGenerales(m);
        mostrarMesasAsignadas(controlador.getMesasAsignadas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_Pedidos = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        pnl_Mesas = new javax.swing.JPanel();
        btn_Mesa1 = new javax.swing.JButton();
        btn_Mesa2 = new javax.swing.JButton();
        btn_Mesa4 = new javax.swing.JButton();
        btn_Mesa5 = new javax.swing.JButton();
        btn_Mesa3 = new javax.swing.JButton();
        lbl_nombreMozo = new javax.swing.JLabel();
        lbl_MesaSeleccionada = new javax.swing.JLabel();
        btn_AbrirMesa = new javax.swing.JButton();
        btn_CerrarMesa = new javax.swing.JButton();
        btn_TransferirMesa = new javax.swing.JButton();
        btn_NuevoPedido = new javax.swing.JButton();
        pnl_Pedido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnl_NuevoPedido = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmb_Productos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_Descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        int_Cantidad = new javax.swing.JSpinner();
        btn_AgregarPedido = new javax.swing.JButton();
        btn_CancelarPedido = new javax.swing.JButton();
        pnl_Servicio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_PedidosServicio = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pnl_MostrarBeneficio = new javax.swing.JPanel();
        lbl_NombreCliente = new javax.swing.JLabel();
        lbl_Beneficio = new javax.swing.JLabel();
        lbl_NombreDescuento = new javax.swing.JLabel();
        lbl_MontoFinal = new javax.swing.JLabel();
        pnl_CierreMesa = new javax.swing.JPanel();
        lbl_IngresarCliente = new javax.swing.JLabel();
        txt_NroCli = new javax.swing.JTextField();
        btn_Descuento = new javax.swing.JButton();
        btn_ConfirmarCierre = new javax.swing.JButton();
        btn_CancelarCierre = new javax.swing.JButton();

        Lst_Pedidos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "No se encuentran pedidos" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lst_Pedidos);

        jLabel4.setText("Nombre Producto - Cantidad - Descripción - Procesado");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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

        javax.swing.GroupLayout pnl_MesasLayout = new javax.swing.GroupLayout(pnl_Mesas);
        pnl_Mesas.setLayout(pnl_MesasLayout);
        pnl_MesasLayout.setHorizontalGroup(
            pnl_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MesasLayout.createSequentialGroup()
                .addComponent(btn_Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_MesasLayout.createSequentialGroup()
                .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_MesasLayout.setVerticalGroup(
            pnl_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        lbl_nombreMozo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_nombreMozo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_nombreMozo.setText("Mozo:");

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
        btn_NuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_PedidoLayout = new javax.swing.GroupLayout(pnl_Pedido);
        pnl_Pedido.setLayout(pnl_PedidoLayout);
        pnl_PedidoLayout.setHorizontalGroup(
            pnl_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        pnl_PedidoLayout.setVerticalGroup(
            pnl_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel1.setText("Productos");

        jLabel2.setText("Descripción");

        jLabel3.setText("Cantidad");

        btn_AgregarPedido.setText("Agregar pedido");
        btn_AgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarPedidoActionPerformed(evt);
            }
        });

        btn_CancelarPedido.setText("Cancelar");
        btn_CancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NuevoPedidoLayout = new javax.swing.GroupLayout(pnl_NuevoPedido);
        pnl_NuevoPedido.setLayout(pnl_NuevoPedidoLayout);
        pnl_NuevoPedidoLayout.setHorizontalGroup(
            pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                        .addComponent(txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                        .addComponent(int_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_AgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jSeparator2)
        );
        pnl_NuevoPedidoLayout.setVerticalGroup(
            pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                                .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(int_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_NuevoPedidoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnl_NuevoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AgregarPedido)
                            .addComponent(btn_CancelarPedido))))
                .addGap(3, 3, 3))
        );

        lst_PedidosServicio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "No se encuentran pedidos" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst_PedidosServicio);

        jLabel5.setText("Nombre Producto - Cantidad - Precio por unidad - Sub-Total");

        lbl_Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Total.setText("Total del servicio: $0");

        lbl_NombreCliente.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbl_NombreCliente.setForeground(new java.awt.Color(0, 102, 0));
        lbl_NombreCliente.setText("Nombre Cliente:");

        lbl_Beneficio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbl_Beneficio.setForeground(new java.awt.Color(0, 102, 0));
        lbl_Beneficio.setText("Beneficio: ");

        lbl_NombreDescuento.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbl_NombreDescuento.setForeground(new java.awt.Color(0, 102, 0));
        lbl_NombreDescuento.setText("Descuento:");

        lbl_MontoFinal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_MontoFinal.setForeground(new java.awt.Color(0, 102, 0));
        lbl_MontoFinal.setText("Monto Final:");

        javax.swing.GroupLayout pnl_MostrarBeneficioLayout = new javax.swing.GroupLayout(pnl_MostrarBeneficio);
        pnl_MostrarBeneficio.setLayout(pnl_MostrarBeneficioLayout);
        pnl_MostrarBeneficioLayout.setHorizontalGroup(
            pnl_MostrarBeneficioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MostrarBeneficioLayout.createSequentialGroup()
                .addGroup(pnl_MostrarBeneficioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_NombreCliente)
                    .addComponent(lbl_Beneficio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_MostrarBeneficioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MostrarBeneficioLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_MontoFinal))
                    .addComponent(lbl_NombreDescuento))
                .addGap(96, 96, 96))
        );
        pnl_MostrarBeneficioLayout.setVerticalGroup(
            pnl_MostrarBeneficioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MostrarBeneficioLayout.createSequentialGroup()
                .addGroup(pnl_MostrarBeneficioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MostrarBeneficioLayout.createSequentialGroup()
                        .addComponent(lbl_NombreDescuento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_MontoFinal))
                    .addComponent(lbl_NombreCliente)
                    .addGroup(pnl_MostrarBeneficioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbl_Beneficio)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ServicioLayout = new javax.swing.GroupLayout(pnl_Servicio);
        pnl_Servicio.setLayout(pnl_ServicioLayout);
        pnl_ServicioLayout.setHorizontalGroup(
            pnl_ServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(pnl_ServicioLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_ServicioLayout.createSequentialGroup()
                .addComponent(lbl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_MostrarBeneficio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        pnl_ServicioLayout.setVerticalGroup(
            pnl_ServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ServicioLayout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_MostrarBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_IngresarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_IngresarCliente.setText("Ingresar cliente:");

        btn_Descuento.setText("Aplicar Descuento");

        btn_ConfirmarCierre.setText("Confirmar Cierre");
        btn_ConfirmarCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarCierreActionPerformed(evt);
            }
        });

        btn_CancelarCierre.setText("Cancelar");
        btn_CancelarCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarCierreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_CierreMesaLayout = new javax.swing.GroupLayout(pnl_CierreMesa);
        pnl_CierreMesa.setLayout(pnl_CierreMesaLayout);
        pnl_CierreMesaLayout.setHorizontalGroup(
            pnl_CierreMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CierreMesaLayout.createSequentialGroup()
                .addComponent(lbl_IngresarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Descuento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ConfirmarCierre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CancelarCierre)
                .addGap(6, 6, 6))
        );
        pnl_CierreMesaLayout.setVerticalGroup(
            pnl_CierreMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CierreMesaLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(pnl_CierreMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IngresarCliente)
                    .addComponent(btn_Descuento)
                    .addComponent(btn_ConfirmarCierre)
                    .addComponent(btn_CancelarCierre)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnl_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombreMozo, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(lbl_MesaSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(btn_AbrirMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_TransferirMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(btn_CerrarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_NuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pnl_NuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_Servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnl_CierreMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_AbrirMesa, btn_CerrarMesa, btn_TransferirMesa, lbl_MesaSeleccionada, lbl_nombreMozo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nombreMozo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_MesaSeleccionada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_AbrirMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CerrarMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_TransferirMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_NuevoPedido))
                    .addComponent(pnl_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_NuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_CierreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 687, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Mesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa1ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa1.getText());
        mesaSeleccionada = controlador.getMesasAsignadas().get(0);
        mostrarEventosMesa();
        controlador.mostrarServicio(mesaSeleccionada);
    }//GEN-LAST:event_btn_Mesa1ActionPerformed

    private void btn_Mesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa2ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa2.getText());
        mesaSeleccionada = controlador.getMesasAsignadas().get(1);
        mostrarEventosMesa();
        controlador.mostrarServicio(mesaSeleccionada);
    }//GEN-LAST:event_btn_Mesa2ActionPerformed

    private void btn_Mesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa5ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa5.getText());
        mesaSeleccionada = controlador.getMesasAsignadas().get(4);
        mostrarEventosMesa();
        controlador.mostrarServicio(mesaSeleccionada);
    }//GEN-LAST:event_btn_Mesa5ActionPerformed

    private void btn_Mesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa3ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa3.getText());
        mesaSeleccionada = controlador.getMesasAsignadas().get(2);
        mostrarEventosMesa();
        controlador.mostrarServicio(mesaSeleccionada);
    }//GEN-LAST:event_btn_Mesa3ActionPerformed

    private void btn_Mesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa4ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa4.getText());
        mesaSeleccionada = controlador.getMesasAsignadas().get(3);
        mostrarEventosMesa();
        controlador.mostrarServicio(mesaSeleccionada);
    }//GEN-LAST:event_btn_Mesa4ActionPerformed

    private void btn_AbrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirMesaActionPerformed
        abrirMesa(mesaSeleccionada);   
    }//GEN-LAST:event_btn_AbrirMesaActionPerformed

    private void btn_CerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarMesaActionPerformed
        pnl_NuevoPedido.setVisible(false);
        if(mesaSeleccionada.isOcupado()){
        pnl_CierreMesa.setVisible(true);
        pnl_MostrarBeneficio.setVisible(false);
        pnl_Servicio.setVisible(true);
        }
    }//GEN-LAST:event_btn_CerrarMesaActionPerformed

    private void btn_NuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoPedidoActionPerformed
        listarProductos(controlador.getProductos());
        txt_Descripcion.setText("");
        int_Cantidad.setValue(0);
        cmb_Productos.setSelectedIndex(0);
        pnl_CierreMesa.setVisible(false);
        pnl_MostrarBeneficio.setVisible(false);
        pnl_NuevoPedido.setVisible(true);
    }//GEN-LAST:event_btn_NuevoPedidoActionPerformed

    private void btn_AgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarPedidoActionPerformed
        Producto p = controlador.getProductos().get(cmb_Productos.getSelectedIndex());
        String descripcion = txt_Descripcion.getText();
        int cantidad = (int) int_Cantidad.getValue();
        agregarPedido(mesaSeleccionada, p, descripcion, cantidad);
        pnl_NuevoPedido.setVisible(false);
    }//GEN-LAST:event_btn_AgregarPedidoActionPerformed

    private void btn_CancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarPedidoActionPerformed
        txt_Descripcion.setText("");
        int_Cantidad.setValue(0);
        cmb_Productos.setSelectedIndex(0);
        pnl_NuevoPedido.setVisible(false);
    }//GEN-LAST:event_btn_CancelarPedidoActionPerformed

    private void btn_CancelarCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarCierreActionPerformed
        pnl_CierreMesa.setVisible(false);
        pnl_MostrarBeneficio.setVisible(false);
        pnl_Servicio.setVisible(true);
    }//GEN-LAST:event_btn_CancelarCierreActionPerformed

    private void btn_ConfirmarCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarCierreActionPerformed
        cerrarMesa(mesaSeleccionada);
        pnl_CierreMesa.setVisible(false);
        pnl_MostrarBeneficio.setVisible(false);
        pnl_Servicio.setVisible(false);
    }//GEN-LAST:event_btn_ConfirmarCierreActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        logout();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Lst_Pedidos;
    private javax.swing.JButton btn_AbrirMesa;
    private javax.swing.JButton btn_AgregarPedido;
    private javax.swing.JButton btn_CancelarCierre;
    private javax.swing.JButton btn_CancelarPedido;
    private javax.swing.JButton btn_CerrarMesa;
    private javax.swing.JButton btn_ConfirmarCierre;
    private javax.swing.JButton btn_Descuento;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_Beneficio;
    private javax.swing.JLabel lbl_IngresarCliente;
    private javax.swing.JLabel lbl_MesaSeleccionada;
    private javax.swing.JLabel lbl_MontoFinal;
    private javax.swing.JLabel lbl_NombreCliente;
    private javax.swing.JLabel lbl_NombreDescuento;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JLabel lbl_nombreMozo;
    private javax.swing.JList lst_PedidosServicio;
    private javax.swing.JPanel pnl_CierreMesa;
    private javax.swing.JPanel pnl_Mesas;
    private javax.swing.JPanel pnl_MostrarBeneficio;
    private javax.swing.JPanel pnl_NuevoPedido;
    private javax.swing.JPanel pnl_Pedido;
    private javax.swing.JPanel pnl_Servicio;
    private javax.swing.JTextField txt_Descripcion;
    private javax.swing.JTextField txt_NroCli;
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
        lbl_nombreMozo.setText("Mozo: " + m.getNombreCompleto());
        lbl_MesaSeleccionada.setVisible(false);
        btn_AbrirMesa.setVisible(false);
        btn_CerrarMesa.setVisible(false);
        btn_TransferirMesa.setVisible(false);
        btn_NuevoPedido.setVisible(false);
        pnl_NuevoPedido.setVisible(false);
        pnl_Servicio.setVisible(false);
        pnl_CierreMesa.setVisible(false);
        pnl_MostrarBeneficio.setVisible(false);
    }
    
    private void mostrarEventosMesa() {
        pnl_NuevoPedido.setVisible(false);
        pnl_CierreMesa.setVisible(false);
        pnl_MostrarBeneficio.setVisible(false);
        lbl_MesaSeleccionada.setVisible(true);
        btn_AbrirMesa.setVisible(true);
        btn_CerrarMesa.setVisible(true);
        btn_TransferirMesa.setVisible(true);
        btn_NuevoPedido.setVisible(true);
        if(mesaSeleccionada.isOcupado()){    
            pnl_Servicio.setVisible(true);
        }
        else
           pnl_Servicio.setVisible(false); 
    }
    
    public void logout() {
        try {
            controlador.logout();
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (MesasException ex) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            JOptionPane.showMessageDialog(this, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
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
            JOptionPane.showMessageDialog(null, "La mesa se abrió correctamente");
            pnl_CierreMesa.setVisible(false);
            pnl_MostrarBeneficio.setVisible(false);
            controlador.mostrarServicio(m);
            pnl_Servicio.setVisible(true);
        } catch (MesasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void listarProductos(ArrayList<Producto> productos) {
        for(Producto producto : productos){
            cmb_Productos.addItem(producto.getNombre());
        }
    }
    
    @Override
    public void mostrarServicio(Servicio s){

        ArrayList<String> listado = new ArrayList();
        for (Pedido p : s.getPedidos()) {
            listado.add(p.getProducto().getNombre() + " - " + p.getCantidad()
                        + " - " + p.getProducto().getPrecioUnitario() + " - " + 
                        (p.getProducto().getPrecioUnitario() * p.getCantidad()));
        }
        lst_PedidosServicio.setListData(listado.toArray());
        lbl_Total.setText("Total del servicio: $" + s.getMontoTotal());
    }

    @Override
    public void agregarPedido(Mesa m, Producto p, String descripcion, int cantidad) {
        try {
            controlador.agregarPedido(m, p, descripcion, cantidad);
            JOptionPane.showMessageDialog(null, "Se ha agregado el pedido");
            controlador.mostrarServicio(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cerrarMesa(Mesa m) {
        try {
            controlador.cerrarMesa(m);
            JOptionPane.showMessageDialog(null, "La mesa se cerró correctamente");
            pnl_CierreMesa.setVisible(false);
            pnl_MostrarBeneficio.setVisible(false);
            pnl_Servicio.setVisible(false);
            mostrarMesasAsignadas(controlador.getMesasAsignadas());
        } catch (MesasException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }
}

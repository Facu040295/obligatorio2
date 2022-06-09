
package vista;

import Logica.Mesa;
import Logica.Mozo;
import controlador.ControladorMesas;
import controlador.IvistaMesas;
import java.awt.Color;
import java.util.ArrayList;
import Logica.Fachada;
import Logica.Sesion;
import controlador.ControladorLogin;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import jdk.jshell.spi.ExecutionControl;

public class VistaMozos extends javax.swing.JDialog implements IvistaMesas{

    private ControladorMesas controlador;
    private ArrayList<JButton> botones = new ArrayList<>();
    private Mesa mesaSeleccionada = null;
  
    //private ControladorLogin controladorLog;

    public VistaMozos(java.awt.Frame parent, boolean modal, Mozo m) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorMesas(m, this);
        cargarBotones();
        cargarGenerales(m);
        mostrarMesasAsignadas(m.getMesasAsignadas());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lb_nombreMozo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_nombreMozo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombreMozo.setText("Mozo:");

        lbl_MesaSeleccionada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_MesaSeleccionada.setText("Se ha seleccionado la mesa");

        btn_AbrirMesa.setText("Abrir Mesa");
        btn_AbrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_MesaSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(btn_AbrirMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(lb_nombreMozo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nombreMozo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_MesaSeleccionada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AbrirMesa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 335, Short.MAX_VALUE))
        );

        setBounds(0, 0, 750, 501);
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
        controlador.abrirMesa(mesaSeleccionada);
        
        JOptionPane.showMessageDialog(this, "Mesa : " + mesaSeleccionada.getNumero() + " Servicio: " + mesaSeleccionada.getServicio().getMesa().getNumero(), "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btn_AbrirMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Mesas;
    private javax.swing.JButton btn_AbrirMesa;
    private javax.swing.JButton btn_Mesa1;
    private javax.swing.JButton btn_Mesa2;
    private javax.swing.JButton btn_Mesa3;
    private javax.swing.JButton btn_Mesa4;
    private javax.swing.JButton btn_Mesa5;
    private javax.swing.JLabel lb_nombreMozo;
    private javax.swing.JLabel lbl_MesaSeleccionada;
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
    
   

}

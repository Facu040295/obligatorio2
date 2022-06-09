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

public class VistaMozos extends javax.swing.JDialog implements IvistaMesas{

    private ControladorMesas controlador;
    //private ControladorLogin controladorLog;

    public VistaMozos(java.awt.Frame parent, boolean modal, Mozo m) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorMesas(m);
        cargarGenerales(m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Mesas = new javax.swing.JPanel();
        btn_Mesa1 = new javax.swing.JButton();
        btn_Mesa2 = new javax.swing.JButton();
        btn_Mesa3 = new javax.swing.JButton();
        btn_Mesa4 = new javax.swing.JButton();
        btn_Mesa5 = new javax.swing.JButton();
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

        btn_Mesa3.setText("Mesa");
        btn_Mesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa3ActionPerformed(evt);
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

        javax.swing.GroupLayout Panel_MesasLayout = new javax.swing.GroupLayout(Panel_Mesas);
        Panel_Mesas.setLayout(Panel_MesasLayout);
        Panel_MesasLayout.setHorizontalGroup(
            Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MesasLayout.createSequentialGroup()
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MesasLayout.createSequentialGroup()
                        .addComponent(btn_Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_MesasLayout.createSequentialGroup()
                        .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        Panel_MesasLayout.setVerticalGroup(
            Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MesasLayout.createSequentialGroup()
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_nombreMozo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_nombreMozo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombreMozo.setText("Mozo:");

        lbl_MesaSeleccionada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_MesaSeleccionada.setText("Se ha seleccionado la mesa");

        btn_AbrirMesa.setText("Abrir Mesa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombreMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_AbrirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_MesaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nombreMozo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_MesaSeleccionada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AbrirMesa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
        );

        setBounds(0, 0, 755, 501);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Mesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa1ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa1.getText());
        lbl_MesaSeleccionada.setVisible(true);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa1ActionPerformed

    private void btn_Mesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa2ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa2.getText());
        lbl_MesaSeleccionada.setVisible(true);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa2ActionPerformed

    private void btn_Mesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa5ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa5.getText());
        lbl_MesaSeleccionada.setVisible(true);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa5ActionPerformed

    private void btn_Mesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa3ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa3.getText());
        lbl_MesaSeleccionada.setVisible(true);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa3ActionPerformed

    private void btn_Mesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa4ActionPerformed
        lbl_MesaSeleccionada.setText("Se ha seleccionado la " + btn_Mesa4.getText());
        lbl_MesaSeleccionada.setVisible(true);
        btn_AbrirMesa.setVisible(true);
    }//GEN-LAST:event_btn_Mesa4ActionPerformed


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

    private void cargarGenerales(Mozo m) {
        btn_Mesa1.setVisible(false);
        btn_Mesa2.setVisible(false);
        btn_Mesa3.setVisible(false);
        btn_Mesa4.setVisible(false);
        btn_Mesa5.setVisible(false);
        lbl_MesaSeleccionada.setVisible(false);
        btn_AbrirMesa.setVisible(false);
        lb_nombreMozo.setText("Mozo: " + m.getNombreCompleto());
        cambiarColorMesas();
    }
    
    private void cambiarColorMesas() {
        ArrayList<Mesa> mesasAsignadas = controlador.MesasAsignadas();
        int contador = 1;
        for(Mesa mesa : mesasAsignadas) {
            String s = "btn_Mesa" + "" + contador + "";
            switch (s) {
                case "btn_Mesa1":
                btn_Mesa1.setVisible(true);
                btn_Mesa1.setText("Mesa " + mesa.getNumero());
                if (mesa.isOcupado()){
                    btn_Mesa1.setBackground(Color.RED);
                } else
                    btn_Mesa1.setBackground(Color.GREEN);
                contador++;
                break;
                
                case "btn_Mesa2":
                btn_Mesa2.setVisible(true);
                btn_Mesa2.setText("Mesa " + mesa.getNumero());
                if (mesa.isOcupado()){
                    btn_Mesa2.setBackground(Color.RED);
                } else
                    btn_Mesa2.setBackground(Color.GREEN);
                contador++;
                break;
                
                case "btn_Mesa3":
                btn_Mesa3.setVisible(true);
                btn_Mesa3.setText("Mesa " + mesa.getNumero());
                if (mesa.isOcupado()){
                    btn_Mesa3.setBackground(Color.RED);
                } else
                    btn_Mesa3.setBackground(Color.GREEN);
                contador++;
                break;
                
                case "btn_Mesa4":
                btn_Mesa4.setVisible(true);
                btn_Mesa4.setText("Mesa " + mesa.getNumero());
                if (mesa.isOcupado()){
                    btn_Mesa4.setBackground(Color.RED);
                } else
                    btn_Mesa4.setBackground(Color.GREEN);
                contador++;
                break;
                
                case "btn_Mesa5":
                btn_Mesa5.setVisible(true);
                btn_Mesa5.setText("Mesa " + mesa.getNumero());
                if (mesa.isOcupado()){
                    btn_Mesa5.setBackground(Color.RED);
                } else
                    btn_Mesa5.setBackground(Color.GREEN);
                contador++;
                break;
        }
    }
}
    
    public void logout() {
       controlador.logout();
    }
    
    @Override
    public void mostrarMesasAsignadas(ArrayList<Mesa> m, boolean ocupada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

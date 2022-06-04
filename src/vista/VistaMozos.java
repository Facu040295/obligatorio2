package vista;

import Logica.Mesa;
import Logica.Mozo;
import controlador.ControladorMesas;
import controlador.IvistaMesas;
import java.awt.Color;
import java.util.ArrayList;

public class VistaMozos extends javax.swing.JDialog implements IvistaMesas{

    private ControladorMesas controlador;

    public VistaMozos(java.awt.Frame parent, boolean modal, Mozo m) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new ControladorMesas(m);
        cambiarColorMesas(m);
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
        btn_Mesa6 = new javax.swing.JButton();
        btn_Mesa7 = new javax.swing.JButton();
        btn_Mesa8 = new javax.swing.JButton();
        btn_Mesa9 = new javax.swing.JButton();
        btn_Mesa10 = new javax.swing.JButton();
        btn_Mesa11 = new javax.swing.JButton();
        btn_Mesa12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btn_Mesa1.setText("Mesa 1");
        btn_Mesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa1ActionPerformed(evt);
            }
        });

        btn_Mesa2.setText("Mesa 2");
        btn_Mesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa2ActionPerformed(evt);
            }
        });

        btn_Mesa3.setText("Mesa 3");
        btn_Mesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa3ActionPerformed(evt);
            }
        });

        btn_Mesa4.setText("Mesa 4");
        btn_Mesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa4ActionPerformed(evt);
            }
        });

        btn_Mesa5.setText("Mesa 5");
        btn_Mesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa5ActionPerformed(evt);
            }
        });

        btn_Mesa6.setText("Mesa 6");
        btn_Mesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa6ActionPerformed(evt);
            }
        });

        btn_Mesa7.setText("Mesa 7");
        btn_Mesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa7ActionPerformed(evt);
            }
        });

        btn_Mesa8.setText("Mesa 8");
        btn_Mesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa8ActionPerformed(evt);
            }
        });

        btn_Mesa9.setText("Mesa 9");
        btn_Mesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa9ActionPerformed(evt);
            }
        });

        btn_Mesa10.setText("Mesa 10");
        btn_Mesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa10ActionPerformed(evt);
            }
        });

        btn_Mesa11.setText("Mesa 11");
        btn_Mesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa11ActionPerformed(evt);
            }
        });

        btn_Mesa12.setText("Mesa 12");
        btn_Mesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mesa12ActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_MesasLayout.createSequentialGroup()
                        .addComponent(btn_Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_MesasLayout.createSequentialGroup()
                        .addComponent(btn_Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_MesasLayout.createSequentialGroup()
                        .addComponent(btn_Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(btn_Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 413, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Mesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 116, Short.MAX_VALUE))
        );

        setBounds(0, 0, 790, 465);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Mesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa1ActionPerformed

    private void btn_Mesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa2ActionPerformed

    private void btn_Mesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa5ActionPerformed

    private void btn_Mesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa7ActionPerformed

    private void btn_Mesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa4ActionPerformed

    private void btn_Mesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa8ActionPerformed

    private void btn_Mesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa3ActionPerformed

    private void btn_Mesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa6ActionPerformed

    private void btn_Mesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa9ActionPerformed

    private void btn_Mesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa10ActionPerformed

    private void btn_Mesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa11ActionPerformed

    private void btn_Mesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mesa12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Mesa12ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Mesas;
    private javax.swing.JButton btn_Mesa1;
    private javax.swing.JButton btn_Mesa10;
    private javax.swing.JButton btn_Mesa11;
    private javax.swing.JButton btn_Mesa12;
    private javax.swing.JButton btn_Mesa2;
    private javax.swing.JButton btn_Mesa3;
    private javax.swing.JButton btn_Mesa4;
    private javax.swing.JButton btn_Mesa5;
    private javax.swing.JButton btn_Mesa6;
    private javax.swing.JButton btn_Mesa7;
    private javax.swing.JButton btn_Mesa8;
    private javax.swing.JButton btn_Mesa9;
    // End of variables declaration//GEN-END:variables

    
    private void cambiarColorMesas(Mozo m) {
        btn_Mesa1.setVisible(true);
        btn_Mesa2.setVisible(true);
        btn_Mesa3.setVisible(true);
        btn_Mesa4.setVisible(true);
        btn_Mesa5.setVisible(true);
        btn_Mesa6.setVisible(true);
        btn_Mesa7.setVisible(true);
        btn_Mesa8.setVisible(true);
        btn_Mesa9.setVisible(true);
        btn_Mesa10.setVisible(true);
        btn_Mesa11.setVisible(true);
        btn_Mesa12.setVisible(true);
        ArrayList<Mesa> mesasAsignadas = m.getMesasAsignadas();
        for(Mesa mesa : mesasAsignadas) {
            String s = "btn_Mesa" + "" + mesa.getNumero() + "";
            if (btn_Mesa1.equals(s)){
                btn_Mesa1.setVisible(true);
            }
        }
    }

    @Override
    public void mostrarMesasAsignadas(ArrayList<Mesa> m, boolean ocupada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

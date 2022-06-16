package vista;

import javax.swing.JOptionPane;
import Logica.UsuarioException;
import controlador.IVistaLogin;

public abstract class LoginAbstracto extends javax.swing.JDialog implements IVistaLogin {
    
    public LoginAbstracto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle(getTitulo());
    }

    public abstract String getTitulo();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        bLogin = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 180));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        bLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bLogin.setText("Login");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(bLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_Nombre, txt_Password});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        login();
    }//GEN-LAST:event_bLoginActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        login();
    }//GEN-LAST:event_txt_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables

    private void login() {
        String nom = txt_Nombre.getText();
        String pwd = new String(txt_Password.getPassword());
        try {
            invocarLoginLogicaNegocio(nom, pwd);
            dispose();
        } catch (UsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public abstract void invocarLoginLogicaNegocio(String nom, String pwd) throws UsuarioException;

    public abstract void ejecutarProximoCasoUso(Object dato);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipijar;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame implements InterLogin {
    String query="";
    public Login() {
        initComponents();
        //pemanggilan fungsi koneksi database yang sudah dibuat pada class koneksi.java
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JOptionPane = new javax.swing.JOptionPane();
        loginLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        loginAsCombo = new javax.swing.JComboBox<>();
        loginAsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 300));
        setResizable(false);

        loginLabel.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        loginLabel.setText("LOGIN");

        idLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idLabel.setText("Id");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passLabel.setText("Password");

        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        loginAsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Kemahasiswaan" }));

        loginAsLabel.setText("Login As");

        jLabel1.setText("by Fajar Windhu Zulfikar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginAsLabel)
                            .addComponent(passLabel)
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginAsCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginLabel)
                            .addComponent(passField)
                            .addComponent(idField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(loginLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginAsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginAsLabel))
                .addGap(15, 15, 15)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        cekLogin();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed
    
    @Override
    public void cekLogin(){
        try {
            /*sql = "SELECT * FROM t_mahasiswa WHERE id='"+idField.getText()+"' AND password='"+passField.getText()+"'";
            rs = stat.executeQuery(sql);
            if(rs.next()){
                if((idField.getText().equals(rs.getString("id"))) && (passField.getText().equals(rs.getString("password")))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    //this.setVisible(false);
                    String id = idField.getText();
                    String nama = rs.getString("nama");
                    this.dispose();
                    new Mahasiswa(id,nama).setVisible(true);
                }
            }else{
                    JOptionPane.showMessageDialog(null, "ID atau Password salah");
                    idField.setText(null);
                    passField.setText(null);
                }*/
            //java.sql.Connection conn = (Connection)koneksi.configDB();
            //koneksi konek=new koneksi();
            //konek.configDB();
            
            /*String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/sipijar";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");*/
            
            loginAs(query);  //pengelompokan login sebagai siapa
            
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            
            if(rs.next()){
                if((idField.getText().equals(rs.getString("id"))) && (passField.getText().equals(rs.getString("password")))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    String id = idField.getText();
                    String nama = rs.getString("nama");
                    //this.dispose();
                    if(loginAsCombo.getSelectedItem().equals("Mahasiswa")){
                        new Buat_Permohonan(id,nama).setVisible(true);
                    }
                    else if(loginAsCombo.getSelectedItem().equals("Kemahasiswaan")){
                        new Persetujuan_Permohonan(id,nama).setVisible(true);
                    }
                    //new Mahasiswa(id,nama).setVisible(true);
                    this.setVisible(false);
                    conn.close();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "ID atau Password salah");
                    idField.setText(null);
                    passField.setText(null);
                    loginAsCombo.setSelectedItem(this);
                }
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
    @Override
    public String loginAs(String newQuery){
        query=newQuery;
        if(loginAsCombo.getSelectedItem().equals("Mahasiswa")){
            query = "SELECT * FROM t_mahasiswa WHERE id='"+idField.getText()+"' AND password='"+passField.getText()+"'";
        }
            if(loginAsCombo.getSelectedItem().equals("Kemahasiswaan")){
            query = "SELECT * FROM t_kemahasiswaan WHERE id='"+idField.getText()+"' AND password='"+passField.getText()+"'";
        }
        return query;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Login loginObj = new Login();
        //loginObj.loginAs();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> loginAsCombo;
    private javax.swing.JLabel loginAsLabel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    // End of variables declaration//GEN-END:variables

}

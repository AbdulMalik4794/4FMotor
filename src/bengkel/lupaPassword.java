/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class lupaPassword extends javax.swing.JFrame {

    Connection cn;
    ResultSet rs;
    Statement st;
    Koneksi db = new Koneksi();

    /**
     * Creates new form registerUser
     */
    public lupaPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlJawabanOwner = new javax.swing.JPanel();
        lblLogo3 = new javax.swing.JLabel();
        btnBackLogin1 = new javax.swing.JButton();
        lblUserId6 = new javax.swing.JLabel();
        lblUserId7 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        txtUsername1 = new javax.swing.JTextField();
        pnlLupaPasswordOwner = new javax.swing.JPanel();
        lblLogo2 = new javax.swing.JLabel();
        btnJawabOwner = new javax.swing.JButton();
        lblUserId4 = new javax.swing.JLabel();
        lblUserId5 = new javax.swing.JLabel();
        txtTahunAPP = new javax.swing.JTextField();
        txtKodeOwner = new javax.swing.JTextField();
        pnlLupaPassword = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnJawabPegawai = new javax.swing.JButton();
        lblUserId = new javax.swing.JLabel();
        lblUserId1 = new javax.swing.JLabel();
        txtNamaPegawai = new javax.swing.JTextField();
        txtIdPegawai = new javax.swing.JTextField();
        pnlJawaban = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        btnBackLogin = new javax.swing.JButton();
        lblUserId2 = new javax.swing.JLabel();
        lblUserId3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        pnlTips = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTips = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnItmLogin = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnItemKeluar = new javax.swing.JMenuItem();
        mnBantuan = new javax.swing.JMenu();
        mnItemAbout = new javax.swing.JMenuItem();
        mnItemHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4F-APP");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlBackground.setAlignmentX(1.0F);
        pnlBackground.setAlignmentY(1.0F);
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlJawabanOwner.setBackground(new java.awt.Color(255, 255, 255));
        pnlJawabanOwner.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(224, 224, 224), new java.awt.Color(234, 234, 234)));
        pnlJawabanOwner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4F.PNG"))); // NOI18N
        pnlJawabanOwner.add(lblLogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 210, 130));

        btnBackLogin1.setBackground(new java.awt.Color(51, 102, 255));
        btnBackLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLogin1.setText("KEMBALI LOGIN");
        btnBackLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackLogin1ActionPerformed(evt);
            }
        });
        pnlJawabanOwner.add(btnBackLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 380, 35));

        lblUserId6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId6.setText("Password PEMILIK");
        pnlJawabanOwner.add(lblUserId6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        lblUserId7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId7.setText("Username PEMILIK");
        pnlJawabanOwner.add(lblUserId7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        txtPassword1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword1.setText("faruq");
        pnlJawabanOwner.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 310, 30));

        txtUsername1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername1.setText("4fmotor");
        pnlJawabanOwner.add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 310, 30));

        pnlBackground.add(pnlJawabanOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 670, 390));

        pnlLupaPasswordOwner.setBackground(new java.awt.Color(255, 255, 255));
        pnlLupaPasswordOwner.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(224, 224, 224), new java.awt.Color(234, 234, 234)));
        pnlLupaPasswordOwner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4F.PNG"))); // NOI18N
        pnlLupaPasswordOwner.add(lblLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 210, 130));

        btnJawabOwner.setBackground(new java.awt.Color(51, 102, 255));
        btnJawabOwner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJawabOwner.setForeground(new java.awt.Color(255, 255, 255));
        btnJawabOwner.setText("JAWAB PERTANYAAN");
        btnJawabOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJawabOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawabOwnerActionPerformed(evt);
            }
        });
        pnlLupaPasswordOwner.add(btnJawabOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 380, 35));

        lblUserId4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId4.setText("2. Tahun Berapa 4F-APP Di Buat ?");
        pnlLupaPasswordOwner.add(lblUserId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        lblUserId5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId5.setText("1. Masukkan Kode Pemilik");
        pnlLupaPasswordOwner.add(lblUserId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 30));
        pnlLupaPasswordOwner.add(txtTahunAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 310, 30));
        pnlLupaPasswordOwner.add(txtKodeOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 310, 30));

        pnlBackground.add(pnlLupaPasswordOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 670, 390));

        pnlLupaPassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlLupaPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(224, 224, 224), new java.awt.Color(234, 234, 234)));
        pnlLupaPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4F.PNG"))); // NOI18N
        pnlLupaPassword.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 130));

        btnJawabPegawai.setBackground(new java.awt.Color(51, 102, 255));
        btnJawabPegawai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJawabPegawai.setForeground(new java.awt.Color(255, 255, 255));
        btnJawabPegawai.setText("JAWAB PERTANYAAN");
        btnJawabPegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJawabPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJawabPegawaiActionPerformed(evt);
            }
        });
        pnlLupaPassword.add(btnJawabPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 380, 35));

        lblUserId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId.setText("2. Masukkan Nama Lengkap Anda ?");
        pnlLupaPassword.add(lblUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        lblUserId1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId1.setText("1. Masukkan ID Pegawai Anda ?");
        pnlLupaPassword.add(lblUserId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        pnlLupaPassword.add(txtNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 310, 30));
        pnlLupaPassword.add(txtIdPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 310, 30));

        pnlBackground.add(pnlLupaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 670, 390));

        pnlJawaban.setBackground(new java.awt.Color(255, 255, 255));
        pnlJawaban.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(224, 224, 224), new java.awt.Color(234, 234, 234)));
        pnlJawaban.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4F.PNG"))); // NOI18N
        pnlJawaban.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 210, 130));

        btnBackLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnBackLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLogin.setText("KEMBALI LOGIN");
        btnBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackLoginActionPerformed(evt);
            }
        });
        pnlJawaban.add(btnBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 380, 35));

        lblUserId2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId2.setText("Password");
        pnlJawaban.add(lblUserId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        lblUserId3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserId3.setText("Username");
        pnlJawaban.add(lblUserId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        pnlJawaban.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 310, 30));
        pnlJawaban.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 310, 30));

        pnlBackground.add(pnlJawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 670, 390));

        pnlTips.setBackground(new java.awt.Color(245, 245, 245));
        pnlTips.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ada masalah atau kendala yang terjadi");
        pnlTips.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Untuk Lupa Password, Harap jawab pertanyaan dengan benar");
        pnlTips.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Klik pada tab menu \"Bantuan\" Apabila anda merasa");
        pnlTips.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Lalu klik tombol \"Jawab\"  ");
        pnlTips.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        pnlBackground.add(pnlTips, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 860, 110));

        lblTips.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTips.setForeground(new java.awt.Color(102, 102, 102));
        lblTips.setText("Tips");
        pnlBackground.add(lblTips, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 40, 40));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Kembali >>");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlBackground.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 100, -1));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        mnFile.setText("File");

        mnItmLogin.setText("Login");
        mnItmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmLoginActionPerformed(evt);
            }
        });
        mnFile.add(mnItmLogin);

        jMenuItem1.setText("Open DB XAMPP");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnFile.add(jMenuItem1);

        mnItemKeluar.setText("Keluar");
        mnItemKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemKeluarActionPerformed(evt);
            }
        });
        mnFile.add(mnItemKeluar);

        MenuBar.add(mnFile);

        mnBantuan.setText("Bantuan");

        mnItemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bantuan.png"))); // NOI18N
        mnItemAbout.setText("Tentang");
        mnItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemAboutActionPerformed(evt);
            }
        });
        mnBantuan.add(mnItemAbout);

        mnItemHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Help.png"))); // NOI18N
        mnItemHelp.setText("Bantuan");
        mnItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemHelpActionPerformed(evt);
            }
        });
        mnBantuan.add(mnItemHelp);

        MenuBar.add(mnBantuan);

        setJMenuBar(MenuBar);

        setSize(new java.awt.Dimension(1381, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnJawabPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawabPegawaiActionPerformed
        // TODO add your handling code here:
        db.Connect();
        if(txtIdPegawai.getText().isEmpty()||txtNamaPegawai.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Inputan Tidak Lengkap", "Pesan", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                st = db.getConnection().createStatement();
                String sql = "SELECT * FROM pegawai WHERE id_pegawai = '"+txtIdPegawai.getText()+"' and nama_pegawai = '"+txtNamaPegawai.getText()+"'";
                rs = st.executeQuery(sql);
                if(rs.next()){
                    txtUsername.setText(rs.getString("username"));
                    txtPassword.setText(rs.getString("password"));
                    pnlLupaPassword.setVisible(false);
                    pnlJawaban.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Jawaban Salah");
                }
            } catch (SQLException ex) {
                Logger.getLogger(lupaPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnJawabPegawaiActionPerformed

    private void mnItmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmLoginActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnItmLoginActionPerformed

    private void mnItemKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnItemKeluarActionPerformed

    private void mnItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "4F APP Adalah Aplikasi Sistem Informasi Transaksi 4F Motor"
                + "\nDibuat oleh Mahasiswa Kerja Praktek Teknik Informatika ITATS Surabaya dengan tujuan untuk"
                + "\nmembantu dan memudahkan 4F Motor dalam kegiatan Transaksi Dan Laporan."
                + "\n\nApplication Version 1.0.0", "Tentang 4F APP", 1);
    }//GEN-LAST:event_mnItemAboutActionPerformed

    private void mnItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemHelpActionPerformed
        // TODO add your handling code here:
        new Bantuan().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnItemHelpActionPerformed

    private void btnBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLoginActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackLoginActionPerformed

    private void btnJawabOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJawabOwnerActionPerformed
        // TODO add your handling code here:
        if (txtKodeOwner.getText().isEmpty() || txtTahunAPP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jawaban Ada Yang Kosong");
        } else {
            db.Connect();
            if(txtTahunAPP.getText().equals("2019")){
                try{
                    st = db.getConnection().createStatement();
                    String sql = "SELECT * FROM pemilik WHERE id_pemilik = '"+txtKodeOwner.getText()+"'";
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        txtUsername1.setText(rs.getString("username"));
                        txtPassword1.setText(rs.getString("password"));
                        pnlLupaPasswordOwner.setVisible(false);
                        pnlJawabanOwner.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Jawaban Salah");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(lupaPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Jawaban Salah !");
            }
        }
    }//GEN-LAST:event_btnJawabOwnerActionPerformed

    private void btnBackLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLogin1ActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackLogin1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().open(new File("C:\\xampp\\xampp-control.exe"));
        } catch (IOException ex) {
            Logger.getLogger(lupaPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(lupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lupaPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackLogin;
    private javax.swing.JButton btnBackLogin1;
    protected javax.swing.JButton btnJawabOwner;
    protected javax.swing.JButton btnJawabPegawai;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JLabel lblTips;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserId1;
    private javax.swing.JLabel lblUserId2;
    private javax.swing.JLabel lblUserId3;
    private javax.swing.JLabel lblUserId4;
    private javax.swing.JLabel lblUserId5;
    private javax.swing.JLabel lblUserId6;
    private javax.swing.JLabel lblUserId7;
    private javax.swing.JMenu mnBantuan;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnItemAbout;
    private javax.swing.JMenuItem mnItemHelp;
    private javax.swing.JMenuItem mnItemKeluar;
    private javax.swing.JMenuItem mnItmLogin;
    private javax.swing.JPanel pnlBackground;
    protected javax.swing.JPanel pnlJawaban;
    protected javax.swing.JPanel pnlJawabanOwner;
    protected javax.swing.JPanel pnlLupaPassword;
    protected javax.swing.JPanel pnlLupaPasswordOwner;
    private javax.swing.JPanel pnlTips;
    protected javax.swing.JTextField txtIdPegawai;
    protected javax.swing.JTextField txtKodeOwner;
    protected javax.swing.JTextField txtNamaPegawai;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    protected javax.swing.JTextField txtTahunAPP;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables
}

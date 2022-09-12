/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eighteenags
 */
public class FormPegawai extends javax.swing.JFrame {

    String tgl;
    Connection cn;
    ResultSet rs;
    Statement st;
    Koneksi db = new Koneksi();
    DefaultTableModel MdtPegawai; 
    /**
     * Creates new form FormBarang
     */
    public FormPegawai() {
        db.Connect();
        initComponents();
        akses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        PanelTransaksi = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        text_id_Pegawai = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        text_ktp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text_nama = new javax.swing.JTextField();
        text_user = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_alamat = new javax.swing.JTextArea();
        ShowPass = new javax.swing.JCheckBox();
        text_pass = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPegawai = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        textCariPegawai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnData = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnBantuan = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("4F-APP");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel3.setText("Sistem Transaksi Bengkel");
        Header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, -1));

        jButton11.setBackground(new java.awt.Color(0, 204, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Kembali>>");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Header.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        pnlList.setBackground(new java.awt.Color(0, 102, 255));
        pnlList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 4));

        PanelTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        PanelTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pegawai", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 204, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ID Pegawai");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        text_id_Pegawai.setEditable(false);
        text_id_Pegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(text_id_Pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 30));

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 100, -1));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 110, -1));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Insert");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        text_ktp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_ktp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_ktpKeyTyped(evt);
            }
        });
        jPanel2.add(text_ktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Alamat");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("No. KTP");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4F.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 230, 150));

        text_nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(text_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 200, 30));

        text_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(text_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Username");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        text_alamat.setColumns(14);
        text_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_alamat.setRows(5);
        jScrollPane2.setViewportView(text_alamat);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 60));

        ShowPass.setBackground(new java.awt.Color(255, 255, 255));
        ShowPass.setText("Tampilkan");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel2.add(ShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 80, 30));

        text_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(text_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 200, 30));

        PanelTransaksi.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 430, 520));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Form Pegawai");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PanelTransaksi.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1330, 50));

        tbPegawai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPegawai.setOpaque(false);
        tbPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPegawai);

        PanelTransaksi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 860, 460));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama_Pegawai", "ID_Pegawai", "No_KTP" }));
        PanelTransaksi.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 130, -1));

        textCariPegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelTransaksi.add(textCariPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, 150, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelTransaksi.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 80, 80, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        PanelTransaksi.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, 30));

        getContentPane().add(PanelTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 680));

        mnFile.setText("File");

        jMenuItem1.setText("Open DB-XAMPP");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnFile.add(jMenuItem1);

        jMenuItem2.setText("Menu Utama");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnFile.add(jMenuItem2);

        jMenuBar2.add(mnFile);

        mnData.setText("Data");

        jMenuItem3.setText("Data Barang");
        mnData.add(jMenuItem3);

        jMenuItem4.setText("Data Jasa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnData.add(jMenuItem4);

        jMenuBar2.add(mnData);

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnTransaksiMouseClicked(evt);
            }
        });

        jMenuItem5.setText("Penjualan");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnTransaksi.add(jMenuItem5);

        jMenuBar2.add(mnTransaksi);

        mnBantuan.setText("Bantuan");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bantuan.png"))); // NOI18N
        jMenuItem6.setText("Tentang");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnBantuan.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Help.png"))); // NOI18N
        jMenuItem7.setText("Bantuan");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnBantuan.add(jMenuItem7);

        jMenuBar2.add(mnBantuan);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().open(new File("C:\\xampp\\xampp-control.exe"));
        } catch (IOException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tbPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPegawaiMouseClicked
        // TODO add your handling code here:
        int i = tbPegawai.getSelectedRow();
        text_id_Pegawai.setText((String) tbPegawai.getValueAt(i, 0));
        text_nama.setText((String) tbPegawai.getValueAt(i, 1));
        text_alamat.setText((String) tbPegawai.getValueAt(i, 2));
        text_ktp.setText((String) tbPegawai.getValueAt(i, 3));
        //text_user.setText((String) tbPegawai.getValueAt(i, 4));
        //text_pass.setText((String) tbPegawai.getValueAt(i, 5));
        text_user.setEnabled(false);
        text_pass.setEnabled(false);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton7.setEnabled(false);
    }//GEN-LAST:event_tbPegawaiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CariPegawai();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        akses();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "4F APP Adalah Aplikasi Sistem Informasi Transaksi 4F Motor"
                + "\nDibuat oleh Mahasiswa Kerja Praktek Teknik Informatika ITATS Surabaya dengan tujuan untuk"
                + "\nmembantu dan memudahkan 4F Motor dalam kegiatan Transaksi Dan Laporan."
                + "\n\nApplication Version 1.0.0", "Tentang 4F APP", 1);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        InputData();
        akses();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void text_ktpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_ktpKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && text_ktp.getText().length() < 16
        || (c == KeyEvent.VK_BACK_SPACE)
        || (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_text_ktpKeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        UpdateData();
        akses();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new FormMenu("PM01").setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTransaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnTransaksiMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        new FormMenu("PM01").setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new Bantuan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        DeleteData();
        akses();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        // TODO add your handling code here:
        if (ShowPass.isSelected()) {
            text_pass.setEchoChar((char) 0);

        } else {
            text_pass.setEchoChar('•');

        }
    }//GEN-LAST:event_ShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PanelTransaksi;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu mnBantuan;
    private javax.swing.JMenu mnData;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTable tbPegawai;
    private javax.swing.JTextField textCariPegawai;
    private javax.swing.JTextArea text_alamat;
    private javax.swing.JTextField text_id_Pegawai;
    private javax.swing.JTextField text_ktp;
    private javax.swing.JTextField text_nama;
    private javax.swing.JPasswordField text_pass;
    private javax.swing.JTextField text_user;
    // End of variables declaration//GEN-END:variables

    private void akses(){
        autoid_pegawai();
        LihatTabel();
        text_nama.setText("");
        text_alamat.setText("");
        text_ktp.setText("");
        text_user.setText("");
        text_pass.setText("");
        textCariPegawai.setText("");
        text_user.setEnabled(true);
        text_pass.setEnabled(true);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton7.setEnabled(true);
    }
      
    private void autoid_pegawai(){
        try{
            String sql = "select max(right(id_pegawai,5)) as no from pegawai";
            st = db.getConnection().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.first() == false){
                    text_id_Pegawai.setText("PG00001");
                }
                else{
                    rs.last();
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int n = 0; n < 5 - id_next; n++) {
                        no = "0" + no;
                    }
                    text_id_Pegawai.setText("PG"+no);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal Database Mati !");
        }
    }
    
    private void InputData(){
        if(text_nama.getText().isEmpty()||text_alamat.getText().isEmpty()||text_ktp.getText().isEmpty()
                ||text_user.getText().isEmpty()||text_pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Inputan Kurang", "Pesan", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                String sql = "insert into pegawai values ('"+text_id_Pegawai.getText()
                        +"','"+text_nama.getText()+"','"+text_alamat.getText()
                        +"','"+text_ktp.getText()+"','"+text_user.getText()
                        +"','"+text_pass.getText()+"')";
                st = db.getConnection().createStatement();
                st.executeUpdate(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Memasukkan Data !");
            }
        }
    }
    
    private void UpdateData(){
        try{
            String sql="update pegawai set nama_pegawai='"+text_nama.getText()
                +"',alamat_pegawai='"+text_alamat.getText()
                +"',no_ktp='"+text_ktp.getText()
                +"'  where id_pegawai='"+text_id_Pegawai.getText()+"'";
            st = db.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Data !");
        }
    }
    
    private void DeleteData(){
        int jawab = JOptionPane.showOptionDialog(null, "Yakin Menghapus Data ?", "Delete",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(jawab == JOptionPane.YES_OPTION){
            try{
                String sql="DELETE FROM pegawai where id_pegawai='"+text_id_Pegawai.getText()+"'";
                st = db.getConnection().createStatement();
                st.executeUpdate(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Tidak Bisa Dihapus");
            }
        }
    }
    
    private void LihatTabel(){
        MdtPegawai = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
          }
        };
        MdtPegawai.addColumn("Id");
        MdtPegawai.addColumn("Nama");
        MdtPegawai.addColumn("Alamat");
        MdtPegawai.addColumn("No. KTP");
        //MdtPegawai.addColumn("Username");
        //MdtPegawai.addColumn("Password");
        tbPegawai.setModel(MdtPegawai);
        
        try{
            MdtPegawai.setRowCount(0);
            String sql = "SELECT * FROM pegawai";
            st = db.getConnection().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                MdtPegawai.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                    //rs.getString(5),
                    //"******"
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Kesalahan Perintah !");
        }
    }
    
    private void CariPegawai(){
        if(textCariPegawai.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Isikan Data yang akan di cari");
        }
        else{
            try{
                String pilihan = jComboBox1.getSelectedItem().toString();
                String sql = "select "+pilihan+" from pegawai where "+pilihan+" like '%"+textCariPegawai.getText()+"%'";
                st = db.getConnection().createStatement();
                rs = st.executeQuery(sql);
                if(rs.next()){
                    MdtPegawai.setRowCount(0);
                    sql = "select * from pegawai where "+pilihan+" like '%"+textCariPegawai.getText()+"%'";
                    st = db.getConnection().createStatement();
                    rs = st.executeQuery(sql);
                    while(rs.next()){
                        MdtPegawai.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                        });
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Data Tidak Ada", "Pesan", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal Database Mati !");
            }
        }
    }
}

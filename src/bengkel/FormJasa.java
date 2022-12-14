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
public class FormJasa extends javax.swing.JFrame {

    String tgl,id_pegawai;
    Connection cn;
    ResultSet rs;
    Statement st;
    Koneksi db = new Koneksi();
    DefaultTableModel MdtJasa; 
    /**
     * Creates new form FormPenjualan
     */
    public FormJasa(String Id) {
        db.Connect();
        initComponents();
        jMenuItem4.setEnabled(false);
        akses();
        id_pegawai = Id;
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
        jButton10 = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        PanelTransaksi = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        text_id_jasa = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        text_nmJasa = new javax.swing.JTextField();
        text_hgJasa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbJasa = new javax.swing.JTable();
        textCariJasa = new javax.swing.JTextField();
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

        jButton10.setBackground(new java.awt.Color(0, 204, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Kembali>>");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Header.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        pnlList.setBackground(new java.awt.Color(0, 102, 255));
        pnlList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 4));

        PanelTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        PanelTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Jasa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 204, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ID Jasa");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        text_id_jasa.setEditable(false);
        text_id_jasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(text_id_jasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, -1));

        jButton9.setBackground(new java.awt.Color(0, 153, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, -1));

        jButton8.setBackground(new java.awt.Color(0, 153, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, -1));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Insert");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, -1));

        text_nmJasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(text_nmJasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 140, -1));

        text_hgJasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text_hgJasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_hgJasaKeyTyped(evt);
            }
        });
        jPanel2.add(text_hgJasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Harga");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4F.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 220, 170));

        PanelTransaksi.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 430, 520));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Form Jasa");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PanelTransaksi.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1330, 50));

        tbJasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbJasa.setModel(new javax.swing.table.DefaultTableModel(
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
        tbJasa.setOpaque(false);
        tbJasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbJasaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbJasa);

        PanelTransaksi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 860, 460));

        textCariJasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PanelTransaksi.add(textCariJasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelTransaksi.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 80, -1, 30));

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
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnData.add(jMenuItem3);

        jMenuItem4.setText("Data Jasa");
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

    private void tbJasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbJasaMouseClicked
        // TODO add your handling code here:
        int i = tbJasa.getSelectedRow();
        text_id_jasa.setText((String) tbJasa.getValueAt(i, 0));
        text_nmJasa.setText((String) tbJasa.getValueAt(i, 1));
        text_hgJasa.setText((String) tbJasa.getValueAt(i, 2));
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton7.setEnabled(false);
    }//GEN-LAST:event_tbJasaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CariJasa();
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

    private void text_hgJasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_hgJasaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && text_hgJasa.getText().length() < 10
        || (c == KeyEvent.VK_BACK_SPACE)
        || (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_text_hgJasaKeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        UpdateData();
        akses();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void mnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTransaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnTransaksiMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new FormPenjualan(id_pegawai).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new FormMenu(id_pegawai).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new FormBarang(id_pegawai).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        DeleteData();
        akses();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        new FormMenu(id_pegawai).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new Bantuan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(FormJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PanelTransaksi;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JMenu mnBantuan;
    private javax.swing.JMenu mnData;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTable tbJasa;
    private javax.swing.JTextField textCariJasa;
    private javax.swing.JTextField text_hgJasa;
    private javax.swing.JTextField text_id_jasa;
    private javax.swing.JTextField text_nmJasa;
    // End of variables declaration//GEN-END:variables

    private void akses(){
        autoid_jasa();
        LihatTabel();
        textCariJasa.setText("");
        text_nmJasa.setText("");
        text_hgJasa.setText("");
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton7.setEnabled(true);
    }
      
    private void autoid_jasa(){
        try{
            String sql = "select max(right(id_jasa,4)) as no from jasa";
            st = db.getConnection().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.first() == false){
                    text_id_jasa.setText("JS0001");
                }
                else{
                    rs.last();
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int n = 0; n < 4 - id_next; n++) {
                        no = "0" + no;
                    }
                    text_id_jasa.setText("JS"+no);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal Database Mati !");
        }
    }
    
    private void InputData(){
        db.Connect();
        if(text_nmJasa.getText().isEmpty()||text_hgJasa.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Inputan Kurang !","Pesan",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                String sql = "insert into jasa values ('"+text_id_jasa.getText()
                        +"','"+text_nmJasa.getText()+"','"+text_hgJasa.getText()+"')";
                st = db.getConnection().createStatement();
                st.executeUpdate(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Memasukkan Data !");
            }
        }
    }
    
    private void UpdateData(){
        db.Connect();
        try{
            String sql="update jasa set nama_jasa='"+text_nmJasa.getText()
                +"',harga_jasa='"+text_hgJasa.getText()
                +"'  where id_jasa='"+text_id_jasa.getText()+"'";
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
            db.Connect();
            try{
                String sql="DELETE FROM jasa where id_jasa='"+text_id_jasa.getText()+"'";
                st = db.getConnection().createStatement();
                st.executeUpdate(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Tidak Bisa Dihapus");
            }
        }
    }
    
    private void LihatTabel(){
        MdtJasa = new DefaultTableModel(){
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
          }
        };
        MdtJasa.addColumn("Id");
        MdtJasa.addColumn("Nama");
        MdtJasa.addColumn("Harga");
        tbJasa.setModel(MdtJasa);
        
        db.Connect();
        try{
            MdtJasa.setRowCount(0);
            String sql = "SELECT * FROM jasa";
            st = db.getConnection().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                MdtJasa.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal Database Mati !");
        }
    }
    
    private void CariJasa(){
        db.Connect();
        if(textCariJasa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Isikan Data yang akan di cari");
        }
        else{
            try{
                String sql = "select nama_jasa from jasa where nama_jasa like '%"+textCariJasa.getText()+"%'";
                st = db.getConnection().createStatement();
                rs = st.executeQuery(sql);
                if(rs.next()){
                    MdtJasa.setRowCount(0);
                    sql = "select * from jasa where nama_jasa like '%"+textCariJasa.getText()+"%'";
                    st = db.getConnection().createStatement();
                    rs = st.executeQuery(sql);
                    while(rs.next()){
                        MdtJasa.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                        });
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal Database Mati !");
            }
        }
    }
}

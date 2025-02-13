/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom11_qltrasua;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Cat Tuong
 */
public class frmMainNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form frmMainNhanVien
     */
    public frmMainNhanVien() {
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

        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnDsNhanVien = new javax.swing.JButton();
        btnDsKhachHang = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNhapSanPham = new javax.swing.JButton();
        btnDsTraSua = new javax.swing.JButton();
        btnDsHoaDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trà sữa 11 Central");

        lblLogo.setText("Logo");

        btnOrder.setBackground(new java.awt.Color(51, 102, 255));
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom11_qltrasua/order.png"))); // NOI18N
        btnOrder.setText("Order trà sữa");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnDsNhanVien.setBackground(new java.awt.Color(51, 51, 255));
        btnDsNhanVien.setText("Danh sách nhân viên");
        btnDsNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDsNhanVienActionPerformed(evt);
            }
        });

        btnDsKhachHang.setBackground(new java.awt.Color(51, 51, 255));
        btnDsKhachHang.setText("Danh sách khách hàng");
        btnDsKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDsKhachHangActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setForeground(new java.awt.Color(51, 0, 51));
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\HocKy6\\Java\\Project\\Nhom11_qlTraSua\\Img\\exit.png")); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNhapSanPham.setBackground(new java.awt.Color(51, 51, 255));
        btnNhapSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhom11_qltrasua/product.png"))); // NOI18N
        btnNhapSanPham.setText("Nhập sản phẩm");
        btnNhapSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapSanPhamActionPerformed(evt);
            }
        });

        btnDsTraSua.setBackground(new java.awt.Color(51, 51, 255));
        btnDsTraSua.setText("Danh sách trà sữa");
        btnDsTraSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDsTraSuaActionPerformed(evt);
            }
        });

        btnDsHoaDon.setBackground(new java.awt.Color(51, 51, 255));
        btnDsHoaDon.setText("Danh sách hóa đơn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDsKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDsNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDsHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDsTraSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhapSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDsHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDsTraSua, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnNhapSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDsNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnDsKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        frmDatTraSua datTraSua = new frmDatTraSua();
        datTraSua.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnDsNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDsNhanVienActionPerformed
        //        try {
            //            // TODO add your handling code here:
            //            Connection connection = KetNoi.connectToDatabase();
            //            String sql = "select MAQUYEN  from QUYEN where TAIKHOAN  = '" +lblTaiKhoan.getText().toString()+ "'";
            //            Statement st = connection.createStatement();
            //            ResultSet rs = st.executeQuery(sql);
            //            String ma = rs.getString("MAQUYEN").substring(0,2);
            //            if(ma == "QL")
            //            {
                //                frm
                //            }
            //
            //        } catch (SQLException ex) {
            //            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            //        }

    }//GEN-LAST:event_btnDsNhanVienActionPerformed

    private void btnDsKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDsKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDsKhachHangActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        frmDangNhap Login = new frmDangNhap();
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNhapSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapSanPhamActionPerformed

    private void btnDsTraSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDsTraSuaActionPerformed
        try {
            // TODO add your handling code here:
            frmDanhSachTraSua danhSachTraSua = new frmDanhSachTraSua();
            danhSachTraSua.setVisible(true);
            this.setVisible(false);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDsTraSuaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMainNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDsHoaDon;
    private javax.swing.JButton btnDsKhachHang;
    private javax.swing.JButton btnDsNhanVien;
    private javax.swing.JButton btnDsTraSua;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNhapSanPham;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}

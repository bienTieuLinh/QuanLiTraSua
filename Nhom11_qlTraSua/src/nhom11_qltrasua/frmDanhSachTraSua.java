/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom11_qltrasua;


import Model.KetNoi;
import java.awt.PopupMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Cat Tuong
 */
public class frmDanhSachTraSua extends javax.swing.JFrame {

    /**
     * Creates new form frmDanhSachTraSua
     */
    public frmDanhSachTraSua() throws SQLException, ClassNotFoundException {
        initComponents();
        loadDuLieuBang();
//        loadDulieuNhaCungCap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDsTraSua = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTimKiemTraSua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDsTraSua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã trà sữa", "Tên trà sữa", "Giá bán", "Giá nhập", "Tên nhà cung cấp"
            }
        ));
        tblDsTraSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDsTraSuaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDsTraSua);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bảng danh sách trà sữa");

        jLabel8.setText("Tìm kiếm trà sữa");

        jButton1.setText("Tìm Kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiemTraSua, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTimKiemTraSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDsTraSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDsTraSuaMouseClicked
        // TODO add your handling code here:
        int co = tblDsTraSua.getSelectedRow();
        if(co != -1)
        {
            txtTimKiemTraSua.setText(String.valueOf(tblDsTraSua.getValueAt(co, 1)));
        }
    }//GEN-LAST:event_tblDsTraSuaMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void loadDuLieuBang () throws SQLException, ClassNotFoundException
    {
        try 
        {
           Connection con = KetNoi.connectToDatabase();
            
            String sql= "select TRASUA.MATRASUA as N'Mã trà sữa', TRASUA.TENTRASUA as N'Tên trà sữa', TRASUA.GiaBan as N'Giá bán' ,TRASUA.GiaNhap as N'Giá nhập', NhaCungCap.TenNCC  as N'Tên nhà cung cấp'from TRASUA  LEFT JOIN NhaCungCap ON TRASUA.MaNCC = NhaCungCap.MaNCC";
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) tblDsTraSua.getModel();      
            while(rs.next()){

                Object   objects[] =  {rs.getString("Mã trà sữa"),rs.getString("Tên trà sữa"), rs.getString("Giá bán"),rs.getString("Giá nhập"),rs.getString("Tên nhà cung cấp")};
                 model.addRow(objects);
            }
            
            con.close();
   
        } catch (SQLException ex) {
            Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
//    private void   loadDulieuNhaCungCap() throws ClassNotFoundException, SQLException
//    {
//        try
//        {
//          Connection con = KetNoi.connectToDatabase();
//            String sql= "select * from NhaCungCap";
//            Statement st = (Statement) con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//                   DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cboNhaCungCap.getModel();
//            while(rs.next()){
//                    String maNCC = rs.getString("MaNCC");
//                    
//                    String tenNCC = rs.getString("TenNCC");
////                    String sdt = rs.getString("SDT");
////                NhaCungCap nhaCungCap = new NhaCungCap(maNCC,tenNCC,sdt);
//                
//                        cboNhaCungCap.addItem(tenNCC);
//            
//            }
//            
//            con.close();
//       
//        }catch (ClassNotFoundException ex) {
//            Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public static void main(String args[]) {
            
      

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmDanhSachTraSua().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmDanhSachTraSua.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDsTraSua;
    private javax.swing.JTextField txtTimKiemTraSua;
    // End of variables declaration//GEN-END:variables
}

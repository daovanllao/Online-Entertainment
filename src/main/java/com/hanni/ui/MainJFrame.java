/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hanni.ui;

import com.hanni.utils.Auth;
import static com.hanni.utils.Auth.user;
import com.hanni.utils.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author anctWin10
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        new Load(this, true).setVisible(true);
        new FormDangNhap(this, true).setVisible(true);
        
        setLocationRelativeTo(null);
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy | hh:mm:ss a");
            public void actionPerformed(ActionEvent e) {
               lblDongHo.setText(format.format(new Date()));
            }
        }).start();
        Auth.user = user;
        //System.out.println(""+user);
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnPLSanPham = new javax.swing.JButton();
        btnQLSanPham = new javax.swing.JButton();
        btnQLKhachHang = new javax.swing.JButton();
        btnQLDonHang = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnQLDonHangCT = new javax.swing.JButton();
        btnQLTaiKhoan = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnQLBaoCaoTK = new javax.swing.JButton();
        btnChamSocKH = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG HANNI - STORE");

        jPanel2.setBackground(new java.awt.Color(255, 250, 243));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 250, 243));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hanni_img.jpg"))); // NOI18N
        jLabel3.setText("Hanni Store");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 204));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        jButton1.setBackground(new java.awt.Color(255, 236, 234));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Exit.png"))); // NOI18N
        jButton1.setText("Đăng Xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        btnPLSanPham.setBackground(new java.awt.Color(255, 236, 234));
        btnPLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/List.png"))); // NOI18N
        btnPLSanPham.setText("QL Phân Loại SP");
        btnPLSanPham.setFocusable(false);
        btnPLSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPLSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPLSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPLSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPLSanPham);

        btnQLSanPham.setBackground(new java.awt.Color(255, 236, 234));
        btnQLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Full basket.png"))); // NOI18N
        btnQLSanPham.setText("QL Sản Phẩm");
        btnQLSanPham.setFocusable(false);
        btnQLSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSanPham);

        btnQLKhachHang.setBackground(new java.awt.Color(255, 236, 234));
        btnQLKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User group.png"))); // NOI18N
        btnQLKhachHang.setText("QL Khách Hàng");
        btnQLKhachHang.setFocusable(false);
        btnQLKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKhachHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLKhachHang);

        btnQLDonHang.setBackground(new java.awt.Color(255, 236, 234));
        btnQLDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add to basket.png"))); // NOI18N
        btnQLDonHang.setText("QL Đơn Hàng");
        btnQLDonHang.setFocusable(false);
        btnQLDonHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLDonHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDonHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLDonHang);
        jToolBar1.add(jSeparator2);

        btnQLDonHangCT.setBackground(new java.awt.Color(255, 236, 234));
        btnQLDonHangCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Price list.png"))); // NOI18N
        btnQLDonHangCT.setText("QL Đơn Hàng Chi Tiết");
        btnQLDonHangCT.setFocusable(false);
        btnQLDonHangCT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLDonHangCT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLDonHangCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDonHangCTActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLDonHangCT);

        btnQLTaiKhoan.setBackground(new java.awt.Color(255, 236, 234));
        btnQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Unknown person.png"))); // NOI18N
        btnQLTaiKhoan.setText("QL Tài Khoản");
        btnQLTaiKhoan.setFocusable(false);
        btnQLTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTaiKhoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLTaiKhoan);
        jToolBar1.add(jSeparator5);

        btnQLBaoCaoTK.setBackground(new java.awt.Color(255, 236, 234));
        btnQLBaoCaoTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Report.png"))); // NOI18N
        btnQLBaoCaoTK.setText("Báo Cáo Thống Kê");
        btnQLBaoCaoTK.setFocusable(false);
        btnQLBaoCaoTK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLBaoCaoTK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLBaoCaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLBaoCaoTKActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLBaoCaoTK);

        btnChamSocKH.setBackground(new java.awt.Color(255, 236, 234));
        btnChamSocKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Comments.png"))); // NOI18N
        btnChamSocKH.setText("Chăm Sóc KH");
        btnChamSocKH.setFocusable(false);
        btnChamSocKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChamSocKH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChamSocKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamSocKHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChamSocKH);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("00:00:00 AM");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Hệ Thống Thời Trang Mắt kính HANNI Store");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDongHo)
                    .addComponent(jLabel2)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 250, 243));

        jMenu2.setText("Thoát");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ Giúp");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormDangNhap tk = new FormDangNhap(this, true);
        tk.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQLSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSanPhamActionPerformed
        // TODO add your handling code here:
        QLSanPham tk = new QLSanPham(this, true);
        tk.setVisible(true);
    }//GEN-LAST:event_btnQLSanPhamActionPerformed

    private void btnQLDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDonHangActionPerformed
        // TODO add your handling code here:
        QLDonHang2 tk = new QLDonHang2(this, true);
        tk.setVisible(true);
    }//GEN-LAST:event_btnQLDonHangActionPerformed

    private void btnChamSocKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamSocKHActionPerformed
        // TODO add your handling code here:
        ChamSocKhachHang1 kh = new ChamSocKhachHang1(this, true);
        kh.setVisible(true);
    }//GEN-LAST:event_btnChamSocKHActionPerformed

    private void btnQLKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKhachHangActionPerformed
        // TODO add your handling code here:
        QLKhachHang1 kh = new QLKhachHang1(this, true);
        kh.setVisible(true);
    }//GEN-LAST:event_btnQLKhachHangActionPerformed

    private void btnQLDonHangCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDonHangCTActionPerformed
        // TODO add your handling code here:
        QLDonHangChiTiet tk = new QLDonHangChiTiet(this, true);
        tk.setVisible(true);
    }//GEN-LAST:event_btnQLDonHangCTActionPerformed

    private void btnQLTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanActionPerformed
        // TODO add your handling code here:
        if(!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xem thông tin Tài Khoản!");
            return;
        }
        QLTaiKhoan tk = new QLTaiKhoan(this, true);
        tk.setVisible(true);
    }//GEN-LAST:event_btnQLTaiKhoanActionPerformed

    private void btnQLBaoCaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLBaoCaoTKActionPerformed
        // TODO add your handling code here:
        if(!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xem Báo Cáo Thống kê!");
            return;
        } else {
            BCTK2 kh = new BCTK2(this, true);
            kh.setVisible(true);
        }        
    }//GEN-LAST:event_btnQLBaoCaoTKActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        TroGiup kh = new TroGiup(this, true);
        kh.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        if(MsgBox.confirm(this, "Bạn thực sự muốn thoát khỏi ứng dụng?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnPLSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPLSanPhamActionPerformed
        // TODO add your handling code here:
        QLPhanLoaiSP kh = new QLPhanLoaiSP(this, true);
        kh.setVisible(true);
    }//GEN-LAST:event_btnPLSanPhamActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChamSocKH;
    private javax.swing.JButton btnPLSanPham;
    private javax.swing.JButton btnQLBaoCaoTK;
    private javax.swing.JButton btnQLDonHang;
    private javax.swing.JButton btnQLDonHangCT;
    private javax.swing.JButton btnQLKhachHang;
    private javax.swing.JButton btnQLSanPham;
    private javax.swing.JButton btnQLTaiKhoan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    // End of variables declaration//GEN-END:variables
}

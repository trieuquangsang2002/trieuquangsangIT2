/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eaut_app.ui;

import com.mycompany.eaut_app.helpers.ClockThread;
import com.mycompany.eaut_app.helpers.MessageDialogHelper;
import com.mycompany.eaut_app.helpers.ShareData;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author trieuquangsang
 */
public class MainForm extends javax.swing.JFrame {

    private Quanlysinhvien_panel quanlysinhvien_panel;
    private Thongke_panel thongke_panel;
    private MainForm parentForm;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);

        initClock();
        

    }

    private void initClock() {
        ClockThread th = new ClockThread(jbl_clock);
        th.start();
    }

    private void vaiTroDangNhap() {
        lblVaiTro.setText(ShareData.nguoiDanngNhap.getVaiTro());
        lblLoginName.setText(ShareData.nguoiDanngNhap.getTenDangNhap());

        if (ShareData.nguoiDanngNhap.getVaiTro().equals("Xin Chào Giảng Viên")) {
            meunu_thongke.setEnabled(true);
            tool_thongke.setEnabled(true);
            meunu_quanlysv.setEnabled(false);
            tool_quanlysv.setEnabled(false);
            tab_main.remove(quanlysinhvien_panel);
        } else if (ShareData.nguoiDanngNhap.getVaiTro().equals("Xin Chào Đào Tạo")) {
            meunu_thongke.setEnabled(false);
            tool_thongke.setEnabled(false);
            tab_main.remove(thongke_panel);
        } else if (ShareData.nguoiDanngNhap.getVaiTro().equals("Xin Chào Admin")) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tool_logout = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        tool_quanlysv = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        tool_thongke = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        tool_about = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tool_text_run = new javax.swing.JLabel();
        jbl_clock = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblVaiTro = new javax.swing.JLabel();
        lblLoginName = new javax.swing.JLabel();
        tab_main = new javax.swing.JTabbedPane();
        home = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        meunu_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        meunu_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        meunu_quanlysv = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        meunu_thongke = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        meunu_gioithiieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐẠI HỌC CÔNG NGHỆ ĐÔNG Á");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        tool_logout.setBackground(new java.awt.Color(204, 204, 255));
        tool_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/icons8-exit-32.png"))); // NOI18N
        tool_logout.setText("Đăng Xuất");
        tool_logout.setFocusable(false);
        tool_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_logoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tool_logout);
        jToolBar1.add(jSeparator3);

        tool_quanlysv.setBackground(new java.awt.Color(204, 204, 255));
        tool_quanlysv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        tool_quanlysv.setText("Quản Lý Sinh Viên");
        tool_quanlysv.setFocusable(false);
        tool_quanlysv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_quanlysv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_quanlysv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_quanlysvActionPerformed(evt);
            }
        });
        jToolBar1.add(tool_quanlysv);
        jToolBar1.add(jSeparator4);

        tool_thongke.setBackground(new java.awt.Color(204, 204, 255));
        tool_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/icons8-futures-32.png"))); // NOI18N
        tool_thongke.setText("Thống Kê Điểm");
        tool_thongke.setFocusable(false);
        tool_thongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_thongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_thongkeActionPerformed(evt);
            }
        });
        jToolBar1.add(tool_thongke);
        jToolBar1.add(jSeparator5);

        tool_about.setBackground(new java.awt.Color(204, 204, 255));
        tool_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/Actions-help-about-icon-32.png"))); // NOI18N
        tool_about.setText("Giới Thiệu");
        tool_about.setFocusable(false);
        tool_about.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tool_about.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tool_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_aboutActionPerformed(evt);
            }
        });
        jToolBar1.add(tool_about);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 109));

        tool_text_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/menu_icon.png"))); // NOI18N

        jbl_clock.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbl_clock.setForeground(new java.awt.Color(255, 0, 0));
        jbl_clock.setText("8:8:8 AM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tool_text_run)
                .addGap(162, 162, 162)
                .addComponent(jbl_clock)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbl_clock)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tool_text_run, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lblVaiTro.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(255, 0, 0));
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblLoginName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblLoginName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel2);

        tab_main.setBackground(new java.awt.Color(204, 255, 255));
        tab_main.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/Main form đã sửa.jpg"))); // NOI18N
        tab_main.addTab("Trang Chủ", home);

        jMenu1.setText("Hệ Thống");

        meunu_logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        meunu_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/icons8-exit-16.png"))); // NOI18N
        meunu_logout.setText("Đăng Xuất");
        jMenu1.add(meunu_logout);
        jMenu1.add(jSeparator1);

        meunu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        meunu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        meunu_exit.setText("Thoát");
        meunu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meunu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(meunu_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        meunu_quanlysv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        meunu_quanlysv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        meunu_quanlysv.setText("Quản Lý Sinh Viên");
        meunu_quanlysv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meunu_quanlysvActionPerformed(evt);
            }
        });
        jMenu2.add(meunu_quanlysv);
        jMenu2.add(jSeparator2);

        meunu_thongke.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        meunu_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/icons8-futures-16.png"))); // NOI18N
        meunu_thongke.setText("Thống Kê Điểm");
        meunu_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meunu_thongkeActionPerformed(evt);
            }
        });
        jMenu2.add(meunu_thongke);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ Giúp");

        meunu_gioithiieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        meunu_gioithiieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/eaut_app/icons/Actions-help-about-icon-16.png"))); // NOI18N
        meunu_gioithiieu.setText("Giới Thiệu");
        meunu_gioithiieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meunu_gioithiieuActionPerformed(evt);
            }
        });
        jMenu3.add(meunu_gioithiieu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tab_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab_main))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tool_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_logoutActionPerformed
        LoginDiaLog loginDiaLog = new LoginDiaLog(this, true);

        loginDiaLog.setVisible(true);

        vaiTroDangNhap();
    }//GEN-LAST:event_tool_logoutActionPerformed

    private void meunu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meunu_exitActionPerformed
        if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn thoát chương trình không", "Thông báo")
                == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_meunu_exitActionPerformed

    private void meunu_quanlysvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meunu_quanlysvActionPerformed
        if (quanlysinhvien_panel == null) {
            quanlysinhvien_panel = new Quanlysinhvien_panel();
            ImageIcon icon = new ImageIcon(getClass()
                    .getResource("/com/mycompany/eaut_app/icons/10207-man-student-light-skin-tone-icon-16.png"));
            tab_main.addTab("Quản Lý Sinh Viên", icon, quanlysinhvien_panel, "Quản Lý Sinh Viên");
        }
        tab_main.setSelectedComponent(quanlysinhvien_panel);
    }//GEN-LAST:event_meunu_quanlysvActionPerformed

    private void meunu_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meunu_thongkeActionPerformed
        if (thongke_panel == null) {
            thongke_panel = new Thongke_panel();
            ImageIcon icon = new ImageIcon(getClass()
                    .getResource("/com/mycompany/eaut_app/icons/icons8-futures-16.png"));
            tab_main.addTab("Thống Kê Điểm", icon, thongke_panel, "Thống Kê Điểm");
        }
        tab_main.setSelectedComponent(thongke_panel);
    }//GEN-LAST:event_meunu_thongkeActionPerformed

    private void tool_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_aboutActionPerformed
        About_dialog about_dialog = new About_dialog(this, true);

        about_dialog.setVisible(true);
    }//GEN-LAST:event_tool_aboutActionPerformed

    private void meunu_gioithiieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meunu_gioithiieuActionPerformed
        tool_aboutActionPerformed(evt);
    }//GEN-LAST:event_meunu_gioithiieuActionPerformed

    private void tool_quanlysvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_quanlysvActionPerformed
        meunu_quanlysvActionPerformed(evt);
    }//GEN-LAST:event_tool_quanlysvActionPerformed

    private void tool_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_thongkeActionPerformed
        meunu_thongkeActionPerformed(evt);
    }//GEN-LAST:event_tool_thongkeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginDiaLog diaLog = new LoginDiaLog(this, true);
        diaLog.setVisible(true);

        vaiTroDangNhap();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jbl_clock;
    private javax.swing.JLabel lblLoginName;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JMenuItem meunu_exit;
    private javax.swing.JMenuItem meunu_gioithiieu;
    private javax.swing.JMenuItem meunu_logout;
    private javax.swing.JMenuItem meunu_quanlysv;
    private javax.swing.JMenuItem meunu_thongke;
    private javax.swing.JTabbedPane tab_main;
    private javax.swing.JButton tool_about;
    private javax.swing.JButton tool_logout;
    private javax.swing.JButton tool_quanlysv;
    private javax.swing.JLabel tool_text_run;
    private javax.swing.JButton tool_thongke;
    // End of variables declaration//GEN-END:variables

}

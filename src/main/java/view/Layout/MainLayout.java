/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import view.custom.HighlightPanel;
import config.MongoConnection;
import controllers.AccountBUS;
import javax.swing.JOptionPane;
import models.Account;

/**
 *
 * @author Son
 */
public class MainLayout extends javax.swing.JFrame {
    private Account account;
    private final AccountBUS accountBUS;
    /**
     * Creates new form NewJFrame
     */
    public MainLayout(Account account) throws Exception {
        initComponents();
        setTheme();
        this.account=account;
        accountBUS = new AccountBUS();
        centerLocation();
        
        
//        active(page1);
//        getContent(new Folder());
    }
    public Account getAccountInfo(){
        account= accountBUS.getById(account.getId());
        return account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        quitBtn = new view.custom.Button();
        quitBtn1 = new view.custom.Button();
        jPanel4 = new javax.swing.JPanel();
        page1 = new view.custom.HighlightPanel();
        jLabel2 = new javax.swing.JLabel();
        page2 = new view.custom.HighlightPanel();
        jLabel3 = new javax.swing.JLabel();
        page3 = new view.custom.HighlightPanel();
        jLabel4 = new javax.swing.JLabel();
        page4 = new view.custom.HighlightPanel();
        jLabel5 = new javax.swing.JLabel();
        page5 = new view.custom.HighlightPanel();
        jLabel7 = new javax.swing.JLabel();
        page6 = new view.custom.HighlightPanel();
        jLabel8 = new javax.swing.JLabel();
        roundPanel1 = new view.custom.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        imageAvatar1 = new view.custom.ImageAvatar();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        contentPanel.setBackground(new java.awt.Color(51, 51, 51));
        contentPanel.setPreferredSize(new java.awt.Dimension(1266, 550));
        contentPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        quitBtn.setBackground(new java.awt.Color(204, 255, 204));
        quitBtn.setText("Tắt hệ thống");
        quitBtn.setColor(new java.awt.Color(204, 255, 204));
        quitBtn.setColorClick(new java.awt.Color(255, 153, 153));
        quitBtn.setColorOver(new java.awt.Color(255, 204, 204));
        quitBtn.setRadius(8);
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        quitBtn1.setBackground(new java.awt.Color(255, 255, 204));
        quitBtn1.setText("Thu nhỏ");
        quitBtn1.setColor(new java.awt.Color(255, 255, 204));
        quitBtn1.setColorClick(new java.awt.Color(255, 153, 153));
        quitBtn1.setColorOver(new java.awt.Color(255, 204, 204));
        quitBtn1.setRadius(8);
        quitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtn1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        page1.setColor(new java.awt.Color(51, 51, 51));
        page1.setColorClick(java.awt.Color.gray);
        page1.setColorOver(new java.awt.Color(255, 255, 204));
        page1.setRadius(0);
        page1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                page1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                page1MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chủ sở hữu");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout page1Layout = new javax.swing.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        page2.setColor(new java.awt.Color(51, 51, 51));
        page2.setColorClick(java.awt.Color.gray);
        page2.setColorOver(new java.awt.Color(255, 255, 204));
        page2.setPreferredSize(new java.awt.Dimension(232, 89));
        page2.setRadius(0);
        page2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                page2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                page2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Xe");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout page2Layout = new javax.swing.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        page3.setColor(new java.awt.Color(51, 51, 51));
        page3.setColorClick(java.awt.Color.gray);
        page3.setColorOver(new java.awt.Color(255, 255, 204));
        page3.setPreferredSize(new java.awt.Dimension(232, 89));
        page3.setRadius(0);
        page3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                page3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                page3MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dòng xe");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout page3Layout = new javax.swing.GroupLayout(page3);
        page3.setLayout(page3Layout);
        page3Layout.setHorizontalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        page3Layout.setVerticalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        page4.setColor(new java.awt.Color(51, 51, 51));
        page4.setColorClick(java.awt.Color.gray);
        page4.setColorOver(new java.awt.Color(255, 255, 204));
        page4.setPreferredSize(new java.awt.Dimension(232, 89));
        page4.setRadius(0);
        page4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                page4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                page4MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tài khoản");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout page4Layout = new javax.swing.GroupLayout(page4);
        page4.setLayout(page4Layout);
        page4Layout.setHorizontalGroup(
            page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        page4Layout.setVerticalGroup(
            page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        page5.setColor(new java.awt.Color(51, 51, 51));
        page5.setColorClick(java.awt.Color.gray);
        page5.setColorOver(new java.awt.Color(255, 255, 204));
        page5.setPreferredSize(new java.awt.Dimension(232, 89));
        page5.setRadius(0);
        page5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                page5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                page5MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thông tin cá nhân");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout page5Layout = new javax.swing.GroupLayout(page5);
        page5.setLayout(page5Layout);
        page5Layout.setHorizontalGroup(
            page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        page5Layout.setVerticalGroup(
            page5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        page6.setColor(new java.awt.Color(51, 51, 51));
        page6.setColorClick(java.awt.Color.gray);
        page6.setColorOver(new java.awt.Color(255, 255, 204));
        page6.setPreferredSize(new java.awt.Dimension(232, 89));
        page6.setRadius(0);
        page6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                page6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                page6MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tài khoản");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout page6Layout = new javax.swing.GroupLayout(page6);
        page6.setLayout(page6Layout);
        page6Layout.setHorizontalGroup(
            page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        page6Layout.setVerticalGroup(
            page6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(page3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(page5, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(page6, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(page3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(page4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hệ thống đăng kiểm xe");

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/ad.png"))); // NOI18N

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 1376, 1376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void page4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_page4MouseExited

    private void page4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_page4MouseEntered

    private void page4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page4MouseClicked
        getAccountInfo();
        if(account.getRole().getAccountManager()==0){
            JOptionPane.showMessageDialog(rootPane, "Bạn không có quyền truy cập vào chức năng này");
            return;
        }
        active(page4);
        getContent(new AccountGUI(account));
    }//GEN-LAST:event_page4MouseClicked

    private void page3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_page3MouseExited

    private void page3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_page3MouseEntered

    private void page3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page3MouseClicked
        getAccountInfo();
        if(account.getRole().getTransportationTypeManager()==0){
            JOptionPane.showMessageDialog(rootPane, "Bạn không có quyền truy cập vào chức năng này");
            return;
        }
        active(page3);
        getContent(new TransportationTypeGUI(account));
    }//GEN-LAST:event_page3MouseClicked

    private void page2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_page2MouseExited

    private void page2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_page2MouseEntered

    private void page2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page2MouseClicked
        getAccountInfo();
        if(account.getRole().getTransportationManager()==0){
            JOptionPane.showMessageDialog(rootPane, "Bạn không có quyền truy cập vào chức năng này");
            return;
        }
        active(page2);
        getContent(new TransportationGUI(account));
    }//GEN-LAST:event_page2MouseClicked

    private void page1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page1MouseExited

    }//GEN-LAST:event_page1MouseExited

    private void page1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page1MouseEntered

    }//GEN-LAST:event_page1MouseEntered

    private void page1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page1MouseClicked
        getAccountInfo();
        if(account.getRole().getOwnerManager()==0){
            JOptionPane.showMessageDialog(rootPane, "Bạn không có quyền truy cập vào chức năng này");
            return;
        }
        active(page1);
        getContent(new OwnerGUI(account));
    }//GEN-LAST:event_page1MouseClicked

    private void quitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtn1ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_quitBtn1ActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        MongoConnection.getInstance().close();
        System.exit(0);
    }//GEN-LAST:event_quitBtnActionPerformed

    private void page5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page5MouseClicked
        active(page5);
        getContent(new InformationGUI(account));
    }//GEN-LAST:event_page5MouseClicked

    private void page5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_page5MouseEntered

    private void page5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_page5MouseExited

    private void page6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_page6MouseClicked

    private void page6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_page6MouseEntered

    private void page6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_page6MouseExited

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new MainLayout().setVisible(true);
//                } catch (Exception ex) {
//                    Logger.getLogger(MainLayout.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }
    
    public void centerLocation(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            
            // Lấy kích thước của JFrame
            Dimension frameSize = getSize();
            
            // Tính toán vị trí để đặt JFrame ở giữa màn hình
            int x = (screenSize.width - frameSize.width) / 2;
            int y = (screenSize.height - frameSize.height) / 2;
            
            // Đặt vị trí của JFrame
            setLocation(x, y);
    }
    public void active(HighlightPanel panel){
        disable();
        actived=panel;
        actived.setColor(active);
    }
    public void disable(){
        if(actived!=null){
            actived.setColor(normal);
        }
    }
    public void getContent(JPanel panel){
    contentPanel.removeAll();
    contentPanel.setLayout(new BorderLayout());
    contentPanel.add(panel,BorderLayout.CENTER);
    contentPanel.repaint();
    contentPanel.revalidate();
}
    public void setTheme(){
        active = new java.awt.Color(204,204,204);
        normal = new java.awt.Color(51,51,51);
    }
    private HighlightPanel actived;
    private Color active,normal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private view.custom.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private view.custom.HighlightPanel page1;
    private view.custom.HighlightPanel page2;
    private view.custom.HighlightPanel page3;
    private view.custom.HighlightPanel page4;
    private view.custom.HighlightPanel page5;
    private view.custom.HighlightPanel page6;
    private view.custom.Button quitBtn;
    private view.custom.Button quitBtn1;
    private view.custom.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Layout;

import controllers.AccountBUS;
import controllers.TransportationTypeBUS;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Account;
import models.Role;
import models.TransportationType;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class InformationGUI extends javax.swing.JPanel {
    private Account account;
    private AccountBUS accountBUS;    
    /**
     * Creates new form OwnerGUI
     */
    public InformationGUI(Account account) {
        initComponents();
        accountBUS = new AccountBUS();
        this.account = accountBUS.getById(account.getId());
        getAccountDetail(account);

    }
    public void getAccountDetail(Account account){
        if(account!=null){
            nameTxt.setText(account.getName());
            emailTxt.setText(account.getEmail());
            if(account.getGender().equals("Nam"))
                maleOption.setSelected(true);
            else 
                femaleOption.setSelected(true);
            phoneTxt.setText(account.getPhone());
            ownerRole.setSelectedIndex(account.getRole().getOwnerManager());
            transportationRole.setSelectedIndex(account.getRole().getTransportationManager());
            transportationTypeRole.setSelectedIndex(account.getRole().getTransportationTypeManager());
            AccountRole.setSelectedIndex(account.getRole().getAccountManager());
        }
    }
    public void refresh(){
        nameTxt.setText("");
        emailTxt.setText("");
        genderOption.clearSelection();
        phoneTxt.setText("");
        ownerRole.setSelectedIndex(0);
        transportationRole.setSelectedIndex(0);
        transportationTypeRole.setSelectedIndex(0);
        AccountRole.setSelectedIndex(0);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderOption = new javax.swing.ButtonGroup();
        contentPanel2 = new javax.swing.JPanel();
        lblCategoryIDConfig4 = new javax.swing.JLabel();
        lblCategoryIDConfig2 = new javax.swing.JLabel();
        nameTxt = new view.custom.textField();
        lblCategoryIDConfig1 = new javax.swing.JLabel();
        emailTxt = new view.custom.textField();
        lblCategoryIDConfig3 = new javax.swing.JLabel();
        maleOption = new javax.swing.JRadioButton();
        femaleOption = new javax.swing.JRadioButton();
        birthdateField = new de.wannawork.jcalendar.JCalendarComboBox();
        lblCategoryIDConfig10 = new javax.swing.JLabel();
        lblCategoryIDConfig9 = new javax.swing.JLabel();
        phoneTxt = new view.custom.textField();
        lblCategoryIDConfig = new javax.swing.JLabel();
        lblCategoryIDConfig8 = new javax.swing.JLabel();
        lblCategoryIDConfig6 = new javax.swing.JLabel();
        transportationTypeRole = new javax.swing.JComboBox<>();
        AccountRole = new javax.swing.JComboBox<>();
        lblCategoryIDConfig7 = new javax.swing.JLabel();
        transportationRole = new javax.swing.JComboBox<>();
        lblCategoryIDConfig5 = new javax.swing.JLabel();
        ownerRole = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        button5 = new view.custom.Button();
        button6 = new view.custom.Button();

        setPreferredSize(new java.awt.Dimension(1266, 550));

        contentPanel2.setBackground(new java.awt.Color(51, 51, 51));
        contentPanel2.setPreferredSize(new java.awt.Dimension(1266, 550));
        contentPanel2.setVerifyInputWhenFocusTarget(false);

        lblCategoryIDConfig4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCategoryIDConfig4.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryIDConfig4.setText("Thông tin cơ bản");

        lblCategoryIDConfig2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig2.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig2.setText("Họ tên:");

        nameTxt.setBackground(new java.awt.Color(51, 51, 51));
        nameTxt.setForeground(new java.awt.Color(255, 255, 255));
        nameTxt.setLabelText("Họ và tên");

        lblCategoryIDConfig1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig1.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig1.setText("Email:");

        emailTxt.setBackground(new java.awt.Color(51, 51, 51));
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));
        emailTxt.setLabelText("Email");

        lblCategoryIDConfig3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig3.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig3.setText("Giới tính:");

        genderOption.add(maleOption);
        maleOption.setForeground(new java.awt.Color(255, 255, 255));
        maleOption.setText("Nam");

        genderOption.add(femaleOption);
        femaleOption.setForeground(new java.awt.Color(255, 255, 255));
        femaleOption.setText("Nữ");

        birthdateField.setFocusable(false);
        birthdateField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCategoryIDConfig10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig10.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig10.setText("Ngày sinh:");

        lblCategoryIDConfig9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig9.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig9.setText("Số điện thoại:");

        phoneTxt.setBackground(new java.awt.Color(51, 51, 51));
        phoneTxt.setForeground(new java.awt.Color(255, 255, 255));
        phoneTxt.setLabelText("Số điện thoại");

        lblCategoryIDConfig.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig.setText("Chủ sở hữu:");

        lblCategoryIDConfig8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCategoryIDConfig8.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryIDConfig8.setText("Phân quyền");

        lblCategoryIDConfig6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig6.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig6.setText("Dòng xe:");

        transportationTypeRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vô hiệu", "Chỉ xem", "Chỉnh sửa" }));
        transportationTypeRole.setEnabled(false);

        AccountRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vô hiệu", "Chỉ xem", "Chỉnh sửa" }));
        AccountRole.setEnabled(false);

        lblCategoryIDConfig7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig7.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig7.setText("Phân quyền:");

        transportationRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vô hiệu", "Chỉ xem", "Chỉnh sửa" }));
        transportationRole.setEnabled(false);

        lblCategoryIDConfig5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig5.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig5.setText("Xe:");

        ownerRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vô hiệu", "Chỉ xem", "Chỉnh sửa" }));
        ownerRole.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button5.setBackground(new java.awt.Color(204, 204, 255));
        button5.setBorder(null);
        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/wrench.png"))); // NOI18N
        button5.setText("Cập nhật");
        button5.setToolTipText("");
        button5.setBorderColor(new java.awt.Color(0, 0, 0));
        button5.setColor(new java.awt.Color(204, 204, 255));
        button5.setColorClick(new java.awt.Color(240, 235, 235));
        button5.setColorOver(new java.awt.Color(255, 255, 255));
        button5.setFocusPainted(false);
        button5.setRadius(20);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(204, 204, 255));
        button6.setBorder(null);
        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/refresh.png"))); // NOI18N
        button6.setText("Làm mới");
        button6.setToolTipText("");
        button6.setBorderColor(new java.awt.Color(0, 0, 0));
        button6.setColor(new java.awt.Color(204, 204, 255));
        button6.setColorClick(new java.awt.Color(240, 235, 235));
        button6.setColorOver(new java.awt.Color(255, 255, 255));
        button6.setFocusPainted(false);
        button6.setRadius(20);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel2Layout = new javax.swing.GroupLayout(contentPanel2);
        contentPanel2.setLayout(contentPanel2Layout);
        contentPanel2Layout.setHorizontalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoryIDConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoryIDConfig9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(maleOption)
                                .addGap(18, 18, 18)
                                .addComponent(femaleOption)
                                .addGap(18, 18, 18)
                                .addComponent(lblCategoryIDConfig10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(birthdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPanel2Layout.createSequentialGroup()
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblCategoryIDConfig4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                        .addComponent(lblCategoryIDConfig8, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(lblCategoryIDConfig5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transportationRole, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(lblCategoryIDConfig7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccountRole, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(lblCategoryIDConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ownerRole, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(lblCategoryIDConfig6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transportationTypeRole, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(214, 214, 214))))
        );
        contentPanel2Layout.setVerticalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCategoryIDConfig6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(transportationTypeRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maleOption)
                                .addComponent(femaleOption)
                                .addComponent(lblCategoryIDConfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCategoryIDConfig10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(birthdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownerRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transportationRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        String name = nameTxt.getText();
        String email = emailTxt.getText();
        String gender = genderOption.getSelection()==null?null:maleOption.isSelected()?"Nam":"Nữ";
        Date birthDate = birthdateField.getDate();
        String phone = phoneTxt.getText();
        String phoneRegex = "^(0[0-9]{9}|\\+84[0-9]{9})$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phone);
        if(name.isBlank()||email.isBlank()||gender==null||phone.isBlank()){
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống thông tin");
            return;
        }
        if(birthDate.after(new Date())){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng ngày sinh");
            return;
        }
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(this, "Định dạng số điện thoại 0xxx-xxx-xxx hoặc +84-xxx-xxx-xxx");
            return;
        }
        account.setName(name);
        account.setEmail(email);
        account.setGender(gender);
        account.setBirthDate(birthDate);
        account.setPhone(phone);
        if(accountBUS.updateWithoutChangePassword(account)){
            JOptionPane.showMessageDialog(contentPanel2, "Cập nhật thành công!");
            refresh();
            getAccountDetail(account);
        }else {
            JOptionPane.showMessageDialog(contentPanel2, "Có lỗi xảy ra");
        }

    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
            account = accountBUS.getById(account.getId());
            getAccountDetail(account);
    }//GEN-LAST:event_button6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccountRole;
    private de.wannawork.jcalendar.JCalendarComboBox birthdateField;
    private view.custom.Button button5;
    private view.custom.Button button6;
    private javax.swing.JPanel contentPanel2;
    private view.custom.textField emailTxt;
    private javax.swing.JRadioButton femaleOption;
    private javax.swing.ButtonGroup genderOption;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCategoryIDConfig;
    private javax.swing.JLabel lblCategoryIDConfig1;
    private javax.swing.JLabel lblCategoryIDConfig10;
    private javax.swing.JLabel lblCategoryIDConfig2;
    private javax.swing.JLabel lblCategoryIDConfig3;
    private javax.swing.JLabel lblCategoryIDConfig4;
    private javax.swing.JLabel lblCategoryIDConfig5;
    private javax.swing.JLabel lblCategoryIDConfig6;
    private javax.swing.JLabel lblCategoryIDConfig7;
    private javax.swing.JLabel lblCategoryIDConfig8;
    private javax.swing.JLabel lblCategoryIDConfig9;
    private javax.swing.JRadioButton maleOption;
    private view.custom.textField nameTxt;
    private javax.swing.JComboBox<String> ownerRole;
    private view.custom.textField phoneTxt;
    private javax.swing.JComboBox<String> transportationRole;
    private javax.swing.JComboBox<String> transportationTypeRole;
    // End of variables declaration//GEN-END:variables
}

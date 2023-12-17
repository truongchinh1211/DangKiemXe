/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Layout;

import controllers.AccountBUS;
import controllers.RoleBUS;
import controllers.TransportationTypeBUS;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Account;
import models.Role;
import models.TransportationType;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class AccountGUI extends javax.swing.JPanel {

    private Account account;
    private final AccountBUS accountBUS;
    private final RoleBUS roleBUS;
    private Account selectedAccount;
    private JFrame parentFrame=null;
    /**
     * Creates new form OwnerGUI
     * @param account
     */
    public AccountGUI(Account account) {
        initComponents();
        accountBUS = new AccountBUS();
        roleBUS = new RoleBUS();
        this.account = account;
        SwingUtilities.invokeLater(() -> {
            parentFrame = (MainLayout) SwingUtilities.getWindowAncestor(this);
        });
        System.out.println(parentFrame==null);
        getAccountsData();
        refresh();
    }
    public void getRoleOption(){
        Vector Items = new Vector();
        List<Role> roles = roleBUS.getAll();
        for(Role role: roles)
            Items.add(role.getRoleName());
        roleOption.setModel(new DefaultComboBoxModel(Items));
    }
    public void getAccountsData(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Account> accounts = accountBUS.getAll();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int i=0;
        for(Account account:accounts){
            Object[] row = new Object[]{++i,account.getUsername(),dateFormat.format(account.getCreatedDate()),account.getRole().getRoleName(),account.getId()};
            model.addRow(row);
        }
    }
    public void getAccountDetail(Account account){
        refresh();
        if(account!=null){
            nameTxt.setText(account.getName());
            emailTxt.setText(account.getEmail());
            if(account.getGender().equals("Nam"))
                maleOption.setSelected(true);
            else 
                femaleOption.setSelected(true);
            phoneTxt.setText(account.getPhone());
            addressTxt.setText(account.getAddress());
            usernameTxt.setText(account.getUsername());
            birthdateField.setDate(account.getBirthDate());
            roleOption.setSelectedItem(account.getRole().getRoleName());
        }
    }
    public void refresh(){
        getRoleOption();
        nameTxt.setText("");
        emailTxt.setText("");
        genderOption.clearSelection();
        phoneTxt.setText("");
        addressTxt.setText("");
        usernameTxt.setText("");
        passwordField.setText("");
    }
    public boolean validateField(){
        String name = nameTxt.getText();
        String username = usernameTxt.getText();
        String password = passwordField.getText();
        String email = emailTxt.getText();
        String gender = genderOption.getSelection()==null?null:maleOption.isSelected()?"Nam":"Nữ";
        Date birthDate = birthdateField.getDate();
        String phone = phoneTxt.getText();
        String address = addressTxt.getText();
        String phoneRegex = "^(0[0-9]{9}|\\+84[0-9]{9})$";
        String passwordRegex = "^.{6,}$";
        String usernameRegex = "^(?!\\d+$)(?![-_]+$)[A-Za-z0-9-_]{5,30}$";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if(name.isBlank()||username.isBlank()||gender==null||phone.isBlank()||email.isBlank()||address.isBlank()){
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống thông tin");
            return false;
        }
        if(!Pattern.compile(emailRegex).matcher(email).matches()){
            JOptionPane.showMessageDialog(this, "Sai định dạng email");
            return false;
        }
        if(birthDate.after(new Date())){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng ngày sinh");
            return false;
        }
        if(!Pattern.compile(phoneRegex).matcher(phone).matches()){
            JOptionPane.showMessageDialog(this, "Định dạng số điện thoại 0xxx-xxx-xxx hoặc +84-xxx-xxx-xxx");
            return false;
        }
        if(!Pattern.compile(usernameRegex).matcher(username).matches()){
            JOptionPane.showMessageDialog(this, "tên đăng nhập chứa từ 5-30 ký tự, không chứa ký tự đặc biệt");
            return false;
        }
        if(!password.isBlank())
            if(!Pattern.compile(passwordRegex).matcher(password).matches()){
            JOptionPane.showMessageDialog(this, "password tối thiểu 6 ký tự");
            return false;
        }
        
        return true;
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
        roundPanel3 = new view.custom.RoundPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        nameTxt = new view.custom.textField();
        lblCategoryIDConfig1 = new javax.swing.JLabel();
        emailTxt = new view.custom.textField();
        lblCategoryIDConfig2 = new javax.swing.JLabel();
        maleOption = new javax.swing.JRadioButton();
        femaleOption = new javax.swing.JRadioButton();
        lblCategoryIDConfig3 = new javax.swing.JLabel();
        lblCategoryIDConfig4 = new javax.swing.JLabel();
        lblCategoryIDConfig9 = new javax.swing.JLabel();
        phoneTxt = new view.custom.textField();
        lblCategoryIDConfig10 = new javax.swing.JLabel();
        birthdateField = new de.wannawork.jcalendar.JCalendarComboBox();
        button6 = new view.custom.Button();
        button5 = new view.custom.Button();
        jSeparator1 = new javax.swing.JSeparator();
        button4 = new view.custom.Button();
        lblCategoryIDConfig12 = new javax.swing.JLabel();
        addressTxt = new view.custom.textField();
        roundPanel1 = new view.custom.RoundPanel();
        button3 = new view.custom.Button();
        searchTxt = new view.custom.textField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblCategoryIDConfig13 = new javax.swing.JLabel();
        lblCategoryIDConfig14 = new javax.swing.JLabel();
        usernameTxt = new view.custom.textField();
        lblCategoryIDConfig15 = new javax.swing.JLabel();
        passwordField = new view.custom.passwordField();
        lblCategoryIDConfig5 = new javax.swing.JLabel();
        roleOption = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1266, 550));

        contentPanel2.setBackground(new java.awt.Color(51, 51, 51));
        contentPanel2.setPreferredSize(new java.awt.Dimension(1266, 550));
        contentPanel2.setVerifyInputWhenFocusTarget(false);

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "username", "Ngày khởi tạo", "Vai trò", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(10);
            table.getColumnModel().getColumn(4).setMinWidth(0);
            table.getColumnModel().getColumn(4).setPreferredWidth(0);
            table.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nameTxt.setBackground(new java.awt.Color(51, 51, 51));
        nameTxt.setForeground(new java.awt.Color(255, 255, 255));
        nameTxt.setLabelText("Họ và tên");

        lblCategoryIDConfig1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig1.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig1.setText("Email:");

        emailTxt.setBackground(new java.awt.Color(51, 51, 51));
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));
        emailTxt.setLabelText("Email");

        lblCategoryIDConfig2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig2.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig2.setText("Họ tên:");

        genderOption.add(maleOption);
        maleOption.setForeground(new java.awt.Color(255, 255, 255));
        maleOption.setText("Nam");

        genderOption.add(femaleOption);
        femaleOption.setForeground(new java.awt.Color(255, 255, 255));
        femaleOption.setText("Nữ");

        lblCategoryIDConfig3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig3.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig3.setText("Giới tính:");

        lblCategoryIDConfig4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCategoryIDConfig4.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryIDConfig4.setText("Thông tin cơ bản");

        lblCategoryIDConfig9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig9.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig9.setText("Số điện thoại:");

        phoneTxt.setBackground(new java.awt.Color(51, 51, 51));
        phoneTxt.setForeground(new java.awt.Color(255, 255, 255));
        phoneTxt.setLabelText("Số điện thoại");

        lblCategoryIDConfig10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig10.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig10.setText("Ngày sinh:");

        birthdateField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        button4.setBackground(new java.awt.Color(204, 204, 255));
        button4.setBorder(null);
        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/plus.png"))); // NOI18N
        button4.setText("Thêm");
        button4.setToolTipText("");
        button4.setBorderColor(new java.awt.Color(0, 0, 0));
        button4.setColor(new java.awt.Color(204, 204, 255));
        button4.setColorClick(new java.awt.Color(240, 235, 235));
        button4.setColorOver(new java.awt.Color(255, 255, 255));
        button4.setFocusPainted(false);
        button4.setRadius(20);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        lblCategoryIDConfig12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig12.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig12.setText("Địa chỉ: ");

        addressTxt.setBackground(new java.awt.Color(51, 51, 51));
        addressTxt.setForeground(new java.awt.Color(255, 255, 255));
        addressTxt.setLabelText("Địa chỉ");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/search.png"))); // NOI18N
        button3.setText("Tìm kiếm");
        button3.setRadius(5);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        searchTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchTxt.setLabelText("Tìm kiếm");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "username", "tên nhân viên" }));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1)
                        .addGap(2, 2, 2))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        lblCategoryIDConfig13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCategoryIDConfig13.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoryIDConfig13.setText("Tài khoản");

        lblCategoryIDConfig14.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig14.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig14.setText("Tên đăng nhập:");

        usernameTxt.setBackground(new java.awt.Color(51, 51, 51));
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxt.setLabelText("Username");

        lblCategoryIDConfig15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig15.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig15.setText("Mật khẩu: ");

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setLabelText("Mật khẩu");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        lblCategoryIDConfig5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCategoryIDConfig5.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoryIDConfig5.setText("Vai trò:");

        roleOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout contentPanel2Layout = new javax.swing.GroupLayout(contentPanel2);
        contentPanel2.setLayout(contentPanel2Layout);
        contentPanel2Layout.setHorizontalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoryIDConfig14, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategoryIDConfig13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanel2Layout.createSequentialGroup()
                                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoryIDConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoryIDConfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblCategoryIDConfig4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanel2Layout.createSequentialGroup()
                                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoryIDConfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoryIDConfig9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(maleOption)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleOption)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCategoryIDConfig10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(birthdateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblCategoryIDConfig5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(roleOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanel2Layout.createSequentialGroup()
                                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCategoryIDConfig12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 92, Short.MAX_VALUE)))
                        .addGap(94, 94, 94))))
        );
        contentPanel2Layout.setVerticalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblCategoryIDConfig4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maleOption)
                                .addComponent(femaleOption)
                                .addComponent(lblCategoryIDConfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCategoryIDConfig10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(birthdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleOption, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCategoryIDConfig13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDConfig14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoryIDConfig15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        String keyword = searchTxt.getText();
        List<Account> accounts = accountBUS.getAll();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Account account: accounts){
            Object row[] = new Object[]{account.getName()};
            model.addRow(row);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if(accountBUS.getById(account.getId()).getRole().getOwnerManager()!=2){
            JOptionPane.showMessageDialog(contentPanel2, "Bạn không có quyền thao tác");
            return;
        }
        try{
            
            if(!validateField())
                return;
            String password = passwordField.getText();
            if(password.isBlank()){
                JOptionPane.showMessageDialog(parentFrame, "Không được để trống mật khẩu");
                return;  
            }
            String username = usernameTxt.getText();    
            String email = emailTxt.getText();
            String roleName= roleOption.getSelectedItem().toString();
            String name = nameTxt.getText();
            String gender = genderOption.getSelection()==null?null:maleOption.isSelected()?"Nam":"Nữ";
            String address = addressTxt.getText();
            String phone = phoneTxt.getText();
            Date birthday = birthdateField.getDate();
            Role role = roleBUS.getByName(roleName);
            if(role==null){
                JOptionPane.showMessageDialog(parentFrame, "dữ liệu của lựa chọn vai trò có thể đã bị thay đổi! tiến hành tải lại..");
                refresh();
                return;
            }
            
            Account createAccount = new Account(name, username, password, role, email, birthday, gender, phone, address);
            if(accountBUS.save(createAccount)){
                JOptionPane.showMessageDialog(contentPanel2, "Thêm thành công!!");
                refresh();
            }else{
                JOptionPane.showMessageDialog(contentPanel2, "Thêm thất bại!!Hãy chắc chắn username chưa đựọc sử dụng");
            }
            getAccountsData();

        }catch(Exception e){

        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if(accountBUS.getById(account.getId()).getRole().getAccountManager()!=2){
            JOptionPane.showMessageDialog(contentPanel2, "Bạn không có quyền thao tác");
            return;
        }
        if(selectedAccount==null){
            JOptionPane.showMessageDialog(contentPanel2, "Vui lòng chọn một đối tượng thể thao tác");
            return;
        }
        if(!validateField())
            return;
        String username = usernameTxt.getText();    
        String email = emailTxt.getText();
        String roleName= roleOption.getSelectedItem().toString();
        String name = nameTxt.getText();
        String gender = genderOption.getSelection()==null?null:maleOption.isSelected()?"Nam":"Nữ";
        String address = addressTxt.getText();
        String phone = phoneTxt.getText();
        Date birthday = birthdateField.getDate();
        String password = passwordField.getText();
        Role role = roleBUS.getByName(roleName);
        if(role==null){
            JOptionPane.showMessageDialog(parentFrame, "dữ liệu của lựa chọn vai trò có thể đã bị thay đổi! tiến hành tải lại..");
            refresh();
            return;
        }
        selectedAccount.setUsername(username);
        selectedAccount.setName(name);
        selectedAccount.setEmail(email);
        selectedAccount.setBirthDate(birthday);
        selectedAccount.setGender(gender);
        selectedAccount.setPhone(phone);
        selectedAccount.setAddress(address);
        selectedAccount.setRole(role);
        int flag = 0;
        if(password.isBlank()){
            if(accountBUS.updateWithoutChangePassword(selectedAccount))
                flag =1; 
        }
        else {
            int result = JOptionPane.showConfirmDialog(parentFrame, "Hành động này sẽ cập nhật lại mật khẩu mới, bạn chắc chắn chứ?");
            if(result == JOptionPane.YES_OPTION){
                selectedAccount.setPassword(password);
                if(accountBUS.save(selectedAccount))
                    flag =1 ;
            }
        }
        
        if(flag ==1 ){
            JOptionPane.showMessageDialog(contentPanel2, "Cập nhật thành công!");
                refresh();
                selectedAccount=null;
                getAccountsData();
        }else {
            JOptionPane.showMessageDialog(contentPanel2, "Có lỗi xảy ra");
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
                if(selectedAccount!=null)
                    getAccountDetail(selectedAccount);
                else
                JOptionPane.showMessageDialog(contentPanel2, "Vui lòng chọn một đối tượng để thao táo");
    }//GEN-LAST:event_button6ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            String idString = table.getValueAt(row, 4).toString();
            ObjectId id = new ObjectId(idString);
            selectedAccount = accountBUS.getById(id);
            if(selectedAccount==null){
                JOptionPane.showMessageDialog(contentPanel2, "Có lỗi xảy ra!! tiến hành tải lại trang...");
                refresh();
                getAccountsData();
                return;
            }
            getAccountDetail(selectedAccount);
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.custom.textField addressTxt;
    private de.wannawork.jcalendar.JCalendarComboBox birthdateField;
    private view.custom.Button button3;
    private view.custom.Button button4;
    private view.custom.Button button5;
    private view.custom.Button button6;
    private javax.swing.JPanel contentPanel2;
    private view.custom.textField emailTxt;
    private javax.swing.JRadioButton femaleOption;
    private javax.swing.ButtonGroup genderOption;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoryIDConfig1;
    private javax.swing.JLabel lblCategoryIDConfig10;
    private javax.swing.JLabel lblCategoryIDConfig12;
    private javax.swing.JLabel lblCategoryIDConfig13;
    private javax.swing.JLabel lblCategoryIDConfig14;
    private javax.swing.JLabel lblCategoryIDConfig15;
    private javax.swing.JLabel lblCategoryIDConfig2;
    private javax.swing.JLabel lblCategoryIDConfig3;
    private javax.swing.JLabel lblCategoryIDConfig4;
    private javax.swing.JLabel lblCategoryIDConfig5;
    private javax.swing.JLabel lblCategoryIDConfig9;
    private javax.swing.JRadioButton maleOption;
    private view.custom.textField nameTxt;
    private view.custom.passwordField passwordField;
    private view.custom.textField phoneTxt;
    private javax.swing.JComboBox<String> roleOption;
    private view.custom.RoundPanel roundPanel1;
    private view.custom.RoundPanel roundPanel3;
    private view.custom.textField searchTxt;
    private javax.swing.JTable table;
    private view.custom.textField usernameTxt;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeder;

import controllers.AccountBUS;
import controllers.RoleBUS;
import java.util.Date;
import models.Account;
import models.Role;

/**
 *
 * @author Son
 */
public class createAdminAccount {
    
    public static void main(String[] args) {
        AccountBUS accountBUS = new AccountBUS();
        RoleBUS roleBUS = new RoleBUS();
        Role role = new Role("admin",2,2,2,2);
        roleBUS.save(role);
        Account account = new Account("admin", "admin", "admin", role, "example@gmail.com", new Date(),"Nam","0862863753","a");
        if(accountBUS.save(account)){
            System.out.println("Tài khoản: admin");
            System.out.println("Mật khẩu: admin");
        }
    }
}

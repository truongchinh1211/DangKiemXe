/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeder;

import controllers.AccountBUS;
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
        Role role = new Role(2,2,2,2);
        Account account = new Account("admin","admin","admin",role,"example@gmail.com","Nam","0862863753",new Date(),true);
        if(accountBUS.save(account)){
            System.out.println("Tài khoản: admin");
            System.out.println("Mật khẩu: admin");
        }
    }
}

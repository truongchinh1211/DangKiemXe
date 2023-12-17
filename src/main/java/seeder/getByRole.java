/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeder;

import controllers.AccountBUS;
import controllers.RoleBUS;
import java.util.List;
import models.Account;
import models.Role;

/**
 *
 * @author Bum
 */
public class getByRole {
    public static void main(String[] args) {
        AccountBUS accountBUS = new AccountBUS();
        RoleBUS roleBUS = new RoleBUS();
        Role role = roleBUS.getAll().get(0);
        System.out.println(role.getRoleName());
        List<Account> accounts = accountBUS.getByRole(role.getId());
        if(!accounts.isEmpty()){
            System.out.println("error");
        }
    }
}

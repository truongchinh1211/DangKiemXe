/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.AccountDAO;
import java.util.List;
import models.Account;
import org.bson.types.ObjectId;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Son
 */
public class AccountBUS {
    private final AccountDAO accountDAO;
    public AccountBUS(){
        accountDAO = new AccountDAO();
    }
    public List<Account> getAll(){
        try{
            return accountDAO.getAll();
        }catch(Exception e){
            return null;
        }
    }
    public Account getById(ObjectId id){
        try{
            return accountDAO.getById(id);
        }catch(Exception e){
            return null;
        }
    }
    public Account login(String username,String password){
        try{
            Account account = accountDAO.getByUsername(username);
            if(account==null){
                return null;
            }
            if(!BCrypt.checkpw(password, account.getPassword())){
                return null;
            }
            return account;
        }catch(Exception e){
            return null;
        }
        
    }
    public boolean save(Account account){
        try{
            if(accountDAO.getByUsername(account.getUsername())!=null)
                return false;
            account.setPassword(BCrypt.hashpw(account.getPassword(), BCrypt.gensalt()));
            accountDAO.save(account);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean updateWithoutChangePassword(Account account){
        try{
            if(accountDAO.getByUsername(account.getUsername())!=null)
                return false;
            accountDAO.save(account);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean delete(Account account){
        try{
            accountDAO.delete(account);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

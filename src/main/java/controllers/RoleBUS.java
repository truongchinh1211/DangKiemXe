/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.RoleDAO;
import java.util.List;
import models.Account;
import models.Role;

import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class RoleBUS {
    private final RoleDAO roleDAO;
    public RoleBUS(){
        roleDAO = new RoleDAO();
    }
    public List<Role> getAll(){
        return roleDAO.getAll();
    }
    public Role getById(ObjectId id){
        try{
            return roleDAO.getById(id);
        }catch(Exception e){
            return null;
        }
    }
    public Role getByName(String name){
        try{
            return roleDAO.getByName(name);
        }catch(Exception e){
            return null;
        }
    }
    public Role getByNameExcludeId(String name,ObjectId excludeId){
        try{
            return roleDAO.getByNameExcludeId(name,excludeId);
        }catch(Exception e){
            return null;
        }
    }
    public List<Role> getByNameKeyword(String keyword){
        try{
            return roleDAO.getByNameKeyword(keyword);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean save(Role role){
        try{
            if(getByNameExcludeId(role.getRoleName(),role.getId())!=null)
                return false;
            roleDAO.save(role);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean delete(Role role){
        try{
            AccountBUS accountBUS = new AccountBUS();
            List<Account> accounts = accountBUS.getByRole(role.getId());
            if(!accounts.isEmpty())
                return false;
            roleDAO.delete(role);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}

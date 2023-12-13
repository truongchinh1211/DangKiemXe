/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.OwnerDAO;
import java.util.List;
import models.DriverLicense;
import models.Owner;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class OwnerBUS {
    private final OwnerDAO ownerDAO;
    public OwnerBUS(){
        ownerDAO = new OwnerDAO();
    }
    public Owner getByCmnd(String cmnd){
        try{
            return ownerDAO.getByCmnd(cmnd);
        }catch(Exception e){
            return null;
        }
    }
    public Owner getById(ObjectId id){
        try{
            return ownerDAO.getById(id);
        }catch(Exception e){
            return null;
        }
    }
    public List<Owner> getByCmndKeyword(String cmnd){
       try{
            return ownerDAO.getByCmndKeyword(cmnd);
        }catch(Exception e){
            return null;
        } 
    }
    public List<Owner> getAll(){
        try{
            return ownerDAO.getAll();
        }catch(Exception e){
            return null;
        }
    }

    public boolean save(Owner owner){
        try{
        if(ownerDAO.getByCmndAndNotId(owner.getCmnd(),owner.getId())==null){
            ownerDAO.save(owner);
            return true;
            }
            return false;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean delete(Owner owner){
        try{
            if(getByCmnd(owner.getCmnd())!=null){
                ownerDAO.delete(owner);
                return true;
            }
            return false;
        }catch(Exception e){
            return false;
        }
    }
    public boolean saveDriverLicense(Owner owner, DriverLicense updatedDriverLicense){
        try{
        if(ownerDAO.getByDriverLicenseIdAndNotId(updatedDriverLicense.getId(), owner.getId())==null){
            owner.setDriverLicense(updatedDriverLicense);
            ownerDAO.save(owner);
            return true;
        }
        }catch(Exception e){
                return false;
                }
        return false;
    }
}

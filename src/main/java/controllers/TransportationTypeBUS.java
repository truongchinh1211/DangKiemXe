/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.TransportationDAO;
import DAO.TransportationTypeDAO;
import java.util.List;
import models.Transportation;
import models.TransportationType;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class TransportationTypeBUS {
    private final TransportationTypeDAO transportationTypeDAO;
    public TransportationTypeBUS(){
        transportationTypeDAO = new TransportationTypeDAO();
    }
    public List<TransportationType> getAll(){
        try{
            return transportationTypeDAO.getAll();
        }catch(Exception e){
            return null;
        }
    }
    public TransportationType getById(ObjectId id){
        try{
            return transportationTypeDAO.getById(id);
        }catch (Exception e){
            return null;
        }
    }
    public TransportationType getByName(String name){
        try{
            return transportationTypeDAO.getByName(name);
        }catch (Exception e){
            return null;
        }
    }
    public List<TransportationType> getByNameKeyword(String keyword){
        try{
            return transportationTypeDAO.getByNameKeyword(keyword);
        }catch(Exception e){
            return null;
        }
    }
    public boolean save(TransportationType transportationType){
        try{
            transportationTypeDAO.save(transportationType);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean delete(TransportationType transportationType){
        try{
            TransportationDAO transportationDAO = new TransportationDAO();
            List<Transportation> transportations =  transportationDAO.getByType(transportationType.getId());
            if(transportations.isEmpty())
                return false;
            transportationTypeDAO.Delete(transportationType);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

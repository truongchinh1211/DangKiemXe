/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.TransportationDAO;
import java.util.List;
import models.Transportation;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class TransportationBUS {
    private final TransportationDAO transportationDAO;
    public TransportationBUS(){
        transportationDAO = new TransportationDAO();
    }
    public List<Transportation> getAll(){
        return transportationDAO.getAll();
    }
    public Transportation getById(ObjectId id){
        try{
            return transportationDAO.getById(id);
        }catch(Exception e){
            return null;
        }
    }
    public List<Transportation> getByNameKeyword(String keyword){
        try{
            return transportationDAO.getByNameKeyword(keyword);
        }catch(Exception e){
            return null;
        }
    }
    public boolean save(Transportation transportation){
        try{
            transportationDAO.save(transportation);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean delete(Transportation transportation){
        try{
            transportationDAO.delete(transportation);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

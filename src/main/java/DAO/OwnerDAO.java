/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import config.MongoConnection;
import dev.morphia.Datastore;
import dev.morphia.DeleteOptions;
import dev.morphia.query.Criteria;
import dev.morphia.query.CriteriaContainerImpl;
import dev.morphia.query.Query;
import dev.morphia.query.QueryFactory;
import dev.morphia.query.experimental.filters.Filters;
import models.Owner;

import java.util.List;
import java.util.regex.Pattern;
import models.DriverLicense;
import org.bson.types.ObjectId;

public class OwnerDAO {

    private final Datastore datastore;

    public OwnerDAO() {
        this.datastore = MongoConnection.getInstance().getDatastore();
    }

    // Create (Insert) Operation
    public void save(Owner owner) throws Exception{
        datastore.save(owner);
    }

    // Read (Retrieve) Operations
    public Owner getByCmnd(String cmnd)throws Exception {
        return datastore.find(Owner.class)
            .filter(Filters.eq(Owner.CMND_FIELD, cmnd))
            .first();
    }
    public Owner getById(ObjectId id)throws Exception {
        return datastore.find(Owner.class)
            .filter(Filters.eq("_id", id))
            .first();
    }
    public Owner getByCmndAndNotId(String cmnd, ObjectId excludeId) throws Exception {
        return datastore.find(Owner.class)
                .filter(Filters.eq(Owner.CMND_FIELD, cmnd))
                .filter(Filters.ne("_id", excludeId))  // Sử dụng ne() để kiểm tra ObjectId khác excludeId
                .first();
    }
    public Owner getByDriverLicenseIdAndNotId(String driverLicenseId, ObjectId excludeId) throws Exception {
        return datastore.find(Owner.class)
                .filter(Filters.exists(Owner.DRIVER_LICENSE_FIELD))
                .filter(Filters.eq(Owner.DRIVER_LICENSE_FIELD+"."+DriverLicense.ID_FIELD, driverLicenseId))
                .filter(Filters.ne("_id", excludeId))  // Sử dụng ne() để kiểm tra ObjectId khác excludeId
                .first();

    }
    public List<Owner> getByCmndKeyword(String cmnd){
        String regexPattern = ".*" + Pattern.quote(cmnd) + ".*";
        return datastore.find(Owner.class)
        .filter(Owner.CMND_FIELD,Pattern.compile(regexPattern)).iterator().toList();
        
    }

    public List<Owner> getAll() throws Exception {
        return datastore.find(Owner.class).iterator().toList();
    }

    // Delete Operation
    public void delete(Owner owner) throws Exception {
        datastore.delete(owner,new DeleteOptions()
                .multi(true));
    }
}
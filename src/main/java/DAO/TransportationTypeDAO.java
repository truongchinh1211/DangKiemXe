/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.MongoConnection;
import dev.morphia.Datastore;
import dev.morphia.DeleteOptions;
import dev.morphia.query.experimental.filters.Filters;
import java.util.List;
import java.util.regex.Pattern;
import models.Transportation;
import models.TransportationType;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class TransportationTypeDAO {
    private final Datastore datastore;
    public TransportationTypeDAO(){
        this.datastore = MongoConnection.getInstance().getDatastore();
    }
    public void save(TransportationType transportationType) throws Exception{
        datastore.save(transportationType);
    }
    public List<TransportationType> getAll() throws Exception{
        return datastore.find(TransportationType.class).iterator().toList();
    }
    public TransportationType getById(ObjectId id) throws Exception {
        return datastore.find(TransportationType.class)
            .filter(Filters.eq("_id", id))
            .first();
    }
    public List<TransportationType> getByNameKeyword(String keyword) throws Exception{
        String regexPattern = ".*" + Pattern.quote(keyword) + ".*";
        return datastore.find(TransportationType.class)
        .filter(TransportationType.NAME_FIELD,Pattern.compile(regexPattern)).iterator().toList();
    }
     public TransportationType getByName(String name) throws Exception {
        return datastore.find(TransportationType.class)
            .filter(Filters.eq(TransportationType.NAME_FIELD,name))
            .first();
    }
    public void Delete(TransportationType transportationType) throws Exception{
        datastore.delete(transportationType,new DeleteOptions()
                .multi(true));
    }
}

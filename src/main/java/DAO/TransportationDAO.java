/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mongodb.diagnostics.logging.Logger;
import config.MongoConnection;
import dev.morphia.Datastore;
import dev.morphia.query.experimental.filters.Filters;
import java.util.List;
import java.util.regex.Pattern;
import models.Owner;
import models.Transportation;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class TransportationDAO {
    private final Datastore datastore;
    public TransportationDAO(){
        this.datastore = MongoConnection.getInstance().getDatastore();
    }
    public List<Transportation> getAll(){
        return datastore.find(Transportation.class).iterator().toList();
    }
    public Transportation getById(ObjectId id) throws Exception {
        return datastore.find(Transportation.class)
            .filter(Filters.eq("_id", id))
            .first();
    }
    public List<Transportation> getByNameKeyword(String keyword) throws Exception{
        String regexPattern = ".*" + Pattern.quote(keyword) + ".*";
        return datastore.find(Transportation.class)
        .filter(Transportation.NAME_FIELD,Pattern.compile(regexPattern)).iterator().toList();
    }
    public List<Transportation> getByOwnerCMNDKeyword(String keyword) throws Exception{
        String regexPattern = ".*" + Pattern.quote(keyword) + ".*";
        return datastore.find(Transportation.class)
        .field(Transportation.OWNER_FIELD).containsIgnoreCase(keyword).iterator().toList();
    }
    public void save(Transportation transportation) throws Exception{
        datastore.save(transportation);
    }
    public void delete(Transportation transportation) throws Exception{
        datastore.delete(transportation);
    }
}

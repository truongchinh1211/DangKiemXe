/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.MongoConnection;
import dev.morphia.Datastore;
import dev.morphia.query.experimental.filters.Filters;
import java.util.List;
import java.util.regex.Pattern;
import models.Role;
import models.Transportation;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class RoleDAO {
    private final Datastore datastore;
    public RoleDAO(){
        this.datastore = MongoConnection.getInstance().getDatastore();
    }
    public List<Role> getAll(){
        return datastore.find(Role.class).iterator().toList();
    }
    public Role getById(ObjectId id) throws Exception {
        return datastore.find(Role.class)
            .filter(Filters.eq("_id", id))
            .first();
    }
    
    public Role getByName(String name) throws Exception {
        return datastore.find(Role.class)
            .filter(Filters.eq(Role.NAME_FIELD,name))
            .first();
    }
    public Role getByNameExcludeId(String name,ObjectId excludeId) throws Exception {
        return datastore.find(Role.class)
            .filter(Filters.eq(Role.NAME_FIELD,name))
            .filter(Filters.ne("_id", excludeId))
            .first();
    }
    public List<Role> getByNameKeyword(String keyword) throws Exception{
        String regexPattern = ".*" + Pattern.quote(keyword) + ".*";
        return datastore.find(Role.class)
        .field(Role.NAME_FIELD).containsIgnoreCase(keyword).iterator().toList();
    }
    public void save(Role role) throws Exception{
        datastore.save(role);
    }
    public void delete(Role role) throws Exception{
        datastore.delete(role);
    }
}

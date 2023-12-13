/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.MongoConnection;
import dev.morphia.Datastore;
import dev.morphia.query.experimental.filters.Filters;
import java.util.List;
import models.Account;
import models.Owner;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
public class AccountDAO {
    private final Datastore datastore;

    public AccountDAO() {
        this.datastore = MongoConnection.getInstance().getDatastore();
    }
    public List<Account> getAll()throws Exception{
        return datastore.find(Account.class).iterator().toList();
    }
    public Account getById(ObjectId id) throws Exception{
        return datastore.find(Account.class)
            .filter(Filters.eq("_id", id))
            .first();
    }
    public Account getByUsername(String username)throws Exception{
        return datastore.find(Account.class)
                .filter(Filters.eq(Account.USERNAME_FIELD, username))
                .first();
    }
    public void save(Account account)throws Exception{
        datastore.save(account);
    }
    public void delete(Account account)throws Exception{
        datastore.delete(account);
    }
}

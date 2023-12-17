/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dev.morphia.annotations.Embedded;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import static models.Owner.FULL_NAME_FIELD;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity("Vai_tro")
public class Role {
    public static final String NAME_FIELD = "ten vai tro";
    public static final String OWNER_MANAGER_FIELD = "quan ly chu so huu";
    public static final String TRANSPORTATION_MANAGER_FIELD = "quan ly xe";
    public static final String TRANSPORTATION_TYPE_MANAGER_FIELD = "quan ly dong xe";
    public static final String ACCOUNT_MANAGER_FIELD = "quan ly tai khoan";

    @Id
    private ObjectId id;
    @Property(NAME_FIELD)
    private String roleName;
    @Property(OWNER_MANAGER_FIELD)
    private int ownerManager;
    @Property(TRANSPORTATION_MANAGER_FIELD)
    private int transportationManager;
    @Property(TRANSPORTATION_TYPE_MANAGER_FIELD)
    private int transportationTypeManager;
    @Property(ACCOUNT_MANAGER_FIELD)
    private int AccountManager;

    public Role(String roleName, int ownerManager, int transportationManager, int transportationTypeManager, int AccountManager) {
        this.roleName = roleName;
        this.ownerManager = ownerManager;
        this.transportationManager = transportationManager;
        this.transportationTypeManager = transportationTypeManager;
        this.AccountManager = AccountManager;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;
import java.time.Year;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity("xe")  
public class Transportation {
    
    public static final String NAME_FIELD = "ten";
    public static final String TYPE_FIELD = "ngay sinh";
    public static final String CREATED_YEAR_FIELD = "nam san xuat";
    public static final String LICENSE_PLATE_FIELD = "bien so";
    public static final String OWNER_FIELD = "chu so huu";
    public static final String DECRIPTION_FIELD = "thong tin them";

    
    @Id
    private ObjectId id;
    
    @Property(NAME_FIELD)
    private String name;
    
    @Reference
    private TransportationType transportationType;
    
    @Property(CREATED_YEAR_FIELD)
    private int year;
    
    @Property(LICENSE_PLATE_FIELD)
    private String licensePlate;
    
    @Property(OWNER_FIELD)
    private String owner;
    
    @Property(DECRIPTION_FIELD)
    private String decription;

    public Transportation(String name, TransportationType transportationType, int year, String licensePlate, String owner, String decription) {
        this.name = name;
        this.transportationType = transportationType;
        this.year = year;
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.decription = decription;
    }
    
    
}

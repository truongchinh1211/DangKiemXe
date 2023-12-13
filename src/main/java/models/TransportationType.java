/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
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
@Entity("dong_xe")  
public class TransportationType {

    public static final String NAME_FIELD = "ten";
    public static final String BRAND_FIELD = "ngay sinh";
    public static final String TYPE_FIELD = "giay phep lai ";

    
    @Id
    private ObjectId id;
    
    @Property(NAME_FIELD)
    private String name;
    
    @Property(BRAND_FIELD)
    private String brand;
    
    @Property(TYPE_FIELD)
    private String type;

    public TransportationType(String name, String brand, String type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }
    
    
}

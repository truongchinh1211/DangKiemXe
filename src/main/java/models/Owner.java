/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.Document;
import org.bson.types.ObjectId;



/**
 *
 * @author Son
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity("chu_so_huu")  
public class Owner{
    public static final String CMND_FIELD = "cmnd";
    public static final String FULL_NAME_FIELD = "ten";
    public static final String BIRTHDAY_FIELD = "ngay sinh";
    public static final String DRIVER_LICENSE_FIELD = "giay phep lai ";
    public static final String ADDRESS_FIELD = "dia chi";
    public static final String PHONE_NUMBER_FIELD = "sdt";
    public static final String GENDER_FIELD = "gioi tinh";
    
    @Id
    private ObjectId id;
    
    @Property(FULL_NAME_FIELD)
    private String fullName;
    
    @Property(BIRTHDAY_FIELD)
    private Date birthday;
    
    @Property(CMND_FIELD)
    private String cmnd;
    
    @Property(DRIVER_LICENSE_FIELD)
    private DriverLicense driverLicense;
    
    @Property(ADDRESS_FIELD)
    private String address;
    
    @Property(PHONE_NUMBER_FIELD)
    private String phoneNumber;
    
    @Property(GENDER_FIELD)
    private String gender;

    // Constructors, getters, setters

    public Owner(String fullName, Date birthday, String cmnd, String address, String phoneNumber, String gender) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


}


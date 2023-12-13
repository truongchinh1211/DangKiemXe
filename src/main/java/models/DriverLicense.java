/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dev.morphia.annotations.Embedded;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Son
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embedded 
public class DriverLicense {
    
    public static final String ID_FIELD = "so";
    public static final String HANG_FIELD = "Hang";
    public static final String DATE_FIELD = "ngay cap";
    public static final String ADDRESS_FIELD = "noi cap";
    
    
    @Property(ID_FIELD)
    private String Id;
    
    @Property(HANG_FIELD)
    private String hang;
    
    @Property(DATE_FIELD)
    private Date createdDate;
    @Property(ADDRESS_FIELD)
    
    private String address;
}

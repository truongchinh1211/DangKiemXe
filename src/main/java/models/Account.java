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
import org.bson.types.ObjectId;

/**
 *
 * @author Son
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity("tai_khoan") 
public class Account {
    public static final String NAME_FIELD = "ho va ten";
    public static final String USERNAME_FIELD = "ten dang nhap";
    public static final String PASSWORD_FIELD = "mat khau";
    public static final String EMAIL_FIELD = "email";
    public static final String GENDER_FIELD = "gioi tinh";
    public static final String CREATED_DATE_FIELD = "ngay khoi tao";
    public static final String BIRTHDATE_FIELD = "ngay sinh";
    public static final String PHONE_FIELD = "sdt";
    public static final String ADDRESS_FIELD = "dia chi";
    @Id
    private ObjectId id;
    
    @Property(NAME_FIELD)
    private String name;
    
    @Property(USERNAME_FIELD)
    private String username;
    
    @Property(PASSWORD_FIELD)
    private String password;
    
    @Reference
    private Role role;
    
    @Property(EMAIL_FIELD)
    private String email;
    
    @Property(CREATED_DATE_FIELD)
    private Date createdDate;
    
    @Property(BIRTHDATE_FIELD)
    private Date birthDate;
    
    @Property(GENDER_FIELD)
    private String gender;
    
    @Property(PHONE_FIELD)
    private String phone;
    
    @Property(ADDRESS_FIELD)
    private String address;

    public Account(String name, String username, String password, Role role, String email,Date birthDate, String gender, String phone, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.createdDate = new Date();
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }


}

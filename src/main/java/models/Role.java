/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import dev.morphia.annotations.Embedded;
import dev.morphia.annotations.Entity;
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
@Embedded
public class Role {
    private int ownerManager;
    private int transportationManager;
    private int transportationTypeManager;
    private int AccountManager;
}

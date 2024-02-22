package com.example.minecraftapi.Model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

// The class is a entity that will be mapped to a database table
@Entity
//Specifies the name of the table in the database.
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = IDENTITY) //Generates a new unique id
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private boolean craftable;

    @Column(nullable = false)
    private Origin origin;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCraftable(boolean craftable) {
        this.craftable = craftable;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCraftable() {
        return craftable;
    }

    public Origin getOrigin() {
        return origin;
    }

    enum Origin{
        Vanilla, Moded
    }
}

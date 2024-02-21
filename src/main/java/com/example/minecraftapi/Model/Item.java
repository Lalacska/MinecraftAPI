package com.example.minecraftapi.Model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = IDENTITY)
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojaso
 */
class User {
    private String id, name;
    private double price;
    private boolean availability;
    
    public User(String id, String name, double price, boolean availability) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.availability = availability;
    }
    public String getid() {
        return id;
    }
    
    public String getname() {
        return name;
    }
    
    public double getprice() {
        return price;
    }

    public boolean getavailability() {
        return availability;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojaso
 */
public class CustomerInfo {
    private String date, entree_one, side_one, beverage_one, dessert_one;
    
    public CustomerInfo(String date, String entree_one, String side_one, String beverage_one, String dessert_one) {
        this.date = date;
        this.entree_one = entree_one;
        this.side_one = side_one;
        this.beverage_one = beverage_one;
        this.dessert_one = dessert_one;
    }
    public String getdate() {
        return date;
    }
    
    public String getentree_one() {
        return entree_one;
    }
    
    public String getside_one() {
        return side_one;
    }

    public String getbeverage_one() {
        return beverage_one;
    }
    
    public String getdessert_one() {
        return dessert_one;
    }
}

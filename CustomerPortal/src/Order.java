/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hspis
 */
class Order {
    public static int id;
    public static String entree;
    public static String [] addCondiments;
    public static String [] removeCondiments;
    public static String side;
    public static String beverage;
    public static String dessert;
    public static double price;
    
    public Order(String entree, String[] addCondiments, String[] removeCondiments, String side, String beverage, String dessert, double price) {
        this.entree = entree;
        this.addCondiments = addCondiments;
        this.removeCondiments = removeCondiments;
        this.side = side;
        this.beverage = beverage;
        this.dessert = dessert;
        this.price = price;
    }
    
    public String getentree() {
        return entree;
    }
    
    public static String getaddCondiments() {
        String container = "";
        for(int i = 0; i < 10; ++i) {
            if (addCondiments[i] != null) {
                container += addCondiments[i] + ", ";
            }
        }
        if(container.length() > 2){
            container = container.substring(0, container.length() - 2);
        }
        return container;
    }
    
    public static String getremoveCondiments() {
        String container = "";
        for(int i = 0; i < 10; ++i) {
            if (removeCondiments[i] != null) {
                container += removeCondiments[i] + ", ";
            }
        }
        if(container.length() > 2){
            container = container.substring(0, container.length() - 2);
        }
        return container;
    }

    public String getside() {
        return side;
    }
    
    public String getbeverage() {
        return beverage;
    }
    
    public String getdessert() {
        return dessert;
    }
    
    public double getprice() {
        return price;
    }
}

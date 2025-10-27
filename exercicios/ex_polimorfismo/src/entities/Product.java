package entities;

public class Product {
    protected String name;
    protected double price;

    public Product(){
        
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        return "PRICE TAGS:\n" + name + "R$ " + price;
    }

}

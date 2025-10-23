package entities;

public class Product {
  
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
     this.name = name;
     this.price = price;
     this.quantity = quantity;
    }

    public Product(String name, double price ){
     this.name = name;
     this.price = price;
    }   

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void AddProduts(int quantity){

        this.quantity+=quantity;

    }
    public void RemoveProducts(int quantity){

        this.quantity-=quantity;
    }

    public String toString(){

        return "Product data: "+ name + ", $ " + price+ ", "+ quantity + " units, "  + "Total: " + totalValueInStock();
    }
}

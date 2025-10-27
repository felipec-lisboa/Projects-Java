package entities;

public class ImportedProduct extends Product{
    private String customsFee;

    public ImportedProduct(String name, double price, String customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice(double tax){
        return price + tax;
    }

    


    
    
}

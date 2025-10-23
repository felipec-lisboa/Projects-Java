import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = teclado.nextLine(); 

        System.out.print("Price: ");
        double price = teclado.nextDouble();
        // System.out.print("Quantity in stock: ");
        // int quantity = teclado.nextInt();


        Product product = new Product(name, price);

        System.out.println(product);
        

        System.out.println("Do you want to add another product? Answer with Yes and No.");
        teclado.nextLine();
        String decision = teclado.nextLine();

        if (decision.equals("yes")){
            System.out.println("Enter the number of products to be added in stock: ");
            product.setQuantity(teclado.nextInt()); 
            teclado.nextLine();
            //product.AddProduts(product.quantity);
            System.out.println("Update data: " + product);
        }else{
            teclado.nextLine();
        }

        

        // System.out.println("Do you want to remove another product? Answer with Yes and No.");
        // //teclado.nextLine();
        // String _decision = teclado.nextLine();

        // if (_decision.equals("yes")){
        //     System.out.println("Enter the number of products to be removed from stock: ");
        //     product.quantity = teclado.nextInt();

        //     product.RemoveProducts(product.quantity);
        //     System.out.println("Update data: " + product);

        // }else{
        //     teclado.nextLine();
        // }


        teclado.close();
    }
}

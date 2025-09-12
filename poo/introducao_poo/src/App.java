import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = teclado.nextLine(); 

        System.out.print("Price: ");
        product.price = teclado.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = teclado.nextInt();

        System.out.println(product);
        

        System.out.println("Do you want to add another product? Answer with Yes and No.");
        teclado.nextLine();
        String decision = teclado.nextLine();

        if (decision.equals("yes")){
            System.out.println("Enter the number of products to be added in stock: ");
            int quantity = teclado.nextInt();
            teclado.nextLine();
            product.AddProduts(quantity);
            System.out.println("Update data: " + product);
        }else{
            teclado.nextLine();
        }

        

        System.out.println("Do you want to remove another product? Answer with Yes and No.");
        //teclado.nextLine();
        String _decision = teclado.nextLine();

        if (_decision.equals("yes")){
            System.out.println("Enter the number of products to be removed from stock: ");
            int quantity = teclado.nextInt();

            product.RemoveProducts(quantity);
            System.out.println("Update data: " + product);

        }else{
            teclado.nextLine();
        }


        teclado.close();
    }
}

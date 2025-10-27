import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Product product;

        System.out.printf("Enter the number of products: ");
        int numberProducts = teclado.nextInt();
        teclado.nextLine();

        for(int i = 1; i <= numberProducts; i++ ){
            System.out.println("Product #"+ i);
            System.out.println("Common, used or imported (c/u/i)");
            String type = teclado.nextLine();
            if(type.equals("c")){
                System.out.printf("Name: ");
                String name = teclado.nextLine();
                System.out.printf("Price: ");
                double price = teclado.nextDouble();
                // System.out.printf("Customs fee: ");
                // double tax = teclado.nextDouble();
                product = new Product(name, price);
            }
            else if(type.equals("u")){
                System.out.printf("Name: ");
                String name = teclado.nextLine();

                System.out.printf("Price: ");
                double price = teclado.nextDouble();
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                String dataTexto = teclado.nextLine();

                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataTexto, formato);
                Date data = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

                product = new UsedProduct(name, price,data);
            }
            else if(type.equals("i")){
                System.out.printf("Name: ");
                String name = teclado.nextLine();
                System.out.printf("Price: ");
                double price = teclado.nextDouble();
                // System.out.printf("Customs fee: ");
                // double tax = teclado.nextDouble();
                product = new Product(name, price);
            }



        }

        



        
        teclado.close();

    }
}

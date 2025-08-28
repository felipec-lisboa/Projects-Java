import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

    String prodruct1 = "Computer";
    String prodruct2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';
    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("Products: ");
    System.out.println(prodruct1+", whitch price is $ " + price1);
    System.out.printf("%s, whitch price is $ %.2f\n", prodruct2, price2);
    System.out.println("");
    System.out.println("Record: 30 years old, code "+ code + " And gender: "+ gender);
    System.out.println("Measure with eight decimal places: " + measure);
    System.out.printf("Rouded (Three decimal places): %.3f\n", measure);
    Locale.setDefault(Locale.US);
    System.out.printf("Us Decimal point: %.3f\n", measure  );
    
    

    }
}

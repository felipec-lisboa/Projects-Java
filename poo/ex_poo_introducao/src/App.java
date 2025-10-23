import java.util.Scanner;
import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = teclado.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = teclado.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = teclado.nextDouble();
        
        System.out.println(funcionario);
        System.out.println();


        System.out.print("Which percentage to incrase salary? ");
        double inc = teclado.nextDouble();
        funcionario.increaseSalary(inc);        
        System.out.println("Update data: " + funcionario);




        teclado.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int x;
        String s1,s2,s3;
        x = teclado.nextInt();
        teclado.nextLine();   // isso é feito para consumir o enter
        s1 = teclado.nextLine();
        s2 = teclado.nextLine();
        s3 = teclado.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        teclado.close();
    }
}

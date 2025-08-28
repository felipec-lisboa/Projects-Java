import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        // String x;
        // x = teclado.next();
        // System.out.println("Você digitou: "+x);
        //tipo string

        // int x;
        // System.out.println("Digite um numero: ");
        // x = teclado.nextInt();
        // System.out.println("O numero que você digitou foi: "+x);
        // tipo int

        // double x;
        // System.out.print("Digite um numero double: ");
        // x = teclado.nextDouble();
        // System.out.printf("O numero digitado foi: %.2f", x);
        // tipo double

        // char x;
        // System.out.println("Digite um caractere: ");
        // x = teclado.next().charAt(0);
        // System.out.println("O caractere digitado foi: "+x);
        // tipo char

        String x;
        int y;
        double z;
        
        x = teclado.next();
        y = teclado.nextInt();
        z = teclado.nextDouble();

        System.out.println("Dados digitados String " +x+ " int "+y+" Double " +z);



        teclado.close();
    }
}

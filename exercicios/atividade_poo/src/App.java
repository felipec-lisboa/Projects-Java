import java.util.Scanner;
import entities.Conta;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o numero da conta: ");
        int numeroConta = teclado.nextInt();
        teclado.nextLine(); 

        System.out.printf("Digite seu nome: ");
        String nome = teclado.nextLine();

        

        System.out.printf("Você deseja fazer um deposito incial (s/n)?");
        String depositoInicial = teclado.nextLine();


        Conta conta;

        if (depositoInicial.equalsIgnoreCase("s")) {
            System.out.print("Entre com o valor inicial: ");
            double depositoInicialValor = teclado.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicialValor);
        } else {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println(conta);

        System.out.printf("Digite um valor para depositar: ");
        double deposito = teclado.nextDouble();
        conta.depositoConta(deposito);  
        System.out.println(conta);  

        System.out.printf("Digite um valor para sacar: ");
        double saque = teclado.nextDouble();
        conta.saqueConta(saque);
        System.out.println(conta);  
        


        






        teclado.close();

    }
}

import java.util.Scanner;
import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPopanca;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // System.out.printf("Digite o numero da conta: ");
        // int numeroConta = teclado.nextInt();
        // teclado.nextLine(); 

        // System.out.printf("Digite seu nome: ");
        // String nome = teclado.nextLine();

        

        // System.out.printf("Você deseja fazer um deposito incial (s/n)?");
        // String depositoInicial = teclado.nextLine();


        // Conta conta;

        // if (depositoInicial.equalsIgnoreCase("s")) {
        //     System.out.print("Entre com o valor inicial: ");
        //     double depositoInicialValor = teclado.nextDouble();
        //     conta = new Conta(numeroConta, nome, depositoInicialValor);
        // } else {
        //     conta = new Conta(numeroConta, nome);
        // }

        // System.out.println(conta);

        // System.out.printf("Digite um valor para depositar: ");
        // double deposito = teclado.nextDouble();
        // conta.depositoConta(deposito);  
        // System.out.println(conta);  

        // System.out.printf("Digite um valor para sacar: ");
        // double saque = teclado.nextDouble();
        // conta.saqueConta(saque);
        // System.out.println(conta);  

        // Conta conta = new Conta(1000, "Felipe", 0);

        // ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);

        // Conta conta1 = contaEmpresarial;

        // Conta conta2 = new ContaEmpresarial(1003, "null", 0, 200);

        // Conta conta3 = new ContaPopanca(1004, "Teste", 1000, 0.02);

        // // DOWNCASTING

        // ContaEmpresarial conta4 = (ContaEmpresarial)conta2;

        // if (conta3 instanceof ContaEmpresarial){
        //     ContaEmpresarial conta5 = (ContaEmpresarial)conta3;
        //     conta5.emprestimo(200.00);
        //     System.out.println("Emprestimo correto");
        // }

        // if (conta3 instanceof ContaPopanca){
        //     ContaPopanca conta5 = (ContaPopanca)conta3;
        //     conta5.atualizarSaldoConta();
        //     System.out.println("Uptade correto");
        // }


        Conta conta1 = new Conta(100, "Felipe", 1000);
        conta1.saqueConta(200);
        System.out.println(conta1);

        Conta conta2 = new ContaPopanca(10, "null", 1000, 0.01);     
        conta2.saqueConta(200);
        System.out.println(conta2);

        Conta conta3 = new ContaEmpresarial(100, "Felipe", 1000, 1000);
        conta3.saqueConta(200);
        System.out.println(conta3);



        






        teclado.close();

    }
}

import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        student.nome = teclado.nextLine();
        for(int i = 0; i < 3; i++  ){
            if (i == 0) {
                System.out.print("Digite a sua nota de 0 até 30: ");
                student.notas[i] = teclado.nextDouble();
            }else{
                System.out.print("Digite sua nota de 0 até 35: ");
                student.notas[i] = teclado.nextDouble();
            }
        }

        System.out.println(student);

        teclado.close();
    }
}

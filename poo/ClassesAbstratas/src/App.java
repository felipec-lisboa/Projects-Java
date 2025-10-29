import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import entities.*;
import entities.enums.Color;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        List<Shape> shapes = new LinkedList<>();
        Shape shape;


        System.out.printf("Enter number of shapes: ");
        int n = teclado.nextInt();
        teclado.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.printf("Shape #%d data: \n", i);
            System.out.printf("Rectangle or Circle (r/c)? ");
            String type = teclado.nextLine();
            if(type.equals("r")){
                System.out.printf("Color (BLACK/BLUE/RED)");
                Color color = Color.valueOf(teclado.next());

                System.out.printf("Whidth: ");
                double width = teclado.nextDouble();

                System.out.printf("Height: ");
                double height = teclado.nextDouble();

                shape = new Retangle(color, width, height);
                shapes.add(shape);
                teclado.nextLine(); 

                
            }else if (type.equals("c")){
                System.out.printf("Color (BLACK/BLUE/RED)");
                Color color = Color.valueOf(teclado.next());
                System.out.printf("Radius: ");
                double radius = teclado.nextDouble();

                shape = new Circle(color, radius);
                shapes.add(shape);
                teclado.nextLine(); 


            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        
        for (Shape shap : shapes) {
            System.out.println(shap.area());
    }


        teclado.close();
    }
}

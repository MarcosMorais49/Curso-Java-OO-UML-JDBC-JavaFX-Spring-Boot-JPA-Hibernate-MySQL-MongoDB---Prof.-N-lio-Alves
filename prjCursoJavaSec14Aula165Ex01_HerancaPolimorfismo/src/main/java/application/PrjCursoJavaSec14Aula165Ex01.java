package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnum.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec14Aula165Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Shape> shapes = new ArrayList<>();
        
        System.out.print("Enter the number of shapes: ");
        int nShapes = sc.nextInt();
        
        for (int i=0; i<nShapes; i++){
            System.out.println("Shape #"+i+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char option = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            Color color = Color.valueOf(sc.next());
            if (option == 'r' || option == 'R'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape shape = new Rectangle(width, height, color );
                shapes.add(shape);
            }
            else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                Shape shape = new Circle(radius, color );
                shapes.add(shape);
            }
        }   
        System.out.println("");
        System.out.println("SHAPE AREAS: ");
        for (Shape s : shapes){
            System.out.println(String.format("%.2f",s.area()));
        }
        sc.close();
    }
}

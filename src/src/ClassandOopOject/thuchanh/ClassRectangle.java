package src.ClassandOopOject.thuchanh;

import java.util.Scanner;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter Width: ");
        double rong=scanner.nextDouble();
        System.out.print("enter Height: ");
        double dai=scanner.nextDouble();
        Rectangle rt=new Rectangle(dai,rong);
        System.out.println("Your Rectangle \n"+ rt.display());
        System.out.println("Perimeter of the Rectangle: "+ rt.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rt.getArea());
    }
}

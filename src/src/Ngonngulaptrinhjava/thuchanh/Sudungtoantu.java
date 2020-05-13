package src.Ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class Sudungtoantu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        double area = width * height;

        System.out.println("Area is: " + area);
    }
}

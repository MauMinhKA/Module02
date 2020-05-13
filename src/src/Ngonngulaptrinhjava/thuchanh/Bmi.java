package src.Ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double bmi;
        double height;
        int weight;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chiều cao: ");
        height=Float.parseFloat(scanner.nextLine());
        System.out.println("nhập cân nặng: ");
        weight=Integer.parseInt(scanner.nextLine());
        bmi= weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "trạng thái\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "gầy");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "béo");
        else
            System.out.printf("%-20.2f%s", bmi, "béo vcl");
    }
}

package src.Ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class Timuocsochungmax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a: ");
        int a=Math.abs(Integer.parseInt(scanner.nextLine()))  ;
        System.out.println("input b: ");
        int b=Math.abs(Integer.parseInt(scanner.nextLine()))  ;
        if (a == 0 || b == 0)
            System.out.println("khong co UCLN");
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }

        System.out.println("Greatest common factor: " + a);
    }
}

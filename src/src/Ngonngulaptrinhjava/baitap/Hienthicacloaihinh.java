package src.Ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        int a=-1;
        Scanner scanner = new Scanner(System.in);
        while (a!=0){
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
         a=Integer.parseInt(scanner.nextLine());
        switch (a){
            case 1:
                for (int i=0;i<4;i++){
                    for (int j=0;j<15;j++){
                        System.out.print("*");
                        if (j==14){
                            System.out.print("\n");
                        }
                    }
                }
                break;
            case 2:
                for (int i=0;i<5;i++){
                    for (int j =0;j<=i;j++){
                        System.out.print("*");
                        if (j==i){
                            System.out.print("\n");
                        }
                    }
                }
                System.out.println("-----------------------------");
                for (int b = 5; 1 <= b; b--) {
                    for (int c = b; 1 <= c; c--) {
                        System.out.print('*');
                    } System.out.println(" ");
                } System.out.println(" ");
                System.out.println("-----------------------------");
                for (int i = 5; 1 <= i; i--) {
                    for (int c = (i - 1); 1 <= c; c--) {
                        System.out.print(" ");
                    }
                    for (int b = 5; i <= b; b--) {
                        System.out.print('*');
                    }
                    System.out.println(" ");
                } System.out.println(" ");
                System.out.println("-----------------------------");
                for (int i = 1; i <= 5; i++) {
                    for (int b = 1; b < i; b++) {
                        System.out.print(" ");
                    }
                    for (int c = 5; i <= c; c--) {
                        System.out.print("*");
                    }
                    System.out.println(" ");


                }
                break;
            case 3:
                for (int r = 1; r <= 5; r++) {
                    for (int i = 6 - r ; i >= 1; i--) {
                        System.out.print(" ");
                    }
                    for (int c = 1; c <= r; c++) {
                        System.out.print("*");
                    }
                    for (int c = r - 1; c >= 1; c--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }}
}

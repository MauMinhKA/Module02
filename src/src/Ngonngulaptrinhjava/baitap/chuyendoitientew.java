package src.Ngonngulaptrinhjava.baitap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class chuyendoitientew {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("1.USD=>VND");
        System.out.println("2.VND=>USD");
        Scanner scanner=new Scanner(System.in);
        int schoose=Integer.parseInt(scanner.nextLine());
        switch (schoose){
            case 1:
                System.out.println("input USD: ");
                    int usd=Integer.parseInt(scanner.nextLine());
                System.out.print(usd+"$= "+usd*23+".000d");
            break;
            case 2:
                System.out.println("input VND: ");
                float vnd=Integer.parseInt(scanner.nextLine());
                System.out.print(vnd+"00d = "+df.format(vnd/23)+"$");
                break;
            default:
                System.out.println("loi");
        }
    }
}

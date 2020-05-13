package src.Ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class Tinhtienlaichovay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money,interset_rate,total_interset = 0;
        int month;
        System.out.println("input money: ");
        money=Double.parseDouble(scanner.nextLine());
        System.out.println("input interset_rate: ");
        interset_rate=Double.parseDouble(scanner.nextLine());
        System.out.println("inut month: ");
        month=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=month;i++){
            total_interset=money*(interset_rate/100)/12*month;
        }
        System.out.println("total_interset: "+total_interset);
    }
}

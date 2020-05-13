package src.Ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=Integer.parseInt(scanner.nextLine());
        boolean checkyear=false;
        boolean isDivisibleBy4 = year % 4 == 0;


        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    checkyear = true;
                }
            } else {
                checkyear = true;
            }
        }
        if (checkyear){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
}

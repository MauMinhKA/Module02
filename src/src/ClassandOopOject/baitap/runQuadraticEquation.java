package src.ClassandOopOject.baitap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class runQuadraticEquation {
    public static void main(String[] args) {
        DecimalFormat fr=new DecimalFormat("#0.00");
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a: ");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.print("enter b: ");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.print("enter c: ");
        double c=Double.parseDouble(scanner.nextLine());
        QuadraticEquation qua=new QuadraticEquation(a,b,c);

        if (0<qua.getDiscriminant()){
            System.out.print("x1= "+fr.format(qua.getRoot1()));
            System.out.print(" & x2= "+fr.format(qua.getRoot2()));
        }else if (0==qua.getDiscriminant()){
            System.out.print("x1=x2= "+qua.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}

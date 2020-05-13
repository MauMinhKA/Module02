package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class AddElemantToArray {
    public static void main(String[] args) {
        int[] array;

        Scanner scanner=new Scanner(System.in) ;
        System.out.print("input size of Array: ");
        int size=Integer.parseInt(scanner.nextLine());
        array=new int[size];

        System.out.println("nhap phan tu cho mang: ");
        for (int i=0;i<size;i++){
            System.out.print("input array["+i+"] : ");
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
        System.out.print("nhap so muon chen vao: ");
        int num=Integer.parseInt(scanner.nextLine());
        System.out.print("nhap vi tri can chen");
        int index=Integer.parseInt(scanner.nextLine());
        if (index<=1||(size-1)<=index){
            System.out.println("nhap vi tri nho hon do dai mang: ");
        }else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = num;
            for (int i=0;i<array.length;i++){
                System.out.print(array[i]+"\t");
            }
        }


    }
}

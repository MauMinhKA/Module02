package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input size of Array: ");
        int size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        System.out.println("nhap phan tu cho mang: ");
        for (int i = 0; i < size; i++) {
            System.out.print("input array[" + i + "] : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array:");
        for(int i = 0;i<array.length;i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        System.out.print("input element want delete: ");
        int result=Integer.parseInt(scanner.nextLine());
        for (int i = 0;i<array.length;i++){
            if (array[i]==result){
                for (int j = i;j<array.length;j++) {
                    array[j]=array[j+1];
                    if (j+1==array.length-1){
                        array[array.length-1]=0;
                        break;
                    }
                }
                }
            }
        System.out.print("Array:");
        for(int i = 0;i<array.length;i++) {
            System.out.print(array[i] + "\t");
        }
        }

    }


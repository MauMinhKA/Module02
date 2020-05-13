package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("input size of Array1: ");
        int size1 = Integer.parseInt(scanner.nextLine());
        System.out.print("input size of Array2: ");
        int size2 = Integer.parseInt(scanner.nextLine());
        arr1 = new int[size1];
        arr2 = new int[size2];
        arr3 = new int[(size1 + size2)];

        System.out.println("inser element for Array1: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("input array[" + i + "] : ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        System.out.println("inser element for Array2: ");
        for (int i = 0; i < size2; i++) {
            System.out.print("input array[" + i + "] : ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < (arr2.length + arr1.length); i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.print("Array3:");
        for(int i = 0;i<arr3.length;i++) {
            System.out.print(arr3[i] + "\t");
        }


    }


}


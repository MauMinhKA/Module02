package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class FinMaxinArray {
    public static void main(String[] args) {
        int dong, cot;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của ma trận: ");
        dong = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        cot = scanner.nextInt();
        int A[][] = new int[dong][cot];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}

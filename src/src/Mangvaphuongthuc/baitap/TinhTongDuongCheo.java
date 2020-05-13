package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        int dong, cot;
        int result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của ma trận: ");
        dong = scanner.nextInt();
        cot = dong;
        int A[][] = new int[dong][cot];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < dong; i++) {
            result+=A[i][i];
        }
        System.out.print("tổng số các số ở đường chéo là : "+result);
    }
}

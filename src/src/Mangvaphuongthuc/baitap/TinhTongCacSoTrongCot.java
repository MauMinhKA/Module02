package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongCacSoTrongCot {
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
        System.out.print("Nhap so Cot muon tinh tong: ");
        int num=scanner.nextInt();
        if (cot<=num||num<0){
            System.out.println("cui lòng nhập vị trí cột nhỏ hớn số cột của mảng và lớn hơn không!");
        }else {
            for (int i = 0; i < dong; i++) {
                result+=A[i][num];
            }
            System.out.print("tổng số các số ở đường chéo là : "+result);
        }

    }
}

package src.Mangvaphuongthuc.baitap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Nhập vào ký tự cần kiểm tra: ");
        kyTu = scanner.nextLine().charAt(0);


        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i)==(kyTu)) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }

}

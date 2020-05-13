package src.Mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {
        System.out.println("bạn muốn nhập vào bn phần tử (k quá 20): ");
        Scanner scanner=new Scanner(System.in);
        int amount=Integer.parseInt(scanner.nextLine());
        if(amount<0||20<amount){
            System.out.println("đã bảo nhập k quá 20 rồi");
        }else {
            int[] arr;
            arr=new int[amount];
            for (int i=0;i<amount;i++){
                System.out.print("input arr["+i+"]: ");
                arr[i]=Integer.parseInt(scanner.nextLine());
            }
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
            int index=checkmax(arr);
            System.out.println("max in arry is: "+arr[index]);

        }
        }

    public  static int checkmax(int[] array){
        int max=array[0];
        int a = 0;
        for (int i=1;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
                a=i;
            }
        }
        return a;
    }
}
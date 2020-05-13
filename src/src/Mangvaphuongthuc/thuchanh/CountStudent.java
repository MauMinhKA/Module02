package src.Mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int[] student;
        int result=0;
        Scanner scanner=new Scanner(System.in) ;
        System.out.print("input size of Array: ");
        int size=Integer.parseInt(scanner.nextLine());
        student=new int[size];
        if (size>30||size<0){
            System.out.println("số lượng phần tử phải nhỏ hơn 30 và lớn hơn 0");
        }else {
            System.out.println("nhap phan tu cho mang: ");
            for (int i=0;i<size;i++){
                System.out.print("input array["+i+"] : ");
                student[i]=Integer.parseInt(scanner.nextLine());
            }
            for (int i=0;i<student.length;i++){
                System.out.print(student[i]+"\t");
                if (5<=student[i]&&student[i]<10){
                    result++;
                }
            }
            System.out.print("so luong thi do: "+result);
        }
    }
}

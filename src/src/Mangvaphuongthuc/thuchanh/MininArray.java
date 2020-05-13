package src.Mangvaphuongthuc.thuchanh;

public class MininArray {
    public static void main(String[] args) {
        int[] arr={ 11,2,3,4,5,6,7,8,9};
        int index=checkmin(arr);
        System.out.println("min in array is: "+arr[index]);

    }
    public  static int checkmin(int[] array){
        int min=array[0];
        int a = 0;
        for (int i=1;i<array.length;i++){
            if (min>array[i]){
                min=array[i];
                a=i;
            }
        }
        return a;
    }
}

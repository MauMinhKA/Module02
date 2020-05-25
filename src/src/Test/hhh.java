package src.Test;

public class hhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextFloat();
                check = true;
            } catch (Exception e) {
                System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
                sc.nextLine();
            }
        }
        return n;
    }

}

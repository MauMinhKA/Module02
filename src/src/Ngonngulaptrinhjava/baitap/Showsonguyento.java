package src.Ngonngulaptrinhjava.baitap;

public class Showsonguyento {
    public static void main(String[] args) {
        int number;
        for (number=2;number<100;number++){
            if (check(number)){
                System.out.println(number+" la SNT");
            }
        }
    }
    public static boolean check(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

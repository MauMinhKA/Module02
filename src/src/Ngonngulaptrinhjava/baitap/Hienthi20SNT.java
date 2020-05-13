package src.Ngonngulaptrinhjava.baitap;

public class Hienthi20SNT {

        public static void main(String[] args) {
            int number=2;
            int count=1;
            while (count<=20){
                if (check(number)){
                    System.out.println(number+" la SNT thu "+count);
                    count++;
                }
                number++;
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



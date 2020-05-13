package src.Ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so can doc: ");
        int number=scanner.nextInt();
        int chuc=((number/10)%10);
        int donvi=((number%10)%10);
        int hangtram=number/100;
            String docdonvi = "";
            String dochangchu="";
            String dochangtram="";
            switch (donvi){
                case 0:
                    docdonvi="";
                    break;
                case 1:
                    docdonvi="một";
                    break;
                case 2:
                    docdonvi="hai";
                    break;
                case 3:
                    docdonvi="ba";
                    break;
                case 4:
                    docdonvi="bốn";
                    break;
                case 5:
                    docdonvi="năm";
                    break;
                case 6:
                    docdonvi="sáu";
                    break;
                case 7:
                    docdonvi="bảy";
                    break;
                case 8:
                    docdonvi="tám";
                    break;
                case 9:
                    docdonvi="chín";
            }
            switch (chuc){
                case 0:
                    dochangchu="";
                    break;
                case 1:
                    dochangchu="mười ";
                    break;
                case 2:
                    dochangchu="hai mươi ";
                    break;
                case 3:
                    dochangchu="ba mươi ";
                    break;
                case 4:
                    dochangchu="bốn mươi ";
                    break;
                case 5:
                    dochangchu="năm mươi ";
                    break;
                case 6:
                    dochangchu="sáu mươi ";
                    break;
                case 7:
                    dochangchu="bảy mươi ";
                    break;
                case 8:
                    dochangchu="tám mươi ";
                    break;
                case 9:
                    dochangchu="chín mươi ";
                    break;

            }
            switch (hangtram){
                case 0:
                    dochangtram="";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 1:
                    dochangtram="một trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 2:
                    dochangtram="hai trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 3:
                    dochangtram="ba trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 4:
                    dochangtram="bốn trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 5:
                    dochangtram="năm trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 6:
                    dochangtram="sáu trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 7:
                    dochangtram="bảy trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 8:
                    dochangtram="tám trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);
                    break;
                case 9:
                    dochangtram="chín trăm ";
                    System.out.println(dochangtram+dochangchu+docdonvi);


            }
        }
    }


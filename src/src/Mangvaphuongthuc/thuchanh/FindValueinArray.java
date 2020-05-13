package src.Mangvaphuongthuc.thuchanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FindValueinArray {
    public static void main(String[] args) {
        String[] student={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name's student :");
        String input_name=scanner.nextLine();

        boolean check=false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Not found" + input_name + " in the list.");
    }


}

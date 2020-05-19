package src.ThietKeDoiTuongnangcao.baitap.Resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int db=random.nextInt((99)+1);
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(9,"blue",true);
        shapes[1]=new Rectangle(4,6,"Oranges",true);
        shapes[2]=new Square(5,"blue",false);
        System.out.println("trước khi tăng: ");
        for (Shape shape:shapes){
            System.out.println(shape);
        }
        System.out.println("sau khi tăng: "+db+"%");
        for (Shape shape:shapes){
            shape.Tangsize(db);
            System.out.println(shape);
        }
    }
}

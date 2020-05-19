package src.ThietKeDoiTuongnangcao.baitap.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[5];
        shapes[0]=new Circle(6,"blue",true);
        shapes[1]=new Rectangle(6,9,"Yellow",false);
        shapes[2]=new Rectangle(6,10,"red",true);
        shapes[3]=new Square(6,"green",false);
        shapes[4]=new Circle(6,"Oranges",true);

        for (Shape shape:shapes){
            if (shape instanceof Square){
               ((Square) shape).Howtocolor();
            }else if (shape instanceof Rectangle){
                System.out.println(shape.toString());
            }else if (shape instanceof Circle){
                System.out.println(shape.toString());
            }
        }
    }
}

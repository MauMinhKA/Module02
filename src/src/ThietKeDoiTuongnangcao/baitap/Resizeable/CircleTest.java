package src.ThietKeDoiTuongnangcao.baitap.Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]=new Circle(2.5,"blue",true);
        circles[1]=new Circle(3.5,"orange",true);
        circles[2]=new Circle(4.5,"red",false);
//        System.out.println();

        for (Circle circle:circles){
            System.out.println(circle);
        }
        for (Circle circle:circles){
//            System.out.println(circle);
            circle.Tangsize(50.55);
            System.out.println(circle);
        }



    }
}

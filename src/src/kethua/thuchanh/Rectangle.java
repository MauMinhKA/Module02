package src.kethua.thuchanh;

public class Rectangle extends Shape {
    private double width=1,height=1;

    public Rectangle(){
    };

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return getHeight()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getHeight()+getWidth());
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth()
                + " and height=" + getHeight()
//                +" and area is: "+getArea()
//                +" perimeter is: "+getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle( "blue", true,2.5, 3.8);
        System.out.println(rectangle);

    }
}

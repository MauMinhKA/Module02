package src.ThietKeDoiTuongnangcao.baitap.Resizeable;

import java.text.DecimalFormat;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    DecimalFormat fr=new DecimalFormat("#0.00");

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return Double.parseDouble(fr.format(this.radius));
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Double.parseDouble(fr.format(this.radius * this.radius * Math.PI));
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public void Tangsize(double percent) {
       this.radius+=this.radius*(percent/100);
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                +"area is: "
                +getArea();
    }


}

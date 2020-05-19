package src.ThietKeDoiTuongnangcao.baitap.Resizeable;

import java.text.DecimalFormat;

public class Rectangle extends Shape implements Resizeable {
    DecimalFormat fr=new DecimalFormat("#0.00");
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return Double.parseDouble(fr.format(this.width));
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return Double.parseDouble(fr.format(this.length));
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return Double.parseDouble(fr.format(this.width * this.length));

    }

    public double getPerimeter() {
        return Double.parseDouble(fr.format(2*(this.length+this.width)));
    }

    @Override
    public void Tangsize(double percent) {
        this.width += (this.width * (percent / 100));
        this.length += (this.length * (percent / 100));
    }

    @Override
    public String toString() {
        return "A rectangge with "+
                "width= " + getWidth() +
                ", length= " + getLength() +
                ", color is: "+getColor()+
                ", area= "+getArea()+
                ", Perimeter="+getPerimeter();

    }
}

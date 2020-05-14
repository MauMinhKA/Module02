package src.kethua.baitap;

import java.text.DecimalFormat;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {

    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea()*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " radius= "+getRadius()+
                " color= "+getColor()+
                " thetich= "+getVolume()+
                '}';
    }
    public static void main(String[] args) {
        Cylinder cy=new Cylinder(3.5,"blue",6.5);
        System.out.println(cy);
    }
}

package src.ClassandOopOject.baitap;

public class Fan {
    public final int slow=1;
    public final int medium=2;
    public final int fast=3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public Fan() {
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed=slow;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void show(){
        if (isStatus()){
            System.out.print("fan is on"+" speed: "+getSpeed()+" radius: "+getRadius()+" color: "+getColor());
        }else {
            System.out.println("");
            System.out.print("fan is off, radius: "+getRadius()+" color: "+getColor());
        }
    }
}

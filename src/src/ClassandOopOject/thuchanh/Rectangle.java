package src.ClassandOopOject.thuchanh;

public class Rectangle {
    double dai,rong;

    public Rectangle() {
    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public double getArea(){
        return this.dai*this.rong;
    }
    public  double getPerimeter(){
        return (this.dai+this.rong)*2;
    }
    public String display(){
        return "rectangle{"+"width= "+rong+" height= "+dai+"}";
    }
}

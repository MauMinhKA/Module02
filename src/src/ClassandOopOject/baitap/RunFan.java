package src.ClassandOopOject.baitap;

public class RunFan {
    public static void main(String[] args) {
        Fan fan=new Fan(1,true,5,"blue");
        Fan fan2=new Fan(1,false,7,"red");
        fan.show();
        fan2.show();
    }
}

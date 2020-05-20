package src.Test.AnonymousInnerClass;

public interface PersonWithInterface {
    abstract void eat();
    public static void main(String[] args) {
        PersonWithInterface personWithInterface=new PersonWithInterface() {
            @Override
            public void eat() {
                System.out.println("Thấy chả khác gì vs abstract class");
            }
        };
        personWithInterface.eat();
    }
}
//class testAnonymousInnerClass1{
//
//}

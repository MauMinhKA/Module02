package src.Test.AnonymousInnerClass;

public abstract class PersonWithAbstract {
    abstract void eat();
    public static void main(String[] args) {
        PersonWithAbstract person = new PersonWithAbstract() {
            @Override
            void eat() {
                System.out.println("An mot cai gi do!!");
            }
        };
        person.eat();
    }
}

//class testAnonymousInnerClass {
//
//}

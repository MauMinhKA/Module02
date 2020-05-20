package src.Test.AnonymousInnerClass;

public class PersonWithInnerClass {
    private  int age=22;
    void display(){
        class Local{
            void show(){
                System.out.println(age);
            }
        }
        Local local=new Local();
        local.show();
    }

    public static void main(String[] args) {
        PersonWithInnerClass person=new PersonWithInnerClass();
        PersonWithInnerClass obj=new PersonWithInnerClass();
        obj.display();
    }
}

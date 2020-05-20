package src.Test.ComparablevsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person_Comparable implements Comparable<Person_Comparable> {

    private int id;
    private String name;
    private int age;
    private double Height;
    private double Weight;

    public Person_Comparable(int id, String name, int age, double height, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        Height = height;
        Weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return Height;
    }

    public double getWeight() {
        return Weight;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Height=" + Height +
                ", Weight=" + Weight
                ;
    }

    @Override
    public int compareTo(Person_Comparable person) {
        // sắp xếp theo tuổi
//        if (this.getAge()==person.getAge()){
//            return this.getId()-person.getId();
//        }
//        return this.getAge()-person.getAge();
        // sắp xếp theo tên
        return this.getName().compareToIgnoreCase(person.getName());
    }
    public static void main(String[] args) {
        List<Person_Comparable> personList=new ArrayList<Person_Comparable>();
        personList.add(new Person_Comparable(2,"Giang",22,1.72,55));
        personList.add(new Person_Comparable(1,"Mậu",22,1.73,58));
        personList.add(new Person_Comparable(2,"Hùng",22,1.68,55));
        personList.add(new Person_Comparable(2,"Bắc",22,1.72,55));

        Collections.sort(personList);
        for (Person_Comparable p:personList) {
            System.out.println(p.toString());
        }
    }
}

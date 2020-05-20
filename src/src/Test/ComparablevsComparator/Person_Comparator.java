package src.Test.ComparablevsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person_Comparator {

    private int id;
    private String name;
    private int age;
    private double Height;
    private double Weight;

    public Person_Comparator(int id, String name, int age, double height, double weight) {
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

    public static void main(String[] args) {
        List<Person_Comparator> person=new ArrayList<Person_Comparator>();
        person.add(new Person_Comparator(1,"Mậu",21,1.73,58));
        person.add(new Person_Comparator(2,"Hùng",22,1.68,55));
        person.add(new Person_Comparator(3,"Bắc",22,1.72,55));
        person.add(new Person_Comparator(4,"Giang",23,1.72,55));
        person.sort(new Comparator<Person_Comparator>() {
            @Override
            public int compare(Person_Comparator person_comparator, Person_Comparator t1) {
                //sắp xếp các phần tử theo tên
//                return person_comparator.getName().compareTo(t1.getName());
                // sắp xếp các phần tử theo tuổi
                if (person_comparator.getAge() == t1.getAge()) {
                    return person_comparator.getId() - t1.getId();
                }
                return person_comparator.getAge() - t1.getAge();
            }
        });
        for (Person_Comparator p:person) {
            System.out.println(p.toString());
        }
    }
}

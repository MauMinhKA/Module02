package src.Test.LinkedListvaArrayList;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class MyArrayList {
    private int size;
    private Object[] array;
    private final static int DEFAULT_CAPACITY = 3;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object data) {
        array[size++] = data;
    }

    public void printList() {

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void ensureCapacity() {
        array = Arrays.copyOf(array, DEFAULT_CAPACITY * 2);
    }

    public Object getElement(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
       return array[index];
    }




    public MyArrayList clone() {
        MyArrayList myArrayList = new MyArrayList();

        for (int i = 0; i < size; i++) {
            myArrayList.array[i] = array[i];
        }
        myArrayList.size = size;

        return myArrayList;
    }


}

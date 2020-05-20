package src.Test.LinkedListvaArrayList;



public class MainClass {
    public static void main(String[] args) {
//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.ensureCapacity();
//        myArrayList.add("aaa");
//        myArrayList.add(13041998);
//        myArrayList.add("ddd");
//        myArrayList.add("fff");
//        myArrayList.add("ccc");
//
//
//        myArrayList.printList();
//        System.out.println("");
//        System.out.println("element1= "+myArrayList.getElement(1));
//        MyArrayList myArrayList2=myArrayList.clone();
//        System.out.println("Array List 2----------------------");
//        myArrayList2.ensureCapacity();
//        myArrayList2.printList();

//
        System.out.println("Linked List 0----------------------");
        MyLinkedList myLinkedList = new MyLinkedList("add firts");
        myLinkedList.add(9);
        myLinkedList.add(8);
        myLinkedList.add(7);

        myLinkedList.printList();

        MyLinkedList myLinkedList2 = myLinkedList.clone();
        myLinkedList2.add("5");

        System.out.println("Linked List 1----------------------");
        myLinkedList.printList();
        System.out.println("Linked List 2----------------------");
        myLinkedList2.printList();

    }
}

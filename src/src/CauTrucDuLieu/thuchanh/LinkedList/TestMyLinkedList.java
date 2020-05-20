package src.CauTrucDuLieu.thuchanh.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList("clgt");


        ll.add(0,150);
        ll.add(1,300);
        ll.add(5,100);
        ll.add(6,200);
//        ll.addFirst("Mậu");
//        ll.addFirst("Khánh");
//        ll.addFirst("Trương");

//        ll.add(8,500);
        ll.printList();
    }
}
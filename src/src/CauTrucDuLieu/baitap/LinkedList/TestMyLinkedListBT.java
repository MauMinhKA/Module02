package src.CauTrucDuLieu.baitap.LinkedList;

import java.util.LinkedList;

public class TestMyLinkedListBT {
    public static void main(String[] args) {
        MyLinkedListBT<String> linkedList=new MyLinkedListBT<String>();
//        linkedList.addelements(1,"truong khanh mau");
        linkedList.addFirst("dmm");
        linkedList.addFirst("dmm");
        System.out.println(linkedList.get(1));
    }



}

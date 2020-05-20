package src.CauTrucDuLieu.thuchanh.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listInteger = new MyList<String>();
        listInteger.add("truong");
        listInteger.add("khanh");
        listInteger.add("mau");
        listInteger.add("codegym");
        listInteger.add("da nang");

        listInteger.add("da nang");
        listInteger.add("da nang");
        listInteger.add("da nang");
        System.out.println("element 0: "+listInteger.get(0));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 3: "+listInteger.get(3));
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 5: "+listInteger.get(5));
//        listInteger.get(-1);
////        System.out.println("element -1: " + listInteger.get(-1));





    }
}

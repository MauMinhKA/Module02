package src.Test;

public class HinhTron implements Hinhhoc {

    protected String name;
    protected float radius;

    public HinhTron(String name, float radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public float tinhChuVi() {
        return 2 * PI * radius;
    }

    @Override
    public float tinhDienTich() {
        return PI * radius * radius;
    }

    @Override
    public float tinhTheTich() {
        // Do HinhTron không có tính thể tích, nên phương thức này chỉ override từ HinhHoc mà không làm gì cả
        return 0;
    }

    @Override
    public void xuatThongTin() {
        System.out.println(name);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }

    public static void main(String[] args) {
        HinhTron ht=new HinhTron("mau",15.2f);
        ht.xuatThongTin();
    }
}

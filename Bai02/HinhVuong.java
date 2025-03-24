package Bai02;
import java.util.Scanner;

class HinhVuong implements Hinh {
    private float canh;

    public HinhVuong() {
        this.canh = 0;
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh cua hinh vuong: ");
        this.canh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Vuong - Canh: " + this.canh + ", Dien tich: " + this.dienTich());
    }

    @Override
    public float dienTich() {
        return this.canh * this.canh;
    }
}
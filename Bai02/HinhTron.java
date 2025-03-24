package Bai02;
import java.util.Scanner;

class HinhTron implements Hinh {
    private float banKinh;

    public HinhTron() {
        this.banKinh = 0;
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh cua hinh tron: ");
        this.banKinh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Tron - Ban Kinh: " + this.banKinh + ", Dien tich: " + this.dienTich());
    }

    @Override
    public float dienTich() {
        return pi * this.banKinh * this.banKinh;
    }
}

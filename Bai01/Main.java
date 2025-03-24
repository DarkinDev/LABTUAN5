package Bai01;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", 5000000, "Quan tri", 2000000);
        quanLy.nhap();
        quanLy.xuat();
        System.out.println("Luong: " + quanLy.tinhLuong());

        NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B", "Thac si", 6000000, "Hoa hoc", 1500000);
        nghienCuu.nhap();
        nghienCuu.xuat();
        System.out.println("Luong: " + nghienCuu.tinhLuong());

        PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap", 4000000);
        phucVu.nhap();
        phucVu.xuat();
        System.out.println("Luong: " + phucVu.tinhLuong());

        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);

        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}
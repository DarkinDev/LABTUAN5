package Bai01;
import java.util.Scanner;

public class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapCongViec;

    public QuanLy() {
        super();
        this.chuyenMon = "";
        this.phuCapCongViec = 0.0;
    }

    public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenMon, double phuCapCongViec) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapCongViec = phuCapCongViec;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public double getPhuCapCongViec() {
        return phuCapCongViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = scanner.nextLine();
        System.out.print("Nhap phu cap cong viec: ");
        phuCapCongViec = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap cong viec: " + phuCapCongViec);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapCongViec;
    }
}
package Bai01;
import java.util.Scanner;

public class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;

    public NghienCuu() {
        super();
        this.chuyenMon = "";
        this.phuCapDocHai = 0.0;
    }

    public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenMon, double phuCapDocHai) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = scanner.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        phuCapDocHai = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap doc hai: " + phuCapDocHai);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
}
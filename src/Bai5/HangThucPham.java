package Bai5;

import java.time.LocalDate;

public class HangThucPham {
    private static int MaHang;
    private String TenHang;
    private float DonGia;
    private LocalDate NSX;
    private LocalDate HSD;

    public HangThucPham() {
    }

    public HangThucPham(int maHang, String tenHang, float donGia, LocalDate NSX, LocalDate HSD) {
        MaHang = maHang;
        TenHang = tenHang;
        DonGia = donGia;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public int getMaHang() {
        return MaHang;
    }

    public static void setMaHang(int maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public LocalDate getNSX() {
        return NSX;
    }

    public void setNSX(LocalDate NSX) {
        this.NSX = NSX;
    }

    public LocalDate getHSD() {
        return HSD;
    }

    public void setHSD(LocalDate HSD) {
        this.HSD = HSD;
    }
}

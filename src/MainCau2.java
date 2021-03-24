import java.util.Scanner;

public class MainCau2 {
    public static void main(String[] args) {
        SinhVien SV1 = new SinhVien(1,"Trinh Van Dang",7,8);
        SinhVien SV2 = new SinhVien(2,"Ly Minh Hung",5,7);

        Scanner sc = new Scanner(System.in);
        SinhVien SV3 = new SinhVien();

        System.out.println("Moi nhap Ma Sinh vien 3 (0 -> 100)");
        int Masv3 = sc.nextInt();

        System.out.println("Moi nhap Ho ten Sinh vien 3");
        String nameSv3 = sc.next();
        sc.next();

        System.out.println("Moi nhap diem Ly thuyet Sinh vien 3");
        float LTSv3 = sc.nextFloat();

        System.out.println("Moi nhap diem Thuc hanh Sinh vien 3");
        float THSv3 = sc.nextFloat();

        SV3.setMaSV(Masv3);
        SV3.setHoTen(nameSv3);
        SV3.setDiemLT(LTSv3);
        SV3.setDiemTH(THSv3);

        System.out.println(String.format("%5s %20s %10s %10s %10s", "Ma SV","Ho Ten","DiemLT","DiemTH","DiemTB"));
        SV1.toString();
        SV2.toString();
        SV3.toString();
    }
}

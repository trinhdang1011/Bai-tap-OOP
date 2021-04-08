package Bai4;

public class Main4 {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Trinh Van Dang ","Exciter",45000000,150);
        Vehicle xe2 = new Vehicle("Tran Minh Quan","Air Blade",44000000,125);
        Vehicle xe3 = new Vehicle("Nguyen Viet Hoang","Vespa",70000000,150);
        System.out.println(String.format("%-20s %-15s %-15s %-15s %10s","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai tra"));
        System.out.println("=================================================================================");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}

package Bai3;

public class Main3 {
    public static void main(String[] args) {
        TamGiac TG1 = new TamGiac(1,2,3,"TG1");
        TamGiac TG2 = new TamGiac(-1,3,3,"TG2");
        TamGiac TG3 = new TamGiac(2,2,3,"TG3");
        TamGiac TG4 = new TamGiac(3,3,3,"TG4");
        TamGiac TG5 = new TamGiac(4,5,6,"TG5");
        System.out.println(String.format("%10s %4s %5s %5s %12s %20s %25s", "Ten TG","a","b","c","Chu vi","Dien tich","Kieu TG"));
        TG1.toString();
        TG2.toString();
        TG3.toString();
        TG4.toString();
        TG5.toString();

    }
}

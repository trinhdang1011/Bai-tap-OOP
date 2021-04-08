package Bai4;

public class Vehicle {
    private String Chuxe;
    private String loaixe;
    private float trigiaxe;
    private int dungtichxylanh;

    public Vehicle() {
    }

    public Vehicle(String Chuxe, String loaixe, float trigiaxe, int dungtichxylanh) {
        this.Chuxe = Chuxe;
        this.loaixe = loaixe;
        this.trigiaxe = trigiaxe;
        this.dungtichxylanh = dungtichxylanh;
    }

    public String getChuxe() {
        return Chuxe;
    }

    public void setChuxe(String Chuxe) {
        this.Chuxe = Chuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public float getTrigiaxe() {
        return trigiaxe;
    }

    public void setTrigiaxe(float trigiaxe) {
        if(trigiaxe>=0) {
            this.trigiaxe = trigiaxe;
        }else{
            this.trigiaxe = 0;
            System.out.println("Nhap lai tri gia xe");
        }
    }

    public int getDungtichxylanh() {
        return dungtichxylanh;
    }

    public void setDungtichxylanh(int dungtichxylanh) {
        if(dungtichxylanh>=0) {
            this.dungtichxylanh = dungtichxylanh;
        }else{
            this.dungtichxylanh = 0;
            System.out.println("Nhap lai dung tich xylanh");
        }
    }
    public float thuetruocba(){
        if(this.dungtichxylanh<100){
            return trigiaxe*1/100;
        }else if(this.dungtichxylanh<=200){
            return trigiaxe*3/100;
        }else{
            return trigiaxe*5/100;
        }
    }
    public String toString(){
        return String.format("%-20s %-15s %-14s %10.2f %15.2f",getChuxe(),getLoaixe(),getDungtichxylanh(),getTrigiaxe(),thuetruocba());
    }
}

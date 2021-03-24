public class SinhVien {
    private int MaSV;
    private String HoTen;
    private float DiemLT;
    private float DiemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        MaSV = maSV;
        HoTen = hoTen;
        DiemLT = diemLT;
        DiemTH = diemTH;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int maSV) {
        if(maSV <= 0){
            this.MaSV = 0;
        }else {
            this.MaSV = maSV;
        }
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        if(diemLT < 0 || diemLT > 10){
            this.DiemLT = 0;
        }else {
            this.DiemLT = diemLT;
        }
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float diemTH) {
        if(diemTH < 0 || diemTH > 10){
            this.DiemTH = 0;
        }else {
            this.DiemTH = diemTH;
        }
    }
    public float getDiemTB(){
        return (DiemLT + DiemTH)/2 ;

    }
    public String toString(){
        System.out.println(String.format("%5s %20s %10s %10s %10s",getMaSV(),getHoTen(),getDiemLT(),getDiemTH(),getDiemTB()));
        return null;
    }
}

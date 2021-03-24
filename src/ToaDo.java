public class ToaDo {
    public int x;
    public int y;
    public String TenToaDo;
    public ToaDo() {
    }

    public ToaDo(int x, int y, String tenToaDo) {
        this.x = x;
        this.y = y;
        TenToaDo = tenToaDo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTenToaDo() {
        return TenToaDo;
    }

    public void setTenToaDo(String tenToaDo) {
        TenToaDo = tenToaDo;
    }
    public String toString(){
        System.out.println("Toa Do " + getTenToaDo() + "(" + getX() + "," + getY() + ")") ;
        return null;
    }
}

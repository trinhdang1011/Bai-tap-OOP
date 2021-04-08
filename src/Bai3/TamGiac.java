package Bai3;

public class TamGiac {
    private double a;
    private double b;
    private double c;
    public TamGiac(){}
    public TamGiac(double a, double b,double c){

        if(a>0 && b>0 &&c>0){
            if(a+b>c && a+c>b && b+c>a){
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }else{
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }
    public void setA(double a){
        if(a<0){
            this.a = 0;
        }else{
            this.a = a;
        }
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        if(b<0){
            this.b = 0;
        }else{
            this.b = b;
        }
    }
    public double getB(){
        return b;
    }
    public void setC(double c){
        if(c<0){
            this.c = 0;
        }else{
            this.c = c;
        }
    }
    public double getC(){
        return c;
    }
    public double Chuvi(){
        return a+b+c;
    }
    public double Dientich(){
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public String Type(){
        if(this.a==0||this.b==0||this.c==0){
           return "Day khong phai la tam giac";
        }else if(a == b&& b==c){
            return "Day la tam giac can";
        }else if (a ==b || a==c || b==c){
            return "Day la tam giac deu";
        }else{
            return "Day la tam giac thuong";
        }
    }
    public String toString(){
        System.out.println(String.format("%10s %5s %5s %5s %10s %25s %30s",a,b,c,Chuvi(),Dientich(),Type()));
        return null;
    }
}

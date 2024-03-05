public class Misollar {
    private String color;
    private String modeli;
    private int prise;
    private String tizim;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getTizim() {
        return tizim;
    }

    public void setTizim(String tizim) {
        this.tizim = tizim;
    }
}


class Uchburchak {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void UchburchakYuzi(double a,double b,double c){
        double S=(a * b)/2;
        System.out.println(S);
    }
    public void UchburchakPerimetri (double a, double b, double c){
        double P=a+b+c;
        System.out.println(P);
    }
}

class Point{
    private double x;
    private double y;
    private double z;

    public Point(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

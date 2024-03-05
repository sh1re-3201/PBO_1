package Modul_2;

public class SegitigaMod {
    public double x1,y1,x2,y2,x3,y3;

    // Constructor
    public SegitigaMod(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getX1() {return x1;}

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double hitungSisi(double xa, double ya, double xb, double yb){
        return  Math.sqrt(Math.pow(xa-xb,2) + Math.pow(ya-yb,2));
    }
    public double hitungKeliling() {
        return hitungSisi(getX1(), getY1(), getX2(), getY2()) +
                hitungSisi(getX2(), getY2(), getX3(), getY3()) +
                hitungSisi(getX3(), getY3(), getX1(), getY1());
    }
    public double hitungLuas() {
        double s = hitungKeliling();
        return Math.sqrt(s * (s - hitungSisi(getX1(), getY1(), getX2(), getY2())) *
                (s - hitungSisi(getX2(), getY2(), getX3(), getY3())) *
                (s - hitungSisi(getX3(), getY3(), getX1(), getY1())));
    }
}

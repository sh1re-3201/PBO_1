package Modul_2;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga seg1 = new Segitiga();

        seg1.x1=1;
        seg1.y1=2;
        seg1.x2=7;
        seg1.y2=2;
        seg1.x3=7;
        seg1.y3=9;

        System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan (7,9) adalah :\n"+ seg1.hitungLuas());

        Segitiga seg2 = new Segitiga();

        seg2.x1=0;
        seg2.y1=0;
        seg2.x2=5;
        seg2.y2=4;
        seg2.x3=8;
        seg2.y3=2;

        System.out.println("Luas segitiga dengan titik (0,0) (5,4) dan (8,2) adalah :\n"+ seg2.hitungLuas());



    }
}

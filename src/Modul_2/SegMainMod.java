package Modul_2;

public class SegMainMod {
    public static void main(String[] args) {
        SegitigaMod segi1 = new SegitigaMod(1, 2, 7, 2, 7, 9);

        segi1.setX1(1);
        segi1.setY1(2);
        segi1.setX2(7);
        segi1.setY2(2);
        segi1.setX3(7);
        segi1.setY3(9);

        System.out.println("Luas segiitiga dengan titik (1,2) (7,2) dan (7,9) adalah :\n"+ segi1.hitungLuas());

        SegitigaMod segi2 = new SegitigaMod(0, 0, 5, 4, 8, 2);

        segi2.setX1(0);
        segi2.setY1(0);
        segi2.setX2(5);
        segi2.setY2(4);
        segi2.setX3(8);
        segi2.setY3(2);

        System.out.println("Luas segiitiga dengan titik (0,0) (5,4) dan (8,2) adalah :\n"+ segi2.hitungLuas());

    }
}

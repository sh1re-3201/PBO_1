package Modul_1;

public class Lingkaran {
    double r;
    double luas;
    final double PHI=3.14;// Menginisialisasi attribut PHI bertipe double yang final(tidak bisa diubah)

    Lingkaran(){}// Konstruktor Lingkaran

    public void luas(){// Metode Luas akan dieksekusi untuk menghitung luas lingkaran
        r = 7;
        luas = PHI * r * r;// Rumus luas lingkaran

        System.out.println("Luas lingkaran dengan jari-jari =" + r + " adalah : " +luas);
    }
}

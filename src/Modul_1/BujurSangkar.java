package Modul_1;

public class BujurSangkar extends BujurSangkarMain {// Membuat kelas BujurSangkar
    int sisi;
    double luas;

    BujurSangkar(){}// Konstruktor BujurSangkar

    public double luas(){// Metode yang akan dieksekusi oleh main untuk menghitung luas bujur sangkar
        luas = sisi*sisi;
        return luas;// Mengembalikan nilai luas ke main
    }
}

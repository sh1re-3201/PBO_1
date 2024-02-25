package Modul_1;

public class BukuMain {
    public static void main(String[] args) {
        Buku judul1 = new Buku("Struktur Data", "1304595");
        judul1.pinjam();

        Buku judul2 = new Buku("Java Fundamentals", "1304500");
        judul2.kembali();

    }
}

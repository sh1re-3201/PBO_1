package Modul_1;

public class BukuMain {
    public static void main(String[] args) {
        // Membuat objek baru pada kelas 'Buku' dengan nama 'judul1' berisi judul dan ISBN dari objeknya
        Buku judul1 = new Buku("Struktur Data", "1304595");
        judul1.pinjam();// Memanggil metode 'pinjam' dengan objek 'judul1'

        // Membuat objek baru pada kelas 'Buku' dengan nama 'judul2' berisi judul dan ISBN dari objeknya
        Buku judul2 = new Buku("Java Fundamentals", "1304500");
        judul2.kembali();// Memanggil metode 'kembali' dengan objek 'judul2'


    }
}

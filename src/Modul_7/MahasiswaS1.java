package Modul_7;

import Modul_4.Mahasiswa;// Mengimpor class Mahasiswa dari package Modul_4 agar bisa digunakan pada class ini

public class MahasiswaS1 extends Mahasiswa { // Keyword extends berfungsi sebagai penanda bahwa class ini merupakan SubClass dari class Mahasiswa

    public MahasiswaS1(String namaMhs) {
        super(namaMhs);
    }// Constructor class MahasiswaS1

    @Override // Annotation yang berfungsi untuk menandakan bahwa method ini merupakan method yang di override dari Superclassnya
    public char predikat() {
        // Method predikat yang di-override dari SuperClassnya ini berfungsi untuk menentukan nilai akhir dari mahasiswa sesuai dengan hasil dari method hitungNilaiFinal
        // Method ini bekerja dengan menggunakan logika if-else yang membandingkan value dari nilaiAkhir dengan batas-batas yang sudah ditentukan
        // Jika sudah ditemukan logika yang menghasilkan nilai true maka akan mengembalikan sebuah predikat berupa char
        double nilaiAkhir = hitungNilaiFinal();
        if (nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 56) {
            return 'C';
        } else if (nilaiAkhir >= 45) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
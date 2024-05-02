package Modul_8;

import Modul_4.Mahasiswa;

public class MahasiswaS1Mod extends Mahasiswa {

    public MahasiswaS1Mod(String namaMhs) {
        super(namaMhs);
    }

    @Override // Annotation yang berfungsi untuk menandakan bahwa method ini merupakan method yang di override dari Superclass
    public char predikat() {
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
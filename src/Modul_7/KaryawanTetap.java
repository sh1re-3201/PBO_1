package Modul_7;

public class KaryawanTetap extends Karyawan {// Keyword extends berfungsi sebagai penanda bahwa class ini merupakan SubClass dari class Karyawan
    private int gajiPokok;

    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {// Constructor dari class KaryawanTetap
        super(npp, nama, jumlahAnak);// Keyword super berfungsi agar sebuah constructor SubClass dapat menggunakan fungsi dari constructor SuperClassnya tanpa menulis ulang
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok(){return gajiPokok;}// Method yang berfungsi untuk memanggil value dari attribut objek gajiPokok yang sudah di set

    public int hitungGajiTotal() {
        return gajiPokok + hitungTunjanganAnak();
    }// Method ini berfungsi untuk menghitung total gaji yang diterima oleh seorang karyawan
}
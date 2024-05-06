package Modul_7;

public class KaryawanKontrak extends Karyawan { // Keyword extends berfungsi sebagai penanda bahwa class ini merupakan SubClass dari class Karyawan
    private int upahHarian;
    private int jumlahHariMasuk;

    // Konstruktor class KaryawanKontrak
    // Karena konstruktor ini menggunakan beberapa parameter dari SuperClassnya maka tanpa menulis kembali keseluruhan perintahnya digunakan keyword super
    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        super(npp, nama, jumlahAnak);// Keyword super berfungsi agar sebuah constructor SubClass dapat menggunakan fungsi dari constructor SuperClassnya tanpa menulis ulang
        this.upahHarian = upahHarian;// Keyword 'this' berfungsi supaya variabel yang dipakaikan 'this.' merujuk pada parameter di konstruktor
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public int getUpahHarian() {
        return upahHarian;
    }// Method yang berfungsi untuk memanggil value dari attribut objek upahHarian yang sudah di set menggunakan Constructor

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }// Method yang berfungsi untuk memanggil value dari attribut jumlahHariMasuk yang akan dipakai pada saat penghitungan upahTotal

    public int hitungUpahTotal() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjanganAnak();
    }// Method ini berfungsi untuk menghitung upah perhari yang diterima oleh seorang karyawan
}
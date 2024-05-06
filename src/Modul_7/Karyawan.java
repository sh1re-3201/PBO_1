package Modul_7;

public class Karyawan {

    // Attribut dengan akses protected agar dapat digunakan oleh seluruh SubClass dari SuperClass Karyawan
    protected static final int subsidiPerAnak = 100000; // Subsidi per anak yang bersifat final tidak bisa diubah
    protected int npp;
    protected String nama;
    protected int jumlahAnak;

    // Konstruktor dari Class Karyawan yang nanti akan dipakai oleh SubClass
    public Karyawan(int npp, String nama, int jumlahAnak) {
        // Keyword 'this' berfungsi supaya variabel yang dipakaikan 'this.' merujuk pada parameter di konstruktor
        this.npp = npp;
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }

    public int getNpp() {
        return npp;
    } // Method yang berfungsi untuk memanggil npp dari objek yang sudah di set

    public String getNamaPegawai() {
        return nama;
    }// Method yang berfungsi untuk memanggil nama pegawai dari objek yang sudah di set

    public int getJumlahAnak() {
        return jumlahAnak;
    }// Method yang berfungsi untuk memanggil jumlah anak dari objek yang sudah di set yang nantinya akan dipakai dalam penghitungan gaji/upah total

    public int hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }// Method yang berfungsi untuk menghitung total tunjangan anak sesuai dengan objek yang sudah di set
}
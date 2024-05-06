package Modul_7;

import java.util.Scanner;// Mengimpor scanner dari pustaka java.util

public class MainPerusahaankami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Membuat scanner baru dengan nama input

        System.out.print("Masukkan Jumlah Hari Masuk Karyawan Kontrak : ");
        int hariMasuk = input.nextInt(); // Memasukkan jumlah hari masuk dari karyawan kontak

        // Membuat objek baru (tetap) pada class KaryawanTetap sekaligus mengisi npp, nama, jumlahAnak dan gajipokok
        KaryawanTetap tetap = new KaryawanTetap(1224121, "Aladin", 2, 5000000);
        int totalGajiTetap = tetap.hitungGajiTotal();// Membuat variabel baru bertipe integer yang akan berisi hasil dari method hitungGajiTotal dari objek tetap

        // Mencetak biodata dari karyawan tetap yang sudah di set
        System.out.println("Nama Karyawan Tetap: " + tetap.getNamaPegawai());
        System.out.println("NPP Karyawan Tetap: " + tetap.getNpp());
        System.out.println("Jumlah Anak Karyawan Tetap: " + tetap.getJumlahAnak());
        System.out.println("Gaji Pokok Karyawan Tetap: " + tetap.getGajiPokok());
        System.out.println("Total Tunjangan Anak Karyawan Tetap: " + tetap.hitungTunjanganAnak());
        System.out.println("Total Gaji Karyawan Tetap: " + totalGajiTetap);

        System.out.println("===========================================");
        System.out.println();
        System.out.println("===========================================");

        // Membuat objek baru (kontrak) pada class KaryawanKontak sekaligus mengisi npp, nama, jumlahAnak, upahHarian dan hari masuk
        KaryawanKontrak kontrak = new KaryawanKontrak(12531131, "Asephus Painganensis", 1, 150000, hariMasuk);
        int totalUpahKontrak = kontrak.hitungUpahTotal();// Membuat variabel baru bertipe integer yang akan berisi hasil dari method hitungUpahTotal dari objek kontak

        // Mencetak biodata dari karyawan kontrak yang sudah di set
        System.out.println("Nama Karyawan Kontrak: " + kontrak.getNamaPegawai());
        System.out.println("NPP Karyawan Kontrak: " + kontrak.getNpp());
        System.out.println("Jumlah Anak Karyawan Kontrak: " + kontrak.getJumlahAnak());
        System.out.println("Upah Harian Karyawan Kontrak: " + kontrak.getUpahHarian());
        System.out.println("Jumlah Hari Masuk Karyawan Kontrak: " + kontrak.getJumlahHariMasuk());
        System.out.println("Total Tunjangan Anak Karyawan Kontrak: " + kontrak.hitungTunjanganAnak());
        System.out.println("Total Upah Karyawan Kontrak: " + totalUpahKontrak);
    }
}
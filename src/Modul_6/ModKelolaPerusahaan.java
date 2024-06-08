package Modul_6;

import java.util.Scanner;

public class ModKelolaPerusahaan {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);

        System.out.print("Masukkan jumlah pegawai: ");
        int jumlahPegawai = aria.nextInt();
        aria.nextLine();

        newPegawai[] pegawai = new newPegawai[jumlahPegawai];

        for (int i = 0; i < jumlahPegawai; i++) {
            pegawai[i] = new newPegawai();
            System.out.println("Masukkan data pegawai ke-" + i);
            System.out.print("Nama: ");
            pegawai[i].setNama(aria.nextLine());
            System.out.print("NPP: ");
            pegawai[i].setNpp(aria.nextInt());
            System.out.print("""
                    Masukkan Golongan:
                    1. 1300000
                    2. 1750000
                    3. 2000000
                    Pilih: 
                    """);
            pegawai[i].setGolongan(aria.nextInt());
            System.out.print("""
                    Apakah karyawan ini sudah menikah?
                    1. Ya
                    2. Tidak
                    Pilih :
                    """);
            int menikah = aria.nextInt();
            pegawai[i].hitungTunjanganKeluarga(menikah);
            if (menikah == 1) {
                System.out.print("Masukkan jumlah anak: ");
                pegawai[i].setAnak(aria.nextInt());
                aria.nextLine();
            } else {
                pegawai[i].setAnak(0);
                aria.nextLine();
            }
        }
        // Menampilkan data
        System.out.println("\nData Pegawai: ");
        for (newPegawai pegawai1 : pegawai) {
            System.out.println("Nama: " + pegawai1.getNama());
            System.out.println("NPP: " + pegawai1.getNpp());
            System.out.println("Golongan: " + pegawai1.getGolongan());
            System.out.println("Gaji Pokok: " + pegawai1.hitungGajiPokok());
            System.out.println("Tunjangan: " + pegawai1.getTunjangan());
            System.out.println("Gaji Total: " + pegawai1.hitungGajiTotal());
            System.out.println();
        }

        // Menghitung rerata gaji dari setiap pegawai
        int totalGaji = 0;
        for (newPegawai pegawai1 : pegawai) {
            totalGaji += pegawai1.hitungGajiTotal();
        }
        double rataGaji = (double) totalGaji / jumlahPegawai;
        System.out.println("Rata-rata gaji: " + rataGaji);

        // Mencari pegawai dengan gaji paling tinggi
        int gajiTinggi = Integer.MIN_VALUE;
        String namaPegawaiGajiTinggi = "";
        for (newPegawai pegawai1 : pegawai) {
            if (pegawai1.hitungGajiTotal() > gajiTinggi) {
                gajiTinggi = pegawai1.hitungGajiTotal();
                namaPegawaiGajiTinggi = pegawai1.getNama();
            }
        }
        System.out.println("Pegawai dengan gaji tertinggi: " + namaPegawaiGajiTinggi);
    }
}

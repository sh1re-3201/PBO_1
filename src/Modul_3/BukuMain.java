package Modul_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BukuMain {
    // Deklarasi objek sebagai variabel kelas
    private static BukuGetSet buku1;
    private static BukuGetSet buku2;
    private static BukuGetSet buku3;
    private static BukuGetSet buku4;

    private static Penerbit terbit1;
    private static Penerbit terbit2;
    private static Penerbit terbit3;
    private static Penerbit terbit4;

    public static void main(String[] args) {
        // Inisialisasi objek terbit
        terbit1 = new Penerbit();
        terbit2 = new Penerbit();
        terbit3 = new Penerbit();
        terbit4 = new Penerbit();

        // Inisialisasi objek buku
        buku1 = new BukuGetSet(terbit1);
        buku2 = new BukuGetSet(terbit2);
        buku3 = new BukuGetSet(terbit3);
        buku4 = new BukuGetSet(terbit4);

        // Set data buku
        buku1.setJudulBuku("Nusa utara dari Lintasan Niaga Ke Daerah Perbatasan");
        buku1.setKodeBuku("A2167");
        buku1.setPengarang("ULAEN, Alex John");
        buku1.setTahunTerbit(2016);

        buku2.setJudulBuku("Pariwisata Primata Indonesia");
        buku2.setKodeBuku("A2168");
        buku2.setPengarang("Supriatna, Jatna; Rizki Ramadhan");
        buku2.setTahunTerbit(2016);

        buku3.setJudulBuku("Berani Tidak Disukai");
        buku3.setKodeBuku("A2169");
        buku3.setPengarang("Ichiro Kishimi; Fumitake Koga");
        buku3.setTahunTerbit(2019);

        buku4.setJudulBuku("Sapiens Grafis: Kelahiran Umat Manusia");
        buku4.setKodeBuku("A2170");
        buku4.setPengarang("Yuval Noah Harari");
        buku4.setTahunTerbit(2021);

        // Set data Penerbit
        terbit1.setNamaPenerbit("Penerbit Ombak");
        terbit1.setTanggalBerdiri("8 Februari 2002");
        terbit1.setAlamat("Jl. Progo B-15,Yogyakarta 55599");

        terbit2.setNamaPenerbit("Yayasan Pustaka Obor Indonesia");
        terbit2.setTanggalBerdiri("Tahun 1983");
        terbit2.setAlamat("Jl. Plaju 10, Jakarta 10230");

        terbit3.setNamaPenerbit("Gramedia Pustaka Utama");
        terbit3.setTanggalBerdiri("25 Maret 1974");
        terbit3.setAlamat("Gedung Kompas Gramedia Blok 1 lt. 5, Jl. Palmerah Barat No.29-37 Jakarta 10270 Indonesia");

        terbit4.setNamaPenerbit("Kepustakaan Populer Gramedia");
        terbit4.setTanggalBerdiri("1 Juni 1996");
        terbit4.setAlamat("Gedung Kompas Gramedia Blok 1 lt. 5, Jl. Palmerah Barat No.29-37 Jakarta 10270 Indonesia");

        // Panggil method output()
        BukuMain outputBuku = new BukuMain();
        outputBuku.output();
    }

    void output() {
        Scanner aria = new Scanner(System.in);
        byte pilihan;

        while (true) {
            try {
                System.out.println("Menu Pilihan Buku:\n 1. " + buku1.getJudulBuku() + "\n 2. " + buku2.getJudulBuku() + "\n 3. " + buku3.getJudulBuku() + "\n 4. " + buku4.getJudulBuku() + "\n 5. System Exit");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan = aria.nextByte();
                switch (pilihan) {
                    case 1:
                        System.out.println("1.");
                        System.out.printf("%-30s %-70s\n", "Judul Buku:", buku1.getJudulBuku());
                        System.out.printf("%-30s %-70s\n", "Nama Pengarang:", buku1.getPengarang());
                        System.out.printf("%-30s %-70s\n", "Nama Penerbit:", buku1.getPenerbit().getNamaPenerbit());
                        System.out.printf("%-30s %-70s\n", "Kode Buku:", buku1.getKodeBuku());
                        if (buku1.getTahunTerbit() > 2019){
                            System.out.printf("%-30s %-70s\n","Keterangan :", "BUKU LAMA");
                        } else {
                            System.out.printf("%-30s %-70s\n","Keterangan :","BUKU BARU");
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("\n2.");
                        System.out.printf("%-30s %-70s\n", "Judul Buku:", buku2.getJudulBuku());
                        System.out.printf("%-30s %-70s\n", "Nama Pengarang:", buku2.getPengarang());
                        System.out.printf("%-30s %-70s\n", "Nama Penerbit:", buku2.getPenerbit().getNamaPenerbit());
                        System.out.printf("%-30s %-70s\n", "Kode Buku:", buku2.getKodeBuku());
                        if (buku2.getTahunTerbit() > 2019){
                            System.out.printf("%-30s %-70s\n","Keterangan :", "BUKU LAMA");
                        } else {
                            System.out.printf("%-30s %-70s\n","Keterangan :","BUKU BARU");
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("\n3.");
                        System.out.printf("%-30s %-70s\n", "Judul Buku:", buku3.getJudulBuku());
                        System.out.printf("%-30s %-70s\n", "Nama Pengarang:", buku3.getPengarang());
                        System.out.printf("%-30s %-70s\n", "Nama Penerbit:", buku3.getPenerbit().getNamaPenerbit());
                        System.out.printf("%-30s %-70s\n", "Kode Buku:", buku3.getKodeBuku());
                        if (buku3.getTahunTerbit() > 2019){
                            System.out.printf("%-30s %-70s\n","Keterangan :", "BUKU LAMA");
                        } else {
                            System.out.printf("%-30s %-70s\n","Keterangan :","BUKU BARU");
                        }
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("\n4.");
                        System.out.printf("%-30s %-70s\n", "Judul Buku:", buku4.getJudulBuku());
                        System.out.printf("%-30s %-70s\n", "Nama Pengarang:", buku4.getPengarang());
                        System.out.printf("%-30s %-70s\n", "Nama Penerbit:", buku4.getPenerbit().getNamaPenerbit());
                        System.out.printf("%-30s %-70s\n", "Kode Buku:", buku4.getKodeBuku());
                        if (buku4.getTahunTerbit() > 2019){
                            System.out.printf("%-30s %-70s\n","Keterangan :", "BUKU LAMA");
                        } else {
                            System.out.printf("%-30s %-70s\n","Keterangan :","BUKU BARU");
                        }
                        System.out.println();
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Pilihan Anda Salah. Silahkan Coba Lagi");

                }
            } catch (InputMismatchException e) {
                System.out.println("Masukkan Pilihan Berupa Angka. Silahkan Coba Lagi");
                aria.nextLine();
                System.out.println();
            }
        }
    }
}


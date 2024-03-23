package Modul_4;

import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);

        // Meminta masukan jumlah buku baru
        System.out.print("Masukkan jumlah buku baru: ");
        int jumlahBuku = aria.nextInt();
        aria.nextLine(); // Membuang newline

        // Membuat array of objects untuk menyimpan buku-buku
        Buku[] daftarBuku = new Buku[jumlahBuku];

        // Memasukkan informasi buku ke dalam array
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Masukkan informasi buku ke-" + (i + 1) + ":");
            daftarBuku[i] = new Buku();
            System.out.print("Kode Buku: ");
            daftarBuku[i].setKodeBuku(aria.nextLine());
            System.out.print("Judul: ");
            daftarBuku[i].setJudul(aria.nextLine());
            System.out.print("Tahun Terbit: ");
            daftarBuku[i].setTahunTerbit(aria.nextInt());
            aria.nextLine(); // Membuang newline
            System.out.print("Nama Pengarang: ");
            daftarBuku[i].setNamaPengarang(aria.nextLine());
        }

        // Menampilkan daftar buku lengkap
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.getInfo());
        }

        // Menampilkan jumlah buku yang terbit pada tahun tertentu
        System.out.print("\nMasukkan tahun untuk mencari jumlah buku terbit: ");
        int tahunCari = aria.nextInt();
        int jumlahBukuTahun = 0;
        for (Buku buku : daftarBuku) {
            if (buku.getTahunTerbit() == tahunCari) {
                jumlahBukuTahun++;
            }
        }
        System.out.println("Jumlah buku terbit pada tahun " + tahunCari + " adalah: " + jumlahBukuTahun);

        // Menampilkan data buku yang ditulis oleh pengarang tertentu
        aria.nextLine(); // Membuang newline
        System.out.print("\nMasukkan nama pengarang untuk mencari buku: ");
        String namaPengarangCari = aria.nextLine();
        System.out.println("Daftar buku yang ditulis oleh " + namaPengarangCari + ":");
        for (Buku buku : daftarBuku) {
            if (buku.getNamaPengarang().equalsIgnoreCase(namaPengarangCari)) {
                System.out.println(buku.getInfo());
            }
        }
    }
}

package Modul_5;

import javax.swing.*;

public class KelolaBuku {
    public static void main(String[] args) {
        int jumlahBuku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku baru yang akan disimpan: "));
        Buku[] daftarBuku = new Buku[jumlahBuku];

        // b. For each book object:
        for (int i = 0; i < jumlahBuku; i++) {
            //    - Create a book object and enter the book code, title, author, year of publication.
            Buku buku = new Buku();
            buku.setKodeBuku(JOptionPane.showInputDialog("Masukkan kode buku: "));
            buku.setJudul(JOptionPane.showInputDialog("Masukkan judul buku: "));
            buku.setTahunTerbit(Integer.parseInt(JOptionPane.showInputDialog("Masukkan tahun terbit buku: ")));

            //    - Ask for input in the form of the number of authors.
            int jumlahPengarang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pengarang: "));
            Pengarang[] daftarPengarang = new Pengarang[jumlahPengarang];

            //    - Enter author data according to the number of authors.
            for (int j = 0; j < jumlahPengarang; j++) {
                Pengarang pengarang = new Pengarang();
                pengarang.setNik(JOptionPane.showInputDialog("Masukkan NIK pengarang: "));
                pengarang.setNama(JOptionPane.showInputDialog("Masukkan nama pengarang: "));
                pengarang.setAlamat(JOptionPane.showInputDialog("Masukkan alamat pengarang: "));
                daftarPengarang[j] = pengarang;
            }

            //    - Set the list of authors in the Buku class.
            buku.setDaftarPengarang(daftarPengarang);
            daftarBuku[i] = buku;
        }
        for (Buku buku : daftarBuku) {
            System.out.println("Kode Buku: " + buku.getKodeBuku());
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
            System.out.println("Pengarang:");
            for (Pengarang pengarang : buku.getDaftarPengarang()) {
                System.out.println("  NIK: " + pengarang.getNik());
                System.out.println("  Nama: " + pengarang.getNama());
                System.out.println("  Alamat: " + pengarang.getAlamat());
            }
            System.out.println();
        }
        int minYear = Integer.MAX_VALUE;
        int maxYear = Integer.MIN_VALUE;
        Buku oldestBook = null;
        Buku latestBook = null;
        for (Buku buku : daftarBuku) {
            if (buku.getTahunTerbit() < minYear) {
                minYear = buku.getTahunTerbit();
                oldestBook = buku;
            }
            if (buku.getTahunTerbit() > maxYear) {
                maxYear = buku.getTahunTerbit();
                latestBook = buku;
            }
        }
        System.out.println("Buku terbitan paling lama: " + oldestBook.getJudul() + ", tahun terbit: " + oldestBook.getTahunTerbit());
        System.out.println("Buku terbitan paling akhir: " + latestBook.getJudul() + ", tahun terbit: " + latestBook.getTahunTerbit());
    }
}

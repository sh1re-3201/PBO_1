package Modul_6;


import javax.swing.JOptionPane;

public class ModKelolaBuku {
    public static void main(String[] args) {
        int jumlahBuku = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah buku baru yang akan disimpan: "));
        ModBuku[] daftarBuku = new ModBuku[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            ModBuku buku = new ModBuku();
            buku.setKodeBuku(JOptionPane.showInputDialog("Masukkan kode buku: "));
            buku.setJudul(JOptionPane.showInputDialog("Masukkan judul buku: "));
            buku.setTahunTerbit(Integer.parseInt(JOptionPane.showInputDialog("Masukkan tahun terbit buku: ")));

            int jumlahPengarang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pengarang: "));
            buku.setDaftarPengarang(jumlahPengarang);

            for (int j = 0; j < jumlahPengarang; j++) {
                ModPengarang pengarang = new ModPengarang();
                pengarang.setNik(JOptionPane.showInputDialog("Masukkan NIK pengarang: "));
                pengarang.setNama(JOptionPane.showInputDialog("Masukkan nama pengarang: "));
                pengarang.setAlamat(JOptionPane.showInputDialog("Masukkan alamat pengarang: "));
                buku.tambahPengarang(pengarang);
            }
            daftarBuku[i] = buku;
        }
        for (ModBuku buku : daftarBuku) {
            System.out.println("Kode Buku: " + buku.getKodeBuku());
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
            System.out.println("Pengarang:");
            for (ModPengarang pengarang : buku.getDaftarPengarang()) {
                System.out.println("  NIK: " + pengarang.getNik());
                System.out.println("  Nama: " + pengarang.getNama());
                System.out.println("  Alamat: " + pengarang.getAlamat());
            }
            System.out.println();
        }
        int minYear = Integer.MAX_VALUE;
        int maxYear = Integer.MIN_VALUE;
        ModBuku oldestBook = null;
        ModBuku latestBook = null;
        for (ModBuku buku : daftarBuku) {
            if (buku.getTahunTerbit() < minYear) {
                minYear = buku.getTahunTerbit();
                oldestBook = buku;
            }
            if (buku.getTahunTerbit() > maxYear) {
                maxYear = buku.getTahunTerbit();
                latestBook = buku;
            }
        }

        int tahun = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tahun yang ingin dicari: "));
        int jumlahBukuTahun = hitungBukuTahunTerbit(daftarBuku, tahun);


        System.out.println("Jumlah Buku terbitan pada tahun " + tahun + ": " + jumlahBukuTahun);
        System.out.println("ModBuku terbitan paling lama: " + oldestBook.getJudul() + ", tahun terbit: " + oldestBook.getTahunTerbit());
        System.out.println("ModBuku terbitan paling akhir: " + latestBook.getJudul() + ", tahun terbit: " + latestBook.getTahunTerbit());

    }

    public static int hitungBukuTahunTerbit(ModBuku[] daftarBuku, int tahun) {
        int jumlah = 0;
        for (ModBuku buku : daftarBuku) {
            if (buku.isTerbitTahun(tahun)) {
                jumlah++;
            }
        }
        return jumlah;
    }
}

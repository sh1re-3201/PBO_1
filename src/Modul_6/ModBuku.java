package Modul_6;

import Modul_6.ModPengarang;

public class ModBuku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private ModPengarang[] daftarPengarang;
    private int jumlahPengarang = 0;

    public ModBuku() {}

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public ModPengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }

    public void setDaftarPengarang(int jumlahPengarang) {
        daftarPengarang = new ModPengarang[jumlahPengarang];
    }

    public void tambahPengarang(ModPengarang pengarang) {
        if (jumlahPengarang < daftarPengarang.length) {
            daftarPengarang[jumlahPengarang] = pengarang;
            jumlahPengarang++;
        } else {
            System.out.println("Daftar pengarang sudah penuh.");
        }
    }

    public boolean isTerbitTahun(int tahun) {
        return this.tahunTerbit == tahun;
    }
}

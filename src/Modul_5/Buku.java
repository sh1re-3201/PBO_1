package Modul_5;

public class Buku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private Pengarang[] daftarPengarang;

    public Buku() {}

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

    public Pengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }

    public void setDaftarPengarang(Pengarang[] daftarPengarang) {
        this.daftarPengarang = daftarPengarang;
    }
}

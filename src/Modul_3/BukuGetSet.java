package Modul_3;

public class BukuGetSet {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private Penerbit Penerbit;
    private int tahunTerbit;


    public BukuGetSet(Penerbit Penerbit) {// Constructor BukuGetSet
        this.Penerbit = Penerbit;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPenerbit(Modul_3.Penerbit Penerbit) {
        this.Penerbit = Penerbit;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public Penerbit getPenerbit() {
        return Penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}

package Modul_3;

public class bukuGetSet {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private penerbit Penerbit;
    private int tahunTerbit;


    public bukuGetSet(penerbit Penerbit) {// Constructor bukuGetSet
        this.Penerbit = Penerbit;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPenerbit(penerbit Penerbit) {
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

    public penerbit getPenerbit() {
        return Penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}

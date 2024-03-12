package Modul_3;

public class bukuGetSet {
    private int kodeBuku;
    private String judulBuku;
    private String pengarang;
    private penerbit Penerbit;


    public bukuGetSet(penerbit Penerbit) {// Constructor bukuGetSet
        this.Penerbit = Penerbit;
    }

    public void setKodeBuku(int kodeBuku) {
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

    public int getKodeBuku() {
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
}

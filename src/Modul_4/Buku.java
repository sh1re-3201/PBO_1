package Modul_4;

public class Buku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private String namaPengarang;

    // Konstruktor untuk inisialisasi buku
    public Buku() {}

    // Getter dan setter untuk kodeBuku
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    // Getter dan setter untuk judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan setter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // Getter dan setter untuk namaPengarang
    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    // Metode untuk mendapatkan informasi buku
    public String getInfo() {
        return "Kode Buku: " + kodeBuku + ", Judul: " + judul + ", Tahun Terbit: " + tahunTerbit + ", Pengarang: " + namaPengarang;
    }
}

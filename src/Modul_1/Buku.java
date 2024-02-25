package Modul_1;

public class Buku {
    private String judul;
    private String pengarang;
    private String ISBN;
    private String penerbit;
    private String kategori;

    public Buku(String judul, String ISBN) {
        judul = judul;
        ISBN = ISBN;
    }

    public void pinjam() {
        System.out.println("Sedang dipinjam");
    }

    public void kembali() {
        System.out.println("Sudah dikembalikan");
    }
}

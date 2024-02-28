package Modul_1;
public class Buku {// kelas Buku untuk menjadi wadah perintah yang akan di eksekusi oleh kelas 'BukuMain'
    // Mendeklerasikan atribut dari kelas buku
    private String judul;
    private String pengarang;
    private String ISBN;
    private String penerbit;
    private String kategori;

    public Buku(String judul, String ISBN) {// Metode konstruktor dengan parameter judul dan ISBN bertipe String
        judul = judul;
        ISBN = ISBN;
    }

    public void pinjam() {// Metode pinjam akan dicetak jika buku sedang dipinjam
        System.out.println("Buku yang anda pilih saat ini sedang dipinjam");
        System.out.println("Terima Kasih");
        System.out.println("");
    }

    public void kembali() {// Metode kembali akan dicetak jika buku sudak dikembalikan
        System.out.println("Buku sudah berhasil dikembalikan");
        System.out.println("Terima Kasih");
    }
}

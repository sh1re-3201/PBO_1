package Modul_3;

public class bukuMain {
    public static void main(String[] args) {
        penerbit terbit1 = new penerbit();// Objek baru pada kelas penerbit bernama 'terbit1'
        bukuGetSet buku1 = new bukuGetSet(terbit1);// Objek baru pada kelas bukuGetSet bernama 'buku1'

        buku1.setJudulBuku("Nusa utara dari Lintasan Niaga Ke Daerah Perbatasan");
        buku1.setKodeBuku(1);
        buku1.setPengarang("Adrian B. Lapian");
        // Isi penerbit disini
        terbit1.setNamaPenerbit("Ombak");
        buku1.setPenerbit(terbit1);

        System.out.println(buku1.getPenerbit());





    }
}

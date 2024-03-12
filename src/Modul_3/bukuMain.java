package Modul_3;

public class bukuMain {
    public static void main(String[] args) {
        penerbit terbit1 = new penerbit();// Objek baru pada kelas penerbit bernama 'terbit1'
        penerbit terbit2 = new penerbit();// Objek baru pada kelas penerbit bernama 'terbit2'
        penerbit terbit3 = new penerbit();// Objek baru pada kelas penerbit bernama 'terbit3'
        penerbit terbit4 = new penerbit();// Objek baru pada kelas penerbit bernama 'terbit4'
        bukuGetSet buku1 = new bukuGetSet(terbit1);// Objek baru pada kelas bukuGetSet bernama 'buku1'
        bukuGetSet buku2 = new bukuGetSet(terbit2);// Objek baru pada kelas bukuGetSet bernama 'buku2'
        bukuGetSet buku3 = new bukuGetSet(terbit3);// Objek baru pada kelas bukuGetSet bernama 'buku3'
        bukuGetSet buku4 = new bukuGetSet(terbit4);// Objek baru pada kelas bukuGetSet bernama 'buku4'

        // Buku 1
        buku1.setJudulBuku("Nusa utara dari Lintasan Niaga Ke Daerah Perbatasan");
        buku1.setKodeBuku("A2167");
        buku1.setPengarang("ULAEN, Alex John");
        buku1.setTahunTerbit(2016);

        // Buku 2
        buku2.setJudulBuku("Pariwisata Primata Indonesia");
        buku2.setKodeBuku("A2168");
        buku2.setPengarang("Supriatna, Jatna; Rizki Ramadhan");
        buku2.setTahunTerbit(2016);

        // Buku 3
        buku3.setJudulBuku("Berani Tidak Disukai");
        buku3.setKodeBuku("A2169");
        buku3.setPengarang("Ichiro Kishimi; Fumitake Koga");
        buku3.setTahunTerbit(2019);

        // Buku 4
        buku4.setJudulBuku("Sapiens Grafis: Kelahiran Umat Manusia");
        buku4.setKodeBuku("A2170");
        buku4.setPengarang("Yuval Noah Harari");
        buku4.setTahunTerbit(2021);

        // Penerbit 1
        terbit1.setNamaPenerbit("Penerbit Ombak");
        terbit1.setTanggalBerdiri("8 Februari 2002");
        terbit1.setAlamat("Jl. Progo B-15,Yogyakarta 55599");

        // Penerbit 2
        terbit2.setNamaPenerbit("Yayasan Pustaka Obor Indonesia");
        terbit2.setTanggalBerdiri("Tahun 1983");
        terbit2.setAlamat("Jl. Plaju 10, Jakarta 10230");

        // Penerbit 3
        terbit3.setNamaPenerbit("Gramedia Pustaka Utama");
        terbit3.setTanggalBerdiri("25 Maret 1974");
        terbit3.setAlamat("Gedung Kompas Gramedia Blok 1 lt. 5, Jl. Palmerah Barat No.29-37 Jakarta 10270 Indonesia");

        // Penerbit 4
        terbit4.setNamaPenerbit("Kepustakaan Populer Gramedia");
        terbit4.setTanggalBerdiri("1 Juni 1996");
        terbit4.setAlamat("Gedung Kompas Gramedia Blok 1 lt. 5, Jl. Palmerah Barat No.29-37 Jakarta 10270 Indonesia");



        // Menampilkan data buku
        System.out.println("1.");
        System.out.printf("%-30s %-70s\n", "Judul Buku:", buku1.getJudulBuku());
        System.out.printf("%-30s %-70s\n", "Nama Pengarang:", buku1.getPengarang());
        System.out.printf("%-30s %-70s\n", "Nama Penerbit:", buku1.getPenerbit().getNamaPenerbit());
        System.out.printf("%-30s %-70s\n", "Kode Buku:", buku1.getKodeBuku());
    }
    void output(){
        System.out.println("1.");
        System.out.printf("%-30s %-70s\n", "Judul Buku:", buku1.getJudulBuku());
        System.out.printf("%-30s %-70s\n", "Nama Pengarang:", buku1.getPengarang());
        System.out.printf("%-30s %-70s\n", "Nama Penerbit:", buku1.getPenerbit().getNamaPenerbit());
        System.out.printf("%-30s %-70s\n", "Kode Buku:", buku1.getKodeBuku());
    }
}

package Modul_4;

public class Mahasiswa {
    // Attribut dari class Mahasiswa bersifat private bukan protected maka tidak bisa digunakan oleh SubClassnya
    private String nama;
    private String nim;
    private String tglLahir;
    private double uts1;
    private double uts2;
    private double uas;
    private double nilaiAkhirHitung;

    public Mahasiswa(String namaMhs){
        this.nama = namaMhs;
    }// Constructor class Mahasiswa

    public String getNama() {
        return nama;
    }// Method yang berfungsi untuk memanggil nama yang disimpan sesuai dengan objek

    public String getNim() {
        return nim;
    }// Method yang berfungsi untuk memanggil nim yang disimpan sesuai dengan objek

    public void setNim(String nim) {
        this.nim = nim;
    }// Method yang berfungsi untuk mengset nim yang akan disimpan sesuai dengan objek

    public String getTglLahir() {
        return tglLahir;
    }// Method yang berfungsi untuk memanggil value tanggal lahir yang disimpan sesuai dengan objek

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }// Method untuk mengset tanggal lahir sesuai dengan objek

    public double getUts1() {
        return uts1;
    }// Method yang berfungsi untuk memanggil value nilai UTS1 yang sesuai dengan objek

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }// Method yang berfungsi untuk mengset nilai UTS1 yang sesuai dengan objek

    public double getUts2() {
        return uts2;
    }// Method yang berfungsi untuk memanggil value nilai UTS2 yang sesuai dengan objek

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }// Method yang berfungsi untuk mengset nilai UTS2 yang sesuai dengan objek

    public double getUas() {
        return uas;
    }// Method yang berfungsi untuk memanggil value nilai UAS yang sesuai dengan objek

    public void setUas(double uas) {
        this.uas = uas;
    }// Method yang berfungsi untuk mengset nilai UAS yang sesuai dengan objek

    public double nilaiAKhir() { // Method yang berfungsi untuk menghitung nilai akhir dari data mahasiswa yang telah diisi
        this.nilaiAkhirHitung = ((30.0/100 * uts1) + (30.0/100 * uts2) + (40.0/100 * uas));
        return nilaiAkhirHitung;
    }

    public double hitungNilaiFinal() { // Method ini memiliki fungsi yang sama dengan nilaiAKhir namun dibedakan dengan operasi penghitungannya dilakukan langsung pada return
        return ((30.0/100 * uts1) + (30.0/100 * uts2) + (40.0/100 * uas));
    }

    // Method predikat dari class Mahasiswa Package Modul_4
    // Method ini akan di-override oleh SubClassnya agar sesuai dengan kegunaan yang di inginkan
    public char predikat() {
        double nilaiAkhirFinal = hitungNilaiFinal();

        if (nilaiAkhirFinal >= 80){
            return 'A';
        } else if (nilaiAkhirFinal >= 70) {
            return 'B';
        } else if (nilaiAkhirFinal >= 56) {
            return 'C';
        } else if (nilaiAkhirFinal >= 45) {
            return 'D';
        } else {
            return 'E';
        }
    }

}

package Modul_4;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String tglLahir;
    private double uts1;
    private double uts2;
    private double uas;
    private double nilaiAkhirHitung;

    public Mahasiswa(String namaMhs){
        this.nama = namaMhs;
    }

    public String getNama() {
        return nama;
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public double getUts1() {
        return uts1;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double nilaiAKhir() {
        this.nilaiAkhirHitung = ((30.0/100 * uts1) + (30.0/100 * uts2) + (40.0/100 * uas));
        return nilaiAkhirHitung;
    }

    public double hitungNilaiFinal() {
        return ((30.0/100 * uts1) + (30.0/100 * uts2) + (40.0/100 * uas));
    }

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

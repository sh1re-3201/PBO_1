package Modul_9;

public class SegiEmpat extends BangunDatar{ // Class SegiEmpat mewarisi class BangunDatar
    private double panjang;
    private double lebar;

    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override// Annotation yang menandakan bahwa metode ini di-override dari kelas BangunDatar
    protected double hitungLuas() { // Metode yang di-override dari kelas abstrak BangunDatar
        return panjang * lebar;
    }

    @Override
    protected double hitungKeliling() {// Metode yang di-override dari kelas abstrak BangunDatar
        return 2 * (panjang + lebar);
    }
}

package Modul_9;

public class SegiEmpat extends BangunDatar{
    private double panjang;
    private double lebar;

    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    protected double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    protected double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

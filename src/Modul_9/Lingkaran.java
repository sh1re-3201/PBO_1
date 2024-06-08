package Modul_9;

public class Lingkaran extends BangunDatar{
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    protected double hitungLuas() {
        return Math.PI * radius * radius;
    }
    @Override
    protected double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

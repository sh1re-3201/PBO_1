package Modul_9;

public class Segitiga extends BangunDatar{

    double sisi1, sisi2, sisi3;
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    @Override
    public double hitungKeliling(){ // Metode yang di-override dari kelas abstrak BangunDatar
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public double hitungLuas(){
        return Math.sqrt(sisi2 - Math.pow((0.5 * sisi1),2));
    }


}

package Latihan_22_April;

public class KaryawanTetap extends Karyawan {
    private int gajiPokok;

    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {
        super(npp, nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int hitungGajiTotal() {
        return gajiPokok + hitungTunjanganAnak();
    }
}
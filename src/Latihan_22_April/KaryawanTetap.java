package Latihan_22_April;

public class KaryawanTetap extends Perusahaan{
    private int gajiPokok;

    public KaryawanTetap(int npp, String namaPegawai, int jumlahAnak, int gajiPokok) {
        super(npp, namaPegawai, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public int hitungGajiTotal() {
        return gajiPokok + hitungTunjanganAnak();
    }
}
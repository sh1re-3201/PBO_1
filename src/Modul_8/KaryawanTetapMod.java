package Modul_8;

import Modul_7.Karyawan;

public class KaryawanTetapMod extends Karyawan {
    private int gajiPokok;

    public KaryawanTetapMod(int npp, String nama, int jumlahAnak, int gajiPokok) {
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
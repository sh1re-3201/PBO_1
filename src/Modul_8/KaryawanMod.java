package Modul_8;

public class KaryawanMod {
    protected static final int subsidiPerAnak = 100000;
    protected int npp;
    protected String nama;
    protected int jumlahAnak;

    public KaryawanMod(int npp, String nama, int jumlahAnak) {
        this.npp = npp;
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }

    public int getNpp() {
        return npp;
    }

    public String getNamaPegawai() {
        return nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public int hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }
}
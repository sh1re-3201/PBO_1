package Latihan_22_April;

public class Perusahaan {
    protected static final int subsidiPerAnak = 100000;
    protected int npp;
    protected String namaPegawai;
    protected int jumlahAnak;

    public Perusahaan(int npp, String namaPegawai, int jumlahAnak) {
        this.npp = npp;
        this.namaPegawai = namaPegawai;
        this.jumlahAnak = jumlahAnak;
    }

    public int hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }
}
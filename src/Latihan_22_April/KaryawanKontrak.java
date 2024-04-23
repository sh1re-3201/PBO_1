package Latihan_22_April;

public class KaryawanKontrak extends Perusahaan{
    private int upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(int npp, String namaPegawai, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        super(npp, namaPegawai, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public int hitungUpahTotal() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjanganAnak();
    }
}
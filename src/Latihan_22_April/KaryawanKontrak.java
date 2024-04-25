package Latihan_22_April;

public class KaryawanKontrak extends Karyawan {
    private int upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        super(npp, nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public int getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public int hitungUpahTotal() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjanganAnak();
    }
}
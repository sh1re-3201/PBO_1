package Latihan_22_April;

public class MainPerusahaankami {
    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap(1, "John Doe", 2, 5000000);
        int totalGajiTetap = karyawanTetap.hitungGajiTotal();
        System.out.println("Total Gaji Karyawan Tetap: " + totalGajiTetap);

        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(2, "Jane Doe", 1, 200000, 20);
        int totalUpahKontrak = karyawanKontrak.hitungUpahTotal();
        System.out.println("Total Upah Karyawan Kontrak: " + totalUpahKontrak);
    }
}
package Modul_2;

public class PegawaiGajiMain {
    public static void main(String[] args) {
//        Membuat objek pegawai baru dari class PegawaiData
        PegawaiData pegawai1 = new PegawaiData();
        pegawai1.setNPP("001");
        pegawai1.setNama("Oris");
        pegawai1.setGolongan(3);
        pegawai1.setMenikah(true);
        pegawai1.setJumlahAnak(4);

        PegawaiData pegawai2 = new PegawaiData();
        pegawai2.setNPP("012");
        pegawai2.setNama("Hedwig");
        pegawai2.setGolongan(2);
        pegawai2.setMenikah(false);
        pegawai2.setJumlahAnak(0);

//        Membuat objek calculator baru dari class CalcGaji
        CalcGaji calculator = new CalcGaji();

        double gajiPokok = calculator.hitungGajiPokok(pegawai1.getGolongan());
        double tunjanganKeluarga = calculator.hitungTunjanganKeluarga(pegawai1.isMenikah(), pegawai1.getJumlahAnak());
        double gajiTotal = calculator.hitungGajiTotal(gajiPokok, tunjanganKeluarga);

        System.out.printf("\n%-20s: %s (%s)\n", "Nama", pegawai1.getNama(), pegawai1.getNPP());
        System.out.printf("%-20s: %,.0f\n", "Gaji Pokok", gajiPokok);
        System.out.printf("%-20s: %,.0f\n", "Tunjangan Keluarga", tunjanganKeluarga);
        System.out.printf("%-20s: %,.0f\n", "Gaji Total", gajiTotal);

        gajiPokok = calculator.hitungGajiPokok(pegawai2.getGolongan());
        tunjanganKeluarga = calculator.hitungTunjanganKeluarga(pegawai2.isMenikah(), pegawai2.getJumlahAnak());
        gajiTotal = calculator.hitungGajiTotal(gajiPokok, tunjanganKeluarga);
        System.out.println();

        System.out.println("==========================");
        System.out.printf("\n%-20s: %s (%s)\n", "Nama", pegawai2.getNama(), pegawai2.getNPP());
        System.out.printf("%-20s: %,.0f\n", "Gaji Pokok", gajiPokok);
        System.out.printf("%-20s: %,.0f\n", "Tunjangan Keluarga", tunjanganKeluarga);
        System.out.printf("%-20s: %,.0f\n", "Gaji Total", gajiTotal);
    }
}

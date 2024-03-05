package Modul_2;

public class CalcGaji {
    public double hitungGajiPokok(int golongan) {
        switch (golongan) {
            case 1:
                return 1300000;
            case 2:
                return 1750000;
            case 3:
                return 2000000;
            default:
                return 0;
        }
    }

    public double hitungTunjanganKeluarga(boolean menikah, int jumlahAnak) {
        if (menikah) {
            return 300000 + (jumlahAnak * 100000);
        } else {
            return 0;
        }
    }

    public double hitungGajiTotal(double gajiPokok, double tunjanganKeluarga) {
        return gajiPokok + tunjanganKeluarga;
    }
}

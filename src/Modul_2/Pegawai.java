package Modul_2;

public class Pegawai {
    private String NPP;
    private String nama;
    private int golongan;
    private boolean menikah;
    private int jumlahAnak;

    // Constructor
    public Pegawai() {}

    public String getNPP() {
        return NPP;
    }

    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    public int hitungGajiPokok() {
        int gajiPokok = 0;

        if (golongan == 1) {
            gajiPokok = 1300000;
        } else if (golongan == 2) {
            gajiPokok = 1750000;
        } else if (golongan == 3) {
            gajiPokok = 2000000;
        }
        return gajiPokok;
    }
}

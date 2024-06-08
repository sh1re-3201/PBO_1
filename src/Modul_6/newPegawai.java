package Modul_6;

public class newPegawai {
    private int npp;
    private String nama;
    private int anak;
    private int golongan;
    private int tunjangan;
    private int gajiTotal;

    public newPegawai() {}

    public int getAnak() {
        return anak;
    }

    public void setAnak(int anak) {
        this.anak = anak;
    }

    public int getNpp() {
        return npp;
    }

    public void setNpp(int npp) {
        this.npp = npp;
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

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
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

    public int hitungTunjanganKeluarga(int punya){
        if (punya == 1) {
            tunjangan = 300000 + (anak * 100000);
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    }

    public int hitungGajiTotal(){
        gajiTotal = hitungGajiPokok() + tunjangan;
        return gajiTotal;
    }
}

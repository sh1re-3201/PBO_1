package Modul_5;

import Modul_2.Pegawai;

public class Perusahaan {
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String pemilikPerusahaan;
    private int NPWP;
    private Pegawai[] daftarPegawai;

    // Constructor
    public Perusahaan() {}

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getPemilikPerusahaan() {
        return pemilikPerusahaan;
    }

    public void setPemilikPerusahaan(String pemilikPerusahaan) {
        this.pemilikPerusahaan = pemilikPerusahaan;
    }

    public int getNPWP() {
        return NPWP;
    }

    public void setNPWP(int NPWP) {
        this.NPWP = NPWP;
    }

    public Pegawai[] getDaftarPegawai() {
        return daftarPegawai;
    }

    public void setDaftarPegawai(Pegawai[] daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }

}

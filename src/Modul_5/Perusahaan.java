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

    public void displayAllPegawai() {
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println(formatPegawai(pegawai));
        }
    }

    public void displayMinMaxGaji() {
        if (daftarPegawai.length == 0) {
            System.out.println("Tidak ada pegawai dalam perusahaan ini.");
            return;
        }

        Pegawai minGajiPegawai = daftarPegawai[0];
        Pegawai maxGajiPegawai = daftarPegawai[0];
        double totalGaji = 0;

        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai.getGolongan() < minGajiPegawai.getGolongan()) {
                minGajiPegawai = pegawai;
            }
            if (pegawai.getGolongan() > maxGajiPegawai.getGolongan()) {
                maxGajiPegawai = pegawai;
            }
            totalGaji += pegawai.getGolongan();
        }

        System.out.println("Pegawai dengan gaji terkecil: " + formatPegawai(minGajiPegawai));
        System.out.println("Pegawai dengan gaji terbesar: " + formatPegawai(maxGajiPegawai));
//        System.out.println("Rata-rata gaji: " + totalGaji / daftarPegawai.length);
    }

    private String formatPegawai(Pegawai pegawai) {
        return "NPP: " + pegawai.getNPP() + ", Nama: " + pegawai.getNama() + ", Golongan: " + pegawai.getGolongan();
    }
}

package Modul_3;

import Modul_2.Pegawai;
public class SastraMesinMain {
    public static void main(String[] args) {
        Pegawai ketua = new Pegawai();
        programStudi prodi = new programStudi();

        ketua.setNama("Maria");
        ketua.setNPP("010605");

        prodi.setKodeProdi(60615);
        prodi.setNamaProdi("Sastra Mesin");

        System.out.println("Program Studi: " + prodi.getNamaProdi() + ", Kode Prodi: (" + prodi.getKodeProdi() + ")");
        System.out.println("Diketuai Oleh: " + ketua.getNama() + " (" + ketua.getNPP() + ")");
    }
}

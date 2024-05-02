package Modul_8;

public class MainMahasiswaMod {
    public static void main(String[] args) {
        MahasiswaS1Mod mhsS1 = new MahasiswaS1Mod("Gresia Plena");
        mhsS1.setNim("123456");
        mhsS1.setUts1(85.5);
        mhsS1.setUts2(80.0);
        mhsS1.setUas(90.0);

        MahasiswaS2Mod mhsS2 = new MahasiswaS2Mod("Michael Asep");
        mhsS2.setNim("654321");
        mhsS2.setUts1(62.3);
        mhsS2.setUts2(72.1);
        mhsS2.setUas(67.54);

        System.out.println("Mahasiswa S1: " + mhsS1.getNama() + ", " + mhsS1.getNim() + ", Nilai Final: " + mhsS1.predikat());
        System.out.println("Mahasiswa S2: " + mhsS2.getNama() + ", " + mhsS2.getNim() + ", Nilai Final: " + mhsS2.predikat());
    }
}
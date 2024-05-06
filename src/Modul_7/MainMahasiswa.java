package Modul_7;

public class MainMahasiswa {
    public static void main(String[] args) {
        MahasiswaS1 mhsS1 = new MahasiswaS1("Oros");
        mhsS1.setNim("123456");
        mhsS1.setUts1(85.5);
        mhsS1.setUts2(80.0);
        mhsS1.setUas(90.0);

        MahasiswaS2 mhsS2 = new MahasiswaS2("Michael Asep");
        mhsS2.setNim("654321");
        mhsS2.setUts1(62.3);
        mhsS2.setUts2(72.1);
        mhsS2.setUas(67.54);

        System.out.println("Mahasiswa S1: " + mhsS1.getNama() + ", " + mhsS1.getNim() + ", Nilai Final: " + mhsS1.predikat());
        System.out.println("Mahasiswa S2: " + mhsS2.getNama() + ", " + mhsS2.getNim() + ", Nilai Final: " + mhsS2.predikat());
    }
}
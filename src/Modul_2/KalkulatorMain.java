package Modul_2;

import java.util.Scanner;

public class KalkulatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bil1;
        double bil2;

        System.out.print("Masukkan Bilangan Pertama: ");
        bil1 = input.nextDouble();

        System.out.print("Masukkan Bilangan Kedua: ");
        bil2 = input.nextDouble();

        // Membuat objek Calc dengan nilai yang dimasukkan pengguna
        Kalkulator Calc = new Kalkulator(bil1, bil2);

        Calc.setBilangan1(bil1);
        Calc.setBilangan2(bil2);

        // Menghitung hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + Calc.tambah());

        // Menghitung hasil pengurangan
        System.out.println("Hasil pengurangan: " + Calc.kurang());

        // Menghitung hasil perkalian
        System.out.println("Hasil perkalian: " + Calc.kali());

        try {
            // Menghitung hasil pembagian
            System.out.println("Hasil pembagian: " + Calc.bagi());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

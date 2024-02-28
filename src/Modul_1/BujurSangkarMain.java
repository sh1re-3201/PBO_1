package Modul_1;

import java.util.Scanner;// Mengimpor Scanner dari pustaka java.util

public class BujurSangkarMain {// Kelas BujurSangkarMain
    public static void main(String[] args) {
        BujurSangkar bujur1 = new BujurSangkar();// Membuat objek pada kelas 'BujurSangkar' yang bernama 'bujur1'
        BujurSangkar bujur2 = new BujurSangkar();// Membuat objek pada kelas 'BujurSangkar' yang bernama 'bujur2'

        Scanner tombol = new Scanner(System.in);//  Mendeklarasikan nama Scanner
        System.out.print("Masukkan sisi bujur sangkar I : ");
        bujur1.sisi = tombol.nextInt();// Memanggil Scanner untuk menerima input user dan memasukkan nilainya kedalam attribut sisi pada kelas 'BujurSangkar'

        System.out.print("Masukkan sisi bujur sangkar II : ");
        bujur2.sisi = tombol.nextInt();// Memanggil Scanner untuk menerima input user dan memasukkan nilainya kedalam attribut sisi pada kelas 'BujurSangkar'

        // Mencetak hasil dari kelas 'BujurSangkar'
        System.out.println("Luas Buju Sangkar dengan sisi = " + bujur1.sisi + " adalah " + bujur1.luas());
        System.out.println("Luas Buju Sangkar dengan sisi = " + bujur2.sisi + " adalah " + bujur2.luas());

    }
}

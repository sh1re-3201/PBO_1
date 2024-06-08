package Modul_9;

import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayBesaran;

        System.out.println();
        System.out.println("Selamat Datang!");
        System.out.print("Masukkan Banyaknya Bangun Datar Yang Ingin Anda Masukkan: ");
        arrayBesaran = input.nextInt();
        BangunDatar[] gambarBocah = new BangunDatar[arrayBesaran];// Membuat wadah yang akan menyimpan koleksi heterogen

        System.out.println();
        for (int i = 0; i < gambarBocah.length; i++) {// perulangan untuk mengiterasi array gambarBocah
            System.out.println("""
                    Pilih bangun datar yang ingin anda masukkan datanya
                    1. Persegi
                    2. Segitiga
                    3. Lingkaran
                    4. Keluar""");
            System.out.print("Pilihan Anda : ");// User memasukkan pilihan
            int pilih = input.nextInt();


            // Switch case yang berfungsi untuk menentukan objek yang akan dimasukkan ke dalam array gambarBocah
            // Objek yang dipilih lalu akan diisi oleh user sesuai dengan value yang diperlukan untuk menghitung luas dan keliling
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan panjang dan lebar persegi:");
                    System.out.print("Panjang: ");
                    double panjangPersegi = input.nextDouble();
                    System.out.print("Lebar: ");
                    double lebarPersegi = input.nextDouble();
                    gambarBocah[i] = new SegiEmpat(panjangPersegi, lebarPersegi);
                    break;
                case 2:
                    System.out.println("Masukkan Besaran Sisi Segitiga:");
                    System.out.print("sisi 1: ");
                    double sisi1 = input.nextDouble();
                    System.out.print("sisi 2: ");
                    double sisi2 = input.nextDouble();
                    System.out.print("sisi 3: ");
                    double sisi3 = input.nextDouble();
                    gambarBocah[i] = new Segitiga(sisi1, sisi2, sisi3);
                    break;
                case 3:
                    System.out.println("Masukkan radius lingkaran:");
                    System.out.print("Radius: ");
                    double radius = input.nextDouble();
                    gambarBocah[i] = new Lingkaran(radius);
                    break;
                case 4:
                    System.exit(0);// Berfungsi agar program langsung berhenti
                default:
                    System.out.println("Pilihan salah, Coba lagi");
                    System.out.println();
                    break;
            }
        }

        // mencetak tabel yang akan dipakai untuk menampilkan hasil perhitungan luas dan keliling dari tiap objek yang telah diisi
        System.out.printf("%-15s %-15s %-15s\n", "Bangun Datar", "Keliling", "Luas");// Mencetak Header tabel
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < arrayBesaran; i++) {// perulangan untuk mengiterasi array gambarBocah
            if (gambarBocah[i] != null) {// Jika array tidak kosong maka akan menampilkan hasil perhitungan luas dan keliling
                BangunDatar tampilanBangun = gambarBocah[i];// Menyimpan objek yang ada pada array ke dalam variabel tampilanBangun
                // Menggunakan instanceof untuk mengecek objek yang ada pada array merupakan objek dari class yang sesuai maka akan ditampilkan
                if (tampilanBangun instanceof SegiEmpat) {
                    System.out.printf("%-15s %-15.2f %-15.2f\n", "Segi Empat", tampilanBangun.hitungKeliling(), tampilanBangun.hitungLuas());
                } else if (tampilanBangun instanceof Lingkaran) {
                    System.out.printf("%-15s %-15.2f %-15.2f\n", "Lingkaran", tampilanBangun.hitungKeliling(), tampilanBangun.hitungLuas());
                } else if (tampilanBangun instanceof Segitiga) {
                    System.out.printf("%-15s %-15.2f %-15.2f\n", "Segitiga", tampilanBangun.hitungKeliling(), tampilanBangun.hitungLuas());
                }
            }
        }
    }
}

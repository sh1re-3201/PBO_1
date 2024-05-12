package Modul_8;

// Mengimport class-class yang diperlukan
import Modul_4.Mahasiswa;
import Modul_7.MahasiswaS2;
import Modul_7.MahasiswaS1;

public class MahasiswaMainHeterogen {
    public static void main(String[] args) {
        Mahasiswa[] siswaKampus = new Mahasiswa[5]; // Membuat array baru yang akan menjadi wadah koleksi heterogen


        // Mengisi array dengan objek-objek dari class MahasiswaS1 dan MahasiswaS2
        siswaKampus[0] = new MahasiswaS1("Michael Asep");
        siswaKampus[0].setUts1(85.5);
        siswaKampus[0].setUts2(80.0);
        siswaKampus[0].setUas(90.0);

        siswaKampus[1] = new MahasiswaS1("Oros");
        siswaKampus[1].setUts1(62.3);
        siswaKampus[1].setUts2(43.3);
        siswaKampus[1].setUas(45.6);

        siswaKampus[2] = new MahasiswaS2("Treni");
        siswaKampus[2].setUts1(85.5);
        siswaKampus[2].setUts2(80.0);
        siswaKampus[2].setUas(90.0);

        siswaKampus[3] = new MahasiswaS1("Cani");
        siswaKampus[3].setUts1(86.3);
        siswaKampus[3].setUts2(81.1);
        siswaKampus[3].setUas(90.5);

        siswaKampus[4] = new MahasiswaS2("Toni");
        siswaKampus[4].setUts1(45.4);
        siswaKampus[4].setUts2(69.2);
        siswaKampus[4].setUas(70.2);


        for (int i = 0; i < siswaKampus.length; i++) { // For loop yang berfungsi untuk menampilkan data-data yang ada pada array siswaKampus
            if (siswaKampus[i] instanceof MahasiswaS1){ // Menggunakan instanceof untuk mengecek apakah objek yang ada pada array merupakan objek dari class MahasiswaS1
                System.out.println();
                System.out.println("Nama = " + siswaKampus[i].getNama());
                System.out.println("Jenjang Mahasiswa = Mahasiswa Strata 1");
                System.out.println("Predikat = " + siswaKampus[i].predikat());
            } else if (siswaKampus[i] instanceof MahasiswaS2){ // Menggunakan instanceof untuk mengecek apakah objek yang ada pada array merupakan objek dari class MahasiswaS2
                System.out.println();
                System.out.println("Nama = " + siswaKampus[i].getNama());
                System.out.println("Jenjang Mahasiswa = Mahasiswa Strata 2");
                System.out.println("Predikat = " + siswaKampus[i].predikat());
            }
        }
        System.out.println("====================================================");
        System.out.println();
        System.out.println("====================================================");
        System.out.println("Mahasiswa Strata 1 Yang Lulus");
        for (int i = 0; i < siswaKampus.length; i++) { // For loop yang berfungsi untuk membaca data-data yang ada pada array siswaKampus
            if (siswaKampus[i] instanceof MahasiswaS1){ // Menggunakan instanceof untuk mengecek apakah objek yang ada pada array merupakan objek dari class MahasiswaS1
                if (siswaKampus[i].predikat() == 'A'){ // Dengan if statement membandingkan nilai yang dihasilkan oleh method predikat
                    System.out.println();
                    System.out.println("Nama = " + siswaKampus[i].getNama());
                    System.out.println("Predikat = " + siswaKampus[i].predikat());
                } else if(siswaKampus[i].predikat() == 'B'){
                    System.out.println();
                    System.out.println("Nama = " + siswaKampus[i].getNama());
                    System.out.println("Predikat = " + siswaKampus[i].predikat());
                } else if (siswaKampus[i].predikat() == 'C'){
                    System.out.println();
                    System.out.println("Nama = " + siswaKampus[i].getNama());
                    System.out.println("Predikat = " + siswaKampus[i].predikat());
                }
            }
        }
    }
}

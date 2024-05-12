package Modul_8;

// Mengimpor class-class yang diperlukan
import Modul_7.Karyawan;
import Modul_7.KaryawanKontrak;
import Modul_7.KaryawanTetap;

public class PerusahaanMainHeterogen {
    public static void main(String[] args) {
        Karyawan[] budakKorporat = new Karyawan[5];// Membuat array baru yang akan menjadi wadah koleksi heterogen

        // Mengisi array dengan objek-objek dari class KaryawanTetap dan KaryawanKontrak
        budakKorporat[0] = new KaryawanTetap(23124131, "Michael Asep", 0, 5000000);
        budakKorporat[1] = new KaryawanKontrak(23124132, "Oros", 1, 200000, 23);
        budakKorporat[2] = new KaryawanTetap(23699821, "Treni", 3, 5000000);

        for (int i = 0; i < budakKorporat.length; i++) { // For loop yang berfungsi untuk menampilkan data-data yang ada pada array budakKorporat
            if (budakKorporat[i] instanceof KaryawanTetap){ // Menggunakan instanceof untuk mengecek apakah objek yang ada pada array merupakan objek dari class KaryawanTetap
                System.out.println();
                System.out.println("Nama = " + budakKorporat[i].getNamaPegawai());
                System.out.println("Status Kepegawaian = Karyawan Tetap");
                System.out.println("Gaji Total = " + ((KaryawanTetap) budakKorporat[i]).hitungGajiTotal());
            } else if (budakKorporat[i] instanceof KaryawanKontrak){ // Menggunakan instanceof untuk mengecek apakah objek yang ada pada array merupakan objek dari class KaryawanKontrak
                System.out.println();
                System.out.println("Nama = " + budakKorporat[i].getNamaPegawai());
                System.out.println("Status Kepegawaian = Karyawan Kontrak");
                System.out.println("Upah Total = " + ((KaryawanKontrak) budakKorporat[i]).hitungUpahTotal());
            }
        }
    }
}

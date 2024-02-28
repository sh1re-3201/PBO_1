package Modul_1;

public class Mobil {// Membuat kelas Mobil
    String warna;// Deklarasi atribut untuk kelas mobil 'warna'
    Mobil(String wrn){// Membuat method konstruktor untuk menyiapkan data yang akan digunakan oleh kelas
        warna = wrn;
    }
    void jalan_maju(){// Metode yang akan dieksekusi untuk mencetak pesan mobil 'warna' maju !
        System.out.print("Mobil warna " + warna);
        System.out.println(" Maju !");
    }
    public static void main(String[] args) {// Method main yang menjadi tempat untuk memanggil dan mengeksekusi semua metode
        Mobil sedan = new Mobil("merah");// Membuat objek baru 'sedan' dalam kelas Mobil
        sedan.jalan_maju();// Memanggil metode 'jalan_maju' dengan objek sedan
    }
}

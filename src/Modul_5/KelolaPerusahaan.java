package Modul_5;

import Modul_2.Pegawai;

import javax.swing.*;

public class KelolaPerusahaan {
    public static void main(String[] args) {
        Perusahaan manusia = new Perusahaan();
        boolean keluar = false;
        int count = 0;

        String namaPerusahaan = JOptionPane.showInputDialog(null, "Masukkan nama perusahaan anda");
        if (namaPerusahaan == null) {
            return;
        }
        if (namaPerusahaan.isEmpty()) {
            JOptionPane.showMessageDialog(null, """
                    Nama Perusahaan Tidak Boleh Kosong
                    Silakan coba lagi""");
        } else
            manusia.setNamaPerusahaan(namaPerusahaan);


        String alamatPerusahaan = JOptionPane.showInputDialog(null, "Masukkan alamat perusahaan");
        if (alamatPerusahaan == null) {
            return;
        }
        if (alamatPerusahaan.isEmpty()) {
            JOptionPane.showInputDialog(null, """
                    Alamat Perusahaan Tidak Boleh Kosong
                    Silakan coba lagi""");
        } else
            manusia.setAlamatPerusahaan(alamatPerusahaan);

// Set alamat KaryawanMod
        String pemilikPerusahaan = JOptionPane.showInputDialog(null, "Masukkan nama pemilik perusahaan");
        if (pemilikPerusahaan == null) {
            return;
        }
        if (pemilikPerusahaan.isEmpty()) {
            JOptionPane.showInputDialog(null, """
                    Nama Pemilik Perusahaan Tidak Boleh Kosong
                    Silakan coba lagi""");
        } else
            manusia.setPemilikPerusahaan(pemilikPerusahaan);

        boolean npwpBool = false;
        while (!npwpBool) {
            String npwpInput = JOptionPane.showInputDialog(null, "Masukkan NPWP perusahaan");
            if (npwpInput == null) {// If statement ini berfungsi untuk keluar dari program jika user mengklik tombol X(silang) pada jendela
                return;
            }

            try {
                if (npwpInput.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data yang dimasukkan tidak boleh kosong");
                } else {
                    int npwpFinal = Integer.parseInt(npwpInput);
                    manusia.setNPWP(npwpFinal);
                    npwpBool = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan data berupa angka. Silakan coba lagi");
            }
        }
        System.out.println(manusia.getNPWP());
        while (!keluar) {
            String input = JOptionPane.showInputDialog(null, "Masukkan jumlah pegawai yang ingin anda masukkan datanya");
            if (input == null) {// If statement ini berfungsi untuk keluar dari program jika user mengklik tombol X(silang) pada jendela
                return;
            }
            try {
                /*
                Karena penerimaan input dari JOptionPane secara default berupa String
                maka agar inputan dari user dapat dipakai menjadi jumlah panjang array,
                variabel Input di parse ke Integer variabel count
                 */
                count = Integer.parseInt(input);
                if (count <= 0){
                    JOptionPane.showMessageDialog(null, "Data yang dimasukkan tidak boleh nol atau kurang!");
                } else
                    keluar = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan data berupa angka. Silakan coba lagi.");
            }
        }
        Pegawai[] daftarPegawai = new Pegawai[count];
        for (int i = 0; i < daftarPegawai.length; i++) { // Blok kode untuk set data pegawai
            daftarPegawai[i] = new Pegawai();

            String namaPegawai = JOptionPane.showInputDialog(null, "Masukkan nama pegawai ke " + (i+1));
            if (namaPegawai == null) return;
            daftarPegawai[i].setNama(namaPegawai);

            String nppPegawai = JOptionPane.showInputDialog(null, "Masukkan NPP pegawai ke " + (i + 1));
            if (nppPegawai == null) return;
            daftarPegawai[i].setNPP(nppPegawai);

            String golonganPegawai = JOptionPane.showInputDialog(null, "Masukkan Golongan pegawai ke " + (i + 1));
            if (golonganPegawai == null) return;
            daftarPegawai[i].setGolongan(Integer.parseInt(golonganPegawai));

        }
        manusia.setDaftarPegawai(daftarPegawai);
        manusia.displayAllPegawai();
        manusia.displayMinMaxGaji();
        double gaji = 0;
        for (int i = 0; i < daftarPegawai.length; i++) {
            gaji += daftarPegawai[i].hitungGajiPokok();
        }
        double rataRata = gaji / count;
        System.out.println("Rata-rata gaji pokok = " + (int) rataRata);
    }
}

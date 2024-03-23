package Modul_5;

import Modul_2.Pegawai;

import javax.swing.*;

public class KelolaPerusahaan {
    public static void main(String[] args) {
        boolean keluar = false;
        int count = 0;

        String namaPerusahaan = JOptionPane.showInputDialog(null, "Masukkan nama perusahaan anda");
        if (namaPerusahaan == null) {
            return;
        }
        if (namaPerusahaan.isEmpty()) {
            JOptionPane.showInputDialog(null, """
                    Nama Perusahaan Tidak Boleh Kosong
                    Silakan coba lagi""");
        }
// Set nama Perusahaan
        String alamatPerusahaan = JOptionPane.showInputDialog(null, "Masukkan alamat perusahaan");
        if (alamatPerusahaan == null) {
            return;
        }
        if (alamatPerusahaan.isEmpty()) {
            JOptionPane.showInputDialog(null, """
                    Alamat Perusahaan Tidak Boleh Kosong
                    Silakan coba lagi""");
        }
// Set alamat Perusahaan
        String pemilikPerusahaan = JOptionPane.showInputDialog(null, "Masukkan nama pemilik perusahaan");
        if (pemilikPerusahaan == null) {
            return;
        }
        if (pemilikPerusahaan.isEmpty()) {
            JOptionPane.showInputDialog(null, """
                    Nama Pemilik Perusahaan Tidak Boleh Kosong
                    Silakan coba lagi""");
        }
// Set pemilik perusahaan

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
                    npwpBool = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan data berupa angka. Silakan coba lagi");
            }
        }
// set NPWP
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
        Pegawai[] pegawaiData = new Pegawai[count];
        for (int i = 0; i < pegawaiData.length;) { // Blok kode untuk set data pegawai

        }
    }
}

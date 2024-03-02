package Modul_1;

import javax.swing.JOptionPane;// Mengimpor JOptionPane dari pustaka javax.swing

public class PersegiMain extends Persegi {
    public static void main(String[] args) {
        Persegi objPersegi = new Persegi();// Membuat objek baru bernama 'objPersegi' pada kelas Persegi

        objPersegi.panj = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));// Menampilkan dialog input untuk meminta user mengisi panjang persegi
        objPersegi.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));// Menampilkan dialog input untuk meminta user mengisi lebar persegi

        //mencetak data yang dimasukkan user dan hasil dari method luas
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang = " + objPersegi.panj + " dan lebar = " + objPersegi.lebar + " adalah " + objPersegi.luas());
    }
}

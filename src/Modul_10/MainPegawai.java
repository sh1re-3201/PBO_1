package Modul_10;

public class MainPegawai {
    public static void main(String[] args) {

        // Mencetak email dari tiap kategori Pegawai
        new PegawaiHonorer(123);
        System.out.println("Email Pegawai Honorer : " + PegawaiHonorer.getEmail());
        new PegawaiManager(456);
        System.out.println("Email Pegawai Manager : " + PegawaiManager.getEmail());
        new PegawaiMarketing(789);
        System.out.println("Email Pegawai Marketing : " + PegawaiMarketing.getEmail());
    }
}

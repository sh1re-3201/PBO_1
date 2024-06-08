package Modul_10;

public class PegawaiMarketing extends Pegawai{
    public PegawaiMarketing(int NIP) {
        super(NIP);
    }

    public static String getEmail(){
        return getNIP() + "@marketing.usd.ac.id";
    }
}

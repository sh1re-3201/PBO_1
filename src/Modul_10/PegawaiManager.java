package Modul_10;

public class PegawaiManager extends Pegawai{
    public PegawaiManager(int NIP) {
        super(NIP);
    }

    public static String getEmail(){
        return getNIP() + "@manager.usd.ac.id";
    }
}

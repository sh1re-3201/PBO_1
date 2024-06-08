package Modul_10;

public class PegawaiHonorer extends Pegawai{


    public PegawaiHonorer(int NIP){
        super(NIP);
    }

    public static String getEmail(){
        return getNIP() + "@honorer.usd.ac.id";
    }
}

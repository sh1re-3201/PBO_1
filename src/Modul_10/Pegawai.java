package Modul_10;

public abstract class Pegawai implements Email{
    protected static int NIP;

    public Pegawai(int NIP){
        this.NIP = NIP;
    }
    protected void setNIP(int NIP){
        this.NIP = NIP;
    }
    protected static int getNIP(){
        return NIP;
    }
    public static String getEmail(){
        return null;
    }
}

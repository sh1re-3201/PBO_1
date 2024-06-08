package Modul_9;

public class MainHewan {
    public static void main(String[] args) {
        Hewan kewan;
        kewan = new Anjing();
        kewan.suara();
        kewan = new Kucing();
        kewan.suara();
        kewan = new Bebek();
        kewan.suara();
        kewan= new Buaya();
        kewan.suara();
    }
}

package Modul_9;

public abstract class Hewan {
    void suara() {
        System.out.println("suara hewan-hewan");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("gug gug");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("meong-meong");
    }
}

class Bebek extends Hewan {
    void suara() {
        System.out.println("kwek-kwek");
    }
}

class Buaya extends Hewan {
    void suara() {// Metode polimorfis baru
            System.out.println("Gaada Yang Marah Kan?");
    }
}

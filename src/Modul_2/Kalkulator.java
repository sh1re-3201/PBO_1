package Modul_2;

public class Kalkulator {
    private double bilangan1;
    private double bilangan2;

    // Constructor
    public Kalkulator(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    // Getter and Setter methods
    public double getBilangan1() {
        return bilangan1;
    }

    public void setBilangan1(double bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public double getBilangan2() {
        return bilangan2;
    }

    public void setBilangan2(double bilangan2) {
        this.bilangan2 = bilangan2;
    }

    // Method to perform addition
    public double tambah() {
        return bilangan1 + bilangan2;
    }

    // Method to perform subtraction
    public double kurang() {
        return bilangan1 - bilangan2;
    }

    // Method to perform multiplication
    public double kali() {
        return bilangan1 * bilangan2;
    }

    // Method to perform division
    public double bagi() {
        if (bilangan2 == 0) {
            throw new IllegalArgumentException("Pembagian dengan nol tidak diizinkan");
        }
        return bilangan1 / bilangan2;
    }
}


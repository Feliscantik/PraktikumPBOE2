package Anabul2;

// Nama File    : Kembangtelon.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) { 
        super(nama, bobot); 
    }

    @Override 
    public String toString() { 
        return "Kembangtelon: " + nama + " (" + bobot + " kg)"; 
    }
}

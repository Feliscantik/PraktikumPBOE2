package Anabul2;

// Nama File    : Anggora.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) { 
        super(nama, bobot); 
    }

    @Override 
    public String toString() { 
        return "Anggora: " + nama + " (" + bobot + " kg)"; 
    }
}
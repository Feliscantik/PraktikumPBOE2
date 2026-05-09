package Piaraan;

// Nama File    : Anabul.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 7 Mei

class Anabul3 {
    private String panggilan; // Atribut panggilan 
    protected double bobot;

    public Anabul3(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    // Fungsi get dan set untuk nama panggilan
    public String getNama() { 
        return panggilan; 
    }

    public void setNama(String nama) { 
        this.panggilan = nama; 
    }

    public double getBobot() { 
        return bobot; 
    }
}
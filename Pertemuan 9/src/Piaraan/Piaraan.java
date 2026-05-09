package Piaraan;

// Nama File    : Piaraan.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 7 Mei

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul3> Lanabul; // Menggunakan Queue untuk antrean 

    public Piaraan() {
        this.Lanabul = new LinkedList<>(); // Instansiasi pada konstruktor 
        this.nbelm = 0;
    }

    // B. I
    public int getNbelm(){
        return this.nbelm;
    }

    // b. II
    public void enqueueAnabul (Anabul3 anabul) {
        this.Lanabul.add(anabul);
        this.nbelm++;
    }

    //b III
    public boolean isMember(Anabul3 anabul) {
        return Lanabul.contains(anabul);
    }

    //b IV
    public Anabul3 getanabul(){
        return this.Lanabul.peek();
    }

    // b V
    public Anabul3 dequeueAnabul() {
        Anabul3 a = this.Lanabul.poll();
        if (a != null) {
            this.nbelm--;
        }
        return a;
    }

    // c
    public void showAnabul() {
        for (Anabul3 a : this.Lanabul) {
            System.out.println("Anabul: " + a.getNama());
        }
    }
    
    public int countKucing(){
        int count = 0;
        for (Anabul3 a : this.Lanabul){
            if (a instanceof Kucing2){
                count++;
            }
        }
        return count;
    }

    public double bobotKucing(){
        double bobot = 0;
        for (Anabul3 a : this.Lanabul){
            if (a instanceof Kucing2){
                bobot = bobot + a.getBobot();
            }
        }
        return bobot;
    }

    public void showJenisAnabul() {
        for (Anabul3 a : this.Lanabul) {
            System.out.println("Panggilan" + a.getNama() + "Jenis" + a.getClass().getName());
        }
    }  
}


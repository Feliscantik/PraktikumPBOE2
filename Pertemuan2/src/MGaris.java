/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menjalankan class Titik
 * Pembuat      : Felicia Evelina
 * Tanggal      : 28 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(2, 0);
        Titik t2 = new Titik(0, 4);
        Garis G1 = new Garis(t1, t2);
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(3, 5);
        Garis G2 = new Garis(t3, t4);
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        Titik tengahG1 = G1.getTitikTengah();
        System.out.print("Titik Tengah G1: " );
        tengahG1.printTitik();
        System.out.println("Sejajar atau tidak: " + G1.isSejajar(G2));
        System.out.println("Tegak lurus atau tidak: " + G1.isTegakLurus(G2));
        Titik awalG1 = G1.getTitikAwal();
        Titik akhirG1 = G1.getTitikAkhir();
        System.out.println("Titik Awal G1: (" + awalG1.getAbsis() + ", " + awalG1.getOrdinat() + ")");
        System.out.println("Titik Akhir G1: (" + akhirG1.getAbsis() + ", " + akhirG1.getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());
    }
}
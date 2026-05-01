package OperatorGenerik;
import Anabul2.*;

// Nama File    : Anabul2.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

public class Mainop {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        Datum<Integer> angka1 = new Datum<>();
        angka1.setIsi(1);
        Datum<Integer> angka2 = new Datum<>();
        angka2.setIsi(2);
        System.out.println("Sebelum: ");
        System.out.println(+ angka1.getIsi() + "," + angka2.getIsi());
        System.out.println("Sesudah: ");
        op.Tukar(angka1, angka2);
        System.out.println(+ angka1.getIsi() + "," + angka2.getIsi());

        Datum<String> str1 = new Datum<>();
        str1.setIsi("Felis cantik");
        Datum<String> str2 = new Datum<>();
        str2.setIsi("Felis imup");
        System.out.println("Sebelum: ");
        System.out.println(str1.getIsi() + "," + str2.getIsi());
        System.out.println("Sesudah: ");
        op.Tukar(str1, str2);
        System.out.println(str1.getIsi() + "," + str2.getIsi());

        Datum<Kucing> k1 = new Datum<>();
        k1.setIsi(new Anggora("Bobi", 5.6));
        Datum<Kucing> k2 = new Datum<>();
        k2.setIsi(new Kembangtelon("Mikel", 5.4));
        System.out.println("Sebelum: " + k1.getIsi().toString());
        System.out.println("Sebelum: " + k2.getIsi().toString());
        op.Tukar(k1, k2);
        System.out.println("Sesudah:  " + k1.getIsi().toString());
        System.out.println("Sesudah:  " + k2.getIsi().toString());
       
        Kucing kucing1 = k1.getIsi(); 
        Kucing kucing2 = k2.getIsi();
        double totalBobot = op.Bobot2(kucing1, kucing2);
        System.out.println("Total Bobot: " + totalBobot + " kg");
    }
}

package Data;
import Anabul2.*; 

// Nama File    : Anabul2.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

public class MData {
    public static void main(String[] args) {
        Data<Kucing> d = new Data<>();

        d.setIsi(0, new Kucing("Boby", 3.0));
        d.setIsi(1, new Anggora("Bobon", 4.5));
        d.setIsi(2, new Kembangtelon("Mimi", 3.2));

        for (int i = 0; i < d.getSize(); i++) {
            System.out.println("Data ke-" + i);
            System.out.println(d.getIsi(i).toString());
        }
    }
}
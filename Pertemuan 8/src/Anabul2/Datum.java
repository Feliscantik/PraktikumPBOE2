package Anabul2;

// Nama File    : Datum.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

// T extends Kucing artinya T hanya boleh Kucing atau anak-anaknya
public class Datum<T extends Kucing> {
    private T isi;

    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }

    public T getIsi() { 
        return this.isi; 
    }
}
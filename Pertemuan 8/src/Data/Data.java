package Data;

// Nama File    : Anabul2.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

public class Data<T> {
    private Object[] ruang = new Object[100];
    private int banyak = 0;

    public T getIsi(int index) {
        return (T) ruang[index];
    }

    public void setIsi(int index, T isi) {
        ruang[index] = isi;
        if (index >= banyak) {
            banyak = index + 1;
        }
    }

    public int getSize() {
        return banyak;
    }
}
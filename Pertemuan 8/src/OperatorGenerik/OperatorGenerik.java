package OperatorGenerik;
import Anabul2.Datum;
import Anabul2.Kucing;

// Nama File    : Anabul2.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 1 Mei 2026

public class OperatorGenerik {
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing> double Bobot2(T kcg1, T kcg2) {
        return kcg1.getBobot() + kcg2.getBobot();
    }
}

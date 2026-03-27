/**
 * File : Asersi2.java
 * deskripsi : Progam untuk demo asersi, yang akan menolak input sisi segiempat yang bernilai nol
 * nama : Felicia Evelina
 * tanggal : 27 Maret 2026
 */
// class segiempat
class Segiempatt{
    private double sisii;
    public Segiempatt(double sisii){
        this.sisii = sisii;
    }
    public double hitungKeliling(){
        double keliling = 4*sisii;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args){
        double sisii = 0;
        assert(sisii>0):"sisii tdk blh noll";
        Segiempatt l = new Segiempatt(sisii);
        double kelilingSegiempat = l.hitungKeliling();
        System.out.println("keliling lingkaran =" +kelilingSegiempat);
    }
}

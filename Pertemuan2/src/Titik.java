// Nama : Titik.java
// Deskripsi : berisi atribut dan method dalam class Titik
// Pembuat : Felicia Evelina
// Tanggal : 19 Februari 2026

public class Titik {
    double absis;
    double ordinat;

    Titik () {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis (double x){
        absis = x;
    }

    void setOrdinat (double y){
        absis = y;
    }

    void Geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }
    
    int getKuadran() {
        int kuad = 0;
        if (absis > 0 && ordinat > 0) {
            kuad = 1;
        } else if (absis > 0 && ordinat < 0) {
            kuad = 2;
        } else if (absis < 0 && ordinat < 0) {
            kuad = 3;
        } else if (absis > 0 && ordinat < 0) {
            kuad = 4;
        }
        return kuad;
    }

    double getJarakPusat() {
        double jarak;
        jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }

Titik getRefleksiX(){
        Titik T1 = new Titik();
        T1.setOrdinat(-1*ordinat);
        T1.setAbsis(absis);
        return T1;
    }


}


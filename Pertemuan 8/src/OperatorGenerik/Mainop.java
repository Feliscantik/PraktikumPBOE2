package OperatorGenerik;
import Anabul2.*;

public class Mainop {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        Datum<Kucing> k1 = new Datum<>();
        k1.setIsi(new Anggora(4.5));
        
        Datum<Kucing> k2 = new Datum<>();
        k2.setIsi(new Kembangtelon(3.2));
    }
}

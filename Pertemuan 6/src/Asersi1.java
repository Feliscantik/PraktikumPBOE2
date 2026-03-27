/**
 * File : Asersi1.java
 * deskripsi : Progam untuk menunjukkan asersi
 * nama : Felicia Evelina
 * tanggal : 27 Maret 2026
 */
public class Asersi1 {
    public static void main(String[] args){
        int bykduit=0;
        if(bykduit>20){
            System.out.println("lagi banyak duit");
        }else{
            assert(bykduit>=0):"kasihan bgt..utang";
            System.out.println("ga ada duit");
        }
    }
}

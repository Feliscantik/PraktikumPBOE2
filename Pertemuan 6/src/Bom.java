/**
 * File : Bom.java
 * deskripsi : Progam penggunaan exception buatan sendiri pengenalan klausa throw dan throws
 * nama : Felicia Evelina
 * tanggal : 28 Maret 2026
 */
public class Bom {
    public void cobabom(String bomm ) throws BomException{
        if (bomm == "DUAR"){
            throw new BomException();
        }
        System.out.println(bomm+" bukan bomm");
    }
    public static void main(String[] args) {
        Bom as = new Bom();
        try{
            as.cobabom(null);
            as.cobabom("DUAR");
            as.cobabom(null);
        }catch(BomException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hatii");
        }
    }
}

/**
 * File : Bangundatar.java
 * deskripsi : Class induk Bangundatar 
 * nama : Felicia Evelina
 * tanggal : 19 Maret 2026
 */
public abstract class Bangundatar {
    protected String warna;
    protected String border;

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(Bangundatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(Bangundatar X){
        return this.getKeliling() == X.getKeliling();
    }
}

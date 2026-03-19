/**
 * File : Pengusaha.java
 * deskripsi : Class anak Pengusaha dari class induk Manusia
 * nama : Felicia Evelina
 * tanggal : 19 Maret 2026
 */
import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tglstring, String alamat, double pendapatan, String npwp) {
        super(nama, tglstring, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getnpwp(){
        return npwp;
    }

    public void setnpwp(String npwp){
        this.npwp = npwp; 
    }

    public static int getcounterPengusaha(){
        return counterPengusaha;
    }
    
    @Override
    public int hitungMasakerja(){
        int now = LocalDate.now().getYear();
        return (now - tgl_mulai_kerja.getYear()) + 1;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Pajak: " + hitungPajak());
    }
}

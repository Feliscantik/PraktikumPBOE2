/**
 * File : Petani.java
 * deskripsi : Class anak Petani dari class induk Manusia
 * nama : Felicia Evelina
 * tanggal : 19 Maret 2026
 */
import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tglstring, String alamat, double pendapatan, String asal_kota) {
        super(nama, tglstring, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getasal(){
        return asal_kota;
    }

    public void setasal(String asal_kota){
        this.asal_kota = asal_kota; 
    }

    public static int getcounterPetani(){
        return counterPetani;
    }
    
    @Override
    public int hitungMasakerja(){
        int now = LocalDate.now().getYear();
        return (now - tgl_mulai_kerja.getYear()) + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Pajak: " + hitungPajak());
    }
}

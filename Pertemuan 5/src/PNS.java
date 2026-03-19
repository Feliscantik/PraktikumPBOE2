/**
 * File : PNS.java
 * deskripsi : Class anak PNS dari class induk Manusia
 * nama : Felicia Evelina
 * tanggal : 19 Maret 2026
 */
import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tglstring, String alamat, double pendapatan, String nip) {
        super(nama, tglstring, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getnip(){
        return nip;
    }

    public void setnip(String nip){
        this.nip = nip; 
    }

    public static int getCounterPNS(){
        return counterPNS;
    }
    
    @Override
    public int hitungMasakerja(){
        int now = LocalDate.now().getYear();
        return (now - tgl_mulai_kerja.getYear()) + 2;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Pajak: " + hitungPajak());
    }
}

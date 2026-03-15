/**
 * File : DosenTamu.java
 * deskripsi : Class anak dosen tamu dari induk dosen
 * nama : Felicia Evelina
 * tanggal : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate tglBerakhirKontrak;

    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gajipokok, String Fakultas, String NIDK, LocalDate tglBerakhirKontrak) {
        super(NIP, Nama, TanggalLahir, TMT, gajipokok, Fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

   @Override
    public int getPub() {
        return 0; 
    }

    @Override
    public double getTunjangan() {
        return 0.025 * gajipokok;
    }

    public long getSisaKontrakBulan() {
        return ChronoUnit.MONTHS.between(LocalDate.now(), tglBerakhirKontrak);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK : " + NIDK);
        System.out.println("Sisa Kontrak   : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Tunjangan : Rp" + getTunjangan());
    }
}

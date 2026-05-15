/**
 * File : DosenTetap.java
 * deskripsi : Class anak dosen tetap dari induk dosen
 * nama : Felicia Evelina
 * tanggal : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    private String NIDN;
    private final static int BUP = 65;

    public DosenTetap(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gajipokok, String Fakultas, String NIDN) {
        super(NIP, Nama, TanggalLahir, TMT, gajipokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    @Override
    public int getPub() {
        return BUP;
    }

    @Override
    public double getTunjangan() {
        int masaKerja = Period.between(this.TMT, LocalDate.now()).getYears();
        return 0.02 * masaKerja * gajipokok;
    }

    public String getTglPensiun() {
        LocalDate pensiun = TanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
        return getFormatTanggal(pensiun);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN : " + NIDN);
        System.out.println("Tunjangan      : Rp" + getTunjangan());
        System.out.println("Tgl Pensiun    : " + getTglPensiun());
    }
}

/**
 * File : Tendik.java
 * deskripsi : Class anak tendik dari induk pegawai
 * nama : Felicia Evelina
 * tanggal : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    private String Bidang;
    private static final int BUP = 55;

    public Tendik(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gajipokok, String Bidang){
        super(NIP, Nama, TanggalLahir, TMT, gajipokok);
        this.Bidang = Bidang;
    }

    public String getBid(){
        return Bidang;
    }

    public void setBid(String Bidang){
        this.Bidang = Bidang;
    }

    @Override
    public int getPub() {
        return BUP;
    }

    @Override
    public double getTunjangan() {
        int masaKerja = Period.between(this.TMT, LocalDate.now()).getYears();
        return 0.01 * masaKerja * gajipokok;
  
    }

    public String getTglPensiun() {
        LocalDate pensiun = TanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
        return getFormatTanggal(pensiun);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang : " + Bidang);
        System.out.printf("Tunjangan      : Rp%.2f%n", getTunjangan());
        System.out.println("Tgl Pensiun    : " + getTglPensiun());
    }
}
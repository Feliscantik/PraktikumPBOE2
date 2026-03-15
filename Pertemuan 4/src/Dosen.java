/**
 * File : Dosen.java
 * deskripsi : Class anak dosen dari induk pegawai
 * nama : Felicia Evelina
 * tanggal : 15 Maret 2026
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai{
    protected String Fakultas;

    public Dosen(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gajipokok, String Fakultas){
        super(NIP, Nama, TanggalLahir, TMT, gajipokok);
        this.Fakultas = Fakultas;
    }

    public String getFak(){
        return Fakultas;
    }

    public void setFak(String Fakultas){
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Fakultas: " + Fakultas);
    }
}

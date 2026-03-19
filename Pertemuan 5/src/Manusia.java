/**
 * File : Manusia.java
 * deskripsi : Class induk Manusia
 * nama : Felicia Evelina
 * tanggal : 19 Maret 2026
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    protected static final DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Manusia(String nama, String tglstring, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getnama(){
        return nama;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public String getalamat(){
        return alamat;
    }

    public void setalamat(String alamat){
        this.alamat = alamat;
    }

    public double getpndpt(){
        return pendapatan;
    }

    public void setpndpt(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public abstract int hitungMasakerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja.format(f));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasakerja() + " tahun");
    }
}

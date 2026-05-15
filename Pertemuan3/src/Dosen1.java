/* Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Felicia Evelina
 * Tanggal      : 11 Maret 2026
 */

public class Dosen1 {
    private String NIP;
    private String nama;
    private String prodi;

    public Dosen1() {
        this.NIP = "";
        this.nama = "";
        this.prodi = "";
    }

    Dosen1(String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    String getNIPDosen() {
        return this.NIP;
    }

    String getNamaDosen() {
        return this.nama;
    }

    String getProdiDosen() {
        return this.prodi;
    }

    public void setNIPDosen(String NIP) {
        this.NIP = NIP;
    }

    public void setNamaDosen(String nama) {
        this.nama = nama;
    }

    public void setProdiDosen(String prodi) {
        this.prodi = prodi;
    }

}
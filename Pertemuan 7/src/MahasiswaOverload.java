/* NIM  : 24060123130094
   Nama : Felicia Evelina
   Tgl  : 24 April 2026
*/
public class MahasiswaOverload {
    private String nim, nama, programStudi;

    // 2c. Konstruktor tanpa parameter
    public MahasiswaOverload() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // 2d. Konstruktor dengan 3 parameter
    public MahasiswaOverload(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = prodi;
    }

    // 2e. Konstruktor Kloning 
    public MahasiswaOverload(MahasiswaOverload m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // 2. Overloading Method setProgramStudi
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    public void setProgramStudi(MahasiswaOverload m) {
        this.programStudi = m.programStudi;
    }

    public void tampilData() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}


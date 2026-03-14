import java.time.LocalDate;

public abstract class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate TanggalLahir;
    protected LocalDate TMT;
    protected double gajipokok;

    public Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gajipokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.gajipokok = gajipokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public LocalDate getTglLahir(){
        return TanggalLahir;
    }

    public void setTglLahir(LocalDate TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getgajipokok(){
        return gajipokok;
    }

    public void setgajipokok(double gajipokok){
        this.gajipokok = gajipokok;
    }

    public abstract int getPub();

    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji pokok: " + gajipokok);
    }
}

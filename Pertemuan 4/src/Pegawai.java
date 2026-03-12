import java.time.LocalDate;


public class Pegawai {
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

    public void setTMT(LocalDate T){
        this.TMT = TMT;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

}

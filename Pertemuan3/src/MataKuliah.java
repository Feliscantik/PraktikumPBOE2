public class MataKuliah {
    /********* ATRIBUT *********/ 
    private String idMatkul;
    private String nama;
    private int sks;
    
    /********* METHOD *********/
    // konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    // konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // setter
    public String getidMatkul(){
        return this.idMatkul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getsks(){
        return this.sks;
    }

    // mutator
    public void setNIP(String idMatkulString){
        idMatkul = idMatkulString;
    }

    public void setNama(String namaMatkul){
        nama = namaMatkul;
    }

    public void setProdi(int SKSmatkul){
        sks = SKSmatkul;
    }

    public String getNamaMataKuliah() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNamaMataKuliah'");
    }
}
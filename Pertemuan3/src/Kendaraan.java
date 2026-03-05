public class Kendaraan {
     /********* ATRIBUT *********/ 
    private String noPlat;
    private String jenis;
    
    /********* METHOD *********/
    // konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // setter
    public String getnoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    // mutator
    public void setnoPlat(String noPlatString){
        noPlat = noPlatString;
    }

    public void setJenis(String jeniskendaraan){
        jenis = jeniskendaraan;
    }
}

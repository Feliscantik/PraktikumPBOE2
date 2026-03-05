import java.util.ArrayList;

public class Mahasiswa {
    /********** ATRIBUT **********/
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /********** METHOD **********/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList <> ();
    }

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    //selektor
    String getNIM(){
        return this.NIM;
    }

    String getnama(){
        return this.nama;
    }

    String getprodi(){
        return this.prodi;
    }
    Dosen getDosenWali(){
        return dosenWali;
    }
    Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    /*MUTATOR */
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi= prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //getJumlahSKS()
    public int getJumlahSKS(){
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++){
            totalSKS = totalSKS + listMatKul.get(i).getsks();
        }
        return totalSKS;
    }

    //getJumlahMatKul()
    public int getJumlahMatkul() {
        return this.listMatKul.size();
    }


    public void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void addMatkul(MataKuliah newMatKul) {
        this.listMatKul.add(newMatKul);
    }

    public void printDetailMhs() {
        System.out.println("NIM Mahasiswa : " + NIM);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi : " + prodi);

        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatKul.get(i).getNamaMataKuliah());
        }
    }

}
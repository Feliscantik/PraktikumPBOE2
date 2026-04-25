public class Civitasakademika {
    protected String Nama;

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNomor() {
        return "";
    }

    public String getNama() {
        return Nama;
    }
}

class Dosen2 extends Civitasakademika{
    private String NIP;

    public Dosen2(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor(){
        return NIP;
    }
}

class Mahasiswa2 extends Civitasakademika {
    private String NIM;
    private Dosen2 Dosenwali;

    public Mahasiswa2(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public void setDosenWali(Dosen2 dosen) {
        this.Dosenwali = dosen;
    }

    void tampilDataMahasiswa(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Dosen Wali: " + Dosenwali.getNama());
    }
}

class Seminar{
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    public Seminar(){
        this.pesertas = new Civitasakademika[100];
        this.banyakPeserta = 0;
    }

    public int countPeserta(){
        return banyakPeserta;
    }

    void registrasi (Civitasakademika civak){
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = civak;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas sudah penuh");
        }
    } 

    public void tampilPeserta() {
    for (int i = 0; i < banyakPeserta; i++) {
        System.out.print("Nomor: " + pesertas[i].getNomor());
        System.out.println(" Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa(){
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++){
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}
package Piaraan;

public class MainPiaraan{
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Anabul3 a1 = new Anabul3("Bobon", 5.2);
        Kucing2 k1 = new Kucing2("Bibin", 3.5);
        Kucing2 k2 = new Kucing2("Bubun", 4.0);
        Anabul3 a2 = new Anabul3("Baban", 10.0);

        a1.setNama("Bobon Jr");

        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(a2);

        System.out.println("NbElm: " + klinik.getNbelm());

        klinik.showAnabul();

        System.out.println("Apakah member? " + klinik.isMember(k1));

        System.out.println("Jumlah Kucing: " + klinik.countKucing());
        System.out.println("Total Bobot Kucing: " + klinik.bobotKucing());

        klinik.showJenisAnabul();

        System.out.println("Data pertama: " + klinik.getanabul().getNama());
        System.out.println("Mengeluarkan: " + klinik.dequeueAnabul().getNama());

        System.out.println("\nNbElm Akhir: " + klinik.getNbelm());
    }
}
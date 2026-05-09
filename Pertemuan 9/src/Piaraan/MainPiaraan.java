package Piaraan;

public class MainPiaraan{
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Anabul a1 = new Anabul("Gerry", 5.2);
        Kucing k1 = new Kucing("Mimi", 3.5);
        Kucing k2 = new Kucing("Oyen", 4.0);
        Anabul a2 = new Anabul("Bobi", 10.0);

        a1.setNama("Gerry Jr");

        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(a2);

        System.out.println("NbElm: " + klinik.getNbelm());

        System.out.println("\n--- showAnabul ---");
        klinik.showAnabul();

        System.out.println("\n--- isMember ---");
        System.out.println("Apakah Mimi member? " + klinik.isMember(k1));

        System.out.println("\n--- countKucing & bobotKucing ---");
        System.out.println("Jumlah Kucing: " + klinik.countKucing());
        System.out.println("Total Bobot Kucing: " + klinik.bobotKucing());

        System.out.println("\n--- showJenisAnabul ---");
        // Karena showJenisAnabul belum ada di file Piaraan.java yang kamu kirim, 
        // ini adalah implementasi manual di main sesuai logika getClass() dan getName()
        System.out.println(a1.getNama() + " adalah " + a1.getClass().getName());
        System.out.println(k1.getNama() + " adalah " + k1.getClass().getName());

        System.out.println("\n--- getAnabul & dequeueAnabul ---");
        System.out.println("Data pertama: " + klinik.getanabul().getNama());
        System.out.println("Mengeluarkan: " + klinik.dequeueAnabul().getNama());

        System.out.println("\nNbElm Akhir: " + klinik.getNbelm());
    }
}
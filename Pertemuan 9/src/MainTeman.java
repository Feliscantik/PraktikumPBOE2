// Nama File    : MainTeman.java
// NIM          : 24060124120012
// Nama         : Felicia Evelina
// Tanggal      : 7 Mei
public class MainTeman {
    public static void main(String[] args) {
        Teman daftarTeman = new Teman();

        daftarTeman.addNama("Felis");
        daftarTeman.addNama("FelisCantik");
        daftarTeman.addNama("Felis"); 
        daftarTeman.addNama("FelisImut");

        daftarTeman.showTeman();

        System.out.println("\nJumlah teman saat ini: " + daftarTeman.getNbelm());

        System.out.println("Teman pada indeks 1: " + daftarTeman.getNama(1));

        daftarTeman.setNama(3, "FelisManis");
        System.out.println("FelisImut jadi FelisManis:");
        daftarTeman.showTeman();

        String cari = "FelisCantik";
        System.out.println("\nApakah ada? " + daftarTeman.isMember(cari));

        System.out.println("Mengganti FelisCantik menjadi FelisApaya");
        daftarTeman.gantiNama("FelisCantik", "FelisApaya");

        System.out.println("Jumlah nama Felis dalam list: " + daftarTeman.countNama("Felis"));

        System.out.println("\nMenghapus Felis");
        daftarTeman.delNama("Felis");

        daftarTeman.showTeman();
        System.out.println("Jumlah elemen akhir: " + daftarTeman.getNbelm());
    }
}
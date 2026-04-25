/* NIM  : 24060123130094
   Nama : Felicia Evelina
   Tgl  : 24 April 2026
*/
public class MMhs {
    public static void main(String[] args) {
        // 2c. Aplikasi Konstruktor Tanpa Parameter
        MahasiswaOverload m1 = new MahasiswaOverload();
        System.out.print("M1 (Default): ");
        m1.tampilData();

        // 2d. Aplikasi Konstruktor 3 Parameter
        MahasiswaOverload m2 = new MahasiswaOverload("24060123", "Budi", "Informatika");
        System.out.print("M2 (Input): ");
        m2.tampilData();

        // 2e. Aplikasi Konstruktor Kloning
        MahasiswaOverload m3 = new MahasiswaOverload(m2);
        System.out.print("M3 (Kloning M2): ");
        m3.tampilData();

        System.out.println("--- Testing Overloading setProgramStudi ---");

        // Overloading Varian 1: Tanpa Parameter
        m1.setProgramStudi(); 
        System.out.print("M1 setelah setProgramStudi(): ");
        m1.tampilData();

        // Overloading Varian 2: Parameter String
        m1.setProgramStudi("Sistem Informasi");
        System.out.print("M1 setelah setProgramStudi(String): ");
        m1.tampilData();

        // Overloading Varian 3: Parameter Objek Mahasiswa
        m1.setProgramStudi(m2);
        System.out.print("M1 setelah setProgramStudi(m2): ");
        m1.tampilData();
    }
}
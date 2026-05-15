/**
 * File : MPegawai.java
 * deskripsi : Main dari class induk pegawai dan anak-anaknya
 * nama : Felicia Evelina
 * tanggal : 15 Maret 2026
 */
import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // Dosen Tetap
        DosenTetap dt = new DosenTetap("19850101", "Dr. Felicia", LocalDate.of(1985, 5, 5), LocalDate.of(2015, 1, 1), 6000000, "Informatika", "NIDN123");
        
        // Dosen Tamu (Kontrak berakhir 2027)
        DosenTamu dtm = new DosenTamu("19900505", "Budi M.Kom", LocalDate.of(1990, 5, 5), LocalDate.of(2023, 1, 1), 4500000, "Sains", "NIDK987", LocalDate.of(2027, 12, 31));
        
        // Tendik
        Tendik td = new Tendik("19950808", "Agus S.", LocalDate.of(1995, 8, 15), LocalDate.of(2018, 10, 1), 3500000, "Akademik");

        dt.printInfo();
        System.out.println();
        dtm.printInfo();
        System.out.println();
        td.printInfo();
    }
}
public class MCivitas {
    public static void main(String[] args) {
        Dosen2 dos1 = new Dosen2("Hardi", "293019310");
        Dosen2 dos2 = new Dosen2("Yovita", "293019567");
        
        Mahasiswa2 mhs1 = new Mahasiswa2("Bobon", "24060124");
        Mahasiswa2 mhs2 = new Mahasiswa2("Felicia", "24060125");
        Mahasiswa2 mhs3 = new Mahasiswa2("Loopy", "24060126");
        Mahasiswa2 mhs4 = new Mahasiswa2("Lisha", "24060127");
        Mahasiswa2 mhs5 = new Mahasiswa2("Caca", "24060128");

        mhs1.setDosenWali(dos1);
        mhs2.setDosenWali(dos1);
        mhs3.setDosenWali(dos2);
        mhs4.setDosenWali(dos2);
        mhs5.setDosenWali(dos2);

        Seminar smnr = new Seminar();

        smnr.registrasi(dos1);
        smnr.registrasi(dos2);
        smnr.registrasi(mhs1);
        smnr.registrasi(mhs2);
        smnr.registrasi(mhs3);
        smnr.registrasi(mhs4);
        smnr.registrasi(mhs5);

        System.out.println("Jumlah peserta: " + smnr.countPeserta());

        System.out.println("\nDaftar Peserta:");
        smnr.tampilPeserta();

        System.out.println("\nJumlah Mahasiswa: " + smnr.countMahasiswa());

        System.out.println("\nData Mahasiswa:");
        mhs1.tampilDataMahasiswa();
        mhs2.tampilDataMahasiswa();
        mhs3.tampilDataMahasiswa();
        mhs4.tampilDataMahasiswa();
        mhs5.tampilDataMahasiswa();
    }
}

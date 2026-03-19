public class Mbangundatar {
    public static void main(String[] args){
        Bangundatar P1 = new Persegi2(10);
        Persegi2 P2 = new Persegi2(5);
        Bangundatar L1 = new Lingkaran2(7);
        Lingkaran2 L2 = new Lingkaran2(14);

        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Luas L1: " + L1.getLuas());

        System.out.println("Apakah Luas P1 == L1 ?: " + P1.isEqualLuas(L1));

        System.out.println("Sisi P2 awal: " + P2.getsisi2());
        P2.zoomIn();
        System.out.println("Sisi P2 setelah zoomIn:" + P2.getsisi2());
    }
}

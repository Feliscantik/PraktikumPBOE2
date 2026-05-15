public class MTitik {
    public static void main (String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.Geser(3,4);
        T1.printTitik();
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        Titik T2 = new Titik();
        T2.setAbsis(2);
        T2.setOrdinat(6);
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));
        T1.refleksiX();
        System.out.print("Refleksi X : "); T1.printTitik();
        T1.refleksiY();
        System.out.print("Refleksi Y : "); T1.printTitik();
        Titik T3 = T2.getRefleksiX();
        System.out.print("getRefleksi X : "); T3.printTitik();
        Titik T4 = T2.getRefleksiY();
        System.out.print("getRefleksi Y : "); T4.printTitik();
    }
}

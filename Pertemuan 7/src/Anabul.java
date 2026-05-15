public class Anabul {
    protected String Nama;

    public Anabul(String Nama){
        this.Nama = Nama;
    }

    public void gerak(){}
    public void suara(){}
}

class Kucing extends Anabul{
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
   public void gerak(){
        System.out.println("Kucing bergerak dengan melata.");
   }

    @Override
   public void suara(){
        System.out.println("Kucing berbunyi meong.");
   }
}

class Anjing extends Anabul{
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
   public void gerak(){
        System.out.println("Anjing bergerak dengan melata.");
   }

    @Override
   public void suara(){
        System.out.println("Anjing bersuara guk-guk.");
   }
}

class Burung extends Anabul{
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
   public void gerak(){
        System.out.println("Burung bergerak dengan terbang.");
   }

    @Override
   public void suara(){
        System.out.println("Burung berbunyi cuit.");
   }
}

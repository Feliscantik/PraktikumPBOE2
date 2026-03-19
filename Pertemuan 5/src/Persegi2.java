public class Persegi2 extends Bangundatar implements IResize{
    private double sisi2;

    public Persegi2(double sisi2){
        this.sisi2 = sisi2;
    }

    @Override
    public double getLuas(){
        return sisi2 * sisi2;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi2;
    }

    @Override
    public void zoomIn(){
        this.sisi2 = this.sisi2 + 1.1;
    }

    @Override
    public void zoomOut(){
        this.sisi2 = this.sisi2 + 0.9;
    }

    @Override
    public void zoom(int percent){
        this.sisi2 = this.sisi2 * (percent / 100.0);
    }

    public double getsisi2(){
        return sisi2;
    }
}

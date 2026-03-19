public class Lingkaran2 extends Bangundatar implements IResize {
    private double r;

    public Lingkaran2(double r){
        this.r = r;
    }

    @Override
    public double getLuas(){
        return Math.PI * r * r;
    }

    @Override
    public double getKeliling(){
        return 2 * Math.PI * r;
    }

    @Override
    public void zoomIn(){
        this.r = this.r + 1.1;
    }

    @Override
    public void zoomOut(){
        this.r = this.r + 0.9;
    }

    @Override
    public void zoom(int percent){
        this.r = this.r * (percent / 100.0);
    }

    public double getr(){
        return r;
    }
}


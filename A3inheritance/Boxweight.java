package A3inheritance;

public class Boxweight extends A1box {
    double weight;
    Boxweight(){
        this.weight = -1;
    }

    public Boxweight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight = weight;
    }
}
// ententds for inheritance

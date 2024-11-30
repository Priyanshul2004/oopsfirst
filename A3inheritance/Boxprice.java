package A3inheritance;

public class Boxprice extends Boxweight{
    double cost;

    Boxprice(){
        this.cost = -1;
    }

    Boxprice(Boxprice other){
        this.cost = other.cost;
    }

    Boxprice(double h,double w,double l,double weight,double cost){
        super(l,w,h,weight);
        this.cost = cost;
    }

}
// multilevel in heritance 
package A3inheritance;

public class A1box {
    double l;
    double h;
    double w;

    A1box(){
        
    }

    A1box(double l,double w,double h) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // cube
    A1box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // copy constructor
    A1box(A1box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void informatio(){
        System.out.println("running the box");
    }
}
// inheritance
// polymorphism
// incaptiolution
// abstraction
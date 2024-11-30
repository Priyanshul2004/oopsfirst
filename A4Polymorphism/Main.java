package A4Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle cir = new Circle();
        Squre squr = new Squre();

        squr.area();
        cir.area();;
        shape.area();
    }
}
// polymorphism

// type of polymorphism
// 1 compile time / static poly => achived by method overloading


// method overloading => eak he class ke andar multipele constructor ya method 
// jo alage alage return time or parameter le usko ye kehte hai 

// 2 run time polymorish => achived by method overriding

// method overriding => mthooverriding tab hota jab eak 
// parent class ke anadar ki child class 
// same name se method banate hai or main mei call krte hai
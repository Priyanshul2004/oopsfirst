package A2lect2;

public class A1 {
    static void greatin(){
        System.out.println("hello ji");
    }
    public static void main(String[] args) {
        Human1 h1 = new Human1(22, "priyanshul");
        System.out.println(h1.age); 
        System.out.println(Human1.population); 

        Human1 h2 = new Human1(11, "sahil");
        System.out.println(Human1.population);
        System.out.println(Human1.population);

        A1 s2 = new A1();
        s2.greatin();
    }
}
// package 
// static key word  = under static we can not this keyword
// singleton class 
// in built methods
// overriding
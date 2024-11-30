package A2lect2;

public class Human1 {
    int age;
    String name;
    static long population;
    Human1(int age,String name){
        this.age = age;
        this.name = name;
        Human1.population += 1;
    }
}
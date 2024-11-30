package A9abstractclass;

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    static void hellow(){
        System.out.println("hellow ji");
    }

    abstract void career();
    abstract void partnar();
}
// cannot abstract constructor
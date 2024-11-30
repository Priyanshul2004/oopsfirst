package A9abstractclass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.normal();

        Daughter d1 = new Daughter(11);
        d1.partnar();

        Parent.hellow();
    }
}
// 1) cannot create obj of abstract class
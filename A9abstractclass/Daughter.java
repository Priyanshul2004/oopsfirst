package A9abstractclass;

public class Daughter extends Parent {
    public Daughter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("i am a daughter");
    }
    @Override
    void partnar(){
        System.out.println("i am a daugher partner");
    }
}

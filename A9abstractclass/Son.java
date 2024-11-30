package A9abstractclass;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("i am a name");
    }
    @Override
    void partnar(){
        System.out.println("i am in paratnar");
    }

    void normal(){
        System.out.println("normal");
    }
}

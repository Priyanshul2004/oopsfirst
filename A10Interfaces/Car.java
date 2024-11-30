package A10Interfaces;

public class Car implements Engine,Break,Media{
    @Override
    public void Break(){
        System.out.println("break like a normal car");
    }

    @Override
    public void start(){
        System.out.println("start like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("stop like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("acclerate like a normal car");
    }
}

package A10Interfaces;

public class CDPlayed implements Media{
    @Override
    public void start(){
        System.out.println("start media player like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("stop media player like a normal car");
    }
}

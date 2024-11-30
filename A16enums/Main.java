package A16enums;
public class Main {
    enum Week{
        Monday,Tusday,Wednesday
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        for(Week day:Week.values()){
            System.out.println(day);
        }
    }
}
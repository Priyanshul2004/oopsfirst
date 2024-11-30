package A2lect2;

public class A2staticblock {
    static int a = 4;
    static int b;

    // will only ones 
    static {
        System.out.println("i am in static cblock");
        b=a*5;
    }

    public static void main(String[] args) {
        A2staticblock obj = new A2staticblock();
        System.out.println(A2staticblock.a+" "+A2staticblock.b);
    }
}

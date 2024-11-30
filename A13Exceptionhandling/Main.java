package A13Exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("it will run always ");
        }
    }
}


// teo type 
// 1checked exception
// 2 unchacked exception
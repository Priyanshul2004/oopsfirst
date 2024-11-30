package A8accesscontrol;

public class Main {
    public static void main(String[] args) {
        A obj = new A(33, "sahil");
        System.out.println(obj.name);
        // System.out.println(obj.num); // private
        System.out.println(obj.arr);
        System.out.println(obj.getnum());

    }
}

// gatter and setter
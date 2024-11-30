package A10Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.acc();

        Media car1 = new CDPlayed();
        car1.stop();
    }
}
// entends interface 
// nested interface












// Interface 1 with default method
// interface InterfaceA {
//     default int display() {
//         return 5;
//     }
// }

// Interface 2 with default method
// interface InterfaceB {
//     default int display() {
//         return 6;
//     }
// }

// Class implementing both interfaces
// class MyClass implements InterfaceA, InterfaceB {
//     @Override
//     public int display() {
// Resolving conflict by providing a custom implementation
//         int resultA = InterfaceA.super.display();  // Call InterfaceA's display()
//         int resultB = InterfaceB.super.display();  // Call InterfaceB's display()

//         System.out.println("Display from InterfaceA: " + resultA);
//         System.out.println("Display from InterfaceB: " + resultB);

//         return resultA + resultB;  // Return sum of both results
//     }
// }

// public class MultipleInterfaceExampleWithDefault {
//     public static void main(String[] args) {
//         MyClass obj = new MyClass();
//         int result = obj.display();  // Output: Display from InterfaceA and InterfaceB
//         System.out.println("Result: " + result);  // Output: Result: 11
//     }
// }

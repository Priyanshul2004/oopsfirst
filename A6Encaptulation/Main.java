package A6Encaptulation;
class Person {
    private String name;  // Private field  // also called data hiding

    // Public setter method to set the value of name
    public void setName(String name) { 
        this.name = name;
    }

    // Public getter method to access the value of name
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");              // Set the name
        System.out.println(person.getName()); // Get the name
    }
}

// The name variable is private (hidden).
// Public methods setName() and getName() provide controlled access to the name variable.
// Encapsulation ensures that the internal details of the Person class are hidden, and only necessary methods are exposed to modify or retrieve the data.
// data hiding
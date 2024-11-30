package A1lect1;
class Student {
    int roll = 1; // default is 1
    String name;
    float marks;

    void greeting() {
        System.out.println("my name is " + this.name);
    }

    void changename(String newname) {
        this.name = newname;
    }

    // default constructor
    Student() {
        roll = 1; // Default roll number is 1
        name = "Unknown"; // Default name is "Unknown"
        marks = 0.0f; // Default marks are 0.0
    }

    // parameterized constructor
    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }
}

public class A1basic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 2;
        s1.name = "priyanshul";

        System.out.println(s1.name);

        // second topic
        Student s2 = new Student();
        System.out.println(s2.roll);
        System.out.println(s2.name);

        // third
        Student s3 = new Student();
        System.out.println(s3.roll);

        // fourth
        s1.greeting();
        s3.greeting();

        s1.changename("sahil");
        s1.greeting();

        Student other = new Student(s1);
        System.out.println(other.name);

        Student s5 = s1;
        System.out.println(s5.name);

        final int a = 10;
        System.out.println( a);
    }
}
// 1) instance variable
// 2) new keywords
// 3) class
// 4) object
// 5) constructors
// 6) keyswords
// 6) this keyword
// 7) differ in Intergrt and int
// 8) final and static
// 9) garbage collactor for distructores
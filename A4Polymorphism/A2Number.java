package A4Polymorphism;

public class A2Number {
    int sum(int a,int b){
        return a+b;
    } 
    int sum(int a,int b,int c){   // method overloading
        return a+b+c;
    }
    public static void main(String[] args) {
        A2Number num = new A2Number();
        System.out.println(num.sum(2, 03));
    }
}
// compile time / static poly 
// or method overloading
package A14Objectcloning;

import java.util.Arrays;

class human implements Cloneable{
    int age;
    String name;
    int[] arr;

    human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4};
    }

    human(human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

    // deep copy
    
    public Object clone() throws CloneNotSupportedException{
        human twin = (human)super.clone();

        // deep 
        twin.arr = new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        human h1 = new human(21,"priyanshul");
       // human h2 = new human(h1);

        human twin = (human)h1.clone();
        System.out.println(twin.age);

        // shallow copy
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(h1.arr));

         System.out.println(Arrays.toString(twin.arr));
    }
}
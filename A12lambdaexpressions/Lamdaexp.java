package A12lambdaexpressions;

import java.util.ArrayList;

public class Lamdaexp {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        arr.forEach((item)->System.out.println(item*2));
    }
}

// 
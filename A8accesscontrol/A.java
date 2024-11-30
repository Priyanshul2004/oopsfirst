package A8accesscontrol;

public class A {
    private int num;
    protected String name;
    int[] arr;

    public A(int num,String name){
        this.num = num;
        this.name = name;
        this.arr=  new int[4];
    }

    public int getnum(){
        return num;
    }
}
// access using gatter and setter
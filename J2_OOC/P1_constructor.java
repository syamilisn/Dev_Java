//CONSTRUCTORS
public class P1_constructor {
    int a =10;
    P1_constructor(){
        System.out.println("Non-param Constructor: 100");
    }
    P1_constructor(int x){
        System.out.println("Param Constructor: "+x);
    }
    public static void main(String[] args) {
        P1_constructor obj1 = new P1_constructor();
        P1_constructor obj2 = new P1_constructor(20);
        //obj2.P1_constructor();
        System.out.println("Default constructor: "+obj1.a);
    }
}

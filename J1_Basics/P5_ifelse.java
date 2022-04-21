import java.util.*;

public class P5_ifelse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a;
        System.out.println("Enter integer value");
        a = obj.nextInt();

        if(a > 0) {
            System.out.println("The value "+a+" is greater than 0 " );
        }
        else if(a == 0){

            System.out.println("The value "+a+" is equal to 0 " );
        }
        else
        {
            System.out.println("The value "+a+" is less than 0 " );
        }
 
    }
}

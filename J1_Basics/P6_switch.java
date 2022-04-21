import java.util.*;

public class P6_switch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a;
        System.out.println("Enter integer value");
        a = obj.nextInt();
 
        switch (a) {
        case 45:
            System.out.println("The integer value is 45: " +a);
            break;
        case 5:
            System.out.println("The integer value is 5: " +a);
            break;
        case 75:
            System.out.println("The integer value is 75: " +a);
            break;
 
        default:
            System.out.println("The integer value is default: " +a);
            break;
        }
    }
}

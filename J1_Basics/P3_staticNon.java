public class P3_staticNon{
    int a = 10;
    static int b = 20;
    public static void main(String[] args){
        P3_staticNon obj = new P3_staticNon();
        int c = 30;
        int sum = obj.a + b + c;
        System.out.println(sum);
    }
}

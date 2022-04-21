public class P3_child {
    public static void main(String[] args) {
        P2_parent obj = new P2_parent();
        obj.show();
        P4_encapsulation obj2 = new P4_encapsulation();
        System.out.println("Initial id: "+obj2.getId());
        obj2.setId(101);
        System.out.println("Final id: "+obj2.getId());

    }
}

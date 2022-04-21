/* 
This Prog doesnt return any o/p.
child class inherits this class and assigns id.
But the id is not assigned here,
it remains with the child class.
*/
public class P4_encapsulation {

    private int id;     //3. id = 101
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {     //1. setId(101)
        this.id = id;           //2. this.id = 101
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        P4_encapsulation obj = new P4_encapsulation();
    }
}

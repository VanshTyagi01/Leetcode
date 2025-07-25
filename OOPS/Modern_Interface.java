// abstract class do not has variable they has constant

// there are two default method in two interface they will create ambiguity 
// to solve this we can override them (overriding do hide parent class methods) 

// methods can have body by using default keyword in java and can still be overridden

interface M1{
    void show();
    default void disp(){
        System.out.println("M1 Disp...");
    }
}
interface M2{
    void show();
    default void disp(){
        System.out.println("M2 Disp...");
    }
}
 class M3 implements M1, M2{
    @Override
    public void disp(){
        M1.super.disp();  // calling parent class method in case of ambiguity
        M2.super.disp();
        System.out.println("M3 Show...");
    }
    @Override
    public void show(){
        System.out.println("M3 Show...");
    }
 }

public class Modern_Interface {
    public static void main(String[] args) {
        M3 obj = new M3();
        obj.disp();
        obj.show();
    }
}

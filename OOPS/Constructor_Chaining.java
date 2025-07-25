class P1{
    int x = 200;
    P1(){
        System.out.println("P1 Default Cons");
    }
    P1(int x){
        this();
        System.out.println("P1 Para Const "+x);
    }
}
class P2 extends P1{
    int x = 300;
    P2(){
        super(20);
        System.out.println("P2 Default Cons");
    }
    P2(int x){
        this();
        // super(x*x);
        System.out.println("P2 Para Const "+x);
    }
}

class C3 extends P2{
    int x = 100;
    C3(){
        super(30); // calling parent class para constructor
        // super;   implict super call to the  parent class default constructor, even if you call other constructor
        // you have to use super() to call other constructor in case of constructor chaining
        System.out.println("C3 Default Cons");
    }
    C3(int x){
        this(); // calling same class  default constructor ( cunstructor call must be the first statement of the function)
        // super(x*x);
        int z = x + this.x + super.x + ((P1)this).x;
        System.out.println("C3 Para Const "+x +" "+z);
    }
}

public class Constructor_Chaining {
    public static void main(String[] args) {
        C3 ob = new C3(10);
    }
}



import static java.lang.System.out; // imports static method out from class system


class Customer{
    //Instance
    int id;
    String name;
    // Class Member
    // binds with class not with object and shared amongs all objects
    static String companyName;
    // static blocks used to initialise static variable
    // static blocks runs when class is loaded into the memory(ie one time)
    // executes int first come first order in source code
    static{
        System.out.println("static block call");
        companyName = "DIT UNIVERSITY";
    }
    static{
        System.out.println("another static block");
    }
    // default construstor kills when a user codes a new constructor 
    // unless user codes it
    Customer(int id, String name){
        System.out.println("Constructor call");
        this.id = id;
        this.name = name;
    }
}



class User{
    String userid;
    int password;
    static int count=0;
    User(String userid, int password){
        this.userid = userid;
        this.password = password;
        count++;
        System.out.println("count = "+count);
    }
}



class triMath{
    private triMath(){};
    static void sin(){
        System.out.println("Sin");
    }
    static void cos(){
        out.println("Cos");  // no ned for stystem as static method is already imported
    }
}

// outer class can not be static but class as member of another class can be static
// static things comes before non-static things in memory
// static can not use non static things
class B{
    static class A{
        static void show(){
            // disp(); // cannot  be called as static comes before non static
            System.out.println("A Show.....");
        }
        void disp(){
            show(); // can be called as static comes before non static
            System.out.println("A show");
        }
    }
    
}

public class Static_vs_Instance {
    public static void main(String[] args) {

    // customer class

    //     Customer ram = new Customer(101, "Ram");
    //     System.out.println(Customer.companyName);
    //     System.out.println(ram.id);
    //     System.out.println(ram.name);

    //     Customer shyam = new Customer(102, "Shyam");
    //     System.out.println(Customer.companyName);
    //     System.out.println(shyam.id);
    //     System.out.println(shyam.name);

    // user class

    //     User user = new User("vansh", 101);
    //     User user1 = new User("Ram", 102);
    //     User user2 = new User("Shyam", 103); 
    
    // triMath class
        // triMath m = new triMath();  constructor is private cannot be called
        // triMath.sin();
        // triMath.cos();

        B.A.show();
        B.A obj = new B.A();
        obj.disp();
    }
}

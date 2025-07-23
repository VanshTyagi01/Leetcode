import java.util.*;
// scope of class (public(access within and outside package) or default(within the package))
public class testStudent {
    public static void main(String[] args) {
        int x;
        x=10;
        student ram;  // ram is variable
        // ram is a reference variable
        // ()-  constructor calling bracket
        ram = new student(1001, "ram", new int[]{99, 99, 100});  // new -keyword (Runtime memory allocation)
        ram.print();
        ram.setEmail("ram@gmai.com");
        System.out.println("Email - "+ram.getEmail());
        // ram.roll = 3249043;
        // ram.name = "jg;k";
        // ram.marks = new int[]{52239, 9452239, 1452300};
        // object goes to heap
        // function and its variable goes to stack
        // System.out.println(ram.roll);
        // System.out.println(ram.name);
        // System.out.println(ram.marks);
    }
}

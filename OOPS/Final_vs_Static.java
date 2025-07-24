// static is used to reserve memory only once
// final is used to make variable constant
public class Final_vs_Static {
    static int t; // static can only used at class member level
    final int J= 0; // final can be used at both level(instance variable, class member and local variable)
    final static int M = 90;
    public static void main(String[] args) {
        final int Max = 100;
        final int MIN_CAP = 1;
        final int arr[] = {10, 20}; //array can not be reinitialize but its value can changed
        // arr = new int[10]; // cannot reassign as it is final
        System.out.println(arr[1]);
        arr[1] = 4; // value can change
        System.out.println(arr[1]);
    }
    static void show(final int Y){
        //y++   //cannot be done as itis constant
    }
    final void disp(){  // can be inherited but can not ne override

    }
}

// final - prevent variable to modify
// final - prevents class inheritance
// final - prevents method overriding
// final - class cannot be inherited


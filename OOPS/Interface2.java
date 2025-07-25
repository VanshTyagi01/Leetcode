// there will mot be any ambiguity as there is not an implemented function to call
// variable are tied to the class so there class object will call them 
interface I1{
    int x = 10;
    void show();
}
interface I2{
    int x = 20;
    void show();
}
interface I3 extends I1, I2{

}
class I4 implements I3{
    public void show(){
        System.out.println(I1.x + I2.x);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        I4 ob = new I4();
        ob.show();
    }
}

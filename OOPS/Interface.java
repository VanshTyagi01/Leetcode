/*
 * Interface - Standard / Contract (What to do)
 * Interface - 100%  Abstraction
 * 
 * Implements (How to do) has to implements all functions in interface
 * 
 * Interface Segration function (divide the interface in many parts)
 * single class can implements any numbers of interfaces
 * 
 * 
 * 
 * first class is inherited then interface is implemented if any
 */

interface  IPlayer{
    int MAX_POWER = 100;   // by default (public static final MAX_POWER = 100;)
    int MIN_POWER = 10;
    void walk();// by default public abstract
    void jump();
    void punch();
}
interface Extraower {
    void power(int pow);
}
class RedPlayer implements IPlayer, Extraower{
    @Override
    public void punch() {
        final int value = MAX_POWER;
        System.out.println("Punch "+value);
        
    }
    @Override
    public void walk(){
        System.out.println("Walk");
    }
    @Override
    public void jump(){
        System.out.println("Jump");
    }
    public void power(int pow){
        System.out.println("Power "+pow);
    }
}
public class Interface {
    
}
